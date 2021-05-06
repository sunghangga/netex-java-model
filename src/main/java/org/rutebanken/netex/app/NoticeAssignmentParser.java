package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.NoticeAssignment;
import org.rutebanken.netex.entity.NoticeAssignmentEntity;

class NoticeAssignmentParser {
	
	public void parser (List<JAXBElement<? extends DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			NoticeAssignment actualValue = (NoticeAssignment) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			BigInteger orders = (actualValue.getOrder() == null) ?  null : actualValue.getOrder();
			String noticeRef = (actualValue.getNoticeRef() == null) ?  null : actualValue.getNoticeRef().getRef();
			String noticedObjectRef = (actualValue.getNoticedObjectRef() == null) ?  null : actualValue.getNoticedObjectRef().getRef();
			NoticeAssignmentEntity noticeAssignment = new NoticeAssignmentEntity(
										id, 
										version,  
										orders, 
										noticeRef,
										noticedObjectRef);
		    // Save object
		    session.save(noticeAssignment);
		}
	}
	
}
