package org.rutebanken.netex.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="point_on_link")
public class PointOnLinkEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "route_link_ref")
    private String routeLinkRef;
    
    @Column(name = "distance_from_start")
    private BigDecimal distanceFromStart;
    
    @Column(name = "activation_point_ref")
    private String activationPointRef;

	public PointOnLinkEntity(String id, String version, BigInteger orders, String routeLinkRef,
			BigDecimal distanceFromStart, String activationPointRef) {
		super();
		this.id = id;
		this.version = version;
		this.orders = orders;
		this.routeLinkRef = routeLinkRef;
		this.distanceFromStart = distanceFromStart;
		this.activationPointRef = activationPointRef;
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

	public String getRouteLinkRef() {
		return routeLinkRef;
	}

	public void setRouteLinkRef(String routeLinkRef) {
		this.routeLinkRef = routeLinkRef;
	}

	public BigDecimal getDistanceFromStart() {
		return distanceFromStart;
	}

	public void setDistanceFromStart(BigDecimal distanceFromStart) {
		this.distanceFromStart = distanceFromStart;
	}

	public String getActivationPointRef() {
		return activationPointRef;
	}

	public void setActivationPointRef(String activationPointRef) {
		this.activationPointRef = activationPointRef;
	}

	@Override
	public String toString() {
		return "PointOnLinkEntity [id=" + id + ", version=" + version + ", orders=" + orders + ", routeLinkRef="
				+ routeLinkRef + ", distanceFromStart=" + distanceFromStart + ", activationPointRef="
				+ activationPointRef + "]";
	}

}
