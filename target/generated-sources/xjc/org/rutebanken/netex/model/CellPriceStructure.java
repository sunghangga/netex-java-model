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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateXmlAdapter;


/**
 * <p>Java class for CellPriceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellPriceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FarePriceGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}LimitingRuleGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellPriceStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "startDate",
    "endDate",
    "amount",
    "currency",
    "priceUnitRef",
    "units",
    "ruleStepResults",
    "isAllowed",
    "pricingServiceRef",
    "farePriceRef",
    "pricingRuleRef",
    "pricingRule_",
    "canBeCumulative",
    "roundingRef",
    "ranking",
    "minimumPrice",
    "minimumPriceAsPercentage",
    "minimumPriceAsMultiple",
    "maximumPrice",
    "maximumPriceAsPercentage",
    "maximumPriceAsMultiple",
    "minimumLimitPriceAsPercentage",
    "minimumLimitPrice",
    "maximumLimitPriceAsPercentage",
    "maximumLimitPrice"
})
public class CellPriceStructure {

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime startDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime endDate;
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
    protected PriceRuleStepResults_RelStructure ruleStepResults;
    @XmlElement(name = "IsAllowed")
    protected Boolean isAllowed;
    @XmlElement(name = "PricingServiceRef")
    protected PricingServiceRefStructure pricingServiceRef;
    @XmlElementRef(name = "FarePriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FarePriceRefStructure> farePriceRef;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    @XmlElementRef(name = "PricingRule_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends DataManagedObjectStructure> pricingRule_;
    @XmlElement(name = "CanBeCumulative", defaultValue = "true")
    protected Boolean canBeCumulative;
    @XmlElement(name = "RoundingRef")
    protected RoundingRefStructure roundingRef;
    @XmlElement(name = "Ranking")
    protected BigInteger ranking;
    @XmlElement(name = "MinimumPrice")
    protected BigDecimal minimumPrice;
    @XmlElement(name = "MinimumPriceAsPercentage")
    protected BigDecimal minimumPriceAsPercentage;
    @XmlElement(name = "MinimumPriceAsMultiple")
    protected BigInteger minimumPriceAsMultiple;
    @XmlElement(name = "MaximumPrice")
    protected BigDecimal maximumPrice;
    @XmlElement(name = "MaximumPriceAsPercentage")
    protected BigDecimal maximumPriceAsPercentage;
    @XmlElement(name = "MaximumPriceAsMultiple")
    protected BigInteger maximumPriceAsMultiple;
    @XmlElement(name = "MinimumLimitPriceAsPercentage")
    protected BigDecimal minimumLimitPriceAsPercentage;
    @XmlElement(name = "MinimumLimitPrice")
    protected BigDecimal minimumLimitPrice;
    @XmlElement(name = "MaximumLimitPriceAsPercentage")
    protected BigDecimal maximumLimitPriceAsPercentage;
    @XmlElement(name = "MaximumLimitPrice")
    protected BigDecimal maximumLimitPrice;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(LocalDateTime value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(LocalDateTime value) {
        this.endDate = value;
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
     * Gets the value of the ruleStepResults property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRuleStepResults_RelStructure }
     *     
     */
    public PriceRuleStepResults_RelStructure getRuleStepResults() {
        return ruleStepResults;
    }

    /**
     * Sets the value of the ruleStepResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRuleStepResults_RelStructure }
     *     
     */
    public void setRuleStepResults(PriceRuleStepResults_RelStructure value) {
        this.ruleStepResults = value;
    }

    /**
     * Gets the value of the isAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllowed() {
        return isAllowed;
    }

    /**
     * Sets the value of the isAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllowed(Boolean value) {
        this.isAllowed = value;
    }

    /**
     * Gets the value of the pricingServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link PricingServiceRefStructure }
     *     
     */
    public PricingServiceRefStructure getPricingServiceRef() {
        return pricingServiceRef;
    }

    /**
     * Sets the value of the pricingServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingServiceRefStructure }
     *     
     */
    public void setPricingServiceRef(PricingServiceRefStructure value) {
        this.pricingServiceRef = value;
    }

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
     * Gets the value of the pricingRule_ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LimitingRuleInContext }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRule }{@code >}
     *     
     */
    public JAXBElement<? extends DataManagedObjectStructure> getPricingRule_() {
        return pricingRule_;
    }

    /**
     * Sets the value of the pricingRule_ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LimitingRuleInContext }{@code >}
     *     {@link JAXBElement }{@code <}{@link LimitingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscountingRule }{@code >}
     *     {@link JAXBElement }{@code <}{@link PricingRule }{@code >}
     *     
     */
    public void setPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        this.pricingRule_ = value;
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
     * Gets the value of the ranking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRanking() {
        return ranking;
    }

    /**
     * Sets the value of the ranking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRanking(BigInteger value) {
        this.ranking = value;
    }

    /**
     * Gets the value of the minimumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Sets the value of the minimumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPrice(BigDecimal value) {
        this.minimumPrice = value;
    }

    /**
     * Gets the value of the minimumPriceAsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPriceAsPercentage() {
        return minimumPriceAsPercentage;
    }

    /**
     * Sets the value of the minimumPriceAsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPriceAsPercentage(BigDecimal value) {
        this.minimumPriceAsPercentage = value;
    }

    /**
     * Gets the value of the minimumPriceAsMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumPriceAsMultiple() {
        return minimumPriceAsMultiple;
    }

    /**
     * Sets the value of the minimumPriceAsMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumPriceAsMultiple(BigInteger value) {
        this.minimumPriceAsMultiple = value;
    }

    /**
     * Gets the value of the maximumPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPrice() {
        return maximumPrice;
    }

    /**
     * Sets the value of the maximumPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPrice(BigDecimal value) {
        this.maximumPrice = value;
    }

    /**
     * Gets the value of the maximumPriceAsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPriceAsPercentage() {
        return maximumPriceAsPercentage;
    }

    /**
     * Sets the value of the maximumPriceAsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPriceAsPercentage(BigDecimal value) {
        this.maximumPriceAsPercentage = value;
    }

    /**
     * Gets the value of the maximumPriceAsMultiple property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumPriceAsMultiple() {
        return maximumPriceAsMultiple;
    }

    /**
     * Sets the value of the maximumPriceAsMultiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumPriceAsMultiple(BigInteger value) {
        this.maximumPriceAsMultiple = value;
    }

    /**
     * Gets the value of the minimumLimitPriceAsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPriceAsPercentage() {
        return minimumLimitPriceAsPercentage;
    }

    /**
     * Sets the value of the minimumLimitPriceAsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPriceAsPercentage(BigDecimal value) {
        this.minimumLimitPriceAsPercentage = value;
    }

    /**
     * Gets the value of the minimumLimitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLimitPrice() {
        return minimumLimitPrice;
    }

    /**
     * Sets the value of the minimumLimitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLimitPrice(BigDecimal value) {
        this.minimumLimitPrice = value;
    }

    /**
     * Gets the value of the maximumLimitPriceAsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPriceAsPercentage() {
        return maximumLimitPriceAsPercentage;
    }

    /**
     * Sets the value of the maximumLimitPriceAsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPriceAsPercentage(BigDecimal value) {
        this.maximumLimitPriceAsPercentage = value;
    }

    /**
     * Gets the value of the maximumLimitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumLimitPrice() {
        return maximumLimitPrice;
    }

    /**
     * Sets the value of the maximumLimitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumLimitPrice(BigDecimal value) {
        this.maximumLimitPrice = value;
    }

    public CellPriceStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public CellPriceStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public CellPriceStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public CellPriceStructure withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    public CellPriceStructure withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    public CellPriceStructure withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    public CellPriceStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public CellPriceStructure withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    public CellPriceStructure withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    public CellPriceStructure withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    public CellPriceStructure withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    public CellPriceStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    public CellPriceStructure withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    public CellPriceStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    public CellPriceStructure withPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        setPricingRule_(value);
        return this;
    }

    public CellPriceStructure withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    public CellPriceStructure withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    public CellPriceStructure withRanking(BigInteger value) {
        setRanking(value);
        return this;
    }

    public CellPriceStructure withMinimumPrice(BigDecimal value) {
        setMinimumPrice(value);
        return this;
    }

    public CellPriceStructure withMinimumPriceAsPercentage(BigDecimal value) {
        setMinimumPriceAsPercentage(value);
        return this;
    }

    public CellPriceStructure withMinimumPriceAsMultiple(BigInteger value) {
        setMinimumPriceAsMultiple(value);
        return this;
    }

    public CellPriceStructure withMaximumPrice(BigDecimal value) {
        setMaximumPrice(value);
        return this;
    }

    public CellPriceStructure withMaximumPriceAsPercentage(BigDecimal value) {
        setMaximumPriceAsPercentage(value);
        return this;
    }

    public CellPriceStructure withMaximumPriceAsMultiple(BigInteger value) {
        setMaximumPriceAsMultiple(value);
        return this;
    }

    public CellPriceStructure withMinimumLimitPriceAsPercentage(BigDecimal value) {
        setMinimumLimitPriceAsPercentage(value);
        return this;
    }

    public CellPriceStructure withMinimumLimitPrice(BigDecimal value) {
        setMinimumLimitPrice(value);
        return this;
    }

    public CellPriceStructure withMaximumLimitPriceAsPercentage(BigDecimal value) {
        setMaximumLimitPriceAsPercentage(value);
        return this;
    }

    public CellPriceStructure withMaximumLimitPrice(BigDecimal value) {
        setMaximumLimitPrice(value);
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