package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.entity.RoutePointEntity;
import org.rutebanken.netex.model.RoutePoint;

class RoutePointParser {
	
	public void parser (List<RoutePoint> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			RoutePoint actualValue = (RoutePoint) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			Double rdX = (actualValue.getLocation().getPos().getValue() == null) ?  null : actualValue.getLocation().getPos().getValue().get(0);
			Double rdY = (actualValue.getLocation().getPos().getValue() == null) ?  null : actualValue.getLocation().getPos().getValue().get(1);
		    RoutePointEntity routePoints = new RoutePointEntity(
										id, 
										version,
										rdX, 
										rdY);
		    // Save object
		    session.saveOrUpdate(routePoints);
		}
	}
	
}
