package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operator")
public class OperatorEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "short_name")
    private String shortName;

    @Column(name = "contact_email")
    private String contactEmail;
    
    @Column(name = "contact_phone")
    private String contactPhone;
    
    @Column(name = "contact_url")
    private String contactUrl;

	public OperatorEntity(String id, String version, String name, String shortName, String contactEmail,
			String contactPhone, String contactUrl) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.shortName = shortName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.contactUrl = contactUrl;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactUrl() {
		return contactUrl;
	}

	public void setContactUrl(String contactUrl) {
		this.contactUrl = contactUrl;
	}

	@Override
	public String toString() {
		return "OperatorEntity [id=" + id + ", version=" + version + ", name=" + name + ", shortName=" + shortName
				+ ", contactEmail=" + contactEmail + ", contactPhone=" + contactPhone + ", contactUrl=" + contactUrl
				+ "]";
	}
	
}
