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
 * <p>Java class for TypeOfFuelEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfFuelEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="diesel"/&gt;
 *     &lt;enumeration value="naturalGas"/&gt;
 *     &lt;enumeration value="biodiesel"/&gt;
 *     &lt;enumeration value="electricity"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfFuelEnumeration")
@XmlEnum
public enum TypeOfFuelEnumeration {

    @XmlEnumValue("petrol")
    PETROL("petrol"),
    @XmlEnumValue("diesel")
    DIESEL("diesel"),
    @XmlEnumValue("naturalGas")
    NATURAL_GAS("naturalGas"),
    @XmlEnumValue("biodiesel")
    BIODIESEL("biodiesel"),
    @XmlEnumValue("electricity")
    ELECTRICITY("electricity"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfFuelEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfFuelEnumeration fromValue(String v) {
        for (TypeOfFuelEnumeration c: TypeOfFuelEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
