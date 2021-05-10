package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="activation_point")
public class ActivationPointEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "rd_x")
    private Double rdX;
    
    @Column(name = "rd_y")
    private Double rdY;
    
    @Column(name = "private_code")
    private String privateCode;
    
    @Column(name = "type_of_activation_ref")
    private String typeOfActivationRef;

	public ActivationPointEntity(String id, String version, Double rdX, Double rdY, String privateCode,
			String typeOfActivationRef) {
		super();
		this.id = id;
		this.version = version;
		this.rdX = rdX;
		this.rdY = rdY;
		this.privateCode = privateCode;
		this.typeOfActivationRef = typeOfActivationRef;
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

	public Double getRdX() {
		return rdX;
	}

	public void setRdX(Double rdX) {
		this.rdX = rdX;
	}

	public Double getRdY() {
		return rdY;
	}

	public void setRdY(Double rdY) {
		this.rdY = rdY;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public String getTypeOfActivationRef() {
		return typeOfActivationRef;
	}

	public void setTypeOfActivationRef(String typeOfActivationRef) {
		this.typeOfActivationRef = typeOfActivationRef;
	}

	@Override
	public String toString() {
		return "ActivationPointEntity [id=" + id + ", version=" + version + ", rdX=" + rdX + ", rdY=" + rdY
				+ ", privateCode=" + privateCode + ", typeOfActivationRef=" + typeOfActivationRef + "]";
	}
	
}
