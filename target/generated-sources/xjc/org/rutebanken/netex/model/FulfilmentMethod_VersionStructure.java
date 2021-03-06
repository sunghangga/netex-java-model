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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FulfilmentMethod_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfilmentMethod_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FulfilmentMethodGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfilmentMethod_VersionStructure", propOrder = {
    "fulfilmentMethodType",
    "requiresCard",
    "requiresBookingReference",
    "typesOfTravelDocument",
    "prices"
})
@XmlSeeAlso({
    FulfilmentMethod.class
})
public class FulfilmentMethod_VersionStructure
    extends PriceableObject_VersionStructure
{

    @XmlElement(name = "FulfilmentMethodType")
    @XmlSchemaType(name = "normalizedString")
    protected FulfilmentMethodTypeEnumeration fulfilmentMethodType;
    @XmlElement(name = "RequiresCard")
    protected Boolean requiresCard;
    @XmlElement(name = "RequiresBookingReference")
    protected Boolean requiresBookingReference;
    protected TypeOfTravelDocumentRefs_RelStructure typesOfTravelDocument;
    protected FulfilmentMethodPrices_RelStructure prices;

    /**
     * Gets the value of the fulfilmentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodTypeEnumeration }
     *     
     */
    public FulfilmentMethodTypeEnumeration getFulfilmentMethodType() {
        return fulfilmentMethodType;
    }

    /**
     * Sets the value of the fulfilmentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodTypeEnumeration }
     *     
     */
    public void setFulfilmentMethodType(FulfilmentMethodTypeEnumeration value) {
        this.fulfilmentMethodType = value;
    }

    /**
     * Gets the value of the requiresCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresCard() {
        return requiresCard;
    }

    /**
     * Sets the value of the requiresCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresCard(Boolean value) {
        this.requiresCard = value;
    }

    /**
     * Gets the value of the requiresBookingReference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresBookingReference() {
        return requiresBookingReference;
    }

    /**
     * Sets the value of the requiresBookingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresBookingReference(Boolean value) {
        this.requiresBookingReference = value;
    }

    /**
     * Gets the value of the typesOfTravelDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefs_RelStructure }
     *     
     */
    public TypeOfTravelDocumentRefs_RelStructure getTypesOfTravelDocument() {
        return typesOfTravelDocument;
    }

    /**
     * Sets the value of the typesOfTravelDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefs_RelStructure }
     *     
     */
    public void setTypesOfTravelDocument(TypeOfTravelDocumentRefs_RelStructure value) {
        this.typesOfTravelDocument = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentMethodPrices_RelStructure }
     *     
     */
    public FulfilmentMethodPrices_RelStructure getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentMethodPrices_RelStructure }
     *     
     */
    public void setPrices(FulfilmentMethodPrices_RelStructure value) {
        this.prices = value;
    }

    public FulfilmentMethod_VersionStructure withFulfilmentMethodType(FulfilmentMethodTypeEnumeration value) {
        setFulfilmentMethodType(value);
        return this;
    }

    public FulfilmentMethod_VersionStructure withRequiresCard(Boolean value) {
        setRequiresCard(value);
        return this;
    }

    public FulfilmentMethod_VersionStructure withRequiresBookingReference(Boolean value) {
        setRequiresBookingReference(value);
        return this;
    }

    public FulfilmentMethod_VersionStructure withTypesOfTravelDocument(TypeOfTravelDocumentRefs_RelStructure value) {
        setTypesOfTravelDocument(value);
        return this;
    }

    public FulfilmentMethod_VersionStructure withPrices(FulfilmentMethodPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FulfilmentMethod_VersionStructure withId(String value) {
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
