package org.rutebanken.netex.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_type")
public class VehicleTypeEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "short_name")
    private String shortName;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "type_of_fuel")
    private String typeOfFuel;
    
    @Column(name = "branding_ref")
    private String brandingRef;
    
    @Column(name = "low_floor")
    private Boolean lowFloor;
    
    @Column(name = "has_lift_or_ramp")
    private Boolean hasLiftOrRamp;
    
    @Column(name = "has_hoist")
    private Boolean hasHoist;
    
    @Column(name = "length")
    private BigDecimal length;
    
    @Column(name = "width")
    private BigDecimal width;
    
    @Column(name = "height")
    private BigDecimal height;
    
    @Column(name = "weight")
    private BigDecimal weight;
    
    @Column(name = "boarding_height")
    private BigDecimal boardingHeight;
    
    @Column(name = "gap_to_platform")
    private BigDecimal gapToPlatform;
    
    @Column(name = "fare_class")
    private String fareClass;
    
    @Column(name = "total_capacity")
    private BigInteger totalCapacity;
    
    @Column(name = "seating_capacity")
    private BigInteger seatingCapacity;
    
    @Column(name = "standing_capacity")
    private BigInteger standingCapacity;
    
    @Column(name = "special_place_capacity")
    private BigInteger specialPlaceCapacity;
    
    @Column(name = "pushchair_capacity")
    private BigInteger pushchairCapacity;
    
    @Column(name = "wheelchair_place_capacity")
    private BigInteger wheelchairPlaceCapacity;
    
    @Column(name = "mobility_facility_list")
    private String mobilityFacilityList;
    
    @Column(name = "passenger_comms_facility_list")
    private String passengerCommsFacilityList;
    
    @Column(name = "sanitary_facility_list")
    private String sanitaryFacilityList;
    
    @Column(name = "ticketing_service_facility_list")
    private String ticketingServiceFacilityList;
    
    @Column(name = "vehicle_access_facility_list")
    private String vehicleAccessFacilityList;

	public VehicleTypeEntity(String id, String version, String name, String shortName, String description,
			String typeOfFuel, String brandingRef, Boolean lowFloor, Boolean hasLiftOrRamp, Boolean hasHoist,
			BigDecimal length, BigDecimal width, BigDecimal height, BigDecimal weight, BigDecimal boardingHeight,
			BigDecimal gapToPlatform, String fareClass, BigInteger totalCapacity, BigInteger seatingCapacity,
			BigInteger standingCapacity, BigInteger specialPlaceCapacity, BigInteger pushchairCapacity,
			BigInteger wheelchairPlaceCapacity, String mobilityFacilityList, String passengerCommsFacilityList,
			String sanitaryFacilityList, String ticketingServiceFacilityList, String vehicleAccessFacilityList) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.shortName = shortName;
		this.description = description;
		this.typeOfFuel = typeOfFuel;
		this.brandingRef = brandingRef;
		this.lowFloor = lowFloor;
		this.hasLiftOrRamp = hasLiftOrRamp;
		this.hasHoist = hasHoist;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.boardingHeight = boardingHeight;
		this.gapToPlatform = gapToPlatform;
		this.fareClass = fareClass;
		this.totalCapacity = totalCapacity;
		this.seatingCapacity = seatingCapacity;
		this.standingCapacity = standingCapacity;
		this.specialPlaceCapacity = specialPlaceCapacity;
		this.pushchairCapacity = pushchairCapacity;
		this.wheelchairPlaceCapacity = wheelchairPlaceCapacity;
		this.mobilityFacilityList = mobilityFacilityList;
		this.passengerCommsFacilityList = passengerCommsFacilityList;
		this.sanitaryFacilityList = sanitaryFacilityList;
		this.ticketingServiceFacilityList = ticketingServiceFacilityList;
		this.vehicleAccessFacilityList = vehicleAccessFacilityList;
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

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public String getBrandingRef() {
		return brandingRef;
	}

	public void setBrandingRef(String brandingRef) {
		this.brandingRef = brandingRef;
	}

	public Boolean getLowFloor() {
		return lowFloor;
	}

	public void setLowFloor(Boolean lowFloor) {
		this.lowFloor = lowFloor;
	}

	public Boolean getHasLiftOrRamp() {
		return hasLiftOrRamp;
	}

	public void setHasLiftOrRamp(Boolean hasLiftOrRamp) {
		this.hasLiftOrRamp = hasLiftOrRamp;
	}

	public Boolean getHasHoist() {
		return hasHoist;
	}

	public void setHasHoist(Boolean hasHoist) {
		this.hasHoist = hasHoist;
	}

	public BigDecimal getLength() {
		return length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public BigDecimal getWidth() {
		return width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getBoardingHeight() {
		return boardingHeight;
	}

	public void setBoardingHeight(BigDecimal boardingHeight) {
		this.boardingHeight = boardingHeight;
	}

	public BigDecimal getGapToPlatform() {
		return gapToPlatform;
	}

	public void setGapToPlatform(BigDecimal gapToPlatform) {
		this.gapToPlatform = gapToPlatform;
	}

	public String getFareClass() {
		return fareClass;
	}

	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}

	public BigInteger getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(BigInteger totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public BigInteger getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(BigInteger seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public BigInteger getStandingCapacity() {
		return standingCapacity;
	}

	public void setStandingCapacity(BigInteger standingCapacity) {
		this.standingCapacity = standingCapacity;
	}

	public BigInteger getSpecialPlaceCapacity() {
		return specialPlaceCapacity;
	}

	public void setSpecialPlaceCapacity(BigInteger specialPlaceCapacity) {
		this.specialPlaceCapacity = specialPlaceCapacity;
	}

	public BigInteger getPushchairCapacity() {
		return pushchairCapacity;
	}

	public void setPushchairCapacity(BigInteger pushchairCapacity) {
		this.pushchairCapacity = pushchairCapacity;
	}

	public BigInteger getWheelchairPlaceCapacity() {
		return wheelchairPlaceCapacity;
	}

	public void setWheelchairPlaceCapacity(BigInteger wheelchairPlaceCapacity) {
		this.wheelchairPlaceCapacity = wheelchairPlaceCapacity;
	}

	public String getMobilityFacilityList() {
		return mobilityFacilityList;
	}

	public void setMobilityFacilityList(String mobilityFacilityList) {
		this.mobilityFacilityList = mobilityFacilityList;
	}

	public String getPassengerCommsFacilityList() {
		return passengerCommsFacilityList;
	}

	public void setPassengerCommsFacilityList(String passengerCommsFacilityList) {
		this.passengerCommsFacilityList = passengerCommsFacilityList;
	}

	public String getSanitaryFacilityList() {
		return sanitaryFacilityList;
	}

	public void setSanitaryFacilityList(String sanitaryFacilityList) {
		this.sanitaryFacilityList = sanitaryFacilityList;
	}

	public String getTicketingServiceFacilityList() {
		return ticketingServiceFacilityList;
	}

	public void setTicketingServiceFacilityList(String ticketingServiceFacilityList) {
		this.ticketingServiceFacilityList = ticketingServiceFacilityList;
	}

	public String getVehicleAccessFacilityList() {
		return vehicleAccessFacilityList;
	}

	public void setVehicleAccessFacilityList(String vehicleAccessFacilityList) {
		this.vehicleAccessFacilityList = vehicleAccessFacilityList;
	}

	@Override
	public String toString() {
		return "VehicleTypeEntity [id=" + id + ", version=" + version + ", name=" + name + ", shortName=" + shortName
				+ ", description=" + description + ", typeOfFuel=" + typeOfFuel + ", brandingRef=" + brandingRef
				+ ", lowFloor=" + lowFloor + ", hasLiftOrRamp=" + hasLiftOrRamp + ", hasHoist=" + hasHoist + ", length="
				+ length + ", width=" + width + ", height=" + height + ", weight=" + weight + ", boardingHeight="
				+ boardingHeight + ", gapToPlatform=" + gapToPlatform + ", fareClass=" + fareClass + ", totalCapacity="
				+ totalCapacity + ", seatingCapacity=" + seatingCapacity + ", standingCapacity=" + standingCapacity
				+ ", specialPlaceCapacity=" + specialPlaceCapacity + ", pushchairCapacity=" + pushchairCapacity
				+ ", wheelchairPlaceCapacity=" + wheelchairPlaceCapacity + ", mobilityFacilityList="
				+ mobilityFacilityList + ", passengerCommsFacilityList=" + passengerCommsFacilityList
				+ ", sanitaryFacilityList=" + sanitaryFacilityList + ", ticketingServiceFacilityList="
				+ ticketingServiceFacilityList + ", vehicleAccessFacilityList=" + vehicleAccessFacilityList + "]";
	}
	
}
