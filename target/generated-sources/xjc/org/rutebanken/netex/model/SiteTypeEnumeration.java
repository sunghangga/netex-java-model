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
 * <p>Java class for SiteTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="school"/&gt;
 *     &lt;enumeration value="university"/&gt;
 *     &lt;enumeration value="works"/&gt;
 *     &lt;enumeration value="office"/&gt;
 *     &lt;enumeration value="militaryBase"/&gt;
 *     &lt;enumeration value="retail"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SiteTypeEnumeration")
@XmlEnum
public enum SiteTypeEnumeration {

    @XmlEnumValue("school")
    SCHOOL("school"),
    @XmlEnumValue("university")
    UNIVERSITY("university"),
    @XmlEnumValue("works")
    WORKS("works"),
    @XmlEnumValue("office")
    OFFICE("office"),
    @XmlEnumValue("militaryBase")
    MILITARY_BASE("militaryBase"),
    @XmlEnumValue("retail")
    RETAIL("retail"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SiteTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiteTypeEnumeration fromValue(String v) {
        for (SiteTypeEnumeration c: SiteTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
