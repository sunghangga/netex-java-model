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
 * <p>Java class for TrainElementTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainElementTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="buffetCar"/&gt;
 *     &lt;enumeration value="carriage"/&gt;
 *     &lt;enumeration value="engine"/&gt;
 *     &lt;enumeration value="carTransporter"/&gt;
 *     &lt;enumeration value="sleeperCarriage"/&gt;
 *     &lt;enumeration value="luggageVan"/&gt;
 *     &lt;enumeration value="restaurantCarriage"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrainElementTypeEnumeration")
@XmlEnum
public enum TrainElementTypeEnumeration {

    @XmlEnumValue("buffetCar")
    BUFFET_CAR("buffetCar"),
    @XmlEnumValue("carriage")
    CARRIAGE("carriage"),
    @XmlEnumValue("engine")
    ENGINE("engine"),
    @XmlEnumValue("carTransporter")
    CAR_TRANSPORTER("carTransporter"),
    @XmlEnumValue("sleeperCarriage")
    SLEEPER_CARRIAGE("sleeperCarriage"),
    @XmlEnumValue("luggageVan")
    LUGGAGE_VAN("luggageVan"),
    @XmlEnumValue("restaurantCarriage")
    RESTAURANT_CARRIAGE("restaurantCarriage"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TrainElementTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainElementTypeEnumeration fromValue(String v) {
        for (TrainElementTypeEnumeration c: TrainElementTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}