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
 * <p>Java class for AssistanceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssistanceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="personalAssistance"/&gt;
 *     &lt;enumeration value="boardingAssistance"/&gt;
 *     &lt;enumeration value="wheechairAssistance"/&gt;
 *     &lt;enumeration value="unaccompaniedMinorAssistance"/&gt;
 *     &lt;enumeration value="wheelchairUse"/&gt;
 *     &lt;enumeration value="conductor"/&gt;
 *     &lt;enumeration value="information"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="any"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AssistanceFacilityEnumeration")
@XmlEnum
public enum AssistanceFacilityEnumeration {

    @XmlEnumValue("personalAssistance")
    PERSONAL_ASSISTANCE("personalAssistance"),
    @XmlEnumValue("boardingAssistance")
    BOARDING_ASSISTANCE("boardingAssistance"),
    @XmlEnumValue("wheechairAssistance")
    WHEECHAIR_ASSISTANCE("wheechairAssistance"),
    @XmlEnumValue("unaccompaniedMinorAssistance")
    UNACCOMPANIED_MINOR_ASSISTANCE("unaccompaniedMinorAssistance"),
    @XmlEnumValue("wheelchairUse")
    WHEELCHAIR_USE("wheelchairUse"),
    @XmlEnumValue("conductor")
    CONDUCTOR("conductor"),
    @XmlEnumValue("information")
    INFORMATION("information"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("any")
    ANY("any");
    private final String value;

    AssistanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssistanceFacilityEnumeration fromValue(String v) {
        for (AssistanceFacilityEnumeration c: AssistanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}