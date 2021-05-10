package org.rutebanken.netex.app;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.entity.AvailabilityConditionEntity;
import org.rutebanken.netex.model.AvailabilityCondition;

class AvailabilityConditionParser {
	
	public void parser (List<Object> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			AvailabilityCondition actualValue = (AvailabilityCondition) (actual.get(i));
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ? null : actualValue.getName().getValue();
			LocalDateTime fromDate = (actualValue.getFromDate() == null) ?  null : actualValue.getFromDate();
			LocalDateTime toDate = (actualValue.getToDate() == null) ?  null : actualValue.getToDate();
			String validDayBits = (actualValue.getValidDayBits() == null) ? null : actualValue.getValidDayBits();
		    AvailabilityConditionEntity availabilityCondition = new AvailabilityConditionEntity(
										id, 
										version, 
										name,
										fromDate, 
										toDate,
										validDayBits);
		    // Save object
		    session.saveOrUpdate(availabilityCondition);
		}
	}
	
}
