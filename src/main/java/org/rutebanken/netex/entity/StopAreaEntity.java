package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stop_area")
public class StopAreaEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "publicCode")
    private String publicCode;
    
    @Column(name = "privateCode")
    private String privateCode;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "topographicPlaceView")
    private String topographicPlaceView;

	public StopAreaEntity(String id, String version, String name, String publicCode, String privateCode,
			String description, String topographicPlaceView) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.publicCode = publicCode;
		this.privateCode = privateCode;
		this.description = description;
		this.topographicPlaceView = topographicPlaceView;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTopographicPlaceView() {
		return topographicPlaceView;
	}

	public void setTopographicPlaceView(String topographicPlaceView) {
		this.topographicPlaceView = topographicPlaceView;
	}

	@Override
	public String toString() {
		return "StopAreaEntity [id=" + id + ", version=" + version + ", name=" + name + ", publicCode=" + publicCode
				+ ", privateCode=" + privateCode + ", description=" + description + ", topographicPlaceView="
				+ topographicPlaceView + "]";
	}
    
}
