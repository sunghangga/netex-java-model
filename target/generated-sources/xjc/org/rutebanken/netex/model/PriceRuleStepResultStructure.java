//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PriceRuleStepResultStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRuleStepResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}FarePriceRef" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FarePriceAmountGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}StepCalculationAmountGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PriceRuleStepRateGroup"/&gt;
 *         &lt;element name="Narrative" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}RuleStepResultIdType" /&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRuleStepResultStructure", propOrder = {
    "farePriceRef",
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "rateUsed",
    "adjustmentAmount",
    "adjustmentUnits",
    "pricingRuleRef",
    "roundingRef",
    "roundingStepRef",
    "narrative"
})
public class PriceRuleStepResultStructure {

    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlElement(name = "PriceUnitRef")
    protected PriceUnitRefStructure priceUnitRef;
    @XmlElement(name = "Units")
    protected BigDecimal units;
    @XmlElement(name = "RateUsed")
    protected BigDecimal rateUsed;
    @XmlElement(name = "AdjustmentAmount")
    protected BigDecimal adjustmentAmount;
    @XmlElement(name = "AdjustmentUnits")
    protected BigDecimal adjustmentUnits;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    @XmlElement(name = "RoundingStepRef")
    protected RoundingStepRefStructure roundingStepRef;
    @XmlElement(name = "Narrative")
    protected MultilingualString narrative;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the farePriceRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FarePriceRefStructure> getFarePriceRef() {
        return farePriceRef;
    }

    /**
     * Sets the value of the farePriceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link UsageParameterPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareStructureElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProductPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerPurchasePackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SalesOfferPackagePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ControllableElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeriesConstraintPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalUnitPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeographicalIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DistanceMatrixElementPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeIntervalPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CappingRulePriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FulfilmentMethodPriceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FarePriceRefStructure }{@code >}
     *     
     */
    public void setFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        this.farePriceRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the priceUnitRef property.
     * 
     * @return
     *     possible object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public PriceUnitRefStructure getPriceUnitRef() {
        return priceUnitRef;
    }

    /**
     * Sets the value of the priceUnitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceUnitRefStructure }
     *     
     */
    public void setPriceUnitRef(PriceUnitRefStructure value) {
        this.priceUnitRef = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnits(BigDecimal value) {
        this.units = value;
    }

    /**
     * Gets the value of the rateUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateUsed() {
        return rateUsed;
    }

    /**
     * Sets the value of the rateUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateUsed(BigDecimal value) {
        this.rateUsed = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentAmount(BigDecimal value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the adjustmentUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentUnits() {
        return adjustmentUnits;
    }

    /**
     * Sets the value of the adjustmentUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentUnits(BigDecimal value) {
        this.adjustmentUnits = value;
    }

    /**
     * Gets the value of the pricingRuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PricingRuleRefStructure> getPricingRuleRef() {
        return pricingRuleRef;
    }

    /**
     * Sets the value of the pricingRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     *     
     */
    public void setPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        this.pricingRuleRef = value;
    }

    /**
     * Gets the value of the roundingRef property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingRefStructure }
     *     
     */
    public RoundingRefStructure getRoundingRef() {
        return roundingRef;
    }

    /**
     * Sets the value of the roundingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingRefStructure }
     *     
     */
    public void setRoundingRef(RoundingRefStructure value) {
        this.roundingRef = value;
    }

    /**
     * Gets the value of the roundingStepRef property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public RoundingStepRefStructure getRoundingStepRef() {
        return roundingStepRef;
    }

    /**
     * Sets the value of the roundingStepRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingStepRefStructure }
     *     
     */
    public void setRoundingStepRef(RoundingStepRefStructure value) {
        this.roundingStepRef = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNarrative(MultilingualString value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public PriceRuleStepResultStructure withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    public PriceRuleStepResultStructure withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    public PriceRuleStepResultStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public PriceRuleStepResultStructure withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    public PriceRuleStepResultStructure withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    public PriceRuleStepResultStructure withRateUsed(BigDecimal value) {
        setRateUsed(value);
        return this;
    }

    public PriceRuleStepResultStructure withAdjustmentAmount(BigDecimal value) {
        setAdjustmentAmount(value);
        return this;
    }

    public PriceRuleStepResultStructure withAdjustmentUnits(BigDecimal value) {
        setAdjustmentUnits(value);
        return this;
    }

    public PriceRuleStepResultStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    public PriceRuleStepResultStructure withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    public PriceRuleStepResultStructure withRoundingStepRef(RoundingStepRefStructure value) {
        setRoundingStepRef(value);
        return this;
    }

    public PriceRuleStepResultStructure withNarrative(MultilingualString value) {
        setNarrative(value);
        return this;
    }

    public PriceRuleStepResultStructure withId(String value) {
        setId(value);
        return this;
    }

    public PriceRuleStepResultStructure withOrder(BigInteger value) {
        setOrder(value);
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