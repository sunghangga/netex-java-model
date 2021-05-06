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
 * <p>Java class for TactileWarningStripEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TactileWarningStripEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="tactileStripAtBeginning"/&gt;
 *     &lt;enumeration value="tactileStripAtEnd"/&gt;
 *     &lt;enumeration value="tactileStripAtBothEnds"/&gt;
 *     &lt;enumeration value="noTactileStrip"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TactileWarningStripEnumeration")
@XmlEnum
public enum TactileWarningStripEnumeration {

    @XmlEnumValue("tactileStripAtBeginning")
    TACTILE_STRIP_AT_BEGINNING("tactileStripAtBeginning"),
    @XmlEnumValue("tactileStripAtEnd")
    TACTILE_STRIP_AT_END("tactileStripAtEnd"),
    @XmlEnumValue("tactileStripAtBothEnds")
    TACTILE_STRIP_AT_BOTH_ENDS("tactileStripAtBothEnds"),
    @XmlEnumValue("noTactileStrip")
    NO_TACTILE_STRIP("noTactileStrip"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TactileWarningStripEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TactileWarningStripEnumeration fromValue(String v) {
        for (TactileWarningStripEnumeration c: TactileWarningStripEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
