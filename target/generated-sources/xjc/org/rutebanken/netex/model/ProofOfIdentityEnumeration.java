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
 * <p>Java class for ProofOfIdentityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProofOfIdentityEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="noneRequired"/&gt;
 *     &lt;enumeration value="creditCard"/&gt;
 *     &lt;enumeration value="passport"/&gt;
 *     &lt;enumeration value="drivingLicence"/&gt;
 *     &lt;enumeration value="birthCertificate"/&gt;
 *     &lt;enumeration value="membershipCard"/&gt;
 *     &lt;enumeration value="identityDocument"/&gt;
 *     &lt;enumeration value="medicalDocument"/&gt;
 *     &lt;enumeration value="studentCard"/&gt;
 *     &lt;enumeration value="letterWIthAddress"/&gt;
 *     &lt;enumeration value="mobileDevice"/&gt;
 *     &lt;enumeration value="emailAccount"/&gt;
 *     &lt;enumeration value="measurement"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProofOfIdentityEnumeration")
@XmlEnum
public enum ProofOfIdentityEnumeration {

    @XmlEnumValue("noneRequired")
    NONE_REQUIRED("noneRequired"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("passport")
    PASSPORT("passport"),
    @XmlEnumValue("drivingLicence")
    DRIVING_LICENCE("drivingLicence"),
    @XmlEnumValue("birthCertificate")
    BIRTH_CERTIFICATE("birthCertificate"),
    @XmlEnumValue("membershipCard")
    MEMBERSHIP_CARD("membershipCard"),
    @XmlEnumValue("identityDocument")
    IDENTITY_DOCUMENT("identityDocument"),
    @XmlEnumValue("medicalDocument")
    MEDICAL_DOCUMENT("medicalDocument"),
    @XmlEnumValue("studentCard")
    STUDENT_CARD("studentCard"),
    @XmlEnumValue("letterWIthAddress")
    LETTER_W_ITH_ADDRESS("letterWIthAddress"),
    @XmlEnumValue("mobileDevice")
    MOBILE_DEVICE("mobileDevice"),
    @XmlEnumValue("emailAccount")
    EMAIL_ACCOUNT("emailAccount"),
    @XmlEnumValue("measurement")
    MEASUREMENT("measurement"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ProofOfIdentityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProofOfIdentityEnumeration fromValue(String v) {
        for (ProofOfIdentityEnumeration c: ProofOfIdentityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
