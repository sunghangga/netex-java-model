package org.rutebanken.netex.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger_stop_assignment")
public class PassengerStopAssignmentEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "scheduled_stop_point_ref")
    private String scheduledStopPointRef;
    
    @Column(name = "stop_place_ref")
    private String stopPlaceRef;
    
    @Column(name = "quay_ref")
    private String quayRef;

	public PassengerStopAssignmentEntity(String id, String version, String name, BigInteger orders,
			String scheduledStopPointRef, String stopPlaceRef, String quayRef) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.orders = orders;
		this.scheduledStopPointRef = scheduledStopPointRef;
		this.stopPlaceRef = stopPlaceRef;
		this.quayRef = quayRef;
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

	public BigInteger getOrders() {
		return orders;
	}

	public void setOrders(BigInteger orders) {
		this.orders = orders;
	}

	public String getScheduledStopPointRef() {
		return scheduledStopPointRef;
	}

	public void setScheduledStopPointRef(String scheduledStopPointRef) {
		this.scheduledStopPointRef = scheduledStopPointRef;
	}

	public String getStopPlaceRef() {
		return stopPlaceRef;
	}

	public void setStopPlaceRef(String stopPlaceRef) {
		this.stopPlaceRef = stopPlaceRef;
	}

	public String getQuayRef() {
		return quayRef;
	}

	public void setQuayRef(String quayRef) {
		this.quayRef = quayRef;
	}

	@Override
	public String toString() {
		return "PassengerStopAssignmentEntity [id=" + id + ", version=" + version + ", name=" + name
				+ ", scheduledStopPointRef=" + scheduledStopPointRef + ", stopPlaceRef=" + stopPlaceRef + ", quayRef="
				+ quayRef + "]";
	}
	
}
