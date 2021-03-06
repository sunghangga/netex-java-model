package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.entity.DayTypeEntity;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.DayType;

class DayTypeParser {
	
	public void parser (List<JAXBElement<? extends DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			DayType actualValue = (DayType) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String propertyOfDay = (actualValue.getProperties() == null) ?  null : actualValue.getProperties().getPropertyOfDay().toString();
			DayTypeEntity dayType = new DayTypeEntity(
										id, 
										version,  
										name, 
										shortName,
										propertyOfDay);
		    // Save object
		    session.saveOrUpdate(dayType);
		}
	}
	
}
