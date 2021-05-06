package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.Authority;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.Operator;
import org.rutebanken.netex.entity.AuthorityEntity;
import org.rutebanken.netex.entity.OperatorEntity;

class OperatorParser {
	
	public void parser (List<JAXBElement<? extends DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			if (actual.get(i).getValue() instanceof Operator) {
				Operator actualValue = (Operator) actual.get(i).getValue();
				String id = (actualValue.getId() == null) ?  null : actualValue.getId();
				String version = (versions == null) ?  null : versions;
				String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
				OperatorEntity operator = new OperatorEntity(
											id, 
											version,  
											name);
			    // Save object
			    session.save(operator);
			}
			else if (actual.get(i).getValue() instanceof Authority) {
				Authority actualValue = (Authority) actual.get(i).getValue();
				String id = (actualValue.getId() == null) ?  null : actualValue.getId();
				String version = (versions == null) ?  null : versions;
				String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
				AuthorityEntity authority = new AuthorityEntity(
											id, 
											version,  
											name);
			    // Save object
			    session.save(authority);
			}
		}
	}
	
}
