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
 * <p>Java class for ParkingUserEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingUserEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="allUsers"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="visitors"/&gt;
 *     &lt;enumeration value="registeredDisabled"/&gt;
 *     &lt;enumeration value="registered"/&gt;
 *     &lt;enumeration value="rental"/&gt;
 *     &lt;enumeration value="doctors"/&gt;
 *     &lt;enumeration value="residentsWithPermits"/&gt;
 *     &lt;enumeration value="reservationHolders"/&gt;
 *     &lt;enumeration value="emergencyServices"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingUserEnumeration")
@XmlEnum
public enum ParkingUserEnumeration {

    @XmlEnumValue("allUsers")
    ALL_USERS("allUsers"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("visitors")
    VISITORS("visitors"),
    @XmlEnumValue("registeredDisabled")
    REGISTERED_DISABLED("registeredDisabled"),
    @XmlEnumValue("registered")
    REGISTERED("registered"),
    @XmlEnumValue("rental")
    RENTAL("rental"),
    @XmlEnumValue("doctors")
    DOCTORS("doctors"),
    @XmlEnumValue("residentsWithPermits")
    RESIDENTS_WITH_PERMITS("residentsWithPermits"),
    @XmlEnumValue("reservationHolders")
    RESERVATION_HOLDERS("reservationHolders"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    ParkingUserEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingUserEnumeration fromValue(String v) {
        for (ParkingUserEnumeration c: ParkingUserEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
