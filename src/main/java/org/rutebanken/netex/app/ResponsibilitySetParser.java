package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.ResponsibilitySet;
import org.rutebanken.netex.entity.ResponsibilitySetEntity;

class ResponsibilitySetParser {
	
	public void parser (List<ResponsibilitySet> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ResponsibilitySet actualValue = (ResponsibilitySet) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			ResponsibilitySetEntity responsibilitySet = new ResponsibilitySetEntity(
										id, 
										version,  
										name);
		    // Save object
		    session.save(responsibilitySet);
		}
	}
	
}
