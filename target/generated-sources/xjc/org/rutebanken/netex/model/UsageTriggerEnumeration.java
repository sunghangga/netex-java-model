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
 * <p>Java class for UsageTriggerEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageTriggerEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="enrolment"/&gt;
 *     &lt;enumeration value="reservation"/&gt;
 *     &lt;enumeration value="purchase"/&gt;
 *     &lt;enumeration value="fulfilment"/&gt;
 *     &lt;enumeration value="activation"/&gt;
 *     &lt;enumeration value="specifiedStartDate"/&gt;
 *     &lt;enumeration value="startOutboundRide"/&gt;
 *     &lt;enumeration value="endOutboundRide"/&gt;
 *     &lt;enumeration value="startReturnRide"/&gt;
 *     &lt;enumeration value="startOfPeriod"/&gt;
 *     &lt;enumeration value="dayOffsetBeforeCalendarPeriod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageTriggerEnumeration")
@XmlEnum
public enum UsageTriggerEnumeration {

    @XmlEnumValue("enrolment")
    ENROLMENT("enrolment"),
    @XmlEnumValue("reservation")
    RESERVATION("reservation"),
    @XmlEnumValue("purchase")
    PURCHASE("purchase"),
    @XmlEnumValue("fulfilment")
    FULFILMENT("fulfilment"),
    @XmlEnumValue("activation")
    ACTIVATION("activation"),
    @XmlEnumValue("specifiedStartDate")
    SPECIFIED_START_DATE("specifiedStartDate"),
    @XmlEnumValue("startOutboundRide")
    START_OUTBOUND_RIDE("startOutboundRide"),
    @XmlEnumValue("endOutboundRide")
    END_OUTBOUND_RIDE("endOutboundRide"),
    @XmlEnumValue("startReturnRide")
    START_RETURN_RIDE("startReturnRide"),
    @XmlEnumValue("startOfPeriod")
    START_OF_PERIOD("startOfPeriod"),
    @XmlEnumValue("dayOffsetBeforeCalendarPeriod")
    DAY_OFFSET_BEFORE_CALENDAR_PERIOD("dayOffsetBeforeCalendarPeriod");
    private final String value;

    UsageTriggerEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageTriggerEnumeration fromValue(String v) {
        for (UsageTriggerEnumeration c: UsageTriggerEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}