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
 * <p>Java class for VehicleAccessFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleAccessFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="wheelchairLift"/&gt;
 *     &lt;enumeration value="manualRamp"/&gt;
 *     &lt;enumeration value="automaticRamp"/&gt;
 *     &lt;enumeration value="steps"/&gt;
 *     &lt;enumeration value="slidingStep"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleAccessFacilityEnumeration")
@XmlEnum
public enum VehicleAccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("wheelchairLift")
    WHEELCHAIR_LIFT("wheelchairLift"),
    @XmlEnumValue("manualRamp")
    MANUAL_RAMP("manualRamp"),
    @XmlEnumValue("automaticRamp")
    AUTOMATIC_RAMP("automaticRamp"),
    @XmlEnumValue("steps")
    STEPS("steps"),
    @XmlEnumValue("slidingStep")
    SLIDING_STEP("slidingStep"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    VehicleAccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleAccessFacilityEnumeration fromValue(String v) {
        for (VehicleAccessFacilityEnumeration c: VehicleAccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
