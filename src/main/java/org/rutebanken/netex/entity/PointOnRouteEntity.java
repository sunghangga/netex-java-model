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
    
    @Column(name = "onward_route_link_ref")
    private String onwardRouteLinkRef;

	public PointOnRouteEntity(String id, String version, BigInteger orders, String routeRef, String routePointRef,
			String onwardRouteLinkRef) {
		this.id = id;
		this.version = version;
		this.orders = orders;
		this.routeRef = routeRef;
		this.routePointRef = routePointRef;
		this.onwardRouteLinkRef = onwardRouteLinkRef;
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

	public BigInteger getOrder() {
		return orders;
	}

	public void setOrder(BigInteger orders) {
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

	public String getOnwardRouteLinkRef() {
		return onwardRouteLinkRef;
	}

	public void setOnwardRouteLinkRef(String onwardRouteLinkRef) {
		this.onwardRouteLinkRef = onwardRouteLinkRef;
	}

	@Override
	public String toString() {
		return "PointOnRouteEntity [id=" + id + ", version=" + version + ", orders=" + orders + ", routeRef=" + routeRef
				+ ", routePointRef=" + routePointRef + ", onwardRouteLinkRef=" + onwardRouteLinkRef + "]";
	}
    
}
