package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.PointProjection;
import org.rutebanken.netex.model.ScheduledStopPoint;
import org.rutebanken.netex.entity.ScheduledStopPointEntity;

class ScheduledStopPointParser {
	
	public void parser (List<ScheduledStopPoint> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ScheduledStopPoint actualValue = (ScheduledStopPoint) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			Double rdX = (actualValue.getLocation() == null) ?  null : actualValue.getLocation().getPos().getValue().get(0);
			Double rdY = (actualValue.getLocation() == null) ?  null : actualValue.getLocation().getPos().getValue().get(1);
			String routePointRef = null;
			if (actualValue.getProjections() != null) {
				PointProjection pointProjection = (PointProjection) actualValue.getProjections().getProjectionRefOrProjection().get(0).getValue();
				routePointRef = pointProjection.getProjectToPointRef().getRef();
			}
			String stopAreaRef = (actualValue.getStopAreas() == null) ?  null : actualValue.getStopAreas().getStopAreaRef().get(0).getRef();
			String tariffZoneRef = (actualValue.getTariffZones() == null) ?  null : actualValue.getTariffZones().getTariffZoneRef().get(0).getRef();
			String privateCode = (actualValue.getPrivateCode() == null) ? null : actualValue.getPrivateCode().getValue();
			Boolean forAlighting = (actualValue.isForAlighting() == null) ? null : actualValue.isForAlighting();
			Boolean forBoarding = (actualValue.isForBoarding() == null) ? null : actualValue.isForBoarding();
			ScheduledStopPointEntity scheduledStopPoint = new ScheduledStopPointEntity(
										id, 
										version,  
										name, 
										rdX,
										rdY,
										routePointRef,
										stopAreaRef,
										tariffZoneRef,
										privateCode,
										forAlighting,
										forBoarding);
		    // Save object
		    session.saveOrUpdate(scheduledStopPoint);
		}
	}
	
}
