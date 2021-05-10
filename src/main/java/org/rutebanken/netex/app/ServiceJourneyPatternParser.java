package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.ServiceJourneyPattern;
import org.rutebanken.netex.model.StopPointInJourneyPattern;
import org.rutebanken.netex.model.TimingPointInJourneyPattern;
import org.rutebanken.netex.entity.StopPointJourneyPatternEntity;
import org.rutebanken.netex.entity.TimingPointJourneyPatternEntity;
import org.rutebanken.netex.entity.ServiceJourneyPatternEntity;

class ServiceJourneyPatternParser {
	
	public void parser (List<JAXBElement<?>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ServiceJourneyPattern actualValue = (ServiceJourneyPattern) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String routeRef = (actualValue.getRouteRef() == null) ?  null : actualValue.getRouteRef().getRef();
			String directionType = (actualValue.getDirectionType() == null) ?  null : actualValue.getDirectionType().toString();
			String destinationDisplayRef = (actualValue.getDestinationDisplayRef() == null) ?  null : actualValue.getDestinationDisplayRef().getRef();
			ServiceJourneyPatternEntity serviceJourneyPattern = new ServiceJourneyPatternEntity(
										id, 
										version, 
										name,
										routeRef, 
										directionType,
										destinationDisplayRef);
		    // Save object
		    session.saveOrUpdate(serviceJourneyPattern);
		    
		    if (actualValue.getPointsInSequence() != null && actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern() != null) {
		    	for (int j = 0; j < actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().size(); j = j + 1) {
		    		if (actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().get(j) instanceof StopPointInJourneyPattern) {
		    			StopPointInJourneyPattern pointValue = (StopPointInJourneyPattern) actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().get(j);
			    		String idPointJourneyPattern = (pointValue.getId() == null) ?  null : pointValue.getId();
						String versionPointJourneyPattern = (versions == null) ?  null : versions;
						Boolean forAlighting = (pointValue.isForAlighting() == null) ?  null : pointValue.isForAlighting();
						Boolean forBoarding = (pointValue.isForBoarding() == null) ?  null : pointValue.isForBoarding();
						Boolean isWaitPoint = (pointValue.isIsWaitPoint() == null) ?  null : pointValue.isIsWaitPoint();
						String timingLinkRef = (pointValue.getOnwardTimingLinkRef() == null) ?  null : pointValue.getOnwardTimingLinkRef().getRef();
						String scheduledStopPointRef = (pointValue.getScheduledStopPointRef() == null) ?  null : pointValue.getScheduledStopPointRef().getValue().getRef();
						BigInteger orders = (pointValue.getOrder() == null) ?  null : pointValue.getOrder();
						String serviceJourneyPatternRef = id;
						String destinationDisplayRefPointJourneyPattern = (pointValue.getDestinationDisplayRef() == null) ?  actualValue.getDestinationDisplayRef().getRef() : pointValue.getDestinationDisplayRef().getRef();
						StopPointJourneyPatternEntity stopPointJourneyPattern = new StopPointJourneyPatternEntity(
								idPointJourneyPattern, 
								versionPointJourneyPattern,  
								forAlighting, 
								forBoarding, 
								isWaitPoint,
								timingLinkRef,
								scheduledStopPointRef,
								orders,
								serviceJourneyPatternRef,
								destinationDisplayRefPointJourneyPattern);
						// Save object
					    session.saveOrUpdate(stopPointJourneyPattern);
		    		}
		    		else if (actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().get(j) instanceof TimingPointInJourneyPattern) {
		    			TimingPointInJourneyPattern pointValue = (TimingPointInJourneyPattern) actualValue.getPointsInSequence().getPointInJourneyPatternOrStopPointInJourneyPatternOrTimingPointInJourneyPattern().get(j);
			    		String idPointJourneyPattern = (pointValue.getId() == null) ?  null : pointValue.getId();
						String versionPointJourneyPattern = (versions == null) ?  null : versions;
						Boolean isWaitPoint = (pointValue.isIsWaitPoint() == null) ?  null : pointValue.isIsWaitPoint();
						String timingLinkRef = (pointValue.getOnwardTimingLinkRef() == null) ?  null : pointValue.getOnwardTimingLinkRef().getRef();
						String timingPointRef = (pointValue.getTimingPointRef() == null) ?  null : pointValue.getTimingPointRef().getValue().getRef();
						BigInteger orders = (pointValue.getOrder() == null) ?  null : pointValue.getOrder();
						String serviceJourneyPatternRef = id;
						TimingPointJourneyPatternEntity timingPointJourneyPattern = new TimingPointJourneyPatternEntity(
								idPointJourneyPattern, 
								versionPointJourneyPattern,
								isWaitPoint,
								timingLinkRef,
								timingPointRef,
								orders,
								serviceJourneyPatternRef);
						// Save object
					    session.saveOrUpdate(timingPointJourneyPattern);
		    		}
		    	}
		    }
		}
	}
	
}
