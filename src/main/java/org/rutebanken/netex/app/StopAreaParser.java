package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.StopArea;
import org.rutebanken.netex.entity.StopAreaEntity;

class StopAreaParser {
	
	public void parser (List<StopArea> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			StopArea actualValue = (StopArea) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String publicCode = (actualValue.getPublicCode() == null) ? null : actualValue.getPublicCode();
			String privateCode = (actualValue.getPrivateCode() == null) ? null : actualValue.getPrivateCode().getValue();
			String description = (actualValue.getDescription() == null) ? null : actualValue.getDescription().getValue();
			String topographicPlaceView = (actualValue.getTopographicPlaceView() == null) ? null : actualValue.getTopographicPlaceView().getName().getValue();
			StopAreaEntity stopArea = new StopAreaEntity(
										id, 
										version,  
										name, 
										publicCode,
										privateCode,
										description,
										topographicPlaceView);
		    // Save object
		    session.saveOrUpdate(stopArea);
		}
	}
	
}
