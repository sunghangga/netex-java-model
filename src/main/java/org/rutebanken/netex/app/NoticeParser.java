package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.Notice;
import org.rutebanken.netex.entity.NoticeEntity;

class NoticeParser {
	
	public void parser (List<Notice> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Notice actualValue = (Notice) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String text = (actualValue.getText() == null) ?  null : actualValue.getText().getValue();
			NoticeEntity notices = new NoticeEntity(
										id, 
										version,
										name,
										text);
		    // Save object
		    session.saveOrUpdate(notices);
		}
	}
	
}
