//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Exchanging_VersionStructure"&gt;
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
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ExchangingGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ExchangingIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Exchanging
    extends Exchanging_VersionStructure
{


    @Override
    public Exchanging withNumberOfExchangesAllowed(BigInteger value) {
        setNumberOfExchangesAllowed(value);
        return this;
    }

    @Override
    public Exchanging withToFareClass(FareClassEnumeration value) {
        setToFareClass(value);
        return this;
    }

    @Override
    public Exchanging withToClassOfUseRef(ClassOfUseRefStructure value) {
        setToClassOfUseRef(value);
        return this;
    }

    @Override
    public Exchanging withExchangableTo(ExchangableToEnumeration value) {
        setExchangableTo(value);
        return this;
    }

    @Override
    public Exchanging withAllowed(ResellTypeEnumeration value) {
        setAllowed(value);
        return this;
    }

    @Override
    public Exchanging withCanChangeClass(Boolean value) {
        setCanChangeClass(value);
        return this;
    }

    @Override
    public Exchanging withUnusedTicketsOnly(Boolean value) {
        setUnusedTicketsOnly(value);
        return this;
    }

    @Override
    public Exchanging withOnlyAtCertainDistributionPoints(Boolean value) {
        setOnlyAtCertainDistributionPoints(value);
        return this;
    }

    @Override
    public Exchanging withResellWhen(ResellWhenEnumeration value) {
        setResellWhen(value);
        return this;
    }

    @Override
    public Exchanging withExchangableFromAnyTime(String value) {
        setExchangableFromAnyTime(value);
        return this;
    }

    @Override
    public Exchanging withExchangableFromDuration(Duration value) {
        setExchangableFromDuration(value);
        return this;
    }

    @Override
    public Exchanging withExchangableFromPercentUse(BigDecimal value) {
        setExchangableFromPercentUse(value);
        return this;
    }

    @Override
    public Exchanging withExchangableFromIntervalRef(TimeIntervalRefStructure value) {
        setExchangableFromIntervalRef(value);
        return this;
    }

    @Override
    public Exchanging withExchangableUntilAnyTime(String value) {
        setExchangableUntilAnyTime(value);
        return this;
    }

    @Override
    public Exchanging withExchangableUntilDuration(Duration value) {
        setExchangableUntilDuration(value);
        return this;
    }

    @Override
    public Exchanging withExchangableUntilPercentUse(BigDecimal value) {
        setExchangableUntilPercentUse(value);
        return this;
    }

    @Override
    public Exchanging withExchangableUntilIntervalRef(TimeIntervalRefStructure value) {
        setExchangableUntilIntervalRef(value);
        return this;
    }

    @Override
    public Exchanging withEffectiveFrom(EffectiveFromEnumeration value) {
        setEffectiveFrom(value);
        return this;
    }

    @Override
    public Exchanging withNotificationPeriod(Duration value) {
        setNotificationPeriod(value);
        return this;
    }

    @Override
    public Exchanging withHasFee(Boolean value) {
        setHasFee(value);
        return this;
    }

    @Override
    public Exchanging withRefundBasis(PerBasisEnumeration value) {
        setRefundBasis(value);
        return this;
    }

    @Override
    public Exchanging withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public Exchanging withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public Exchanging withTypesOfPaymentMethodRef(TypeOfPaymentMethodRefs_RelStructure value) {
        setTypesOfPaymentMethodRef(value);
        return this;
    }

    @Override
    public Exchanging withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public Exchanging withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public Exchanging withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Exchanging withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Exchanging withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Exchanging withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Exchanging withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Exchanging withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Exchanging withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public Exchanging withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public Exchanging withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public Exchanging withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public Exchanging withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Exchanging withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Exchanging withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Exchanging withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Exchanging withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Exchanging withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Exchanging withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Exchanging withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Exchanging withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Exchanging withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Exchanging withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Exchanging withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Exchanging withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Exchanging withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Exchanging withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Exchanging withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Exchanging withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Exchanging withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Exchanging withId(String value) {
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
