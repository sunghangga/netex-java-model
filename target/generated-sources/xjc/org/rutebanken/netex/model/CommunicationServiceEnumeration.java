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
 * <p>Java class for CommunicationServiceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationServiceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="freeWifi"/&gt;
 *     &lt;enumeration value="publicWifi"/&gt;
 *     &lt;enumeration value="phone"/&gt;
 *     &lt;enumeration value="internet"/&gt;
 *     &lt;enumeration value="mobileCoverage"/&gt;
 *     &lt;enumeration value="videoEntertainment"/&gt;
 *     &lt;enumeration value="audioEntertainment"/&gt;
 *     &lt;enumeration value="postbox"/&gt;
 *     &lt;enumeration value="postOffice"/&gt;
 *     &lt;enumeration value="businessServices"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationServiceEnumeration")
@XmlEnum
public enum CommunicationServiceEnumeration {

    @XmlEnumValue("freeWifi")
    FREE_WIFI("freeWifi"),
    @XmlEnumValue("publicWifi")
    PUBLIC_WIFI("publicWifi"),
    @XmlEnumValue("phone")
    PHONE("phone"),
    @XmlEnumValue("internet")
    INTERNET("internet"),
    @XmlEnumValue("mobileCoverage")
    MOBILE_COVERAGE("mobileCoverage"),
    @XmlEnumValue("videoEntertainment")
    VIDEO_ENTERTAINMENT("videoEntertainment"),
    @XmlEnumValue("audioEntertainment")
    AUDIO_ENTERTAINMENT("audioEntertainment"),
    @XmlEnumValue("postbox")
    POSTBOX("postbox"),
    @XmlEnumValue("postOffice")
    POST_OFFICE("postOffice"),
    @XmlEnumValue("businessServices")
    BUSINESS_SERVICES("businessServices");
    private final String value;

    CommunicationServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationServiceEnumeration fromValue(String v) {
        for (CommunicationServiceEnumeration c: CommunicationServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
