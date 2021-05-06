package org.rutebanken.netex.entity;

import java.math.BigInteger;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_journey")
public class ServiceJourneyEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;	
	
    @Column(name = "departure_day_offset")
    private BigInteger departureDayOffset;
    
    @Column(name = "departure_time")
    private LocalTime departureTime;
    
    @Column(name = "journey_pattern_ref")
    private String journeyPatternRef;
    
    @Column(name = "time_demand_type_ref")
    private String timeDemandTypeRef;
    
    @Column(name = "type_of_product_category_ref")
    private String typeOfProductCategoryRef;
    
    @Column(name = "availability_condition_ref")
    private String availabilityConditionRef;
    
    @Column(name = "operator_ref")
    private String operatorRef;

	public ServiceJourneyEntity(String id, String version, BigInteger departureDayOffset, LocalTime departureTime,
			String journeyPatternRef, String timeDemandTypeRef, String typeOfProductCategoryRef, String availabilityConditionRef, String operatorRef) {
		this.id = id;
		this.version = version;
		this.departureDayOffset = departureDayOffset;
		this.departureTime = departureTime;
		this.journeyPatternRef = journeyPatternRef;
		this.timeDemandTypeRef = timeDemandTypeRef;
		this.typeOfProductCategoryRef = typeOfProductCategoryRef;
		this.availabilityConditionRef = availabilityConditionRef;
		this.operatorRef = operatorRef;
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

	public BigInteger getDepartureDayOffset() {
		return departureDayOffset;
	}

	public void setDepartureDayOffset(BigInteger departureDayOffset) {
		this.departureDayOffset = departureDayOffset;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getJourneyPatternRef() {
		return journeyPatternRef;
	}

	public void setJourneyPatternRef(String journeyPatternRef) {
		this.journeyPatternRef = journeyPatternRef;
	}

	public String getTimeDemandTypeRef() {
		return timeDemandTypeRef;
	}

	public void setTimeDemandTypeRef(String timeDemandTypeRef) {
		this.timeDemandTypeRef = timeDemandTypeRef;
	}

	public String getTypeOfProductCategoryRef() {
		return typeOfProductCategoryRef;
	}

	public void setTypeOfProductCategoryRef(String typeOfProductCategoryRef) {
		this.typeOfProductCategoryRef = typeOfProductCategoryRef;
	}

	public String getAvailabilityConditionRef() {
		return availabilityConditionRef;
	}

	public void setAvailabilityConditionRef(String availabilityConditionRef) {
		this.availabilityConditionRef = availabilityConditionRef;
	}

	public String getOperatorRef() {
		return operatorRef;
	}

	public void setOperatorRef(String operatorRef) {
		this.operatorRef = operatorRef;
	}

	@Override
	public String toString() {
		return "VehicleJourneyEntity [id=" + id + ", version=" + version + ", departureDayOffset=" + departureDayOffset
				+ ", departureTime=" + departureTime + ", journeyPatternRef=" + journeyPatternRef
				+ ", timeDemandTypeRef=" + timeDemandTypeRef + ", typeOfProductCategoryRef=" + typeOfProductCategoryRef
				+ ", availabilityConditionRef=" + availabilityConditionRef + ", operatorRef=" + operatorRef + "]";
	}
    
}
