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
 * <p>Java class for ServiceJourneyPatternTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceJourneyPatternTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="passenger"/&gt;
 *     &lt;enumeration value="garageRunOut"/&gt;
 *     &lt;enumeration value="garageRunIn"/&gt;
 *     &lt;enumeration value="turningManoeuvre"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceJourneyPatternTypeEnumeration")
@XmlEnum
public enum ServiceJourneyPatternTypeEnumeration {

    @XmlEnumValue("passenger")
    PASSENGER("passenger"),
    @XmlEnumValue("garageRunOut")
    GARAGE_RUN_OUT("garageRunOut"),
    @XmlEnumValue("garageRunIn")
    GARAGE_RUN_IN("garageRunIn"),
    @XmlEnumValue("turningManoeuvre")
    TURNING_MANOEUVRE("turningManoeuvre"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ServiceJourneyPatternTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceJourneyPatternTypeEnumeration fromValue(String v) {
        for (ServiceJourneyPatternTypeEnumeration c: ServiceJourneyPatternTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
