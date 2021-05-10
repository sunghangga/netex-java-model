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
    
    @Column(name = "service_journey_pattern_ref")
    private String journeyPatternRef;
    
    @Column(name = "time_demand_type_ref")
    private String timeDemandTypeRef;
    
    @Column(name = "type_of_product_category_ref")
    private String typeOfProductCategoryRef;
    
    @Column(name = "availability_condition_ref")
    private String availabilityConditionRef;
    
    @Column(name = "operator_ref")
    private String operatorRef;
    
    @Column(name = "private_code")
    private String privateCode;
    
    @Column(name = "monitored")
    private Boolean monitored;
    
    @Column(name = "day_type")
    private String dayType;
    
    @Column(name = "vehicle_type")
    private String vehicleType;
    
    @Column(name = "print")
    private Boolean print;
    
    @Column(name = "dynamic")
    private String dynamic;

    @Column(name = "data_source_ref")
    private String dataSourceRef;
    
    @Column(name = "block_ref")
    private String blockRef;

	public ServiceJourneyEntity(String id, String version, BigInteger departureDayOffset, LocalTime departureTime,
			String journeyPatternRef, String timeDemandTypeRef, String typeOfProductCategoryRef,
			String availabilityConditionRef, String operatorRef, String privateCode, Boolean monitored, String dayType,
			String vehicleType, Boolean print, String dynamic, String dataSourceRef, String blockRef) {
		super();
		this.id = id;
		this.version = version;
		this.departureDayOffset = departureDayOffset;
		this.departureTime = departureTime;
		this.journeyPatternRef = journeyPatternRef;
		this.timeDemandTypeRef = timeDemandTypeRef;
		this.typeOfProductCategoryRef = typeOfProductCategoryRef;
		this.availabilityConditionRef = availabilityConditionRef;
		this.operatorRef = operatorRef;
		this.privateCode = privateCode;
		this.monitored = monitored;
		this.dayType = dayType;
		this.vehicleType = vehicleType;
		this.print = print;
		this.dynamic = dynamic;
		this.dataSourceRef = dataSourceRef;
		this.blockRef = blockRef;
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

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public Boolean getMonitored() {
		return monitored;
	}

	public void setMonitored(Boolean monitored) {
		this.monitored = monitored;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Boolean getPrint() {
		return print;
	}

	public void setPrint(Boolean print) {
		this.print = print;
	}

	public String getDynamic() {
		return dynamic;
	}

	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}

	public String getDataSourceRef() {
		return dataSourceRef;
	}

	public void setDataSourceRef(String dataSourceRef) {
		this.dataSourceRef = dataSourceRef;
	}

	public String getBlockRef() {
		return blockRef;
	}

	public void setBlockRef(String blockRef) {
		this.blockRef = blockRef;
	}

	@Override
	public String toString() {
		return "ServiceJourneyEntity [id=" + id + ", version=" + version + ", departureDayOffset=" + departureDayOffset
				+ ", departureTime=" + departureTime + ", journeyPatternRef=" + journeyPatternRef
				+ ", timeDemandTypeRef=" + timeDemandTypeRef + ", typeOfProductCategoryRef=" + typeOfProductCategoryRef
				+ ", availabilityConditionRef=" + availabilityConditionRef + ", operatorRef=" + operatorRef
				+ ", privateCode=" + privateCode + ", monitored=" + monitored + ", dayType=" + dayType
				+ ", vehicleType=" + vehicleType + ", print=" + print + ", dynamic=" + dynamic + ", dataSourceRef="
				+ dataSourceRef + ", blockRef=" + blockRef + "]";
	}
	
}
