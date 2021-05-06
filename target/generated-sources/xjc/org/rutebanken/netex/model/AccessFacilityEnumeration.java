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
 * <p>Java class for AccessFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="wheelchairLift"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="automaticRamp"/&gt;
 *     &lt;enumeration value="steps"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="slidingStep"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="lowFloorAccess"/&gt;
 *     &lt;enumeration value="validator"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("wheelchairLift")
    WHEELCHAIR_LIFT("wheelchairLift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("automaticRamp")
    AUTOMATIC_RAMP("automaticRamp"),
    @XmlEnumValue("steps")
    STEPS("steps"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("slidingStep")
    SLIDING_STEP("slidingStep"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("lowFloorAccess")
    LOW_FLOOR_ACCESS("lowFloorAccess"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
