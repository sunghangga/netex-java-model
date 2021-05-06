//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for UsageParameterPrice_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageParameterPrice_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}FarePrice_VersionedChildStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}UsageParameterPriceGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageParameterPrice_VersionedChildStructure", propOrder = {
    "usageParameterRef"
})
@XmlSeeAlso({
    UsageParameterPrice.class
})
public class UsageParameterPrice_VersionedChildStructure
    extends FarePrice_VersionedChildStructure
{

    @XmlElementRef(name = "UsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UsageParameterRefStructure> usageParameterRef;

    /**
     * Gets the value of the usageParameterRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UsageParameterRefStructure> getUsageParameterRef() {
        return usageParameterRef;
    }

    /**
     * Sets the value of the usageParameterRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     *     
     */
    public void setUsageParameterRef(JAXBElement<? extends UsageParameterRefStructure> value) {
        this.usageParameterRef = value;
    }

    public UsageParameterPrice_VersionedChildStructure withUsageParameterRef(JAXBElement<? extends UsageParameterRefStructure> value) {
        setUsageParameterRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        setPricingRule_(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withRanking(BigInteger value) {
        setRanking(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public UsageParameterPrice_VersionedChildStructure withId(String value) {
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