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
 * <p>Java class for AudioTriggerMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioTriggerMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="presenceDetector"/&gt;
 *     &lt;enumeration value="mobileApp"/&gt;
 *     &lt;enumeration value="internetPage"/&gt;
 *     &lt;enumeration value="specificDevice"/&gt;
 *     &lt;enumeration value="pushButton"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudioTriggerMethodEnumeration")
@XmlEnum
public enum AudioTriggerMethodEnumeration {

    @XmlEnumValue("presenceDetector")
    PRESENCE_DETECTOR("presenceDetector"),
    @XmlEnumValue("mobileApp")
    MOBILE_APP("mobileApp"),
    @XmlEnumValue("internetPage")
    INTERNET_PAGE("internetPage"),
    @XmlEnumValue("specificDevice")
    SPECIFIC_DEVICE("specificDevice"),
    @XmlEnumValue("pushButton")
    PUSH_BUTTON("pushButton"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AudioTriggerMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioTriggerMethodEnumeration fromValue(String v) {
        for (AudioTriggerMethodEnumeration c: AudioTriggerMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}