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
 * <p>Java class for CheckDirectionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckDirectionEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="forwards"/&gt;
 *     &lt;enumeration value="backwards"/&gt;
 *     &lt;enumeration value="bothWays"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckDirectionEnumeration")
@XmlEnum
public enum CheckDirectionEnumeration {

    @XmlEnumValue("forwards")
    FORWARDS("forwards"),
    @XmlEnumValue("backwards")
    BACKWARDS("backwards"),
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays");
    private final String value;

    CheckDirectionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckDirectionEnumeration fromValue(String v) {
        for (CheckDirectionEnumeration c: CheckDirectionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}