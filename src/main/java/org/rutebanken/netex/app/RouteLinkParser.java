package org.rutebanken.netex.app;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.RouteLink;
import org.rutebanken.netex.entity.PointOnLinkEntity;
import org.rutebanken.netex.entity.RouteLinkEntity;

class RouteLinkParser {
	
	public void parser (List<RouteLink> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			RouteLink actualValue = (RouteLink) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			BigDecimal distance = (actualValue.getDistance() == null) ?  null : actualValue.getDistance();
			String lineString = (actualValue.getLineString() == null) ?  null : actualValue.getLineString().getPosList().getValue().toString();
			String fromPointRef = (actualValue.getFromPointRef() == null) ?  null : actualValue.getFromPointRef().getRef();
			String toPointRef = (actualValue.getToPointRef() == null) ?  null : actualValue.getToPointRef().getRef();
			String operationalContextRef = (actualValue.getOperationalContextRef() == null) ?  null : actualValue.getOperationalContextRef().getRef();
			RouteLinkEntity routeLink = new RouteLinkEntity(
										id, 
										version,  
										distance, 
										lineString,
										fromPointRef,
										toPointRef,
										operationalContextRef);
		    // Save object
		    session.saveOrUpdate(routeLink);
		    
		    if (actualValue.getPassingThrough() != null && actualValue.getPassingThrough().getPointOnLink() != null) {
		    	for (int j = 0; j < actualValue.getPassingThrough().getPointOnLink().size(); j = j + 1) {
					String idPointOnLink = (actualValue.getPassingThrough().getPointOnLink().get(j).getId() == null) ?  null : actualValue.getPassingThrough().getPointOnLink().get(j).getId();
					String versionPointOnRoute = (versions == null) ?  null : versions;
					BigInteger orders = (actualValue.getPassingThrough().getPointOnLink().get(j).getOrder() == null) ?  null : actualValue.getPassingThrough().getPointOnLink().get(j).getOrder();
					String routeLinkRef = (actualValue.getId() == null) ?  null : actualValue.getId();
					BigDecimal distanceFromStart = (actualValue.getPassingThrough().getPointOnLink().get(j).getDistanceFromStart() == null) ?  null : actualValue.getPassingThrough().getPointOnLink().get(j).getDistanceFromStart();
					String activationPointRef = (actualValue.getPassingThrough().getPointOnLink().get(j).getPointRef() == null) ?  null : actualValue.getPassingThrough().getPointOnLink().get(j).getPointRef().getValue().getRef();
					PointOnLinkEntity pointOnLink = new PointOnLinkEntity(
							idPointOnLink, 
							versionPointOnRoute,  
							orders, 
							routeLinkRef, 
							distanceFromStart,
							activationPointRef);
					// Save object
				    session.saveOrUpdate(pointOnLink);
				}
		    }
		}
	}
	
}
