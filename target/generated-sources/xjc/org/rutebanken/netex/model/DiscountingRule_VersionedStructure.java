//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DiscountingRule_VersionedStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountingRule_VersionedStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PricingRule_VersionedStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DiscountingRuleGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountingRule_VersionedStructure", propOrder = {
    "discountAsPercentage",
    "discountAsValue",
    "canBeCumulative"
})
@XmlSeeAlso({
    DiscountingRule.class,
    LimitingRule_VersionedStructure.class
})
public abstract class DiscountingRule_VersionedStructure
    extends PricingRule_VersionedStructure
{

    @XmlElement(name = "DiscountAsPercentage")
    protected BigDecimal discountAsPercentage;
    @XmlElement(name = "DiscountAsValue")
    protected BigDecimal discountAsValue;
    @XmlElement(name = "CanBeCumulative", defaultValue = "true")
    protected Boolean canBeCumulative;

    /**
     * Gets the value of the discountAsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsPercentage() {
        return discountAsPercentage;
    }

    /**
     * Sets the value of the discountAsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsPercentage(BigDecimal value) {
        this.discountAsPercentage = value;
    }

    /**
     * Gets the value of the discountAsValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsValue() {
        return discountAsValue;
    }

    /**
     * Sets the value of the discountAsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsValue(BigDecimal value) {
        this.discountAsValue = value;
    }

    /**
     * Gets the value of the canBeCumulative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeCumulative() {
        return canBeCumulative;
    }

    /**
     * Sets the value of the canBeCumulative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeCumulative(Boolean value) {
        this.canBeCumulative = value;
    }

    public DiscountingRule_VersionedStructure withDiscountAsPercentage(BigDecimal value) {
        setDiscountAsPercentage(value);
        return this;
    }

    public DiscountingRule_VersionedStructure withDiscountAsValue(BigDecimal value) {
        setDiscountAsValue(value);
        return this;
    }

    public DiscountingRule_VersionedStructure withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withMethodName(String value) {
        setMethodName(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withTypeOfPricingRuleRef(TypeOfPricingRuleRefStructure value) {
        setTypeOfPricingRuleRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withFactor(BigDecimal value) {
        setFactor(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DiscountingRule_VersionedStructure withId(String value) {
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
