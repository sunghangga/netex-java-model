package org.rutebanken.netex.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="point_journey_pattern")
public class PointJourneyPatternEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "for_alighting")
    private Boolean forAlighting;
    
    @Column(name = "for_boarding")
    private Boolean forBoarding;
    
    @Column(name = "is_wait_point")
    private Boolean isWaitPoint;
    
    @Column(name = "timing_link_ref")
    private String onwardTimingLinkRef;
    
    @Column(name = "scheduled_stop_point_ref")
    private String scheduledStopPointRef;

    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "service_journey_pattern_ref")
    private String serviceJourneyPatternRef;
    
    @Column(name = "destination_display_ref")
    private String destinationDisplayRefPointJourneyPattern;

	public PointJourneyPatternEntity(String id, String version, Boolean forAlighting, Boolean forBoarding,
			Boolean isWaitPoint, String onwardTimingLinkRef, String scheduledStopPointRef, BigInteger orders,
			String serviceJourneyPatternRef, String destinationDisplayRefPointJourneyPattern) {
		super();
		this.id = id;
		this.version = version;
		this.forAlighting = forAlighting;
		this.forBoarding = forBoarding;
		this.isWaitPoint = isWaitPoint;
		this.onwardTimingLinkRef = onwardTimingLinkRef;
		this.scheduledStopPointRef = scheduledStopPointRef;
		this.orders = orders;
		this.serviceJourneyPatternRef = serviceJourneyPatternRef;
		this.destinationDisplayRefPointJourneyPattern = destinationDisplayRefPointJourneyPattern;
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

	public Boolean getIsWaitPoint() {
		return isWaitPoint;
	}

	public void setIsWaitPoint(Boolean isWaitPoint) {
		this.isWaitPoint = isWaitPoint;
	}

	public String getOnwardTimingLinkRef() {
		return onwardTimingLinkRef;
	}

	public void setOnwardTimingLinkRef(String onwardTimingLinkRef) {
		this.onwardTimingLinkRef = onwardTimingLinkRef;
	}

	public String getScheduledStopPointRef() {
		return scheduledStopPointRef;
	}

	public void setScheduledStopPointRef(String scheduledStopPointRef) {
		this.scheduledStopPointRef = scheduledStopPointRef;
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

	public String getDestinationDisplayRefPointJourneyPattern() {
		return destinationDisplayRefPointJourneyPattern;
	}

	public void setDestinationDisplayRefPointJourneyPattern(String destinationDisplayRefPointJourneyPattern) {
		this.destinationDisplayRefPointJourneyPattern = destinationDisplayRefPointJourneyPattern;
	}

	@Override
	public String toString() {
		return "PointJourneyPatternEntity [id=" + id + ", version=" + version + ", forAlighting=" + forAlighting
				+ ", forBoarding=" + forBoarding + ", isWaitPoint=" + isWaitPoint + ", onwardTimingLinkRef="
				+ onwardTimingLinkRef + ", scheduledStopPointRef=" + scheduledStopPointRef + ", orders=" + orders
				+ ", serviceJourneyPatternRef=" + serviceJourneyPatternRef
				+ ", destinationDisplayRefPointJourneyPattern=" + destinationDisplayRefPointJourneyPattern + "]";
	}

}
