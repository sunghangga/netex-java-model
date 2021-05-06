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
 * <p>Java class for TypeOfCouplingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfCouplingEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="serviceFacility"/&gt;
 *     &lt;enumeration value="coupling"/&gt;
 *     &lt;enumeration value="tariffSection"/&gt;
 *     &lt;enumeration value="uncoupled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfCouplingEnumeration")
@XmlEnum
public enum TypeOfCouplingEnumeration {

    @XmlEnumValue("serviceFacility")
    SERVICE_FACILITY("serviceFacility"),
    @XmlEnumValue("coupling")
    COUPLING("coupling"),
    @XmlEnumValue("tariffSection")
    TARIFF_SECTION("tariffSection"),
    @XmlEnumValue("uncoupled")
    UNCOUPLED("uncoupled");
    private final String value;

    TypeOfCouplingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfCouplingEnumeration fromValue(String v) {
        for (TypeOfCouplingEnumeration c: TypeOfCouplingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
