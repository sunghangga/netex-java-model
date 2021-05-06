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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PriceableObject_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceableObject_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PriceableObjectGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceableObject_VersionStructure", propOrder = {
    "name",
    "description",
    "url",
    "infoLinks",
    "alternativeNames",
    "noticeAssignments",
    "pricingServiceRef",
    "pricingRuleRef",
    "priceGroups",
    "fareTables"
})
@XmlSeeAlso({
    SeriesConstraint_VersionStructure.class,
    DistanceMatrixElement_VersionStructure.class,
    ValidableElement_VersionStructure.class,
    ControllableElement_VersionStructure.class,
    FareUnit_VersionStructure.class,
    FareInterval_VersionStructure.class,
    FareStructureElement_VersionStructure.class,
    CappingRule_VersionedChildStructure.class,
    ServiceAccessRight_VersionStructure.class,
    FulfilmentMethod_VersionStructure.class,
    UsageParameter_VersionStructure.class,
    SalesOfferPackage_VersionStructure.class,
    SalesOfferPackageElement_VersionStructure.class,
    FareStructureFactor_VersionStructure.class,
    CustomerPurchasePackage_VersionStructure.class,
    CustomerPurchasePackageElement_VersionStructure.class
})
public abstract class PriceableObject_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    protected PriceableObject_VersionStructure.InfoLinks infoLinks;
    protected AlternativeNames_RelStructure alternativeNames;
    protected NoticeAssignments_RelStructure noticeAssignments;
    @XmlElement(name = "PricingServiceRef")
    protected PricingServiceRefStructure pricingServiceRef;
    @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PricingRuleRefStructure> pricingRuleRef;
    protected PriceGroups_RelStructure priceGroups;
    protected FareTables_RelStructure fareTables;

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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the infoLinks property.
     * 
     * @return
     *     possible object is
     *     {@link PriceableObject_VersionStructure.InfoLinks }
     *     
     */
    public PriceableObject_VersionStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Sets the value of the infoLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceableObject_VersionStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        this.infoLinks = value;
    }

    /**
     * Gets the value of the alternativeNames property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeNames_RelStructure }
     *     
     */
    public AlternativeNames_RelStructure getAlternativeNames() {
        return alternativeNames;
    }

    /**
     * Sets the value of the alternativeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeNames_RelStructure }
     *     
     */
    public void setAlternativeNames(AlternativeNames_RelStructure value) {
        this.alternativeNames = value;
    }

    /**
     * Gets the value of the noticeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignments_RelStructure }
     *     
     */
    public NoticeAssignments_RelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignments_RelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignments_RelStructure value) {
        this.noticeAssignments = value;
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
     * Gets the value of the priceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGroups_RelStructure }
     *     
     */
    public PriceGroups_RelStructure getPriceGroups() {
        return priceGroups;
    }

    /**
     * Sets the value of the priceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGroups_RelStructure }
     *     
     */
    public void setPriceGroups(PriceGroups_RelStructure value) {
        this.priceGroups = value;
    }

    /**
     * Gets the value of the fareTables property.
     * 
     * @return
     *     possible object is
     *     {@link FareTables_RelStructure }
     *     
     */
    public FareTables_RelStructure getFareTables() {
        return fareTables;
    }

    /**
     * Sets the value of the fareTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTables_RelStructure }
     *     
     */
    public void setFareTables(FareTables_RelStructure value) {
        this.fareTables = value;
    }

    public PriceableObject_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public PriceableObject_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public PriceableObject_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    public PriceableObject_VersionStructure withInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    public PriceableObject_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    public PriceableObject_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    public PriceableObject_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    public PriceableObject_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    public PriceableObject_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    public PriceableObject_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PriceableObject_VersionStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.netex.org.uk/netex}infoLinks_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InfoLinks
        extends InfoLinks_RelStructure
    {


        @Override
        public PriceableObject_VersionStructure.InfoLinks withInfoLink(InfoLinkStructure... values) {
            if (values!= null) {
                for (InfoLinkStructure value: values) {
                    getInfoLink().add(value);
                }
            }
            return this;
        }

        @Override
        public PriceableObject_VersionStructure.InfoLinks withInfoLink(Collection<InfoLinkStructure> values) {
            if (values!= null) {
                getInfoLink().addAll(values);
            }
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

}