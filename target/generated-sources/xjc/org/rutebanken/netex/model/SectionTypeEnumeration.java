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
 * <p>Java class for SectionTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SectionTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="trunk"/&gt;
 *     &lt;enumeration value="branch"/&gt;
 *     &lt;enumeration value="eyelBranch"/&gt;
 *     &lt;enumeration value="endLoop"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SectionTypeEnumeration")
@XmlEnum
public enum SectionTypeEnumeration {

    @XmlEnumValue("trunk")
    TRUNK("trunk"),
    @XmlEnumValue("branch")
    BRANCH("branch"),
    @XmlEnumValue("eyelBranch")
    EYEL_BRANCH("eyelBranch"),
    @XmlEnumValue("endLoop")
    END_LOOP("endLoop"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SectionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SectionTypeEnumeration fromValue(String v) {
        for (SectionTypeEnumeration c: SectionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
