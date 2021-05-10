package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.rutebanken.netex.model.LimitationStatusEnumeration;

@Entity
@Table(name="line")
public class LineEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "responsibility_set_ref")
    private String responsibilitySetRef;
    
    @Column(name = "branding_ref")
    private String brandingRef;
    
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "transport_mode")
    private String transportMode;

    @Column(name = "operational_context_ref")
    private String operationalContextRef;
    
    @Column(name = "public_code")
    private String publicCode;
    
    @Column(name = "private_code")
    private String privateCode;
	
    @Column(name = "external_line_ref")
    private String externalLineRef;
    
    @Column(name = "authority_ref")
    private String authorityRef;
    
    @Column(name = "type_of_product_category_ref")
    private String typeOfProductCategoryRef;
    
    @Column(name = "type_of_service_ref")
    private String typeOfServiceRef;

    @Column(name = "monitored")
    private Boolean monitored;

    @Column(name = "accessibility_assessment")
    private LimitationStatusEnumeration accessibilityAssessment;

	public LineEntity(String id, String version, String responsibilitySetRef, String brandingRef, String name,
			String description, String transportMode, String operationalContextRef, String publicCode,
			String privateCode, String externalLineRef, String authorityRef, String typeOfProductCategoryRef,
			String typeOfServiceRef, Boolean monitored, LimitationStatusEnumeration accessibilityAssessment) {
		super();
		this.id = id;
		this.version = version;
		this.responsibilitySetRef = responsibilitySetRef;
		this.brandingRef = brandingRef;
		this.name = name;
		this.description = description;
		this.transportMode = transportMode;
		this.operationalContextRef = operationalContextRef;
		this.publicCode = publicCode;
		this.privateCode = privateCode;
		this.externalLineRef = externalLineRef;
		this.authorityRef = authorityRef;
		this.typeOfProductCategoryRef = typeOfProductCategoryRef;
		this.typeOfServiceRef = typeOfServiceRef;
		this.monitored = monitored;
		this.accessibilityAssessment = accessibilityAssessment;
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

	public String getBrandingRef() {
		return brandingRef;
	}

	public void setBrandingRef(String brandingRef) {
		this.brandingRef = brandingRef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getOperationalContextRef() {
		return operationalContextRef;
	}

	public void setOperationalContextRef(String operationalContextRef) {
		this.operationalContextRef = operationalContextRef;
	}

	public String getPublicCode() {
		return publicCode;
	}

	public void setPublicCode(String publicCode) {
		this.publicCode = publicCode;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public String getExternalLineRef() {
		return externalLineRef;
	}

	public void setExternalLineRef(String externalLineRef) {
		this.externalLineRef = externalLineRef;
	}

	public String getAuthorityRef() {
		return authorityRef;
	}

	public void setAuthorityRef(String authorityRef) {
		this.authorityRef = authorityRef;
	}

	public String getTypeOfProductCategoryRef() {
		return typeOfProductCategoryRef;
	}

	public void setTypeOfProductCategoryRef(String typeOfProductCategoryRef) {
		this.typeOfProductCategoryRef = typeOfProductCategoryRef;
	}

	public String getTypeOfServiceRef() {
		return typeOfServiceRef;
	}

	public void setTypeOfServiceRef(String typeOfServiceRef) {
		this.typeOfServiceRef = typeOfServiceRef;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public LimitationStatusEnumeration getAccessibilityAssessment() {
		return accessibilityAssessment;
	}

	public void setAccessibilityAssessment(LimitationStatusEnumeration accessibilityAssessment) {
		this.accessibilityAssessment = accessibilityAssessment;
	}

	@Override
	public String toString() {
		return "LineEntity [id=" + id + ", version=" + version + ", responsibilitySetRef=" + responsibilitySetRef
				+ ", brandingRef=" + brandingRef + ", name=" + name + ", description=" + description
				+ ", transportMode=" + transportMode + ", operationalContextRef=" + operationalContextRef
				+ ", publicCode=" + publicCode + ", privateCode=" + privateCode + ", externalLineRef=" + externalLineRef
				+ ", authorityRef=" + authorityRef + ", typeOfProductCategoryRef=" + typeOfProductCategoryRef
				+ ", typeOfServiceRef=" + typeOfServiceRef + ", monitored=" + monitored + ", accessibilityAssessment="
				+ accessibilityAssessment + "]";
	}
    
}
