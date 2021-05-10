package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="responsibility_role_assignment")
public class ResponsibilityRoleAssignmentEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "responsibility_set_ref")
    private String responsibilitySetRef;
    
    @Column(name = "responsible_area_ref")
    private String responsibleAreaRef;
    
    @Column(name = "responsible_organisation_ref")
    private String responsibleOrganisationRef;
    
    @Column(name = "stakeholder_role_type")
    private String stakeholderRoleType;

	public ResponsibilityRoleAssignmentEntity(String id, String version, String responsibilitySetRef,
			String responsibleAreaRef, String responsibleOrganisationRef, String stakeholderRoleType) {
		super();
		this.id = id;
		this.version = version;
		this.responsibilitySetRef = responsibilitySetRef;
		this.responsibleAreaRef = responsibleAreaRef;
		this.responsibleOrganisationRef = responsibleOrganisationRef;
		this.stakeholderRoleType = stakeholderRoleType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getResponsibilitySetRef() {
		return responsibilitySetRef;
	}

	public void setResponsibilitySetRef(String responsibilitySetRef) {
		this.responsibilitySetRef = responsibilitySetRef;
	}

	public String getResponsibleAreaRef() {
		return responsibleAreaRef;
	}

	public void setResponsibleAreaRef(String responsibleAreaRef) {
		this.responsibleAreaRef = responsibleAreaRef;
	}

	public String getResponsibleOrganisationRef() {
		return responsibleOrganisationRef;
	}

	public void setResponsibleOrganisationRef(String responsibleOrganisationRef) {
		this.responsibleOrganisationRef = responsibleOrganisationRef;
	}

	public String getStakeholderRoleType() {
		return stakeholderRoleType;
	}

	public void setStakeholderRoleType(String stakeholderRoleType) {
		this.stakeholderRoleType = stakeholderRoleType;
	}

	@Override
	public String toString() {
		return "ResponsibilityRoleAssignmentEntity [id=" + id + ", version=" + version + ", responsibilitySetRef="
				+ responsibilitySetRef + ", responsibleAreaRef=" + responsibleAreaRef + ", responsibleOrganisationRef="
				+ responsibleOrganisationRef + ", stakeholderRoleType=" + stakeholderRoleType + "]";
	}

}
