package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.Block;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.entity.BlockEntity;

class BlockParser {
	
	public void parser (List<DataManagedObjectStructure> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Block actualValue = (Block) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			BlockEntity blocks = new BlockEntity(
										id, 
										version);
		    // Save object
		    session.save(blocks);
		}
	}
	
}
