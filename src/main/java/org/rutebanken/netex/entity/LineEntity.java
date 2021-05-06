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
    
    @Column(name = "accessibility_assessment")
    private LimitationStatusEnumeration accessibilityAssessment;
    
    @Column(name = "authority_ref")
    private String authorityRef;
    
    @Column(name = "monitored")
    private Boolean monitored;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "public_code")
    private String publicCode;
    
    @Column(name = "transport_mode")
    private String transportMode;

	public LineEntity(String id, String version, LimitationStatusEnumeration accessibilityAssessment,
			String authorityRef, Boolean monitored, String name, String publicCode, String transportMode) {
		this.id = id;
		this.version = version;
		this.accessibilityAssessment = accessibilityAssessment;
		this.authorityRef = authorityRef;
		this.monitored = monitored;
		this.name = name;
		this.publicCode = publicCode;
		this.transportMode = transportMode;
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

	public LimitationStatusEnumeration getAccessibilityAssessment() {
		return accessibilityAssessment;
	}

	public void setAccessibilityAssessment(LimitationStatusEnumeration accessibilityAssessment) {
		this.accessibilityAssessment = accessibilityAssessment;
	}

	public String getAuthorityRef() {
		return authorityRef;
	}

	public void setAuthorityRef(String authorityRef) {
		this.authorityRef = authorityRef;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublicCode() {
		return publicCode;
	}

	public void setPublicCode(String publicCode) {
		this.publicCode = publicCode;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	@Override
	public String toString() {
		return "LineEntity [id=" + id + ", version=" + version + ", accessibilityAssessment=" + accessibilityAssessment
				+ ", authorityRef=" + authorityRef + ", monitored=" + monitored + ", name=" + name + ", publicCode="
				+ publicCode + ", transportMode=" + transportMode + "]";
	}
    
}
