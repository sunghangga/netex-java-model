package org.rutebanken.netex.app;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.FacilityRefStructure;
import org.rutebanken.netex.model.ParkingCapacity;
import org.rutebanken.netex.model.PassengerCapacity;
import org.rutebanken.netex.model.PointProjection;
import org.rutebanken.netex.model.ServiceFacilitySet;
import org.rutebanken.netex.model.Vehicle;
import org.rutebanken.netex.model.VehicleType_VersionStructure;
import org.rutebanken.netex.entity.VehicleEntity;
import org.rutebanken.netex.entity.VehicleTypeEntity;

class VehicleTypeParser {
	
	public void parser (List<VehicleType_VersionStructure> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			VehicleType_VersionStructure actualValue = (VehicleType_VersionStructure) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			String typeOfFuel = (actualValue.getTypeOfFuel() == null) ?  null : actualValue.getTypeOfFuel().toString();
			String brandingRef = (actualValue.getBrandingRef() == null) ?  null : actualValue.getBrandingRef().getRef();
			Boolean lowFloor = (actualValue.isLowFloor() == null) ?  null : actualValue.isLowFloor();
			Boolean hasLiftOrRamp = (actualValue.isHasLiftOrRamp() == null) ?  null : actualValue.isHasLiftOrRamp();
			Boolean hasHoist = (actualValue.isHasHoist() == null) ?  null : actualValue.isHasHoist();
			BigDecimal length = (actualValue.getLength() == null) ?  null : actualValue.getLength();
			BigDecimal width = (actualValue.getWidth() == null) ?  null : actualValue.getWidth();
			BigDecimal height = (actualValue.getHeight() == null) ?  null : actualValue.getHeight();
			BigDecimal weight = (actualValue.getWeight() == null) ?  null : actualValue.getWeight();
			BigDecimal boardingHeight = (actualValue.getBoardingHeight() == null) ?  null : actualValue.getBoardingHeight();
			BigDecimal gapToPlatform = (actualValue.getGapToPlatform() == null) ?  null : actualValue.getGapToPlatform();
			String fareClass = null;
			BigInteger totalCapacity = null;
			BigInteger seatingCapacity = null;
			BigInteger standingCapacity = null;
			BigInteger specialPlaceCapacity = null;
			BigInteger pushchairCapacity = null;
			BigInteger wheelchairPlaceCapacity = null;
			if (actualValue.getCapacities() != null) {
				PassengerCapacity capacity = (PassengerCapacity) actualValue.getCapacities().getPassengerCapacityRefOrPassengerCapacity().get(0);
				fareClass = capacity.getFareClass().toString();
				totalCapacity = capacity.getTotalCapacity();
				seatingCapacity = capacity.getSeatingCapacity();
				standingCapacity = capacity.getStandingCapacity();
				specialPlaceCapacity = capacity.getSpecialPlaceCapacity();
				pushchairCapacity = capacity.getPushchairCapacity();
				wheelchairPlaceCapacity = capacity.getWheelchairPlaceCapacity();
			}
			String mobilityFacilityList = null;
			String passengerCommsFacilityList = null;
			String sanitaryFacilityList = null;
			String ticketingServiceFacilityList = null;
			String vehicleAccessFacilityList = null;
			if (actualValue.getFacilities() != null) {
				ServiceFacilitySet facility = (ServiceFacilitySet) actualValue.getFacilities().getServiceFacilitySetRefOrServiceFacilitySet().get(0);
				mobilityFacilityList = facility.getMobilityFacilityList().get(0).toString();
				passengerCommsFacilityList = facility.getPassengerCommsFacilityList().get(0).toString();
				sanitaryFacilityList = facility.getSanitaryFacilityList().get(0).toString();
				ticketingServiceFacilityList = facility.getTicketingServiceFacilityList().get(0).toString();
				vehicleAccessFacilityList = facility.getVehicleAccessFacilityList().get(0).toString();
			}
			
			VehicleTypeEntity vehicleType = new VehicleTypeEntity(
										id, 
										version,  
										name, 
										shortName,
										description,
										typeOfFuel,
										brandingRef,
										lowFloor,
										hasLiftOrRamp,
										hasHoist,
										length,
										width,
										height,
										weight,
										boardingHeight,
										gapToPlatform,
										fareClass,
										totalCapacity,
										seatingCapacity,
										standingCapacity,
										specialPlaceCapacity,
										pushchairCapacity,
										wheelchairPlaceCapacity,
										mobilityFacilityList,
										passengerCommsFacilityList,
										sanitaryFacilityList,
										ticketingServiceFacilityList,
										vehicleAccessFacilityList);
		    // Save object
		    session.saveOrUpdate(vehicleType);
		}
	}
	
}
