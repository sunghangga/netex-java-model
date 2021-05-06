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
 * <p>Java class for CrowdingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrowdingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="veryQuiet"/&gt;
 *     &lt;enumeration value="quiet"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="busy"/&gt;
 *     &lt;enumeration value="veryBusy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CrowdingEnumeration")
@XmlEnum
public enum CrowdingEnumeration {

    @XmlEnumValue("veryQuiet")
    VERY_QUIET("veryQuiet"),
    @XmlEnumValue("quiet")
    QUIET("quiet"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("busy")
    BUSY("busy"),
    @XmlEnumValue("veryBusy")
    VERY_BUSY("veryBusy");
    private final String value;

    CrowdingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CrowdingEnumeration fromValue(String v) {
        for (CrowdingEnumeration c: CrowdingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
