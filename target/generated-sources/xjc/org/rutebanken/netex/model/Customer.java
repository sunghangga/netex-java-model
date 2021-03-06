//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Customer_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}CustomerGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CustomerIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Customer
    extends Customer_VersionStructure
{


    @Override
    public Customer withSurname(String value) {
        setSurname(value);
        return this;
    }

    @Override
    public Customer withFirstName(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public Customer withTitle(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public Customer withDateOfBirth(LocalDateTime value) {
        setDateOfBirth(value);
        return this;
    }

    @Override
    public Customer withGender(GenderEnumeration value) {
        setGender(value);
        return this;
    }

    @Override
    public Customer withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public Customer withPhoto(String value) {
        setPhoto(value);
        return this;
    }

    @Override
    public Customer withEmail(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public Customer withPhone(TelephoneContactStructure value) {
        setPhone(value);
        return this;
    }

    @Override
    public Customer withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public Customer withIdentityDocumentRef(PrivateCodeStructure value) {
        setIdentityDocumentRef(value);
        return this;
    }

    @Override
    public Customer withCustomerEligibilities(CustomerEligibilities_RelStructure value) {
        setCustomerEligibilities(value);
        return this;
    }

    @Override
    public Customer withCustomerAccounts(CustomerAccounts_RelStructure value) {
        setCustomerAccounts(value);
        return this;
    }

    @Override
    public Customer withFareContracts(FareContracts_RelStructure value) {
        setFareContracts(value);
        return this;
    }

    @Override
    public Customer withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Customer withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Customer withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Customer withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Customer withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Customer withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Customer withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Customer withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Customer withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Customer withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Customer withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Customer withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Customer withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Customer withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Customer withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Customer withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Customer withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Customer withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Customer withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
