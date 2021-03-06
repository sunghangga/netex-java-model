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
 * <p>Java class for ScopeOfTicketEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeOfTicketEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="localTicket"/&gt;
 *     &lt;enumeration value="nationalTicket"/&gt;
 *     &lt;enumeration value="internationalTicket"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScopeOfTicketEnumeration")
@XmlEnum
public enum ScopeOfTicketEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("localTicket")
    LOCAL_TICKET("localTicket"),
    @XmlEnumValue("nationalTicket")
    NATIONAL_TICKET("nationalTicket"),
    @XmlEnumValue("internationalTicket")
    INTERNATIONAL_TICKET("internationalTicket");
    private final String value;

    ScopeOfTicketEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeOfTicketEnumeration fromValue(String v) {
        for (ScopeOfTicketEnumeration c: ScopeOfTicketEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
