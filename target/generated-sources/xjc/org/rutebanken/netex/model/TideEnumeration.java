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
 * <p>Java class for TideEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TideEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HighTide"/&gt;
 *     &lt;enumeration value="LowTide"/&gt;
 *     &lt;enumeration value="NeapTide"/&gt;
 *     &lt;enumeration value="AllTides"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TideEnumeration")
@XmlEnum
public enum TideEnumeration {

    @XmlEnumValue("HighTide")
    HIGH_TIDE("HighTide"),
    @XmlEnumValue("LowTide")
    LOW_TIDE("LowTide"),
    @XmlEnumValue("NeapTide")
    NEAP_TIDE("NeapTide"),
    @XmlEnumValue("AllTides")
    ALL_TIDES("AllTides");
    private final String value;

    TideEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TideEnumeration fromValue(String v) {
        for (TideEnumeration c: TideEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}