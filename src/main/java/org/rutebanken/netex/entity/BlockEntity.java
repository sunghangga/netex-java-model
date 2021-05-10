package org.rutebanken.netex.entity;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="block")
public class BlockEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "private_code")
    private String privateCode;
    
    @Column(name = "preparation_duration")
    private Duration preparationDuration;
    
    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "start_time_day_offset")
    private BigInteger startTimeDayOffset;

    @Column(name = "finishing_duration")
    private Duration finishingDuration;
    
    @Column(name = "end_time")
    private LocalTime endTime;
	
    @Column(name = "end_time_day_offset")
    private BigInteger endTimeDayOffset;
	
    @Column(name = "availability_condition_ref")
    private String availabilityConditionRef;
	
    @Column(name = "day_type")
    private String dayType;
    
    @Column(name = "vehicle_service_part_ref")
    private String vehicleServicePartRef;
    
    @Column(name = "vehicle_type_ref")
    private String vehicleTypeRef;
    
    @Column(name = "start_point_ref")
    private String startPointRef;
    
    @Column(name = "end_point_ref")
    private String endPointRef;
    
    @Column(name = "journey")
    private String journey;
    
    @Column(name = "courseOfJourney")
    private String courseOfJourney;

	public BlockEntity(String id, String version, String name, String description, String privateCode,
			Duration preparationDuration, LocalTime startTime, BigInteger startTimeDayOffset,
			Duration finishingDuration, LocalTime endTime, BigInteger endTimeDayOffset, String availabilityConditionRef,
			String dayType, String vehicleServicePartRef, String vehicleTypeRef, String startPointRef,
			String endPointRef, String journey, String courseOfJourney) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.description = description;
		this.privateCode = privateCode;
		this.preparationDuration = preparationDuration;
		this.startTime = startTime;
		this.startTimeDayOffset = startTimeDayOffset;
		this.finishingDuration = finishingDuration;
		this.endTime = endTime;
		this.endTimeDayOffset = endTimeDayOffset;
		this.availabilityConditionRef = availabilityConditionRef;
		this.dayType = dayType;
		this.vehicleServicePartRef = vehicleServicePartRef;
		this.vehicleTypeRef = vehicleTypeRef;
		this.startPointRef = startPointRef;
		this.endPointRef = endPointRef;
		this.journey = journey;
		this.courseOfJourney = courseOfJourney;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrivateCode() {
		return privateCode;
	}

	public void setPrivateCode(String privateCode) {
		this.privateCode = privateCode;
	}

	public Duration getPreparationDuration() {
		return preparationDuration;
	}

	public void setPreparationDuration(Duration preparationDuration) {
		this.preparationDuration = preparationDuration;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public BigInteger getStartTimeDayOffset() {
		return startTimeDayOffset;
	}

	public void setStartTimeDayOffset(BigInteger startTimeDayOffset) {
		this.startTimeDayOffset = startTimeDayOffset;
	}

	public Duration getFinishingDuration() {
		return finishingDuration;
	}

	public void setFinishingDuration(Duration finishingDuration) {
		this.finishingDuration = finishingDuration;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public BigInteger getEndTimeDayOffset() {
		return endTimeDayOffset;
	}

	public void setEndTimeDayOffset(BigInteger endTimeDayOffset) {
		this.endTimeDayOffset = endTimeDayOffset;
	}

	public String getAvailabilityConditionRef() {
		return availabilityConditionRef;
	}

	public void setAvailabilityConditionRef(String availabilityConditionRef) {
		this.availabilityConditionRef = availabilityConditionRef;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getVehicleServicePartRef() {
		return vehicleServicePartRef;
	}

	public void setVehicleServicePartRef(String vehicleServicePartRef) {
		this.vehicleServicePartRef = vehicleServicePartRef;
	}

	public String getVehicleTypeRef() {
		return vehicleTypeRef;
	}

	public void setVehicleTypeRef(String vehicleTypeRef) {
		this.vehicleTypeRef = vehicleTypeRef;
	}

	public String getStartPointRef() {
		return startPointRef;
	}

	public void setStartPointRef(String startPointRef) {
		this.startPointRef = startPointRef;
	}

	public String getEndPointRef() {
		return endPointRef;
	}

	public void setEndPointRef(String endPointRef) {
		this.endPointRef = endPointRef;
	}

	public String getJourney() {
		return journey;
	}

	public void setJourney(String journey) {
		this.journey = journey;
	}

	public String getCourseOfJourney() {
		return courseOfJourney;
	}

	public void setCourseOfJourney(String courseOfJourney) {
		this.courseOfJourney = courseOfJourney;
	}

	@Override
	public String toString() {
		return "BlockEntity [id=" + id + ", version=" + version + ", name=" + name + ", description=" + description
				+ ", privateCode=" + privateCode + ", preparationDuration=" + preparationDuration + ", startTime="
				+ startTime + ", startTimeDayOffset=" + startTimeDayOffset + ", finishingDuration=" + finishingDuration
				+ ", endTime=" + endTime + ", endTimeDayOffset=" + endTimeDayOffset + ", availabilityConditionRef="
				+ availabilityConditionRef + ", dayType=" + dayType + ", vehicleServicePartRef=" + vehicleServicePartRef
				+ ", vehicleTypeRef=" + vehicleTypeRef + ", startPointRef=" + startPointRef + ", endPointRef="
				+ endPointRef + ", journey=" + journey + ", courseOfJourney=" + courseOfJourney + "]";
	}
	
}
