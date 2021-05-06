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
 * <p>Java class for RefundPolicyEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundPolicyEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="any"/&gt;
 *     &lt;enumeration value="illness"/&gt;
 *     &lt;enumeration value="death"/&gt;
 *     &lt;enumeration value="maternity"/&gt;
 *     &lt;enumeration value="redundancy"/&gt;
 *     &lt;enumeration value="changeOfEmployment"/&gt;
 *     &lt;enumeration value="changeOfResidence"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundPolicyEnumeration")
@XmlEnum
public enum RefundPolicyEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("illness")
    ILLNESS("illness"),
    @XmlEnumValue("death")
    DEATH("death"),
    @XmlEnumValue("maternity")
    MATERNITY("maternity"),
    @XmlEnumValue("redundancy")
    REDUNDANCY("redundancy"),
    @XmlEnumValue("changeOfEmployment")
    CHANGE_OF_EMPLOYMENT("changeOfEmployment"),
    @XmlEnumValue("changeOfResidence")
    CHANGE_OF_RESIDENCE("changeOfResidence"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RefundPolicyEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundPolicyEnumeration fromValue(String v) {
        for (RefundPolicyEnumeration c: RefundPolicyEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}