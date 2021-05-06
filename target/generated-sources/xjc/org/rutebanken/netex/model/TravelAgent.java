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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TravelAgent_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}OtherOrganisationGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TravelAgentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TravelAgent
    extends TravelAgent_VersionStructure
{


    @Override
    public TravelAgent withAddress(PostalAddress_VersionStructure value) {
        setAddress(value);
        return this;
    }

    @Override
    public TravelAgent withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public TravelAgent withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TravelAgent withCompanyNumber(String value) {
        setCompanyNumber(value);
        return this;
    }

    @Override
    public TravelAgent withExternalOperatorRef(ExternalObjectRefStructure value) {
        setExternalOperatorRef(value);
        return this;
    }

    @Override
    public TravelAgent withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TravelAgent withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public TravelAgent withLegalName(MultilingualString value) {
        setLegalName(value);
        return this;
    }

    @Override
    public TravelAgent withTradingName(MultilingualString value) {
        setTradingName(value);
        return this;
    }

    @Override
    public TravelAgent withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public TravelAgent withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TravelAgent withRemarks(MultilingualString value) {
        setRemarks(value);
        return this;
    }

    @Override
    public TravelAgent withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public TravelAgent withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public TravelAgent withPrivateContactDetails(ContactStructure value) {
        setPrivateContactDetails(value);
        return this;
    }

    @Override
    public TravelAgent withOrganisationType(OrganisationTypeEnumeration... values) {
        if (values!= null) {
            for (OrganisationTypeEnumeration value: values) {
                getOrganisationType().add(value);
            }
        }
        return this;
    }

    @Override
    public TravelAgent withOrganisationType(Collection<OrganisationTypeEnumeration> values) {
        if (values!= null) {
            getOrganisationType().addAll(values);
        }
        return this;
    }

    @Override
    public TravelAgent withTypesOfOrganisation(TypeOfOrganisationRefs_RelStructure value) {
        setTypesOfOrganisation(value);
        return this;
    }

    @Override
    public TravelAgent withStatusOrganisationGroup(Boolean value) {
        setStatusOrganisationGroup(value);
        return this;
    }

    @Override
    public TravelAgent withValidityPeriod(org.rutebanken.netex.model.Organisation_VersionStructure.ValidityPeriod value) {
        setValidityPeriod(value);
        return this;
    }

    @Override
    public TravelAgent withParts(org.rutebanken.netex.model.Organisation_VersionStructure.Parts value) {
        setParts(value);
        return this;
    }

    @Override
    public TravelAgent withOwnResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setOwnResponsibilitySets(value);
        return this;
    }

    @Override
    public TravelAgent withDelegatedResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setDelegatedResponsibilitySets(value);
        return this;
    }

    @Override
    public TravelAgent withDelegatedFrom(OrganisationRefs_RelStructure value) {
        setDelegatedFrom(value);
        return this;
    }

    @Override
    public TravelAgent withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TravelAgent withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TravelAgent withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TravelAgent withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TravelAgent withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TravelAgent withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TravelAgent withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TravelAgent withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TravelAgent withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TravelAgent withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TravelAgent withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TravelAgent withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TravelAgent withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TravelAgent withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelAgent withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelAgent withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TravelAgent withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TravelAgent withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TravelAgent withId(String value) {
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