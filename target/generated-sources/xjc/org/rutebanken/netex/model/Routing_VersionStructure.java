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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Routing_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Routing_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoutingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Routing_VersionStructure", propOrder = {
    "isRestricted",
    "returnRouteIdentical",
    "forwardsOnly",
    "crossBorder"
})
@XmlSeeAlso({
    Routing.class
})
public class Routing_VersionStructure
    extends UsageParameter_VersionStructure
{

    @XmlElement(name = "IsRestricted")
    protected Boolean isRestricted;
    @XmlElement(name = "ReturnRouteIdentical")
    protected Boolean returnRouteIdentical;
    @XmlElement(name = "ForwardsOnly")
    protected Boolean forwardsOnly;
    @XmlElement(name = "CrossBorder")
    protected Boolean crossBorder;

    /**
     * Gets the value of the isRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRestricted() {
        return isRestricted;
    }

    /**
     * Sets the value of the isRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRestricted(Boolean value) {
        this.isRestricted = value;
    }

    /**
     * Gets the value of the returnRouteIdentical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRouteIdentical() {
        return returnRouteIdentical;
    }

    /**
     * Sets the value of the returnRouteIdentical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRouteIdentical(Boolean value) {
        this.returnRouteIdentical = value;
    }

    /**
     * Gets the value of the forwardsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForwardsOnly() {
        return forwardsOnly;
    }

    /**
     * Sets the value of the forwardsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardsOnly(Boolean value) {
        this.forwardsOnly = value;
    }

    /**
     * Gets the value of the crossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Sets the value of the crossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    public Routing_VersionStructure withIsRestricted(Boolean value) {
        setIsRestricted(value);
        return this;
    }

    public Routing_VersionStructure withReturnRouteIdentical(Boolean value) {
        setReturnRouteIdentical(value);
        return this;
    }

    public Routing_VersionStructure withForwardsOnly(Boolean value) {
        setForwardsOnly(value);
        return this;
    }

    public Routing_VersionStructure withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Routing_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Routing_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Routing_VersionStructure withId(String value) {
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
