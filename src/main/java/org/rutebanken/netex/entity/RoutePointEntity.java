package org.rutebanken.netex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="route_point")
public class RoutePointEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "rd_x")
    private Double rdX;
    
    @Column(name = "rd_y")
    private Double rdY;

	public RoutePointEntity(String id, String version, Double rdX, Double rdY) {
		this.id = id;
		this.version = version;
		this.rdX = rdX;
		this.rdY = rdY;
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

	@Override
	public String toString() {
		return "RoutePointsEntity [id=" + id + ", version=" + version + ", rdX=" + rdX
				+ ", rdY=" + rdY + "]";
	}
    
}
