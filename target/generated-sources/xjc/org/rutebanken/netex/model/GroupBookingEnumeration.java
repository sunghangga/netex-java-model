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
 * <p>Java class for GroupBookingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupBookingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="groupsAllowed"/&gt;
 *     &lt;enumeration value="groupsNotAllowed"/&gt;
 *     &lt;enumeration value="groupsAllowedWithReservation"/&gt;
 *     &lt;enumeration value="groupBookingsRestricted"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupBookingEnumeration")
@XmlEnum
public enum GroupBookingEnumeration {

    @XmlEnumValue("groupsAllowed")
    GROUPS_ALLOWED("groupsAllowed"),
    @XmlEnumValue("groupsNotAllowed")
    GROUPS_NOT_ALLOWED("groupsNotAllowed"),
    @XmlEnumValue("groupsAllowedWithReservation")
    GROUPS_ALLOWED_WITH_RESERVATION("groupsAllowedWithReservation"),
    @XmlEnumValue("groupBookingsRestricted")
    GROUP_BOOKINGS_RESTRICTED("groupBookingsRestricted"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GroupBookingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupBookingEnumeration fromValue(String v) {
        for (GroupBookingEnumeration c: GroupBookingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
