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
 * <p>Java class for PurchaseWhenEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurchaseWhenEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="advanceOnly"/&gt;
 *     &lt;enumeration value="untilPreviousDay"/&gt;
 *     &lt;enumeration value="dayOfTravelOnly"/&gt;
 *     &lt;enumeration value="advanceAndDayOfTravel"/&gt;
 *     &lt;enumeration value="timeOfTravelOnly"/&gt;
 *     &lt;enumeration value="subscriptionChargeMoment"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseWhenEnumeration")
@XmlEnum
public enum PurchaseWhenEnumeration {

    @XmlEnumValue("advanceOnly")
    ADVANCE_ONLY("advanceOnly"),
    @XmlEnumValue("untilPreviousDay")
    UNTIL_PREVIOUS_DAY("untilPreviousDay"),
    @XmlEnumValue("dayOfTravelOnly")
    DAY_OF_TRAVEL_ONLY("dayOfTravelOnly"),
    @XmlEnumValue("advanceAndDayOfTravel")
    ADVANCE_AND_DAY_OF_TRAVEL("advanceAndDayOfTravel"),
    @XmlEnumValue("timeOfTravelOnly")
    TIME_OF_TRAVEL_ONLY("timeOfTravelOnly"),
    @XmlEnumValue("subscriptionChargeMoment")
    SUBSCRIPTION_CHARGE_MOMENT("subscriptionChargeMoment"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PurchaseWhenEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseWhenEnumeration fromValue(String v) {
        for (PurchaseWhenEnumeration c: PurchaseWhenEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
