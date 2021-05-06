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
 * <p>Java class for CarServiceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarServiceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="carWash"/&gt;
 *     &lt;enumeration value="valetPark"/&gt;
 *     &lt;enumeration value="carValetClean"/&gt;
 *     &lt;enumeration value="oilChange"/&gt;
 *     &lt;enumeration value="engineWarming"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarServiceFacilityEnumeration")
@XmlEnum
public enum CarServiceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("carWash")
    CAR_WASH("carWash"),
    @XmlEnumValue("valetPark")
    VALET_PARK("valetPark"),
    @XmlEnumValue("carValetClean")
    CAR_VALET_CLEAN("carValetClean"),
    @XmlEnumValue("oilChange")
    OIL_CHANGE("oilChange"),
    @XmlEnumValue("engineWarming")
    ENGINE_WARMING("engineWarming"),
    @XmlEnumValue("petrol")
    PETROL("petrol");
    private final String value;

    CarServiceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarServiceFacilityEnumeration fromValue(String v) {
        for (CarServiceFacilityEnumeration c: CarServiceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
