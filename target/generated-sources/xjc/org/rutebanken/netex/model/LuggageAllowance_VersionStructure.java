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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for LuggageAllowance_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LuggageAllowance_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}LuggageAllowanceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LuggageAllowance_VersionStructure", propOrder = {
    "baggageUseType",
    "baggageType",
    "luggageAllowanceType",
    "maximumNumberItems",
    "maximumBagHeight",
    "maximumBagWidth",
    "maximumBagDepth",
    "maximumBagWeight",
    "totalWeight",
    "luggageChargingBasis"
})
@XmlSeeAlso({
    LuggageAllowance.class
})
public class LuggageAllowance_VersionStructure
    extends UsageParameter_VersionStructure
{

    @XmlElement(name = "BaggageUseType")
    @XmlSchemaType(name = "normalizedString")
    protected BaggageUseTypeEnumeration baggageUseType;
    @XmlElement(name = "BaggageType")
    @XmlSchemaType(name = "normalizedString")
    protected BaggageTypeEnumeration baggageType;
    @XmlElement(name = "LuggageAllowanceType")
    @XmlSchemaType(name = "normalizedString")
    protected LuggageAllowanceTypeEnumeration luggageAllowanceType;
    @XmlElement(name = "MaximumNumberItems")
    protected BigInteger maximumNumberItems;
    @XmlElement(name = "MaximumBagHeight")
    protected BigDecimal maximumBagHeight;
    @XmlElement(name = "MaximumBagWidth")
    protected BigDecimal maximumBagWidth;
    @XmlElement(name = "MaximumBagDepth")
    protected BigDecimal maximumBagDepth;
    @XmlElement(name = "MaximumBagWeight")
    protected BigDecimal maximumBagWeight;
    @XmlElement(name = "TotalWeight")
    protected BigDecimal totalWeight;
    @XmlElement(name = "LuggageChargingBasis")
    @XmlSchemaType(name = "normalizedString")
    protected LuggageChargingBasisEnumeration luggageChargingBasis;

    /**
     * Gets the value of the baggageUseType property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageUseTypeEnumeration }
     *     
     */
    public BaggageUseTypeEnumeration getBaggageUseType() {
        return baggageUseType;
    }

    /**
     * Sets the value of the baggageUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageUseTypeEnumeration }
     *     
     */
    public void setBaggageUseType(BaggageUseTypeEnumeration value) {
        this.baggageUseType = value;
    }

    /**
     * Gets the value of the baggageType property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageTypeEnumeration }
     *     
     */
    public BaggageTypeEnumeration getBaggageType() {
        return baggageType;
    }

    /**
     * Sets the value of the baggageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageTypeEnumeration }
     *     
     */
    public void setBaggageType(BaggageTypeEnumeration value) {
        this.baggageType = value;
    }

    /**
     * Gets the value of the luggageAllowanceType property.
     * 
     * @return
     *     possible object is
     *     {@link LuggageAllowanceTypeEnumeration }
     *     
     */
    public LuggageAllowanceTypeEnumeration getLuggageAllowanceType() {
        return luggageAllowanceType;
    }

    /**
     * Sets the value of the luggageAllowanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageAllowanceTypeEnumeration }
     *     
     */
    public void setLuggageAllowanceType(LuggageAllowanceTypeEnumeration value) {
        this.luggageAllowanceType = value;
    }

    /**
     * Gets the value of the maximumNumberItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberItems() {
        return maximumNumberItems;
    }

    /**
     * Sets the value of the maximumNumberItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberItems(BigInteger value) {
        this.maximumNumberItems = value;
    }

    /**
     * Gets the value of the maximumBagHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagHeight() {
        return maximumBagHeight;
    }

    /**
     * Sets the value of the maximumBagHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagHeight(BigDecimal value) {
        this.maximumBagHeight = value;
    }

    /**
     * Gets the value of the maximumBagWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWidth() {
        return maximumBagWidth;
    }

    /**
     * Sets the value of the maximumBagWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWidth(BigDecimal value) {
        this.maximumBagWidth = value;
    }

    /**
     * Gets the value of the maximumBagDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagDepth() {
        return maximumBagDepth;
    }

    /**
     * Sets the value of the maximumBagDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagDepth(BigDecimal value) {
        this.maximumBagDepth = value;
    }

    /**
     * Gets the value of the maximumBagWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWeight() {
        return maximumBagWeight;
    }

    /**
     * Sets the value of the maximumBagWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWeight(BigDecimal value) {
        this.maximumBagWeight = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWeight(BigDecimal value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the luggageChargingBasis property.
     * 
     * @return
     *     possible object is
     *     {@link LuggageChargingBasisEnumeration }
     *     
     */
    public LuggageChargingBasisEnumeration getLuggageChargingBasis() {
        return luggageChargingBasis;
    }

    /**
     * Sets the value of the luggageChargingBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageChargingBasisEnumeration }
     *     
     */
    public void setLuggageChargingBasis(LuggageChargingBasisEnumeration value) {
        this.luggageChargingBasis = value;
    }

    public LuggageAllowance_VersionStructure withBaggageUseType(BaggageUseTypeEnumeration value) {
        setBaggageUseType(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withBaggageType(BaggageTypeEnumeration value) {
        setBaggageType(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withLuggageAllowanceType(LuggageAllowanceTypeEnumeration value) {
        setLuggageAllowanceType(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withMaximumNumberItems(BigInteger value) {
        setMaximumNumberItems(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withMaximumBagHeight(BigDecimal value) {
        setMaximumBagHeight(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withMaximumBagWidth(BigDecimal value) {
        setMaximumBagWidth(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withMaximumBagDepth(BigDecimal value) {
        setMaximumBagDepth(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withMaximumBagWeight(BigDecimal value) {
        setMaximumBagWeight(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withTotalWeight(BigDecimal value) {
        setTotalWeight(value);
        return this;
    }

    public LuggageAllowance_VersionStructure withLuggageChargingBasis(LuggageChargingBasisEnumeration value) {
        setLuggageChargingBasis(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LuggageAllowance_VersionStructure withId(String value) {
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
