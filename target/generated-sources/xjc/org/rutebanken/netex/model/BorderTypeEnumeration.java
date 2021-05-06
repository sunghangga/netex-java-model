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
 * <p>Java class for BorderTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BorderTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="wall"/&gt;
 *     &lt;enumeration value="grass"/&gt;
 *     &lt;enumeration value="earth"/&gt;
 *     &lt;enumeration value="barrier"/&gt;
 *     &lt;enumeration value="road"/&gt;
 *     &lt;enumeration value="cyclingLane"/&gt;
 *     &lt;enumeration value="step"/&gt;
 *     &lt;enumeration value="rail"/&gt;
 *     &lt;enumeration value="plants"/&gt;
 *     &lt;enumeration value="trees"/&gt;
 *     &lt;enumeration value="mud"/&gt;
 *     &lt;enumeration value="solidEdge"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *     &lt;enumeration value="gravel"/&gt;
 *     &lt;enumeration value="noPhysicalBorder"/&gt;
 *     &lt;enumeration value="otherPhysicalBorder"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BorderTypeEnumeration")
@XmlEnum
public enum BorderTypeEnumeration {

    @XmlEnumValue("wall")
    WALL("wall"),
    @XmlEnumValue("grass")
    GRASS("grass"),
    @XmlEnumValue("earth")
    EARTH("earth"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("cyclingLane")
    CYCLING_LANE("cyclingLane"),
    @XmlEnumValue("step")
    STEP("step"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("plants")
    PLANTS("plants"),
    @XmlEnumValue("trees")
    TREES("trees"),
    @XmlEnumValue("mud")
    MUD("mud"),
    @XmlEnumValue("solidEdge")
    SOLID_EDGE("solidEdge"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("gravel")
    GRAVEL("gravel"),
    @XmlEnumValue("noPhysicalBorder")
    NO_PHYSICAL_BORDER("noPhysicalBorder"),
    @XmlEnumValue("otherPhysicalBorder")
    OTHER_PHYSICAL_BORDER("otherPhysicalBorder"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BorderTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BorderTypeEnumeration fromValue(String v) {
        for (BorderTypeEnumeration c: BorderTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
