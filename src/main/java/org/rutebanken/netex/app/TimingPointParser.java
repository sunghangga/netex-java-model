package org.rutebanken.netex.app;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.PointProjection;
import org.rutebanken.netex.model.TimingPoint;
import org.rutebanken.netex.entity.TimingPointEntity;

class TimingPointParser {
	
	public void parser (List<TimingPoint> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			TimingPoint actualValue = (TimingPoint) actual.get(i);
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
			TimingPointEntity timingPoint = new TimingPointEntity(
										id, 
										version,  
										name, 
										rdX,
										rdY,
										routePointRef);
		    // Save object
		    session.saveOrUpdate(timingPoint);
		}
	}
	
}
