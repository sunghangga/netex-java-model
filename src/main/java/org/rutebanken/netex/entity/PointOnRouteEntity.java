package org.rutebanken.netex.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="point_on_route")
public class PointOnRouteEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "route_ref")
    private String routeRef;
    
    @Column(name = "route_point_ref")
    private String routePointRef;
    
    @Column(name = "route_link_ref")
    private String routeLinkRef;

	public PointOnRouteEntity(String id, String version, BigInteger orders, String routeRef, String routePointRef,
			String routeLinkRef) {
		super();
		this.id = id;
		this.version = version;
		this.orders = orders;
		this.routeRef = routeRef;
		this.routePointRef = routePointRef;
		this.routeLinkRef = routeLinkRef;
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

	public BigInteger getOrders() {
		return orders;
	}

	public void setOrders(BigInteger orders) {
		this.orders = orders;
	}

	public String getRouteRef() {
		return routeRef;
	}

	public void setRouteRef(String routeRef) {
		this.routeRef = routeRef;
	}

	public String getRoutePointRef() {
		return routePointRef;
	}

	public void setRoutePointRef(String routePointRef) {
		this.routePointRef = routePointRef;
	}

	public String getRouteLinkRef() {
		return routeLinkRef;
	}

	public void setRouteLinkRef(String routeLinkRef) {
		this.routeLinkRef = routeLinkRef;
	}

	@Override
	public String toString() {
		return "PointOnRouteEntity [id=" + id + ", version=" + version + ", orders=" + orders + ", routeRef=" + routeRef
				+ ", routePointRef=" + routePointRef + ", routeLinkRef=" + routeLinkRef + "]";
	}

}
