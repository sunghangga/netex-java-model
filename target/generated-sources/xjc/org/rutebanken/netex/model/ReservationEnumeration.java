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
 * <p>Java class for ReservationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="reservationsCompulsory"/&gt;
 *     &lt;enumeration value="reservationsCompulsoryForGroups"/&gt;
 *     &lt;enumeration value="reservationsCompulsoryForFirstClass"/&gt;
 *     &lt;enumeration value="reservationsCompulsoryFromOriginStation"/&gt;
 *     &lt;enumeration value="reservationsRecommended"/&gt;
 *     &lt;enumeration value="reservationsPossible"/&gt;
 *     &lt;enumeration value="reservationsPossibleOnlyInFirstClass"/&gt;
 *     &lt;enumeration value="reservationsPossibleOnlyInSecondClass"/&gt;
 *     &lt;enumeration value="reservationsPossibleForCertainClasses"/&gt;
 *     &lt;enumeration value="groupBookingRestricted"/&gt;
 *     &lt;enumeration value="noGroupsAllowed"/&gt;
 *     &lt;enumeration value="noReservationsPossible"/&gt;
 *     &lt;enumeration value="wheelchairOnlyReservations"/&gt;
 *     &lt;enumeration value="bicycleReservationsCompulsory"/&gt;
 *     &lt;enumeration value="reservationsSupplementCharged"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationEnumeration")
@XmlEnum
public enum ReservationEnumeration {

    @XmlEnumValue("reservationsCompulsory")
    RESERVATIONS_COMPULSORY("reservationsCompulsory"),
    @XmlEnumValue("reservationsCompulsoryForGroups")
    RESERVATIONS_COMPULSORY_FOR_GROUPS("reservationsCompulsoryForGroups"),
    @XmlEnumValue("reservationsCompulsoryForFirstClass")
    RESERVATIONS_COMPULSORY_FOR_FIRST_CLASS("reservationsCompulsoryForFirstClass"),
    @XmlEnumValue("reservationsCompulsoryFromOriginStation")
    RESERVATIONS_COMPULSORY_FROM_ORIGIN_STATION("reservationsCompulsoryFromOriginStation"),
    @XmlEnumValue("reservationsRecommended")
    RESERVATIONS_RECOMMENDED("reservationsRecommended"),
    @XmlEnumValue("reservationsPossible")
    RESERVATIONS_POSSIBLE("reservationsPossible"),
    @XmlEnumValue("reservationsPossibleOnlyInFirstClass")
    RESERVATIONS_POSSIBLE_ONLY_IN_FIRST_CLASS("reservationsPossibleOnlyInFirstClass"),
    @XmlEnumValue("reservationsPossibleOnlyInSecondClass")
    RESERVATIONS_POSSIBLE_ONLY_IN_SECOND_CLASS("reservationsPossibleOnlyInSecondClass"),
    @XmlEnumValue("reservationsPossibleForCertainClasses")
    RESERVATIONS_POSSIBLE_FOR_CERTAIN_CLASSES("reservationsPossibleForCertainClasses"),
    @XmlEnumValue("groupBookingRestricted")
    GROUP_BOOKING_RESTRICTED("groupBookingRestricted"),
    @XmlEnumValue("noGroupsAllowed")
    NO_GROUPS_ALLOWED("noGroupsAllowed"),
    @XmlEnumValue("noReservationsPossible")
    NO_RESERVATIONS_POSSIBLE("noReservationsPossible"),
    @XmlEnumValue("wheelchairOnlyReservations")
    WHEELCHAIR_ONLY_RESERVATIONS("wheelchairOnlyReservations"),
    @XmlEnumValue("bicycleReservationsCompulsory")
    BICYCLE_RESERVATIONS_COMPULSORY("bicycleReservationsCompulsory"),
    @XmlEnumValue("reservationsSupplementCharged")
    RESERVATIONS_SUPPLEMENT_CHARGED("reservationsSupplementCharged"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ReservationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationEnumeration fromValue(String v) {
        for (ReservationEnumeration c: ReservationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
