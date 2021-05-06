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
 * <p>Java class for OutputDetailEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutputDetailEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="NoGeometry"/&gt;
 *     &lt;enumeration value="Xref"/&gt;
 *     &lt;enumeration value="AllWithXref"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputDetailEnumeration")
@XmlEnum
public enum OutputDetailEnumeration {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("NoGeometry")
    NO_GEOMETRY("NoGeometry"),
    @XmlEnumValue("Xref")
    XREF("Xref"),
    @XmlEnumValue("AllWithXref")
    ALL_WITH_XREF("AllWithXref");
    private final String value;

    OutputDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputDetailEnumeration fromValue(String v) {
        for (OutputDetailEnumeration c: OutputDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}