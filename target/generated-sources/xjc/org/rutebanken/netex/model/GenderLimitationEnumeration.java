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
 * <p>Java class for GenderLimitationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderLimitationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="femaleOnly"/&gt;
 *     &lt;enumeration value="maleOnly"/&gt;
 *     &lt;enumeration value="sameSexOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenderLimitationEnumeration")
@XmlEnum
public enum GenderLimitationEnumeration {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("femaleOnly")
    FEMALE_ONLY("femaleOnly"),
    @XmlEnumValue("maleOnly")
    MALE_ONLY("maleOnly"),
    @XmlEnumValue("sameSexOnly")
    SAME_SEX_ONLY("sameSexOnly");
    private final String value;

    GenderLimitationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderLimitationEnumeration fromValue(String v) {
        for (GenderLimitationEnumeration c: GenderLimitationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}