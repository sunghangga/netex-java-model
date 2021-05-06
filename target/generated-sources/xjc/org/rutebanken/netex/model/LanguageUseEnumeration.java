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
 * <p>Java class for LanguageUseEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageUseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normallyUsed"/&gt;
 *     &lt;enumeration value="understood"/&gt;
 *     &lt;enumeration value="native"/&gt;
 *     &lt;enumeration value="spoken"/&gt;
 *     &lt;enumeration value="written"/&gt;
 *     &lt;enumeration value="read"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="allUses"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageUseEnumeration")
@XmlEnum
public enum LanguageUseEnumeration {

    @XmlEnumValue("normallyUsed")
    NORMALLY_USED("normallyUsed"),
    @XmlEnumValue("understood")
    UNDERSTOOD("understood"),
    @XmlEnumValue("native")
    NATIVE("native"),
    @XmlEnumValue("spoken")
    SPOKEN("spoken"),
    @XmlEnumValue("written")
    WRITTEN("written"),
    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("allUses")
    ALL_USES("allUses");
    private final String value;

    LanguageUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageUseEnumeration fromValue(String v) {
        for (LanguageUseEnumeration c: LanguageUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
