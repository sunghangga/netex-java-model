//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}SalesOfferPackageEntitlementRequired_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}UsageParameterGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageEntitlementRequiredGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}SalesOfferPackageEntitlementRequiredIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class SalesOfferPackageEntitlementRequired
    extends SalesOfferPackageEntitlementRequired_VersionStructure
{


    @Override
    public SalesOfferPackageEntitlementRequired withSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        setSalesOfferPackageRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withMinimumQualificationPeriod(Duration value) {
        setMinimumQualificationPeriod(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withEntitlementConstraint(EntitlementConstraintStructure value) {
        setEntitlementConstraint(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementRequired withId(String value) {
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