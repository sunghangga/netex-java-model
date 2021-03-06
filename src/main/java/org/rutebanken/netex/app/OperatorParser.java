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
				String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
				String contactEmail = (actualValue.getContactDetails() == null) ?  null : actualValue.getContactDetails().getEmail();
				String contactPhone = (actualValue.getContactDetails() == null) ?  null : actualValue.getContactDetails().getPhone();
				String contactUrl = (actualValue.getContactDetails() == null) ?  null : actualValue.getContactDetails().getUrl();
				OperatorEntity operator = new OperatorEntity(
											id, 
											version,  
											name,
											shortName,
											contactEmail,
											contactPhone,
											contactUrl);
			    // Save object
			    session.saveOrUpdate(operator);
			}
			else if (actual.get(i).getValue() instanceof Authority) {
				Authority actualValue = (Authority) actual.get(i).getValue();
				String id = (actualValue.getId() == null) ?  null : actualValue.getId();
				String version = (versions == null) ?  null : versions;
				String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
				String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
				AuthorityEntity authority = new AuthorityEntity(
											id, 
											version,  
											name,
											shortName);
			    // Save object
			    session.saveOrUpdate(authority);
			}
		}
	}
	
}
