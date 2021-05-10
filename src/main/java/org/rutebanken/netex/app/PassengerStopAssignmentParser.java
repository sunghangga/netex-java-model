package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.PassengerStopAssignment;
import org.rutebanken.netex.model.StopAssignment_VersionStructure;
import org.rutebanken.netex.model.Vehicle;
import org.rutebanken.netex.entity.PassengerStopAssignmentEntity;
import org.rutebanken.netex.entity.VehicleEntity;

class PassengerStopAssignmentParser {
	
	public void parser (List<JAXBElement<? extends StopAssignment_VersionStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			PassengerStopAssignment actualValue = (PassengerStopAssignment) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			BigInteger orders = (actualValue.getOrder() == null) ?  null : actualValue.getOrder();
			String scheduledStopPointRef = (actualValue.getScheduledStopPointRef() == null) ?  null : actualValue.getScheduledStopPointRef().getValue().getRef();
			String stopPlaceRef = (actualValue.getStopPlaceRef() == null) ?  null : actualValue.getStopPlaceRef().getRef();
			String quayRef = (actualValue.getQuayRef() == null) ?  null : actualValue.getQuayRef().getRef();
			PassengerStopAssignmentEntity passengerStopAssignment = new PassengerStopAssignmentEntity(
										id, 
										version,  
										name, 
										orders,
										scheduledStopPointRef,
										stopPlaceRef,
										quayRef);
		    // Save object
		    session.saveOrUpdate(passengerStopAssignment);
		}
	}
	
}
