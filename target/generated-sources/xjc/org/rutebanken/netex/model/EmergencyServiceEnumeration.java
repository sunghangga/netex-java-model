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
 * <p>Java class for EmergencyServiceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyServiceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="police"/&gt;
 *     &lt;enumeration value="fire"/&gt;
 *     &lt;enumeration value="firstAid"/&gt;
 *     &lt;enumeration value="sosPoint"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmergencyServiceEnumeration")
@XmlEnum
public enum EmergencyServiceEnumeration {

    @XmlEnumValue("police")
    POLICE("police"),
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),
    @XmlEnumValue("sosPoint")
    SOS_POINT("sosPoint"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EmergencyServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmergencyServiceEnumeration fromValue(String v) {
        for (EmergencyServiceEnumeration c: EmergencyServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
