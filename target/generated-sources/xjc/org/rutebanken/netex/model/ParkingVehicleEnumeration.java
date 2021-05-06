//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingVehicleEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingVehicleEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pedalCycle"/&gt;
 *     &lt;enumeration value="moped"/&gt;
 *     &lt;enumeration value="motorcycle"/&gt;
 *     &lt;enumeration value="motorcycleWithSidecar"/&gt;
 *     &lt;enumeration value="motorScooter"/&gt;
 *     &lt;enumeration value="twoWheeledVehicle"/&gt;
 *     &lt;enumeration value="threeWheeledVehicle"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="smallCar"/&gt;
 *     &lt;enumeration value="passengerCar"/&gt;
 *     &lt;enumeration value="largeCar"/&gt;
 *     &lt;enumeration value="fourWheelDrive"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="camperCar"/&gt;
 *     &lt;enumeration value="carWithTrailer"/&gt;
 *     &lt;enumeration value="carWithCaravan"/&gt;
 *     &lt;enumeration value="minibus"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="van"/&gt;
 *     &lt;enumeration value="largeVan"/&gt;
 *     &lt;enumeration value="highSidedVehicle"/&gt;
 *     &lt;enumeration value="lightGoodsVehicle"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicle"/&gt;
 *     &lt;enumeration value="agriculturalVehicle"/&gt;
 *     &lt;enumeration value="tanker"/&gt;
 *     &lt;enumeration value="truck"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="articulatedVehicle"/&gt;
 *     &lt;enumeration value="vehicleWithTrailer"/&gt;
 *     &lt;enumeration value="lightGoodsVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="heavyGoodsVehicleWithTrailer"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="allPassengerVehicles"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingVehicleEnumeration")
@XmlEnum
public enum ParkingVehicleEnumeration {

    @XmlEnumValue("pedalCycle")
    PEDAL_CYCLE("pedalCycle"),
    @XmlEnumValue("moped")
    MOPED("moped"),
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),
    @XmlEnumValue("motorcycleWithSidecar")
    MOTORCYCLE_WITH_SIDECAR("motorcycleWithSidecar"),
    @XmlEnumValue("motorScooter")
    MOTOR_SCOOTER("motorScooter"),
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),
    @XmlEnumValue("threeWheeledVehicle")
    THREE_WHEELED_VEHICLE("threeWheeledVehicle"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("smallCar")
    SMALL_CAR("smallCar"),
    @XmlEnumValue("passengerCar")
    PASSENGER_CAR("passengerCar"),
    @XmlEnumValue("largeCar")
    LARGE_CAR("largeCar"),
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("camperCar")
    CAMPER_CAR("camperCar"),
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),
    @XmlEnumValue("minibus")
    MINIBUS("minibus"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("van")
    VAN("van"),
    @XmlEnumValue("largeVan")
    LARGE_VAN("largeVan"),
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),
    @XmlEnumValue("lightGoodsVehicle")
    LIGHT_GOODS_VEHICLE("lightGoodsVehicle"),
    @XmlEnumValue("heavyGoodsVehicle")
    HEAVY_GOODS_VEHICLE("heavyGoodsVehicle"),
    @XmlEnumValue("agriculturalVehicle")
    AGRICULTURAL_VEHICLE("agriculturalVehicle"),
    @XmlEnumValue("tanker")
    TANKER("tanker"),
    @XmlEnumValue("truck")
    TRUCK("truck"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),
    @XmlEnumValue("lightGoodsVehicleWithTrailer")
    LIGHT_GOODS_VEHICLE_WITH_TRAILER("lightGoodsVehicleWithTrailer"),
    @XmlEnumValue("heavyGoodsVehicleWithTrailer")
    HEAVY_GOODS_VEHICLE_WITH_TRAILER("heavyGoodsVehicleWithTrailer"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("allPassengerVehicles")
    ALL_PASSENGER_VEHICLES("allPassengerVehicles"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingVehicleEnumeration fromValue(String v) {
        for (ParkingVehicleEnumeration c: ParkingVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
