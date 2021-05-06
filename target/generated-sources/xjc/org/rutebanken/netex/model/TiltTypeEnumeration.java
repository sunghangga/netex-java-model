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
 * <p>Java class for TiltTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TiltTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="strongLeftTilt"/&gt;
 *     &lt;enumeration value="mediumLeftTilt"/&gt;
 *     &lt;enumeration value="nearlyFlat"/&gt;
 *     &lt;enumeration value="mediumRightTilt"/&gt;
 *     &lt;enumeration value="strongRightTilt"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TiltTypeEnumeration")
@XmlEnum
public enum TiltTypeEnumeration {

    @XmlEnumValue("strongLeftTilt")
    STRONG_LEFT_TILT("strongLeftTilt"),
    @XmlEnumValue("mediumLeftTilt")
    MEDIUM_LEFT_TILT("mediumLeftTilt"),
    @XmlEnumValue("nearlyFlat")
    NEARLY_FLAT("nearlyFlat"),
    @XmlEnumValue("mediumRightTilt")
    MEDIUM_RIGHT_TILT("mediumRightTilt"),
    @XmlEnumValue("strongRightTilt")
    STRONG_RIGHT_TILT("strongRightTilt"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TiltTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TiltTypeEnumeration fromValue(String v) {
        for (TiltTypeEnumeration c: TiltTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}