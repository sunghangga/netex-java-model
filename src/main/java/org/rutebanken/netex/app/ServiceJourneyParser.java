package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.time.LocalTime;

import org.hibernate.Session;
import org.rutebanken.netex.entity.ServiceJourneyEntity;
import org.rutebanken.netex.model.AvailabilityConditionRefStructure;
import org.rutebanken.netex.model.ServiceJourney;
import org.rutebanken.netex.model.TimetableFrame;

class ServiceJourneyParser {
	
	public void parser (TimetableFrame actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.getVehicleJourneys().getVehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney().size(); i = i + 1) {
			ServiceJourney actualValue = (ServiceJourney) (actual.getVehicleJourneys().getVehicleJourneyOrDatedVehicleJourneyOrNormalDatedVehicleJourney().get(i));
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			BigInteger departureDayOffset = (actualValue.getDepartureDayOffset() == null) ?  null : actualValue.getDepartureDayOffset();
			LocalTime departureTime = (actualValue.getDepartureTime() == null) ?  null : actualValue.getDepartureTime();
			String journeyPatternRef = (actualValue.getJourneyPatternRef() == null) ?  null : actualValue.getJourneyPatternRef().getValue().getRef();
			String timeDemandTypeRef = (actualValue.getTimeDemandTypeRef() == null) ? null : actualValue.getTimeDemandTypeRef().getRef();
			String typeOfProductCategoryRef = (actualValue.getTypeOfProductCategoryRef() == null) ? null : actualValue.getTypeOfProductCategoryRef().getRef();
			AvailabilityConditionRefStructure vailabilityCondition = (AvailabilityConditionRefStructure) actualValue.getValidityConditions().getAvailabilityConditionRefOrAvailabilityConditionOrValidDuring().get(0);
			String availabilityConditionRef = (actualValue.getValidityConditions() == null) ? null : vailabilityCondition.getRef();
			String operatorRef = (actualValue.getOperatorRef() != null) ? actualValue.getOperatorRef().getRef() : (actual.getOperatorView().getOperatorRef().getRef());
		    ServiceJourneyEntity vehicleJourney = new ServiceJourneyEntity(
										id, 
										version,  
										departureDayOffset, 
										departureTime,
										journeyPatternRef,
										timeDemandTypeRef,
										typeOfProductCategoryRef,
										availabilityConditionRef,
										operatorRef);
		    // Save object
		    session.save(vehicleJourney);
		}
	}
	
}
