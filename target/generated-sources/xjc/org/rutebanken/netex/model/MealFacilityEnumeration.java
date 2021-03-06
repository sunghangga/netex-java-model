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
 * <p>Java class for MealFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MealFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="breakfast"/&gt;
 *     &lt;enumeration value="lunch"/&gt;
 *     &lt;enumeration value="dinner"/&gt;
 *     &lt;enumeration value="snack"/&gt;
 *     &lt;enumeration value="drinks"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MealFacilityEnumeration")
@XmlEnum
public enum MealFacilityEnumeration {

    @XmlEnumValue("breakfast")
    BREAKFAST("breakfast"),
    @XmlEnumValue("lunch")
    LUNCH("lunch"),
    @XmlEnumValue("dinner")
    DINNER("dinner"),
    @XmlEnumValue("snack")
    SNACK("snack"),
    @XmlEnumValue("drinks")
    DRINKS("drinks");
    private final String value;

    MealFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MealFacilityEnumeration fromValue(String v) {
        for (MealFacilityEnumeration c: MealFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
