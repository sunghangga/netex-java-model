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
 * <p>Java class for StopPlaceWeightEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceWeightEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="international"/&gt;
 *     &lt;enumeration value="national"/&gt;
 *     &lt;enumeration value="regional"/&gt;
 *     &lt;enumeration value="local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceWeightEnumeration")
@XmlEnum
public enum StopPlaceWeightEnumeration {

    @XmlEnumValue("international")
    INTERNATIONAL("international"),
    @XmlEnumValue("national")
    NATIONAL("national"),
    @XmlEnumValue("regional")
    REGIONAL("regional"),
    @XmlEnumValue("local")
    LOCAL("local");
    private final String value;

    StopPlaceWeightEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceWeightEnumeration fromValue(String v) {
        for (StopPlaceWeightEnumeration c: StopPlaceWeightEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
