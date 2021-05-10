package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timing_point")
public class TimingPointEntity {
	
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

	public TimingPointEntity(String id, String version, String name, Double rdX, Double rdY, String routePointRef) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.rdX = rdX;
		this.rdY = rdY;
		this.routePointRef = routePointRef;
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

	@Override
	public String toString() {
		return "TimingPointEntity [id=" + id + ", version=" + version + ", name=" + name + ", rdX=" + rdX + ", rdY="
				+ rdY + ", routePointRef=" + routePointRef + "]";
	}
	
}
