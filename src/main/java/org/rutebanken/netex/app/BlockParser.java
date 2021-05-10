package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.AvailabilityConditionRefStructure;
import org.rutebanken.netex.model.Block;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.entity.BlockEntity;

class BlockParser {
	
	public void parser (List<DataManagedObjectStructure> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Block actualValue = (Block) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			String privateCode = (actualValue.getPrivateCode() == null) ?  null : actualValue.getPrivateCode().getValue();
			Duration preparationDuration = (actualValue.getPreparationDuration() == null) ?  null : actualValue.getPreparationDuration();
			LocalTime startTime = (actualValue.getStartTime() == null) ?  null : actualValue.getStartTime();
			BigInteger startTimeDayOffset = (actualValue.getStartTimeDayOffset() == null) ?  null : actualValue.getStartTimeDayOffset();
			Duration finishingDuration = (actualValue.getFinishingDuration() == null) ?  null : actualValue.getFinishingDuration();
			LocalTime endTime = (actualValue.getEndTime() == null) ?  null : actualValue.getEndTime();
			BigInteger endTimeDayOffset = (actualValue.getEndTimeDayOffset() == null) ?  null : actualValue.getEndTimeDayOffset();
			String availabilityConditionRef = null;
			if (actualValue.getValidityConditions() != null) {
				AvailabilityConditionRefStructure vailabilityCondition = (AvailabilityConditionRefStructure) actualValue.getValidityConditions().getAvailabilityConditionRefOrAvailabilityConditionOrValidDuring().get(0);
				availabilityConditionRef = (actualValue.getValidityConditions() == null) ? null : vailabilityCondition.getRef();
			}
			String dayType = (actualValue.getDayTypes() == null) ?  null : actualValue.getDayTypes().getDayTypeRef().toString();
			String vehicleServicePartRef = (actualValue.getVehicleServicePartRef() == null) ?  null : actualValue.getVehicleServicePartRef().getRef();
			String vehicleTypeRef = (actualValue.getVehicleTypeRef() == null) ?  null : actualValue.getVehicleTypeRef().getValue().getRef();
			String startPointRef = (actualValue.getStartPointRef() == null) ?  null : actualValue.getStartPointRef().getRef();
			String endPointRef = (actualValue.getEndPointRef() == null) ?  null : actualValue.getEndPointRef().getRef();
			String journey = (actualValue.getJourneys() == null) ?  null : actualValue.getJourneys().getJourneyRefOrJourneyDesignatorOrServiceDesignator().toString();
			String courseOfJourney = (actualValue.getCoursesOfJourneys() == null) ?  null : actualValue.getCoursesOfJourneys().getCourseOfJourneysRefOrCourseOfJourneys().toString();
			BlockEntity blocks = new BlockEntity(
										id, 
										version,
										name,
										description,
										privateCode,
										preparationDuration,
										startTime,
										startTimeDayOffset,
										finishingDuration,
										endTime,
										endTimeDayOffset,
										availabilityConditionRef,
										dayType,
										vehicleServicePartRef,
										vehicleTypeRef,
										startPointRef,
										endPointRef,
										journey,
										courseOfJourney);
		    // Save object
		    session.saveOrUpdate(blocks);
		}
	}
	
}
