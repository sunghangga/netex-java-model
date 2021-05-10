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
			String responsibilitySetRef = (actualValue.getResponsibilitySetRef() == null) ?  null : actualValue.getResponsibilitySetRef();
			String brandingRef = (actualValue.getBrandingRef() == null) ?  null : actualValue.getBrandingRef().getRef();
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			String description = (actualValue.getDescription() == null) ?  null : actualValue.getDescription().getValue();
			String transportMode = (actualValue.getTransportMode() == null) ?  null : actualValue.getTransportMode().toString();
			String operationalContextRef = (actualValue.getOperationalContextRef() == null) ?  null : actualValue.getOperationalContextRef().getRef();
			String publicCode = (actualValue.getPublicCode() == null) ?  null : actualValue.getPublicCode();
			String privateCode = (actualValue.getPrivateCode() == null) ?  null : actualValue.getPrivateCode().getValue();
			String externalLineRef = (actualValue.getExternalLineRef() == null) ?  null : actualValue.getExternalLineRef().getRef();
			String authorityRef = (actualValue.getAuthorityRef() == null) ?  null : actualValue.getAuthorityRef().getRef();
			String typeOfProductCategoryRef = (actualValue.getTypeOfProductCategoryRef() == null) ?  null : actualValue.getTypeOfProductCategoryRef().getRef();
			String typeOfServiceRef = (actualValue.getTypeOfServiceRef() == null) ?  null : actualValue.getTypeOfServiceRef().getRef();
			Boolean monitored = (actualValue.isMonitored() == null) ?  null : actualValue.isMonitored();
			LimitationStatusEnumeration accessibilityAssessment = (actualValue.getAccessibilityAssessment() == null) ?  null : actualValue.getAccessibilityAssessment().getMobilityImpairedAccess();
			LineEntity lines = new LineEntity(
										id, 
										version,  
										responsibilitySetRef,
										brandingRef,
										name,
										description,
										transportMode,
										operationalContextRef,
										publicCode,
										privateCode,
										externalLineRef,
										authorityRef,
										typeOfProductCategoryRef,
										typeOfServiceRef,
										monitored,
										accessibilityAssessment);
		    // Save object
		    session.saveOrUpdate(lines);
		}
	}
	
}
