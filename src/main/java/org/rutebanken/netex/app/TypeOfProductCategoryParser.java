package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.Branding;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.TypeOfProductCategory;
import org.rutebanken.netex.entity.BrandingEntity;
import org.rutebanken.netex.entity.TypeOfProductCategoryEntity;

class TypeOfProductCategoryParser {
	
	public void parser (List<JAXBElement<? extends DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			if (actual.get(i).getValue() instanceof TypeOfProductCategory) {
				TypeOfProductCategory actualValue = (TypeOfProductCategory) actual.get(i).getValue();
				String id = (actualValue.getId() == null) ?  null : actualValue.getId();
				String version = (versions == null) ?  null : versions;
				String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
				String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
				String image = (actualValue.getImage() == null) ?  null : actualValue.getImage();
				String url = (actualValue.getUrl() == null) ?  null : actualValue.getUrl();
				TypeOfProductCategoryEntity typeOfProductCategory = new TypeOfProductCategoryEntity(
											id, 
											version,  
											name,
											description,
											image,
											url);
			    // Save object
			    session.saveOrUpdate(typeOfProductCategory);
			}
			else if (actual.get(i).getValue() instanceof Branding) {
				Branding actualValue = (Branding) actual.get(i).getValue();
				String id = (actualValue.getId() == null) ?  null : actualValue.getId();
				String version = (versions == null) ?  null : versions;
				String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
				String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
				String image = (actualValue.getImage() == null) ?  null : actualValue.getImage();
				String url = (actualValue.getUrl() == null) ?  null : actualValue.getUrl();
				BrandingEntity branding = new BrandingEntity(
											id, 
											version,  
											name,
											description,
											image,
											url);
			    // Save object
			    session.saveOrUpdate(branding);
			}
		}
	}
	
}
