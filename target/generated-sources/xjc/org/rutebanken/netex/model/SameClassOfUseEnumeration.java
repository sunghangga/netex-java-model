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
 * <p>Java class for SameClassOfUseEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SameClassOfUseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="any"/&gt;
 *     &lt;enumeration value="same"/&gt;
 *     &lt;enumeration value="sameOrEquivalent"/&gt;
 *     &lt;enumeration value="different"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SameClassOfUseEnumeration")
@XmlEnum
public enum SameClassOfUseEnumeration {

    @XmlEnumValue("any")
    ANY("any"),
    @XmlEnumValue("same")
    SAME("same"),
    @XmlEnumValue("sameOrEquivalent")
    SAME_OR_EQUIVALENT("sameOrEquivalent"),
    @XmlEnumValue("different")
    DIFFERENT("different");
    private final String value;

    SameClassOfUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SameClassOfUseEnumeration fromValue(String v) {
        for (SameClassOfUseEnumeration c: SameClassOfUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
