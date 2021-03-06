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
 * <p>Java class for GradientEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GradientEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="verySteep"/&gt;
 *     &lt;enumeration value="steep"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="gentle"/&gt;
 *     &lt;enumeration value="level"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GradientEnumeration")
@XmlEnum
public enum GradientEnumeration {

    @XmlEnumValue("verySteep")
    VERY_STEEP("verySteep"),
    @XmlEnumValue("steep")
    STEEP("steep"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("gentle")
    GENTLE("gentle"),
    @XmlEnumValue("level")
    LEVEL("level");
    private final String value;

    GradientEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GradientEnumeration fromValue(String v) {
        for (GradientEnumeration c: GradientEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
