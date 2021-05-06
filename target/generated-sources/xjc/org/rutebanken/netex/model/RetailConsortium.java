//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}RetailConsortium_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}OrganisationGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RetailConsortiumGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}RetailConsortiumIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RetailConsortium
    extends RetailConsortium_VersionStructure
{


    @Override
    public RetailConsortium withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public RetailConsortium withMembers(OrganisationRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public RetailConsortium withBlacklistRefs(BlacklistRefs_RelStructure value) {
        setBlacklistRefs(value);
        return this;
    }

    @Override
    public RetailConsortium withWhitelistRefs(WhitelistRefs_RelStructure value) {
        setWhitelistRefs(value);
        return this;
    }

    @Override
    public RetailConsortium withRetailDevices(RetailDevices_RelStructure value) {
        setRetailDevices(value);
        return this;
    }

    @Override
    public RetailConsortium withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public RetailConsortium withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public RetailConsortium withCompanyNumber(String value) {
        setCompanyNumber(value);
        return this;
    }

    @Override
    public RetailConsortium withExternalOperatorRef(ExternalObjectRefStructure value) {
        setExternalOperatorRef(value);
        return this;
    }

    @Override
    public RetailConsortium withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RetailConsortium withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public RetailConsortium withLegalName(MultilingualString value) {
        setLegalName(value);
        return this;
    }

    @Override
    public RetailConsortium withTradingName(MultilingualString value) {
        setTradingName(value);
        return this;
    }

    @Override
    public RetailConsortium withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public RetailConsortium withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public RetailConsortium withRemarks(MultilingualString value) {
        setRemarks(value);
        return this;
    }

    @Override
    public RetailConsortium withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public RetailConsortium withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public RetailConsortium withPrivateContactDetails(ContactStructure value) {
        setPrivateContactDetails(value);
        return this;
    }

    @Override
    public RetailConsortium withOrganisationType(OrganisationTypeEnumeration... values) {
        if (values!= null) {
            for (OrganisationTypeEnumeration value: values) {
                getOrganisationType().add(value);
            }
        }
        return this;
    }

    @Override
    public RetailConsortium withOrganisationType(Collection<OrganisationTypeEnumeration> values) {
        if (values!= null) {
            getOrganisationType().addAll(values);
        }
        return this;
    }

    @Override
    public RetailConsortium withTypesOfOrganisation(TypeOfOrganisationRefs_RelStructure value) {
        setTypesOfOrganisation(value);
        return this;
    }

    @Override
    public RetailConsortium withStatusOrganisationGroup(Boolean value) {
        setStatusOrganisationGroup(value);
        return this;
    }

    @Override
    public RetailConsortium withValidityPeriod(org.rutebanken.netex.model.Organisation_VersionStructure.ValidityPeriod value) {
        setValidityPeriod(value);
        return this;
    }

    @Override
    public RetailConsortium withParts(org.rutebanken.netex.model.Organisation_VersionStructure.Parts value) {
        setParts(value);
        return this;
    }

    @Override
    public RetailConsortium withOwnResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setOwnResponsibilitySets(value);
        return this;
    }

    @Override
    public RetailConsortium withDelegatedResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setDelegatedResponsibilitySets(value);
        return this;
    }

    @Override
    public RetailConsortium withDelegatedFrom(OrganisationRefs_RelStructure value) {
        setDelegatedFrom(value);
        return this;
    }

    @Override
    public RetailConsortium withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RetailConsortium withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RetailConsortium withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RetailConsortium withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RetailConsortium withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RetailConsortium withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RetailConsortium withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RetailConsortium withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RetailConsortium withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RetailConsortium withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RetailConsortium withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RetailConsortium withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RetailConsortium withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RetailConsortium withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RetailConsortium withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RetailConsortium withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RetailConsortium withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RetailConsortium withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RetailConsortium withId(String value) {
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
