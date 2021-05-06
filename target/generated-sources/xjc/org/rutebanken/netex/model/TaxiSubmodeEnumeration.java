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
 * <p>Java class for TaxiSubmodeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxiSubmodeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="communalTaxi"/&gt;
 *     &lt;enumeration value="charterTaxi"/&gt;
 *     &lt;enumeration value="waterTaxi"/&gt;
 *     &lt;enumeration value="railTaxi"/&gt;
 *     &lt;enumeration value="bikeTaxi"/&gt;
 *     &lt;enumeration value="blackCab"/&gt;
 *     &lt;enumeration value="miniCab"/&gt;
 *     &lt;enumeration value="allTaxiServices"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxiSubmodeEnumeration")
@XmlEnum
public enum TaxiSubmodeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("communalTaxi")
    COMMUNAL_TAXI("communalTaxi"),
    @XmlEnumValue("charterTaxi")
    CHARTER_TAXI("charterTaxi"),
    @XmlEnumValue("waterTaxi")
    WATER_TAXI("waterTaxi"),
    @XmlEnumValue("railTaxi")
    RAIL_TAXI("railTaxi"),
    @XmlEnumValue("bikeTaxi")
    BIKE_TAXI("bikeTaxi"),
    @XmlEnumValue("blackCab")
    BLACK_CAB("blackCab"),
    @XmlEnumValue("miniCab")
    MINI_CAB("miniCab"),
    @XmlEnumValue("allTaxiServices")
    ALL_TAXI_SERVICES("allTaxiServices");
    private final String value;

    TaxiSubmodeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxiSubmodeEnumeration fromValue(String v) {
        for (TaxiSubmodeEnumeration c: TaxiSubmodeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}