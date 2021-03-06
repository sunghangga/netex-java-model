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
 * <p>Java class for HeadwayUseEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HeadwayUseEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="DisplayPassingTimesOnly"/&gt;
 *     &lt;enumeration value="DisplayAsWellAsPassingTimes"/&gt;
 *     &lt;enumeration value="DisplayInsteadOfPassingTimes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HeadwayUseEnumeration")
@XmlEnum
public enum HeadwayUseEnumeration {

    @XmlEnumValue("DisplayPassingTimesOnly")
    DISPLAY_PASSING_TIMES_ONLY("DisplayPassingTimesOnly"),
    @XmlEnumValue("DisplayAsWellAsPassingTimes")
    DISPLAY_AS_WELL_AS_PASSING_TIMES("DisplayAsWellAsPassingTimes"),
    @XmlEnumValue("DisplayInsteadOfPassingTimes")
    DISPLAY_INSTEAD_OF_PASSING_TIMES("DisplayInsteadOfPassingTimes");
    private final String value;

    HeadwayUseEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadwayUseEnumeration fromValue(String v) {
        for (HeadwayUseEnumeration c: HeadwayUseEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
