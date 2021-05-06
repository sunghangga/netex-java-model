//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}SupplementProduct_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PriceableObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ServiceAccessRightGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FareProductGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PreassignedFareProductGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SupplementProductGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PreassignedFareProductIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class SupplementProduct
    extends SupplementProduct_VersionStructure
{


    @Override
    public SupplementProduct withSupplementProductType(SupplementProductEnumeration value) {
        setSupplementProductType(value);
        return this;
    }

    @Override
    public SupplementProduct withSupplementToFareProductRef(FareProductRefStructure value) {
        setSupplementToFareProductRef(value);
        return this;
    }

    @Override
    public SupplementProduct withSupplementTo(FareProductRefs_RelStructure value) {
        setSupplementTo(value);
        return this;
    }

    @Override
    public SupplementProduct withProductType(PreassignedFareProductEnumeration value) {
        setProductType(value);
        return this;
    }

    @Override
    public SupplementProduct withChargingMomentRef(ChargingMomentRefStructure value) {
        setChargingMomentRef(value);
        return this;
    }

    @Override
    public SupplementProduct withChargingMomentType(ChargingMomentEnumeration value) {
        setChargingMomentType(value);
        return this;
    }

    @Override
    public SupplementProduct withTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        setTypeOfFareProductRef(value);
        return this;
    }

    @Override
    public SupplementProduct withTypesOfFareProduct(TypeOfFareProductRefs_RelStructure value) {
        setTypesOfFareProduct(value);
        return this;
    }

    @Override
    public SupplementProduct withTransportOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setTransportOrganisationRef(value);
        return this;
    }

    @Override
    public SupplementProduct withConditionSummary(ConditionSummaryStructure value) {
        setConditionSummary(value);
        return this;
    }

    @Override
    public SupplementProduct withFareProductRef(JAXBElement<? extends FareProductRefStructure> value) {
        setFareProductRef(value);
        return this;
    }

    @Override
    public SupplementProduct withValidityParameterAssignments(GenericParameterAssignments_RelStructure value) {
        setValidityParameterAssignments(value);
        return this;
    }

    @Override
    public SupplementProduct withGenericParameterAssignment(GenericParameterAssignment value) {
        setGenericParameterAssignment(value);
        return this;
    }

    @Override
    public SupplementProduct withGenericParameterAssignmentInContext(GenericParameterAssignmentInContext value) {
        setGenericParameterAssignmentInContext(value);
        return this;
    }

    @Override
    public SupplementProduct withValidableElements(ValidableElements_RelStructure value) {
        setValidableElements(value);
        return this;
    }

    @Override
    public SupplementProduct withAccessRightsInProduct(AccessRightsInProduct_RelStructure value) {
        setAccessRightsInProduct(value);
        return this;
    }

    @Override
    public SupplementProduct withTariffs(TariffRefs_RelStructure value) {
        setTariffs(value);
        return this;
    }

    @Override
    public SupplementProduct withPrices(FareProductPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public SupplementProduct withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public SupplementProduct withInfoUrl(String value) {
        setInfoUrl(value);
        return this;
    }

    @Override
    public SupplementProduct withDocumentLinks(InfoLinks_RelStructure value) {
        setDocumentLinks(value);
        return this;
    }

    @Override
    public SupplementProduct withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SupplementProduct withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SupplementProduct withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public SupplementProduct withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public SupplementProduct withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public SupplementProduct withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public SupplementProduct withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public SupplementProduct withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public SupplementProduct withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public SupplementProduct withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public SupplementProduct withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SupplementProduct withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SupplementProduct withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SupplementProduct withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SupplementProduct withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SupplementProduct withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SupplementProduct withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SupplementProduct withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SupplementProduct withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SupplementProduct withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SupplementProduct withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SupplementProduct withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SupplementProduct withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SupplementProduct withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SupplementProduct withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SupplementProduct withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SupplementProduct withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SupplementProduct withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SupplementProduct withId(String value) {
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
