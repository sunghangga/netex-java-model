package org.rutebanken.netex.app;

import java.util.List;

import org.hibernate.Session;
import org.rutebanken.netex.model.ResponsibilitySet;
import org.rutebanken.netex.entity.ResponsibilityRoleAssignmentEntity;
import org.rutebanken.netex.entity.ResponsibilitySetEntity;

class ResponsibilitySetParser {
	
	public void parser (List<ResponsibilitySet> actual, String versions, Session session) {
		
		// Initial process
		for (int i = 0; i < actual.size(); i = i + 1) {
			ResponsibilitySet actualValue = (ResponsibilitySet) actual.get(i);
			String id = (actualValue.getId() == null) ?  null : actualValue.getId();
			String version = (versions == null) ?  null : versions;
			String name = (actualValue.getName() == null) ?  null : actualValue.getName().getValue();
			ResponsibilitySetEntity responsibilitySet = new ResponsibilitySetEntity(
										id, 
										version,  
										name);
		    // Save object
		    session.saveOrUpdate(responsibilitySet);
		    
		    if (actualValue.getRoles() != null && actualValue.getRoles().getResponsibilityRoleAssignment() != null) {
		    	for (int j = 0; j < actualValue.getRoles().getResponsibilityRoleAssignment().size(); j = j + 1) {
					String idResponsibilityRoleAssignment = (actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getId() == null) ?  null : actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getId();
					String versionResponsibilityRoleAssignment = (versions == null) ?  null : versions;
					String responsibilitySetRef = (actualValue.getId() == null) ?  null : actualValue.getId();
					String responsibleAreaRef = (actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getResponsibleAreaRef() == null) ?  null : actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getResponsibleAreaRef().getRef();
					String responsibleOrganisationRef = (actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getResponsibleOrganisationRef() == null) ?  null : actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getResponsibleOrganisationRef().getRef();
					String stakeholderRoleType = (actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getStakeholderRoleType() == null) ?  null : actualValue.getRoles().getResponsibilityRoleAssignment().get(j).getStakeholderRoleType().toString();
					ResponsibilityRoleAssignmentEntity responsibilityRoleAssignment = new ResponsibilityRoleAssignmentEntity(
							idResponsibilityRoleAssignment, 
							versionResponsibilityRoleAssignment,  
							responsibilitySetRef, 
							responsibleAreaRef, 
							responsibleOrganisationRef,
							stakeholderRoleType);
					// Save object
				    session.saveOrUpdate(responsibilityRoleAssignment);
				}
		    }
		}
	}
	
}
