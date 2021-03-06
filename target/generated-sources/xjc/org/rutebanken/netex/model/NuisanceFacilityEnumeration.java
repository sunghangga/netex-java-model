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
 * <p>Java class for NuisanceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NuisanceFacilityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="smoking"/&gt;
 *     &lt;enumeration value="noSmoking"/&gt;
 *     &lt;enumeration value="familyArea"/&gt;
 *     &lt;enumeration value="childfreeArea"/&gt;
 *     &lt;enumeration value="noAnimals"/&gt;
 *     &lt;enumeration value="breastfeedingFriendly"/&gt;
 *     &lt;enumeration value="mobilePhoneUseZone"/&gt;
 *     &lt;enumeration value="mobilePhoneFreeZone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NuisanceFacilityEnumeration")
@XmlEnum
public enum NuisanceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("smoking")
    SMOKING("smoking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("familyArea")
    FAMILY_AREA("familyArea"),
    @XmlEnumValue("childfreeArea")
    CHILDFREE_AREA("childfreeArea"),
    @XmlEnumValue("noAnimals")
    NO_ANIMALS("noAnimals"),
    @XmlEnumValue("breastfeedingFriendly")
    BREASTFEEDING_FRIENDLY("breastfeedingFriendly"),
    @XmlEnumValue("mobilePhoneUseZone")
    MOBILE_PHONE_USE_ZONE("mobilePhoneUseZone"),
    @XmlEnumValue("mobilePhoneFreeZone")
    MOBILE_PHONE_FREE_ZONE("mobilePhoneFreeZone");
    private final String value;

    NuisanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NuisanceFacilityEnumeration fromValue(String v) {
        for (NuisanceFacilityEnumeration c: NuisanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
