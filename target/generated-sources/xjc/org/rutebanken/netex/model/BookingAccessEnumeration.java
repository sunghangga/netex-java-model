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
 * <p>Java class for BookingAccessEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BookingAccessEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="public"/&gt;
 *     &lt;enumeration value="authorisedPublic"/&gt;
 *     &lt;enumeration value="staff"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookingAccessEnumeration")
@XmlEnum
public enum BookingAccessEnumeration {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("authorisedPublic")
    AUTHORISED_PUBLIC("authorisedPublic"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BookingAccessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BookingAccessEnumeration fromValue(String v) {
        for (BookingAccessEnumeration c: BookingAccessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}