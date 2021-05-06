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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ManagementAgent_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementAgent_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}OtherOrganisation_VersionStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementAgent_VersionStructure")
@XmlSeeAlso({
    ManagementAgent.class
})
public class ManagementAgent_VersionStructure
    extends OtherOrganisation_VersionStructure
{


    @Override
    public ManagementAgent_VersionStructure withAddress(PostalAddress_VersionStructure value) {
        setAddress(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withCompanyNumber(String value) {
        setCompanyNumber(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withExternalOperatorRef(ExternalObjectRefStructure value) {
        setExternalOperatorRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withLegalName(MultilingualString value) {
        setLegalName(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withTradingName(MultilingualString value) {
        setTradingName(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withRemarks(MultilingualString value) {
        setRemarks(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withPrivateContactDetails(ContactStructure value) {
        setPrivateContactDetails(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withOrganisationType(OrganisationTypeEnumeration... values) {
        if (values!= null) {
            for (OrganisationTypeEnumeration value: values) {
                getOrganisationType().add(value);
            }
        }
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withOrganisationType(Collection<OrganisationTypeEnumeration> values) {
        if (values!= null) {
            getOrganisationType().addAll(values);
        }
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withTypesOfOrganisation(TypeOfOrganisationRefs_RelStructure value) {
        setTypesOfOrganisation(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withStatusOrganisationGroup(Boolean value) {
        setStatusOrganisationGroup(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withValidityPeriod(org.rutebanken.netex.model.Organisation_VersionStructure.ValidityPeriod value) {
        setValidityPeriod(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withParts(org.rutebanken.netex.model.Organisation_VersionStructure.Parts value) {
        setParts(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withOwnResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setOwnResponsibilitySets(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDelegatedResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setDelegatedResponsibilitySets(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDelegatedFrom(OrganisationRefs_RelStructure value) {
        setDelegatedFrom(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ManagementAgent_VersionStructure withId(String value) {
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