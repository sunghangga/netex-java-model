package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="destination_display")
public class DestinationDisplayEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "short_name")
    private String shortName;

    @Column(name = "side_text")
    private String sideText;
    
    @Column(name = "front_text")
    private String frontText;
    
    @Column(name = "private_code")
    private String privateCode;
    
    @Column(name = "via")
    private String via;
    
    @Column(name = "variant")
    private String variant;

	public DestinationDisplayEntity(String id, String version, String name, String shortName, String sideText,
			String frontText, String privateCode, String via, String variant) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.shortName = shortName;
		this.sideText = sideText;
		this.frontText = frontText;
		this.privateCode = privateCode;
		this.via = via;
		this.variant = variant;
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

	public String getSideText() {
		return sideText;
	}

	public void setSideText(String sideText) {
		this.sideText = sideText;
	}

	public String getFrontText() {
		return frontText;
	}

	public void setFrontText(String frontText) {
		this.frontText = frontText;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	@Override
	public String toString() {
		return "DestinationDisplayEntity [id=" + id + ", version=" + version + ", name=" + name + ", shortName="
				+ shortName + ", sideText=" + sideText + ", frontText=" + frontText + ", privateCode=" + privateCode
				+ ", via=" + via + ", variant=" + variant + "]";
	}
	
}
