package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.Vehicle;
import org.rutebanken.netex.entity.VehicleEntity;

class VehicleParser {
	
	public void parser (List<DataManagedObjectStructure> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Vehicle actualValue = (Vehicle) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String brandingRef = (actualValue.getBrandingRef() == null) ?  null : actualValue.getBrandingRef().getRef();
			String registrationNumber = (actualValue.getRegistrationNumber() == null) ?  null : actualValue.getRegistrationNumber();
			String operationalNumber = (actualValue.getOperationalNumber() == null) ?  null : actualValue.getOperationalNumber();
			String operatorRef = (actualValue.getOperatorRef() == null) ?  null : actualValue.getOperatorRef().getRef();
			String vehicleTypeRef = (actualValue.getVehicleTypeRef() == null) ?  null : actualValue.getVehicleTypeRef().getValue().getRef();
			VehicleEntity vehicle = new VehicleEntity(
										id, 
										version,  
										name, 
										shortName,
										brandingRef,
										registrationNumber,
										operationalNumber,
										operatorRef,
										vehicleTypeRef);
		    // Save object
		    session.saveOrUpdate(vehicle);
		}
	}
	
}
