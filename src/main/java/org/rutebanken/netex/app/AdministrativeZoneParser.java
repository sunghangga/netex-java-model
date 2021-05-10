package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.AdministrativeZone;
import org.rutebanken.netex.model.Zone_VersionStructure;
import org.rutebanken.netex.entity.AdministrativeZoneEntity;

class AdministrativeZoneParser {
	
	public void parser (List<JAXBElement<?extends Zone_VersionStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			AdministrativeZone actualValue = (AdministrativeZone) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			AdministrativeZoneEntity administrativeZone = new AdministrativeZoneEntity(
										id, 
										version,  
										name, 
										shortName,
										description);
		    // Save object
		    session.saveOrUpdate(administrativeZone);
		}
	}
	
}
