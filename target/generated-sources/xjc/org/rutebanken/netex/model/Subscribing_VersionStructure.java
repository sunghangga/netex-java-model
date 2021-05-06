//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Subscribing_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscribing_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SubscribingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscribing_VersionStructure", propOrder = {
    "subscriptionTermType",
    "minimumSubscriptionPeriod",
    "maximumSubscriptionPeriod",
    "subscriptionRenewalPolicy",
    "possibleInstallmenttIntervals",
    "installmentPaymentMethods",
    "installmentTypesOfPaymentMethod"
})
@XmlSeeAlso({
    Subscribing.class
})
public class Subscribing_VersionStructure
    extends UsageParameter_VersionStructure
{

    @XmlElement(name = "SubscriptionTermType", defaultValue = "fixed")
    @XmlSchemaType(name = "normalizedString")
    protected SubscriptionTermTypeEnumeration subscriptionTermType;
    @XmlElement(name = "MinimumSubscriptionPeriod", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumSubscriptionPeriod;
    @XmlElement(name = "MaximumSubscriptionPeriod", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumSubscriptionPeriod;
    @XmlElement(name = "SubscriptionRenewalPolicy", defaultValue = "automatic")
    @XmlSchemaType(name = "normalizedString")
    protected SubscriptionRenewalPolicyEnumeration subscriptionRenewalPolicy;
    protected TimeIntervalRefs_RelStructure possibleInstallmenttIntervals;
    @XmlList
    @XmlElement(name = "InstallmentPaymentMethods")
    protected List<PaymentMethodEnumeration> installmentPaymentMethods;
    protected TypeOfPaymentMethodRefs_RelStructure installmentTypesOfPaymentMethod;

    /**
     * Gets the value of the subscriptionTermType property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionTermTypeEnumeration }
     *     
     */
    public SubscriptionTermTypeEnumeration getSubscriptionTermType() {
        return subscriptionTermType;
    }

    /**
     * Sets the value of the subscriptionTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionTermTypeEnumeration }
     *     
     */
    public void setSubscriptionTermType(SubscriptionTermTypeEnumeration value) {
        this.subscriptionTermType = value;
    }

    /**
     * Gets the value of the minimumSubscriptionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumSubscriptionPeriod() {
        return minimumSubscriptionPeriod;
    }

    /**
     * Sets the value of the minimumSubscriptionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumSubscriptionPeriod(Duration value) {
        this.minimumSubscriptionPeriod = value;
    }

    /**
     * Gets the value of the maximumSubscriptionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumSubscriptionPeriod() {
        return maximumSubscriptionPeriod;
    }

    /**
     * Sets the value of the maximumSubscriptionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumSubscriptionPeriod(Duration value) {
        this.maximumSubscriptionPeriod = value;
    }

    /**
     * Gets the value of the subscriptionRenewalPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRenewalPolicyEnumeration }
     *     
     */
    public SubscriptionRenewalPolicyEnumeration getSubscriptionRenewalPolicy() {
        return subscriptionRenewalPolicy;
    }

    /**
     * Sets the value of the subscriptionRenewalPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRenewalPolicyEnumeration }
     *     
     */
    public void setSubscriptionRenewalPolicy(SubscriptionRenewalPolicyEnumeration value) {
        this.subscriptionRenewalPolicy = value;
    }

    /**
     * Gets the value of the possibleInstallmenttIntervals property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefs_RelStructure }
     *     
     */
    public TimeIntervalRefs_RelStructure getPossibleInstallmenttIntervals() {
        return possibleInstallmenttIntervals;
    }

    /**
     * Sets the value of the possibleInstallmenttIntervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefs_RelStructure }
     *     
     */
    public void setPossibleInstallmenttIntervals(TimeIntervalRefs_RelStructure value) {
        this.possibleInstallmenttIntervals = value;
    }

    /**
     * Gets the value of the installmentPaymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installmentPaymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getInstallmentPaymentMethods() {
        if (installmentPaymentMethods == null) {
            installmentPaymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.installmentPaymentMethods;
    }

    /**
     * Gets the value of the installmentTypesOfPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRefs_RelStructure }
     *     
     */
    public TypeOfPaymentMethodRefs_RelStructure getInstallmentTypesOfPaymentMethod() {
        return installmentTypesOfPaymentMethod;
    }

    /**
     * Sets the value of the installmentTypesOfPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRefs_RelStructure }
     *     
     */
    public void setInstallmentTypesOfPaymentMethod(TypeOfPaymentMethodRefs_RelStructure value) {
        this.installmentTypesOfPaymentMethod = value;
    }

    public Subscribing_VersionStructure withSubscriptionTermType(SubscriptionTermTypeEnumeration value) {
        setSubscriptionTermType(value);
        return this;
    }

    public Subscribing_VersionStructure withMinimumSubscriptionPeriod(Duration value) {
        setMinimumSubscriptionPeriod(value);
        return this;
    }

    public Subscribing_VersionStructure withMaximumSubscriptionPeriod(Duration value) {
        setMaximumSubscriptionPeriod(value);
        return this;
    }

    public Subscribing_VersionStructure withSubscriptionRenewalPolicy(SubscriptionRenewalPolicyEnumeration value) {
        setSubscriptionRenewalPolicy(value);
        return this;
    }

    public Subscribing_VersionStructure withPossibleInstallmenttIntervals(TimeIntervalRefs_RelStructure value) {
        setPossibleInstallmenttIntervals(value);
        return this;
    }

    public Subscribing_VersionStructure withInstallmentPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getInstallmentPaymentMethods().add(value);
            }
        }
        return this;
    }

    public Subscribing_VersionStructure withInstallmentPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getInstallmentPaymentMethods().addAll(values);
        }
        return this;
    }

    public Subscribing_VersionStructure withInstallmentTypesOfPaymentMethod(TypeOfPaymentMethodRefs_RelStructure value) {
        setInstallmentTypesOfPaymentMethod(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Subscribing_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Subscribing_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Subscribing_VersionStructure withId(String value) {
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
