package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataSource;
import org.rutebanken.netex.entity.DataSourceEntity;

class DataSourceParser {
	
	public void parser (List<DataSource> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			DataSource actualValue = (DataSource) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String shortName = (actualValue.getShortName() == null) ?  null : actualValue.getShortName().getValue();
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			String email = (actualValue.getEmail() == null) ?  null : actualValue.getEmail();
			String privateCode = (actualValue.getPrivateCode() == null) ?  null : actualValue.getPrivateCode().getValue();
			DataSourceEntity dataSource = new DataSourceEntity(
										id, 
										version, 
										name,
										shortName, 
										email,
										privateCode,
										description);
		    // Save object
		    session.save(dataSource);
		}
	}
	
}
