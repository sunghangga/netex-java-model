package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.OperationalContext;
import org.rutebanken.netex.entity.OperationalContextEntity;

class OperationalContextParser {
	
	public void parser (List<OperationalContext> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			OperationalContext actualValue = (OperationalContext) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String vehicleMode = (actualValue.getVehicleMode() == null) ?  null : actualValue.getVehicleMode().toString();
			String transportSubmode = (actualValue.getTransportSubmode() == null) ?  null : actualValue.getTransportSubmode().getBusSubmode().toString();
			OperationalContextEntity operationalContext = new OperationalContextEntity(
										id, 
										version,  
										vehicleMode, 
										transportSubmode);
		    // Save object
		    session.saveOrUpdate(operationalContext);
		}
	}
	
}
