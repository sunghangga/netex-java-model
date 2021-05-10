package org.rutebanken.netex.app;

import org.hibernate.Session;
import org.rutebanken.netex.entity.FrameDefaultEntity;
import org.rutebanken.netex.model.VersionFrameDefaultsStructure;

class FrameDefaultParser {
	
	public void parser (VersionFrameDefaultsStructure actual, String version, Session session) {
		
		// Initial process
		String defaultCurrency = (actual.getDefaultCurrency() == null) ?  null : actual.getDefaultCurrency();
	    String defaultDataSourceRef = (actual.getDefaultDataSourceRef() == null) ?  null : actual.getDefaultDataSourceRef().getRef();
	    String defaultLocaleDefaultLanguage = (actual.getDefaultLocale() == null) ?  null : actual.getDefaultLocale().getDefaultLanguage();
	    String defaultLocaleTimeZone = (actual.getDefaultLocale() == null) ?  null : actual.getDefaultLocale().getTimeZone();
	    String defaultLocationSystem = (actual.getDefaultLocationSystem() == null) ?  null : actual.getDefaultLocationSystem();
	    String defaultResponsibilitySetRef = (actual.getDefaultResponsibilitySetRef() == null) ? null : actual.getDefaultResponsibilitySetRef().getRef();
	    String defaultSystemOfUnits = (actual.getDefaultSystemOfUnits() == null) ? null : actual.getDefaultSystemOfUnits().toString();
	    FrameDefaultEntity frameDefaults = new FrameDefaultEntity(
	    											version,
	    											defaultCurrency, 
	    											defaultDataSourceRef,  
	    											defaultLocaleDefaultLanguage, 
	    											defaultLocaleTimeZone, 
	    											defaultLocationSystem, 
	    											defaultResponsibilitySetRef,
	    											defaultSystemOfUnits);
		
		// Save object
		session.saveOrUpdate(frameDefaults);
	}
	
}
