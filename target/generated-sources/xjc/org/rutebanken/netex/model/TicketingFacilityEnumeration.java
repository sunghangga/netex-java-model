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
 * <p>Java class for TicketingFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketingFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="ticketMachines"/&gt;
 *     &lt;enumeration value="ticketOffice"/&gt;
 *     &lt;enumeration value="ticketOnDemandMachines"/&gt;
 *     &lt;enumeration value="mobileTicketing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketingFacilityEnumeration")
@XmlEnum
public enum TicketingFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("ticketMachines")
    TICKET_MACHINES("ticketMachines"),
    @XmlEnumValue("ticketOffice")
    TICKET_OFFICE("ticketOffice"),
    @XmlEnumValue("ticketOnDemandMachines")
    TICKET_ON_DEMAND_MACHINES("ticketOnDemandMachines"),
    @XmlEnumValue("mobileTicketing")
    MOBILE_TICKETING("mobileTicketing");
    private final String value;

    TicketingFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketingFacilityEnumeration fromValue(String v) {
        for (TicketingFacilityEnumeration c: TicketingFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}