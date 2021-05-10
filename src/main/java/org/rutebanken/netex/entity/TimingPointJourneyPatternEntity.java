package org.rutebanken.netex.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timing_point_journey_pattern")
public class TimingPointJourneyPatternEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "is_wait_point")
    private Boolean isWaitPoint;
    
    @Column(name = "timing_link_ref")
    private String timingLinkRef;
    
    @Column(name = "timing_point_ref")
    private String timingPointRef;

    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "service_journey_pattern_ref")
    private String serviceJourneyPatternRef;

	public TimingPointJourneyPatternEntity(String id, String version, Boolean isWaitPoint, String timingLinkRef,
			String timingPointRef, BigInteger orders, String serviceJourneyPatternRef) {
		super();
		this.id = id;
		this.version = version;
		this.isWaitPoint = isWaitPoint;
		this.timingLinkRef = timingLinkRef;
		this.timingPointRef = timingPointRef;
		this.orders = orders;
		this.serviceJourneyPatternRef = serviceJourneyPatternRef;
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

	public Boolean getIsWaitPoint() {
		return isWaitPoint;
	}

	public void setIsWaitPoint(Boolean isWaitPoint) {
		this.isWaitPoint = isWaitPoint;
	}

	public String getTimingLinkRef() {
		return timingLinkRef;
	}

	public void setTimingLinkRef(String timingLinkRef) {
		this.timingLinkRef = timingLinkRef;
	}

	public String getTimingPointRef() {
		return timingPointRef;
	}

	public void setTimingPointRef(String timingPointRef) {
		this.timingPointRef = timingPointRef;
	}

	public BigInteger getOrders() {
		return orders;
	}

	public void setOrders(BigInteger orders) {
		this.orders = orders;
	}

	public String getServiceJourneyPatternRef() {
		return serviceJourneyPatternRef;
	}

	public void setServiceJourneyPatternRef(String serviceJourneyPatternRef) {
		this.serviceJourneyPatternRef = serviceJourneyPatternRef;
	}

	@Override
	public String toString() {
		return "TimingPointJourneyPatternEntity [id=" + id + ", version=" + version + ", isWaitPoint=" + isWaitPoint
				+ ", timingLinkRef=" + timingLinkRef + ", timingPointRef=" + timingPointRef + ", orders=" + orders
				+ ", serviceJourneyPatternRef=" + serviceJourneyPatternRef + "]";
	}
    
}
