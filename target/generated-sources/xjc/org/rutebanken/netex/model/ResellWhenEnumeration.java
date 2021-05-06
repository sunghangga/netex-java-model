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
 * <p>Java class for ResellWhenEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResellWhenEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="never"/&gt;
 *     &lt;enumeration value="withinPurchaseGracePeriod"/&gt;
 *     &lt;enumeration value="beforeStartOfValidity"/&gt;
 *     &lt;enumeration value="afterStartOfValidity"/&gt;
 *     &lt;enumeration value="afterEndOfValidity"/&gt;
 *     &lt;enumeration value="beforeFirstUse"/&gt;
 *     &lt;enumeration value="afterFirstUse"/&gt;
 *     &lt;enumeration value="beforeValidation"/&gt;
 *     &lt;enumeration value="afterValidation"/&gt;
 *     &lt;enumeration value="withinSpecifiedWindow"/&gt;
 *     &lt;enumeration value="anyTime"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResellWhenEnumeration")
@XmlEnum
public enum ResellWhenEnumeration {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("withinPurchaseGracePeriod")
    WITHIN_PURCHASE_GRACE_PERIOD("withinPurchaseGracePeriod"),
    @XmlEnumValue("beforeStartOfValidity")
    BEFORE_START_OF_VALIDITY("beforeStartOfValidity"),
    @XmlEnumValue("afterStartOfValidity")
    AFTER_START_OF_VALIDITY("afterStartOfValidity"),
    @XmlEnumValue("afterEndOfValidity")
    AFTER_END_OF_VALIDITY("afterEndOfValidity"),
    @XmlEnumValue("beforeFirstUse")
    BEFORE_FIRST_USE("beforeFirstUse"),
    @XmlEnumValue("afterFirstUse")
    AFTER_FIRST_USE("afterFirstUse"),
    @XmlEnumValue("beforeValidation")
    BEFORE_VALIDATION("beforeValidation"),
    @XmlEnumValue("afterValidation")
    AFTER_VALIDATION("afterValidation"),
    @XmlEnumValue("withinSpecifiedWindow")
    WITHIN_SPECIFIED_WINDOW("withinSpecifiedWindow"),
    @XmlEnumValue("anyTime")
    ANY_TIME("anyTime"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ResellWhenEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResellWhenEnumeration fromValue(String v) {
        for (ResellWhenEnumeration c: ResellWhenEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
