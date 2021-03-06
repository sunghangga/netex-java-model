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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for SeriesConstraint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeriesConstraint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SeriesConstraintGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeriesConstraint_VersionStructure", propOrder = {
    "privateCode",
    "itinerary",
    "symbolMarkingUsualRoute",
    "seriesType",
    "routingType",
    "fareBasis",
    "firstClassDistance",
    "secondClassDistance",
    "discrete",
    "fromConnectionRef",
    "toConnectionRef",
    "farePointsInPattern",
    "journeyPatterns",
    "prices",
    "replaces"
})
@XmlSeeAlso({
    SeriesConstraint.class
})
public class SeriesConstraint_VersionStructure
    extends PriceableObject_VersionStructure
{

    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "Itinerary")
    protected MultilingualString itinerary;
    @XmlElement(name = "SymbolMarkingUsualRoute")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String symbolMarkingUsualRoute;
    @XmlElement(name = "SeriesType", defaultValue = "stationToStation")
    @XmlSchemaType(name = "normalizedString")
    protected SeriesTypeEnumeration seriesType;
    @XmlElement(name = "RoutingType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RoutingTypeEnumeration routingType;
    @XmlElement(name = "FareBasis", defaultValue = "route")
    @XmlSchemaType(name = "normalizedString")
    protected FareBasisEnumeration fareBasis;
    @XmlElement(name = "FirstClassDistance")
    protected BigDecimal firstClassDistance;
    @XmlElement(name = "SecondClassDistance")
    protected BigDecimal secondClassDistance;
    @XmlElement(name = "Discrete", defaultValue = "true")
    protected Boolean discrete;
    @XmlElement(name = "FromConnectionRef")
    protected ConnectionRefStructure fromConnectionRef;
    @XmlElement(name = "ToConnectionRef")
    protected ConnectionRefStructure toConnectionRef;
    protected List<FarePointsInPattern_RelStructure> farePointsInPattern;
    protected List<JourneyPatternRefs_RelStructure> journeyPatterns;
    protected List<SeriesConstraintPrices_RelStructure> prices;
    protected List<SeriesConstraintRefs_RelStructure> replaces;
    @XmlAttribute(name = "order")
    protected BigInteger order;

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
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setItinerary(MultilingualString value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the symbolMarkingUsualRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolMarkingUsualRoute() {
        return symbolMarkingUsualRoute;
    }

    /**
     * Sets the value of the symbolMarkingUsualRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolMarkingUsualRoute(String value) {
        this.symbolMarkingUsualRoute = value;
    }

    /**
     * Gets the value of the seriesType property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesTypeEnumeration }
     *     
     */
    public SeriesTypeEnumeration getSeriesType() {
        return seriesType;
    }

    /**
     * Sets the value of the seriesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesTypeEnumeration }
     *     
     */
    public void setSeriesType(SeriesTypeEnumeration value) {
        this.seriesType = value;
    }

    /**
     * Gets the value of the routingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public RoutingTypeEnumeration getRoutingType() {
        return routingType;
    }

    /**
     * Sets the value of the routingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public void setRoutingType(RoutingTypeEnumeration value) {
        this.routingType = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link FareBasisEnumeration }
     *     
     */
    public FareBasisEnumeration getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasisEnumeration }
     *     
     */
    public void setFareBasis(FareBasisEnumeration value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the firstClassDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstClassDistance() {
        return firstClassDistance;
    }

    /**
     * Sets the value of the firstClassDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstClassDistance(BigDecimal value) {
        this.firstClassDistance = value;
    }

    /**
     * Gets the value of the secondClassDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondClassDistance() {
        return secondClassDistance;
    }

    /**
     * Sets the value of the secondClassDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondClassDistance(BigDecimal value) {
        this.secondClassDistance = value;
    }

    /**
     * Gets the value of the discrete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscrete() {
        return discrete;
    }

    /**
     * Sets the value of the discrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscrete(Boolean value) {
        this.discrete = value;
    }

    /**
     * Gets the value of the fromConnectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getFromConnectionRef() {
        return fromConnectionRef;
    }

    /**
     * Sets the value of the fromConnectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setFromConnectionRef(ConnectionRefStructure value) {
        this.fromConnectionRef = value;
    }

    /**
     * Gets the value of the toConnectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getToConnectionRef() {
        return toConnectionRef;
    }

    /**
     * Sets the value of the toConnectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setToConnectionRef(ConnectionRefStructure value) {
        this.toConnectionRef = value;
    }

    /**
     * Gets the value of the farePointsInPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePointsInPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFarePointsInPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePointsInPattern_RelStructure }
     * 
     * 
     */
    public List<FarePointsInPattern_RelStructure> getFarePointsInPattern() {
        if (farePointsInPattern == null) {
            farePointsInPattern = new ArrayList<FarePointsInPattern_RelStructure>();
        }
        return this.farePointsInPattern;
    }

    /**
     * Gets the value of the journeyPatterns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyPatterns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyPatterns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyPatternRefs_RelStructure }
     * 
     * 
     */
    public List<JourneyPatternRefs_RelStructure> getJourneyPatterns() {
        if (journeyPatterns == null) {
            journeyPatterns = new ArrayList<JourneyPatternRefs_RelStructure>();
        }
        return this.journeyPatterns;
    }

    /**
     * Gets the value of the prices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesConstraintPrices_RelStructure }
     * 
     * 
     */
    public List<SeriesConstraintPrices_RelStructure> getPrices() {
        if (prices == null) {
            prices = new ArrayList<SeriesConstraintPrices_RelStructure>();
        }
        return this.prices;
    }

    /**
     * Gets the value of the replaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeriesConstraintRefs_RelStructure }
     * 
     * 
     */
    public List<SeriesConstraintRefs_RelStructure> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList<SeriesConstraintRefs_RelStructure>();
        }
        return this.replaces;
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

    public SeriesConstraint_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withItinerary(MultilingualString value) {
        setItinerary(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withSymbolMarkingUsualRoute(String value) {
        setSymbolMarkingUsualRoute(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withSeriesType(SeriesTypeEnumeration value) {
        setSeriesType(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withRoutingType(RoutingTypeEnumeration value) {
        setRoutingType(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withFareBasis(FareBasisEnumeration value) {
        setFareBasis(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withFirstClassDistance(BigDecimal value) {
        setFirstClassDistance(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withSecondClassDistance(BigDecimal value) {
        setSecondClassDistance(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withDiscrete(Boolean value) {
        setDiscrete(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withFromConnectionRef(ConnectionRefStructure value) {
        setFromConnectionRef(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withToConnectionRef(ConnectionRefStructure value) {
        setToConnectionRef(value);
        return this;
    }

    public SeriesConstraint_VersionStructure withFarePointsInPattern(FarePointsInPattern_RelStructure... values) {
        if (values!= null) {
            for (FarePointsInPattern_RelStructure value: values) {
                getFarePointsInPattern().add(value);
            }
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withFarePointsInPattern(Collection<FarePointsInPattern_RelStructure> values) {
        if (values!= null) {
            getFarePointsInPattern().addAll(values);
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withJourneyPatterns(JourneyPatternRefs_RelStructure... values) {
        if (values!= null) {
            for (JourneyPatternRefs_RelStructure value: values) {
                getJourneyPatterns().add(value);
            }
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withJourneyPatterns(Collection<JourneyPatternRefs_RelStructure> values) {
        if (values!= null) {
            getJourneyPatterns().addAll(values);
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withPrices(SeriesConstraintPrices_RelStructure... values) {
        if (values!= null) {
            for (SeriesConstraintPrices_RelStructure value: values) {
                getPrices().add(value);
            }
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withPrices(Collection<SeriesConstraintPrices_RelStructure> values) {
        if (values!= null) {
            getPrices().addAll(values);
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withReplaces(SeriesConstraintRefs_RelStructure... values) {
        if (values!= null) {
            for (SeriesConstraintRefs_RelStructure value: values) {
                getReplaces().add(value);
            }
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withReplaces(Collection<SeriesConstraintRefs_RelStructure> values) {
        if (values!= null) {
            getReplaces().addAll(values);
        }
        return this;
    }

    public SeriesConstraint_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SeriesConstraint_VersionStructure withId(String value) {
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
