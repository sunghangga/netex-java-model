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
 * <p>Java class for FrequencyOfUseTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyOfUseTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unlimited"/&gt;
 *     &lt;enumeration value="limited"/&gt;
 *     &lt;enumeration value="twiceADay"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FrequencyOfUseTypeEnumeration")
@XmlEnum
public enum FrequencyOfUseTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unlimited")
    UNLIMITED("unlimited"),
    @XmlEnumValue("limited")
    LIMITED("limited"),
    @XmlEnumValue("twiceADay")
    TWICE_A_DAY("twiceADay"),
    @XmlEnumValue("single")
    SINGLE("single");
    private final String value;

    FrequencyOfUseTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrequencyOfUseTypeEnumeration fromValue(String v) {
        for (FrequencyOfUseTypeEnumeration c: FrequencyOfUseTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
