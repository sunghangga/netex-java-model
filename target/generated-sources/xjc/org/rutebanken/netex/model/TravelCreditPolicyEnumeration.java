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
 * <p>Java class for TravelCreditPolicyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelCreditPolicyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="allowTravel"/&gt;
 *     &lt;enumeration value="blockAllTravel"/&gt;
 *     &lt;enumeration value="blockPayAsYouGoTravel"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelCreditPolicyEnumeration")
@XmlEnum
public enum TravelCreditPolicyEnumeration {

    @XmlEnumValue("allowTravel")
    ALLOW_TRAVEL("allowTravel"),
    @XmlEnumValue("blockAllTravel")
    BLOCK_ALL_TRAVEL("blockAllTravel"),
    @XmlEnumValue("blockPayAsYouGoTravel")
    BLOCK_PAY_AS_YOU_GO_TRAVEL("blockPayAsYouGoTravel"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TravelCreditPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelCreditPolicyEnumeration fromValue(String v) {
        for (TravelCreditPolicyEnumeration c: TravelCreditPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
