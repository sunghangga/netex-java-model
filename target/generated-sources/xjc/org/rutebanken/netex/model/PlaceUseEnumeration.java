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
 * <p>Java class for PlaceUseEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceUseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="startAt"/&gt;
 *     &lt;enumeration value="endAt"/&gt;
 *     &lt;enumeration value="via"/&gt;
 *     &lt;enumeration value="restrictTo"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlaceUseEnumeration")
@XmlEnum
public enum PlaceUseEnumeration {

    @XmlEnumValue("startAt")
    START_AT("startAt"),
    @XmlEnumValue("endAt")
    END_AT("endAt"),
    @XmlEnumValue("via")
    VIA("via"),
    @XmlEnumValue("restrictTo")
    RESTRICT_TO("restrictTo"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PlaceUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceUseEnumeration fromValue(String v) {
        for (PlaceUseEnumeration c: PlaceUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}