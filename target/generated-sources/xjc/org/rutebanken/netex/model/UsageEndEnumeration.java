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
 * <p>Java class for UsageEndEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageEndEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="standardDuration"/&gt;
 *     &lt;enumeration value="endOfCalendarPeriod"/&gt;
 *     &lt;enumeration value="endOfRide"/&gt;
 *     &lt;enumeration value="endOfTrip"/&gt;
 *     &lt;enumeration value="endOfFareDay"/&gt;
 *     &lt;enumeration value="endOfFarePeriod"/&gt;
 *     &lt;enumeration value="productExpiry"/&gt;
 *     &lt;enumeration value="profileExpiry"/&gt;
 *     &lt;enumeration value="deregistration"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageEndEnumeration")
@XmlEnum
public enum UsageEndEnumeration {

    @XmlEnumValue("standardDuration")
    STANDARD_DURATION("standardDuration"),
    @XmlEnumValue("endOfCalendarPeriod")
    END_OF_CALENDAR_PERIOD("endOfCalendarPeriod"),
    @XmlEnumValue("endOfRide")
    END_OF_RIDE("endOfRide"),
    @XmlEnumValue("endOfTrip")
    END_OF_TRIP("endOfTrip"),
    @XmlEnumValue("endOfFareDay")
    END_OF_FARE_DAY("endOfFareDay"),
    @XmlEnumValue("endOfFarePeriod")
    END_OF_FARE_PERIOD("endOfFarePeriod"),
    @XmlEnumValue("productExpiry")
    PRODUCT_EXPIRY("productExpiry"),
    @XmlEnumValue("profileExpiry")
    PROFILE_EXPIRY("profileExpiry"),
    @XmlEnumValue("deregistration")
    DEREGISTRATION("deregistration"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    UsageEndEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageEndEnumeration fromValue(String v) {
        for (UsageEndEnumeration c: UsageEndEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
