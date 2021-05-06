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
 * <p>Java class for ReservationChargeTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationChargeTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="noFee"/&gt;
 *     &lt;enumeration value="fee"/&gt;
 *     &lt;enumeration value="singleFeeForReturnTrip"/&gt;
 *     &lt;enumeration value="feeForEachDirection"/&gt;
 *     &lt;enumeration value="feeForEachLeg"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReservationChargeTypeEnumeration")
@XmlEnum
public enum ReservationChargeTypeEnumeration {

    @XmlEnumValue("noFee")
    NO_FEE("noFee"),
    @XmlEnumValue("fee")
    FEE("fee"),
    @XmlEnumValue("singleFeeForReturnTrip")
    SINGLE_FEE_FOR_RETURN_TRIP("singleFeeForReturnTrip"),
    @XmlEnumValue("feeForEachDirection")
    FEE_FOR_EACH_DIRECTION("feeForEachDirection"),
    @XmlEnumValue("feeForEachLeg")
    FEE_FOR_EACH_LEG("feeForEachLeg");
    private final String value;

    ReservationChargeTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReservationChargeTypeEnumeration fromValue(String v) {
        for (ReservationChargeTypeEnumeration c: ReservationChargeTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}