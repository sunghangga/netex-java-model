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
 * <p>Java class for StopUseEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopUseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="access"/&gt;
 *     &lt;enumeration value="interchangeOnly"/&gt;
 *     &lt;enumeration value="passthrough"/&gt;
 *     &lt;enumeration value="noBoardingOrAlighting"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StopUseEnumeration")
@XmlEnum
public enum StopUseEnumeration {

    @XmlEnumValue("access")
    ACCESS("access"),
    @XmlEnumValue("interchangeOnly")
    INTERCHANGE_ONLY("interchangeOnly"),
    @XmlEnumValue("passthrough")
    PASSTHROUGH("passthrough"),
    @XmlEnumValue("noBoardingOrAlighting")
    NO_BOARDING_OR_ALIGHTING("noBoardingOrAlighting");
    private final String value;

    StopUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopUseEnumeration fromValue(String v) {
        for (StopUseEnumeration c: StopUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
