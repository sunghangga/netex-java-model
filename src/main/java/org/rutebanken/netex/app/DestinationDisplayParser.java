package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.DestinationDisplay;
import org.rutebanken.netex.entity.DestinationDisplayEntity;

class DestinationDisplayParser {
	
	public void parser (List<DestinationDisplay> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			DestinationDisplay actualValue = (DestinationDisplay) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String sideText = (actualValue.getSideText() == null) ?  null : actualValue.getSideText().getValue();
			String frontText = (actualValue.getFrontText() == null) ?  null : actualValue.getFrontText().getValue();
			String privateCode = (actualValue.getPrivateCode() == null) ?  null : actualValue.getPrivateCode().getValue();
			String via = (actualValue.getVias() == null) ?  null : actualValue.getVias().getVia().get(0).getName().getValue();
			String variant = null;
			if (actualValue.getVariants() != null && actualValue.getVariants().getDestinationDisplayVariant().get(0).getName() != null) {
				variant = actualValue.getVariants().getDestinationDisplayVariant().get(0).getName().getValue();
			}
			DestinationDisplayEntity destinationDisplays = new DestinationDisplayEntity(
										id, 
										version,  
										name, 
										shortName,
										sideText,
										frontText,
										privateCode,
										via,
										variant);
		    // Save object
		    session.saveOrUpdate(destinationDisplays);
		}
	}
	
}
