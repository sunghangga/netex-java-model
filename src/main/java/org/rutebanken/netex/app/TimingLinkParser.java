package org.rutebanken.netex.app;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.TimingLink;
import org.rutebanken.netex.entity.TimingLinkEntity;

class TimingLinkParser {
	
	public void parser (List<TimingLink> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			TimingLink actualValue = (TimingLink) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String responsibilitySetRef = (actualValue.getResponsibilitySetRef() == null) ?  null : actualValue.getResponsibilitySetRef();
			String fromPointRef = (actualValue.getFromPointRef() == null) ?  null : actualValue.getFromPointRef().getRef();
			String toPointRef = (actualValue.getToPointRef() == null) ?  null : actualValue.getToPointRef().getRef();
			BigDecimal distance = (actualValue.getDistance() == null) ?  null : actualValue.getDistance();
			String operationalContextRef = (actualValue.getOperationalContextRef() == null) ?  null : actualValue.getOperationalContextRef().getRef();
			TimingLinkEntity timingLink = new TimingLinkEntity(
										id, 
										version,  
										responsibilitySetRef, 
										fromPointRef,
										toPointRef,
										distance,
										operationalContextRef);
		    // Save object
		    session.saveOrUpdate(timingLink);
		}
	}
	
}
