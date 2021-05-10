package org.rutebanken.netex.app;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.entity.VersionEntity;
import org.rutebanken.netex.model.Version;

class VersionParser {
	
	public void parser (List<Object> actual, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Version actualValue = (Version) actual.get(i);
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			LocalDateTime endDate = (actualValue.getEndDate() == null) ?  null : actualValue.getEndDate();
			LocalDateTime startDate = (actualValue.getStartDate() == null) ?  null : actualValue.getStartDate();
		    String versionType = (actualValue.getVersionType() == null) ?  null : actualValue.getVersionType().toString();
		    String modification = (actualValue.getModification() == null) ?  null : actualValue.getModification().toString();
		    String version = (actualValue.getVersion() == null) ?  null : actualValue.getVersion();
		    String id = (actualValue.getId() == null) ?  null : actualValue.getId();
		    String derivedFromVersionRef = (actualValue.getDerivedFromVersionRef() == null) ?  null : actualValue.getDerivedFromVersionRef().getRef();;
		    VersionEntity versions = new VersionEntity(
										id, 
										version,  
										modification, 
										versionType, 
										startDate, 
										endDate,
										description,
										derivedFromVersionRef);
		    // Save object
		    session.saveOrUpdate(versions);
		}
	}
	
}
