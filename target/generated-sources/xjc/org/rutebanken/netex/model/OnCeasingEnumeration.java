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
 * <p>Java class for OnCeasingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OnCeasingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="immediateTermination"/&gt;
 *     &lt;enumeration value="useUntilExpiry"/&gt;
 *     &lt;enumeration value="terminateAfterGracePeriod"/&gt;
 *     &lt;enumeration value="automaticallySubstituteProduct"/&gt;
 *     &lt;enumeration value="noAction"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnCeasingEnumeration")
@XmlEnum
public enum OnCeasingEnumeration {

    @XmlEnumValue("immediateTermination")
    IMMEDIATE_TERMINATION("immediateTermination"),
    @XmlEnumValue("useUntilExpiry")
    USE_UNTIL_EXPIRY("useUntilExpiry"),
    @XmlEnumValue("terminateAfterGracePeriod")
    TERMINATE_AFTER_GRACE_PERIOD("terminateAfterGracePeriod"),
    @XmlEnumValue("automaticallySubstituteProduct")
    AUTOMATICALLY_SUBSTITUTE_PRODUCT("automaticallySubstituteProduct"),
    @XmlEnumValue("noAction")
    NO_ACTION("noAction"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OnCeasingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnCeasingEnumeration fromValue(String v) {
        for (OnCeasingEnumeration c: OnCeasingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
