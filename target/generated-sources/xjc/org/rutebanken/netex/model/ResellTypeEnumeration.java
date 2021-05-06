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
 * <p>Java class for ResellTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResellTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="partial"/&gt;
 *     &lt;enumeration value="slidingScale"/&gt;
 *     &lt;enumeration value="full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResellTypeEnumeration")
@XmlEnum
public enum ResellTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("partial")
    PARTIAL("partial"),
    @XmlEnumValue("slidingScale")
    SLIDING_SCALE("slidingScale"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    ResellTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResellTypeEnumeration fromValue(String v) {
        for (ResellTypeEnumeration c: ResellTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
