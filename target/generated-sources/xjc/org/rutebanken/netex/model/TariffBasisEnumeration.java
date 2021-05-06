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
 * <p>Java class for TariffBasisEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TariffBasisEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="flat"/&gt;
 *     &lt;enumeration value="distance"/&gt;
 *     &lt;enumeration value="unitSection"/&gt;
 *     &lt;enumeration value="zone"/&gt;
 *     &lt;enumeration value="zoneToZone"/&gt;
 *     &lt;enumeration value="pointToPoint"/&gt;
 *     &lt;enumeration value="route"/&gt;
 *     &lt;enumeration value="tour"/&gt;
 *     &lt;enumeration value="group"/&gt;
 *     &lt;enumeration value="discount"/&gt;
 *     &lt;enumeration value="period"/&gt;
 *     &lt;enumeration value="free"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TariffBasisEnumeration")
@XmlEnum
public enum TariffBasisEnumeration {

    @XmlEnumValue("flat")
    FLAT("flat"),
    @XmlEnumValue("distance")
    DISTANCE("distance"),
    @XmlEnumValue("unitSection")
    UNIT_SECTION("unitSection"),
    @XmlEnumValue("zone")
    ZONE("zone"),
    @XmlEnumValue("zoneToZone")
    ZONE_TO_ZONE("zoneToZone"),
    @XmlEnumValue("pointToPoint")
    POINT_TO_POINT("pointToPoint"),
    @XmlEnumValue("route")
    ROUTE("route"),
    @XmlEnumValue("tour")
    TOUR("tour"),
    @XmlEnumValue("group")
    GROUP("group"),
    @XmlEnumValue("discount")
    DISCOUNT("discount"),
    @XmlEnumValue("period")
    PERIOD("period"),
    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TariffBasisEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TariffBasisEnumeration fromValue(String v) {
        for (TariffBasisEnumeration c: TariffBasisEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}