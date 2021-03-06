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
 * <p>Java class for SystemOfUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemOfUnits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="SiMetres"/&gt;
 *     &lt;enumeration value="SiKilometresAndMetres"/&gt;
 *     &lt;enumeration value="SiKilometresAndMetres"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemOfUnits")
@XmlEnum
public enum SystemOfUnits {

    @XmlEnumValue("SiMetres")
    SI_METRES("SiMetres"),
    @XmlEnumValue("SiKilometresAndMetres")
    SI_KILOMETRES_AND_METRES("SiKilometresAndMetres"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SystemOfUnits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemOfUnits fromValue(String v) {
        for (SystemOfUnits c: SystemOfUnits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
