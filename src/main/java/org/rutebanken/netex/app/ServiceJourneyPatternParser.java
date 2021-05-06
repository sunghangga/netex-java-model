package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.ServiceJourneyPattern;
import org.rutebanken.netex.model.StopPointInJourneyPattern;
import org.rutebanken.netex.entity.PointJourneyPatternEntity;
import org.rutebanken.netex.entity.ServiceJourneyPatternEntity;

class ServiceJourneyPatternParser {
	
	public void parser (List<JAXBElement<?>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ServiceJourneyPattern actualValue = (ServiceJourneyPattern) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String routeRef = (actualValue.getRouteRef() == null) ?  null : actualValue.getRouteRef().getRef();
			String destinationDisplayRef = (actualValue.getDestinationDisplayRef() == null) ?  null : actualValue.getDestinationDisplayRef().getRef();
			ServiceJourneyPatternEntity serviceJourneyPattern = new ServiceJourneyPatternEntity(
										id, 
										version,  
										routeRef, 
										destinationDisplayRef);
		    // Save object
		    session.save(serviceJourneyPattern);
		    
		    if (actualValue.getPointsInSequence() != null && actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern() != null) {
		    	for (int j = 0; j < actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().size(); j = j + 1) {
		    		StopPointInJourneyPattern pointValue = (StopPointInJourneyPattern) actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().get(j);
		    		String idPointJourneyPattern = (pointValue.getId() == null) ?  null : pointValue.getId();
					String versionPointJourneyPattern = (versions == null) ?  null : versions;
					Boolean forAlighting = (pointValue.isForAlighting() == null) ?  null : pointValue.isForAlighting();
					Boolean forBoarding = (pointValue.isForBoarding() == null) ?  null : pointValue.isForBoarding();
					Boolean isWaitPoint = (pointValue.isIsWaitPoint() == null) ?  null : pointValue.isIsWaitPoint();
					String onwardTimingLinkRef = (pointValue.getOnwardTimingLinkRef() == null) ?  null : pointValue.getOnwardTimingLinkRef().getRef();
					String scheduledStopPointRef = (pointValue.getScheduledStopPointRef() == null) ?  null : pointValue.getScheduledStopPointRef().getValue().getRef();
					BigInteger orders = (pointValue.getOrder() == null) ?  null : pointValue.getOrder();
					String serviceJourneyPatternRef = id;
					String destinationDisplayRefPointJourneyPattern = (pointValue.getDestinationDisplayRef() == null) ?  actualValue.getDestinationDisplayRef().getRef() : pointValue.getDestinationDisplayRef().getRef();
					PointJourneyPatternEntity pointJourneyPattern = new PointJourneyPatternEntity(
							idPointJourneyPattern, 
							versionPointJourneyPattern,  
							forAlighting, 
							forBoarding, 
							isWaitPoint,
							onwardTimingLinkRef,
							scheduledStopPointRef,
							orders,
							serviceJourneyPatternRef,
							destinationDisplayRefPointJourneyPattern);
					// Save object
				    session.save(pointJourneyPattern);
		    	}
		    }
		}
	}
	
}
