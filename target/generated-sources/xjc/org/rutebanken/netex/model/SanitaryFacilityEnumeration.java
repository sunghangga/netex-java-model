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
 * <p>Java class for SanitaryFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="toilet"/&gt;
 *     &lt;enumeration value="wheelChairAccessToilet"/&gt;
 *     &lt;enumeration value="shower"/&gt;
 *     &lt;enumeration value="washingAndChangeFacilities"/&gt;
 *     &lt;enumeration value="babyChange"/&gt;
 *     &lt;enumeration value="wheelchairBabyChange"/&gt;
 *     &lt;enumeration value="shoeShiner"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("wheelChairAccessToilet")
    WHEEL_CHAIR_ACCESS_TOILET("wheelChairAccessToilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("washingAndChangeFacilities")
    WASHING_AND_CHANGE_FACILITIES("washingAndChangeFacilities"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange"),
    @XmlEnumValue("wheelchairBabyChange")
    WHEELCHAIR_BABY_CHANGE("wheelchairBabyChange"),
    @XmlEnumValue("shoeShiner")
    SHOE_SHINER("shoeShiner"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c: SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
