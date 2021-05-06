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
 * <p>Java class for ContinuousModeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousModeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="walk"/&gt;
 *     &lt;enumeration value="car"/&gt;
 *     &lt;enumeration value="taxi"/&gt;
 *     &lt;enumeration value="cycle"/&gt;
 *     &lt;enumeration value="drt"/&gt;
 *     &lt;enumeration value="movingWalkway"/&gt;
 *     &lt;enumeration value="through"/&gt;
 *     &lt;enumeration value="ski"/&gt;
 *     &lt;enumeration value="skate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContinuousModeEnumeration")
@XmlEnum
public enum ContinuousModeEnumeration {

    @XmlEnumValue("walk")
    WALK("walk"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("cycle")
    CYCLE("cycle"),
    @XmlEnumValue("drt")
    DRT("drt"),
    @XmlEnumValue("movingWalkway")
    MOVING_WALKWAY("movingWalkway"),
    @XmlEnumValue("through")
    THROUGH("through"),
    @XmlEnumValue("ski")
    SKI("ski"),
    @XmlEnumValue("skate")
    SKATE("skate");
    private final String value;

    ContinuousModeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousModeEnumeration fromValue(String v) {
        for (ContinuousModeEnumeration c: ContinuousModeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}