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
			String privateCode = (actualValue.getPrivateCode() == null) ? null : actualValue.getPrivateCode().getValue();
			Boolean monitored = (actualValue.isMonitored() == null) ? null : actualValue.isMonitored();
			String dayType = (actualValue.getDayTypes() == null) ? null : actualValue.getDayTypes().getDayTypeRef().toString();
			String vehicleType = (actualValue.getVehicleTypeRef() == null) ? null : actualValue.getVehicleTypeRef().getValue().getRef();
			Boolean print = (actualValue.isPrint() == null) ? null : actualValue.isPrint();
			String dynamic = (actualValue.getDynamic() == null) ? null : actualValue.getDynamic().toString();
			String dataSourceRef = (actualValue.getDataSourceRef() == null) ? null : actualValue.getDataSourceRef();
			String blockRef = (actualValue.getBlockRef() == null) ? null : actualValue.getBlockRef().getValue().getRef();
			ServiceJourneyEntity vehicleJourney = new ServiceJourneyEntity(
										id, 
										version,  
										departureDayOffset, 
										departureTime,
										journeyPatternRef,
										timeDemandTypeRef,
										typeOfProductCategoryRef,
										availabilityConditionRef,
										operatorRef,
										privateCode,
										monitored,
										dayType,
										vehicleType,
										print,
										dynamic,
										dataSourceRef,
										blockRef);
		    // Save object
		    session.saveOrUpdate(vehicleJourney);
		}
	}
	
}
