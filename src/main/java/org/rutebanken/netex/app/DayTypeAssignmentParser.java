package org.rutebanken.netex.app;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.entity.DayTypeAssignmentEntity;
import org.rutebanken.netex.model.DayTypeAssignment;

class DayTypeAssignmentParser {
	
	public void parser (List<DayTypeAssignment> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			DayTypeAssignment actualValue = (DayTypeAssignment) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			BigInteger orders = (actualValue.getOrder() == null) ?  null : actualValue.getOrder();
			LocalDateTime date = (actualValue.getDate() == null) ?  null : actualValue.getDate();
			String dayTypeRef = (actualValue.getDayTypeRef() == null) ?  null : actualValue.getDayTypeRef().getValue().getRef();
			DayTypeAssignmentEntity dayTypeAssignment = new DayTypeAssignmentEntity(
										id, 
										version,  
										orders, 
										date,
										dayTypeRef);
		    // Save object
		    session.saveOrUpdate(dayTypeAssignment);
		}
	}
	
}
