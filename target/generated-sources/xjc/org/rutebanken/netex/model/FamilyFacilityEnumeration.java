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
 * <p>Java class for FamilyFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FamilyFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="servicesForChildren"/&gt;
 *     &lt;enumeration value="servicesForArmyFamilies"/&gt;
 *     &lt;enumeration value="nurseryService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FamilyFacilityEnumeration")
@XmlEnum
public enum FamilyFacilityEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("servicesForChildren")
    SERVICES_FOR_CHILDREN("servicesForChildren"),
    @XmlEnumValue("servicesForArmyFamilies")
    SERVICES_FOR_ARMY_FAMILIES("servicesForArmyFamilies"),
    @XmlEnumValue("nurseryService")
    NURSERY_SERVICE("nurseryService");
    private final String value;

    FamilyFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FamilyFacilityEnumeration fromValue(String v) {
        for (FamilyFacilityEnumeration c: FamilyFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}