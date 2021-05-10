package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class VehicleEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "short_name")
    private String shortName;
    
    @Column(name = "branding_ref")
    private String brandingRef;
    
    @Column(name = "registration_number")
    private String registrationNumber;
    
    @Column(name = "operational_number")
    private String operationalNumber;
    
    @Column(name = "operator_ref")
    private String operatorRef;
    
    @Column(name = "vehicle_type_ref")
    private String vehicleTypeRef;

	public VehicleEntity(String id, String version, String name, String shortName, String brandingRef,
			String registrationNumber, String operationalNumber, String operatorRef, String vehicleTypeRef) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.shortName = shortName;
		this.brandingRef = brandingRef;
		this.registrationNumber = registrationNumber;
		this.operationalNumber = operationalNumber;
		this.operatorRef = operatorRef;
		this.vehicleTypeRef = vehicleTypeRef;
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

	public String getBrandingRef() {
		return brandingRef;
	}

	public void setBrandingRef(String brandingRef) {
		this.brandingRef = brandingRef;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getOperationalNumber() {
		return operationalNumber;
	}

	public void setOperationalNumber(String operationalNumber) {
		this.operationalNumber = operationalNumber;
	}

	public String getOperatorRef() {
		return operatorRef;
	}

	public void setOperatorRef(String operatorRef) {
		this.operatorRef = operatorRef;
	}

	public String getVehicleTypeRef() {
		return vehicleTypeRef;
	}

	public void setVehicleTypeRef(String vehicleTypeRef) {
		this.vehicleTypeRef = vehicleTypeRef;
	}

	@Override
	public String toString() {
		return "VehicleEntity [id=" + id + ", version=" + version + ", name=" + name + ", shortName=" + shortName
				+ ", brandingRef=" + brandingRef + ", registrationNumber=" + registrationNumber + ", operationalNumber="
				+ operationalNumber + ", operatorRef=" + operatorRef + ", vehicleTypeRef=" + vehicleTypeRef + "]";
	}
    
}
