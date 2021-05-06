package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.TypeOfProductCategory;
import org.rutebanken.netex.entity.TypeOfProductCategoryEntity;

class TypeOfProductCategoryParser {
	
	public void parser (List<JAXBElement<? extends DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			TypeOfProductCategory actualValue = (TypeOfProductCategory) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			TypeOfProductCategoryEntity typeOfProductCategory = new TypeOfProductCategoryEntity(
										id, 
										version,  
										name);
		    // Save object
		    session.save(typeOfProductCategory);
		}
	}
	
}
