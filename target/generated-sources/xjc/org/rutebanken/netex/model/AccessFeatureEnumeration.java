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
 * <p>Java class for AccessFeatureEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFeatureEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lift"/&gt;
 *     &lt;enumeration value="escalator"/&gt;
 *     &lt;enumeration value="freightElevator"/&gt;
 *     &lt;enumeration value="travelator"/&gt;
 *     &lt;enumeration value="ramp"/&gt;
 *     &lt;enumeration value="stairs"/&gt;
 *     &lt;enumeration value="seriesOfStairs"/&gt;
 *     &lt;enumeration value="shuttle"/&gt;
 *     &lt;enumeration value="crossing"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="narrowEntrance"/&gt;
 *     &lt;enumeration value="hall"/&gt;
 *     &lt;enumeration value="concourse"/&gt;
 *     &lt;enumeration value="confinedSpace"/&gt;
 *     &lt;enumeration value="queueManagement"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="openSpace"/&gt;
 *     &lt;enumeration value="street"/&gt;
 *     &lt;enumeration value="pavement"/&gt;
 *     &lt;enumeration value="footpath"/&gt;
 *     &lt;enumeration value="passage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccessFeatureEnumeration")
@XmlEnum
public enum AccessFeatureEnumeration {

    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("freightElevator")
    FREIGHT_ELEVATOR("freightElevator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("seriesOfStairs")
    SERIES_OF_STAIRS("seriesOfStairs"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("crossing")
    CROSSING("crossing"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("hall")
    HALL("hall"),
    @XmlEnumValue("concourse")
    CONCOURSE("concourse"),
    @XmlEnumValue("confinedSpace")
    CONFINED_SPACE("confinedSpace"),
    @XmlEnumValue("queueManagement")
    QUEUE_MANAGEMENT("queueManagement"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("openSpace")
    OPEN_SPACE("openSpace"),
    @XmlEnumValue("street")
    STREET("street"),
    @XmlEnumValue("pavement")
    PAVEMENT("pavement"),
    @XmlEnumValue("footpath")
    FOOTPATH("footpath"),
    @XmlEnumValue("passage")
    PASSAGE("passage");
    private final String value;

    AccessFeatureEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFeatureEnumeration fromValue(String v) {
        for (AccessFeatureEnumeration c: AccessFeatureEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
