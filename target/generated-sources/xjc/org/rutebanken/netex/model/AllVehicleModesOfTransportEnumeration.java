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
 * <p>Java class for AllVehicleModesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AllVehicleModesOfTransportEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="all"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="bus"/&gt;
 *     &lt;enumeration value="trolleyBus"/&gt;
 *     &lt;enumeration value="tram"/&gt;
 *     &lt;enumeration value="coach"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="intercityRail"/&gt;
 *     &lt;enumeration value="urbanRail"/&gt;
 *     &lt;enumeration value="metro"/&gt;
 *     &lt;enumeration value="air"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="cableway"/&gt;
 *     &lt;enumeration value="funicular"/&gt;
 *     &lt;enumeration value="snowAndIce"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="selfDrive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AllVehicleModesOfTransportEnumeration")
@XmlEnum
public enum AllVehicleModesOfTransportEnumeration {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("intercityRail")
    INTERCITY_RAIL("intercityRail"),
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("cableway")
    CABLEWAY("cableway"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("snowAndIce")
    SNOW_AND_ICE("snowAndIce"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive");
    private final String value;

    AllVehicleModesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllVehicleModesOfTransportEnumeration fromValue(String v) {
        for (AllVehicleModesOfTransportEnumeration c: AllVehicleModesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}