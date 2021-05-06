package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.DataManagedObjectStructure;
import org.rutebanken.netex.model.LimitationStatusEnumeration;
import org.rutebanken.netex.model.Line;
import org.rutebanken.netex.entity.LineEntity;

class LineParser {
	
	public void parser (List<JAXBElement<? extends 
			DataManagedObjectStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			Line actualValue = (Line) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			LimitationStatusEnumeration accessibilityAssessment = (actualValue.getAccessibilityAssessment() == null) ?  null : actualValue.getAccessibilityAssessment().getMobilityImpairedAccess();
			String authorityRef = (actualValue.getAuthorityRef() == null) ?  null : actualValue.getAuthorityRef().getRef();
			Boolean monitored = (actualValue.isMonitored() == null) ?  null : actualValue.isMonitored();
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String publicCode = (actualValue.getPublicCode() == null) ?  null : actualValue.getPublicCode();
			String transportMode = (actualValue.getTransportMode() == null) ?  null : actualValue.getTransportMode().toString();
		    LineEntity lines = new LineEntity(
										id, 
										version,  
										accessibilityAssessment, 
										authorityRef,
										monitored,
										name,
										publicCode,
										transportMode);
		    // Save object
		    session.save(lines);
		}
	}
	
}
