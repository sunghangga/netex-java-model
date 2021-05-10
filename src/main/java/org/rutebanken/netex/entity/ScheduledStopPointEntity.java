package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scheduled_stop_point")
public class ScheduledStopPointEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "rd_x")
    private Double rdX;
    
    @Column(name = "rd_y")
    private Double rdY;
    
    @Column(name = "route_point_ref")
    private String routePointRef;
    
    @Column(name = "stop_area_ref")
    private String stopAreaRef;
    
    @Column(name = "tariff_zone_ref")
    private String tariffZoneRef;
    
    @Column(name = "private_code")
    private String privateCode;

    @Column(name = "for_alighting")
    private Boolean forAlighting;
    
    @Column(name = "for_boarding")
    private Boolean forBoarding;

	public ScheduledStopPointEntity(String id, String version, String name, Double rdX, Double rdY,
			String routePointRef, String stopAreaRef, String tariffZoneRef, String privateCode, Boolean forAlighting,
			Boolean forBoarding) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.rdX = rdX;
		this.rdY = rdY;
		this.routePointRef = routePointRef;
		this.stopAreaRef = stopAreaRef;
		this.tariffZoneRef = tariffZoneRef;
		this.privateCode = privateCode;
		this.forAlighting = forAlighting;
		this.forBoarding = forBoarding;
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

	public String getRoutePointRef() {
		return routePointRef;
	}

	public void setRoutePointRef(String routePointRef) {
		this.routePointRef = routePointRef;
	}

	public String getStopAreaRef() {
		return stopAreaRef;
	}

	public void setStopAreaRef(String stopAreaRef) {
		this.stopAreaRef = stopAreaRef;
	}

	public String getTariffZoneRef() {
		return tariffZoneRef;
	}

	public void setTariffZoneRef(String tariffZoneRef) {
		this.tariffZoneRef = tariffZoneRef;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public Boolean getForAlighting() {
		return forAlighting;
	}

	public void setForAlighting(Boolean forAlighting) {
		this.forAlighting = forAlighting;
	}

	public Boolean getForBoarding() {
		return forBoarding;
	}

	public void setForBoarding(Boolean forBoarding) {
		this.forBoarding = forBoarding;
	}

	@Override
	public String toString() {
		return "ScheduledStopPointEntity [id=" + id + ", version=" + version + ", name=" + name + ", rdX=" + rdX
				+ ", rdY=" + rdY + ", routePointRef=" + routePointRef + ", stopAreaRef=" + stopAreaRef
				+ ", tariffZoneRef=" + tariffZoneRef + ", privateCode=" + privateCode + ", forAlighting=" + forAlighting
				+ ", forBoarding=" + forBoarding + "]";
	}
    
}
