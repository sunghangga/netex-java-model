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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}CustomerPurchasePackage_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CustomerPurchasePackageIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CustomerPurchasePackage
    extends CustomerPurchasePackage_VersionStructure
{


    @Override
    public CustomerPurchasePackage withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        setSalesOfferPackageRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCustomerRef(CustomerRefStructure value) {
        setCustomerRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCustomerAccountRef(CustomerAccountRefStructure value) {
        setCustomerAccountRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withFareContractRef(FareContractRefStructure value) {
        setFareContractRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCustomerPurchasePackageStatus(CustomerPurchasePackageStatusEnumeration value) {
        setCustomerPurchasePackageStatus(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withTravelSpecificationSummaryView(TravelSpecificationSummaryViewStructure value) {
        setTravelSpecificationSummaryView(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withTravelSpecifications(TravelSpecifications_RelStructure value) {
        setTravelSpecifications(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withValidityParameterAssignments(CustomerPurchaseParameterAssignments_RelStructure value) {
        setValidityParameterAssignments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withDistributionAssignments(DistributionAssignments_RelStructure value) {
        setDistributionAssignments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCustomerPurchasePackageElements(CustomerPurchasePackageElements_RelStructure value) {
        setCustomerPurchasePackageElements(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withSalesTransactionRef(SalesTransactionRefStructure value) {
        setSalesTransactionRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withSalesTransactions(SalesTransactionRefs_RelStructure value) {
        setSalesTransactions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withPrices(CustomerPurchasePackagePrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withTravelDocuments(TravelDocuments_RelStructure value) {
        setTravelDocuments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomerPurchasePackage withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CustomerPurchasePackage withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CustomerPurchasePackage withId(String value) {
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