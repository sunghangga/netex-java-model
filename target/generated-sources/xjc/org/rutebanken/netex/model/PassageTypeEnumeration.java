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
 * <p>Java class for PassageTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PassageTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="pathway"/&gt;
 *     &lt;enumeration value="corridor"/&gt;
 *     &lt;enumeration value="overpass"/&gt;
 *     &lt;enumeration value="underpass"/&gt;
 *     &lt;enumeration value="tunnel"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassageTypeEnumeration")
@XmlEnum
public enum PassageTypeEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("pathway")
    PATHWAY("pathway"),
    @XmlEnumValue("corridor")
    CORRIDOR("corridor"),
    @XmlEnumValue("overpass")
    OVERPASS("overpass"),
    @XmlEnumValue("underpass")
    UNDERPASS("underpass"),
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PassageTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PassageTypeEnumeration fromValue(String v) {
        for (PassageTypeEnumeration c: PassageTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}