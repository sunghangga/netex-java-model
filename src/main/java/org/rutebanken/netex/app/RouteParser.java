package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.entity.RouteEntity;
import org.rutebanken.netex.model.LinkSequence_VersionStructure;
import org.rutebanken.netex.model.Route;
import org.rutebanken.netex.entity.PointOnRouteEntity;

class RouteParser {
	
	public void parser (List<JAXBElement<? extends 
			 LinkSequence_VersionStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Route actualValue = (Route) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String directionType = (actualValue.getDirectionType() == null) ?  null : actualValue.getDirectionType().toString();
			String lineRef = (actualValue.getLineRef() == null) ?  null : actualValue.getLineRef().getValue().getRef();
		    RouteEntity routes = new RouteEntity(
										id, 
										version,  
										directionType, 
										lineRef);
		    // Save object
		    session.save(routes);
		    
		    if (actualValue.getPointsInSequence() != null && actualValue.getPointsInSequence().getPointOnRoute() != null) {
		    	for (int j = 0; j < actualValue.getPointsInSequence().getPointOnRoute().size(); j = j + 1) {
					String idPointOnRoute = (actualValue.getPointsInSequence().getPointOnRoute().get(j).getId() == null) ?  null : actualValue.getPointsInSequence().getPointOnRoute().get(j).getId();
					String versionPointOnRoute = (versions == null) ?  null : versions;
					BigInteger orders = (actualValue.getPointsInSequence().getPointOnRoute().get(j).getOrder() == null) ?  null : actualValue.getPointsInSequence().getPointOnRoute().get(j).getOrder();
					String routeRef = (actualValue.getId() == null) ?  null : actualValue.getId();
					String routePointRef = (actualValue.getPointsInSequence().getPointOnRoute().get(j).getPointRef() == null) ?  null : actualValue.getPointsInSequence().getPointOnRoute().get(j).getPointRef().getValue().getRef();
					String onwardRouteLinkRef = (actualValue.getPointsInSequence().getPointOnRoute().get(j).getOnwardRouteLinkRef() == null) ?  null : actualValue.getPointsInSequence().getPointOnRoute().get(j).getOnwardRouteLinkRef().getRef();
					PointOnRouteEntity pointOnRoute = new PointOnRouteEntity(
							idPointOnRoute, 
							versionPointOnRoute,  
							orders, 
							routeRef, 
							routePointRef,
							onwardRouteLinkRef);
					// Save object
				    session.save(pointOnRoute);
				}
		    }
		}
	}
	
}
