//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Reselling_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}ResellingGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ResellingIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Reselling
    extends Reselling_VersionStructure
{


    @Override
    public Reselling withAllowed(ResellTypeEnumeration value) {
        setAllowed(value);
        return this;
    }

    @Override
    public Reselling withCanChangeClass(Boolean value) {
        setCanChangeClass(value);
        return this;
    }

    @Override
    public Reselling withUnusedTicketsOnly(Boolean value) {
        setUnusedTicketsOnly(value);
        return this;
    }

    @Override
    public Reselling withOnlyAtCertainDistributionPoints(Boolean value) {
        setOnlyAtCertainDistributionPoints(value);
        return this;
    }

    @Override
    public Reselling withResellWhen(ResellWhenEnumeration value) {
        setResellWhen(value);
        return this;
    }

    @Override
    public Reselling withExchangableFromAnyTime(String value) {
        setExchangableFromAnyTime(value);
        return this;
    }

    @Override
    public Reselling withExchangableFromDuration(Duration value) {
        setExchangableFromDuration(value);
        return this;
    }

    @Override
    public Reselling withExchangableFromPercentUse(BigDecimal value) {
        setExchangableFromPercentUse(value);
        return this;
    }

    @Override
    public Reselling withExchangableFromIntervalRef(TimeIntervalRefStructure value) {
        setExchangableFromIntervalRef(value);
        return this;
    }

    @Override
    public Reselling withExchangableUntilAnyTime(String value) {
        setExchangableUntilAnyTime(value);
        return this;
    }

    @Override
    public Reselling withExchangableUntilDuration(Duration value) {
        setExchangableUntilDuration(value);
        return this;
    }

    @Override
    public Reselling withExchangableUntilPercentUse(BigDecimal value) {
        setExchangableUntilPercentUse(value);
        return this;
    }

    @Override
    public Reselling withExchangableUntilIntervalRef(TimeIntervalRefStructure value) {
        setExchangableUntilIntervalRef(value);
        return this;
    }

    @Override
    public Reselling withEffectiveFrom(EffectiveFromEnumeration value) {
        setEffectiveFrom(value);
        return this;
    }

    @Override
    public Reselling withNotificationPeriod(Duration value) {
        setNotificationPeriod(value);
        return this;
    }

    @Override
    public Reselling withHasFee(Boolean value) {
        setHasFee(value);
        return this;
    }

    @Override
    public Reselling withRefundBasis(PerBasisEnumeration value) {
        setRefundBasis(value);
        return this;
    }

    @Override
    public Reselling withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public Reselling withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public Reselling withTypesOfPaymentMethodRef(TypeOfPaymentMethodRefs_RelStructure value) {
        setTypesOfPaymentMethodRef(value);
        return this;
    }

    @Override
    public Reselling withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public Reselling withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public Reselling withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Reselling withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Reselling withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Reselling withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Reselling withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Reselling withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Reselling withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public Reselling withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public Reselling withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public Reselling withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public Reselling withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Reselling withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Reselling withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Reselling withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Reselling withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Reselling withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Reselling withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Reselling withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Reselling withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Reselling withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Reselling withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Reselling withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Reselling withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Reselling withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Reselling withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Reselling withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Reselling withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Reselling withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Reselling withId(String value) {
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
