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
 * <p>Java class for ParkingStayEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingStayEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="shortStay"/&gt;
 *     &lt;enumeration value="midTerm"/&gt;
 *     &lt;enumeration value="longTerm"/&gt;
 *     &lt;enumeration value="dropoff"/&gt;
 *     &lt;enumeration value="unlimited"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingStayEnumeration")
@XmlEnum
public enum ParkingStayEnumeration {

    @XmlEnumValue("shortStay")
    SHORT_STAY("shortStay"),
    @XmlEnumValue("midTerm")
    MID_TERM("midTerm"),
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),
    @XmlEnumValue("dropoff")
    DROPOFF("dropoff"),
    @XmlEnumValue("unlimited")
    UNLIMITED("unlimited"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingStayEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingStayEnumeration fromValue(String v) {
        for (ParkingStayEnumeration c: ParkingStayEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}