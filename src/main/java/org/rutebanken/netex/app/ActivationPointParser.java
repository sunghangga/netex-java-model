package org.rutebanken.netex.app;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.hibernate.Session;
import org.rutebanken.netex.model.ActivationPoint;
import org.rutebanken.netex.model.Point_VersionStructure;
import org.rutebanken.netex.entity.ActivationPointEntity;

class ActivationPointParser {
	
	public void parser (List<JAXBElement<? extends Point_VersionStructure>> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ActivationPoint actualValue = (ActivationPoint) actual.get(i).getValue();
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			Double rdX = (actualValue.getLocation() == null) ?  null : actualValue.getLocation().getPos().getValue().get(0);
			Double rdY = (actualValue.getLocation() == null) ?  null : actualValue.getLocation().getPos().getValue().get(1);
			String privateCode = (actualValue.getPrivateCode() == null) ?  null : actualValue.getPrivateCode().getValue();
			String typeOfActivationRef = (actualValue.getTypeOfActivationRef() == null) ?  null : actualValue.getTypeOfActivationRef().getRef();
			ActivationPointEntity activationPoint = new ActivationPointEntity(
										id, 
										version,
										rdX,
										rdY,
										privateCode,
										typeOfActivationRef);
		    // Save object
		    session.saveOrUpdate(activationPoint);
		}
	}
	
}
