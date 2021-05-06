//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CustomerPurchasePackageElement_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackageElement_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageElementGroup"/&gt;
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
@XmlType(name = "CustomerPurchasePackageElement_VersionStructure", propOrder = {
    "customerPurchasePackageRef",
    "salesOfferPackageElementRef",
    "markedAs",
    "blocked",
    "elementAccesses",
    "validityParameterAssignments",
    "prices"
})
@XmlSeeAlso({
    CustomerPurchasePackageElement.class
})
public class CustomerPurchasePackageElement_VersionStructure
    extends PriceableObject_VersionStructure
{

    @XmlElement(name = "CustomerPurchasePackageRef")
    protected CustomerPurchasePackageRefStructure customerPurchasePackageRef;
    @XmlElement(name = "SalesOfferPackageElementRef")
    protected SalesOfferPackageElementRefStructure salesOfferPackageElementRef;
    @XmlElement(name = "MarkedAs")
    @XmlSchemaType(name = "normalizedString")
    protected MarkedAsEnumeration markedAs;
    @XmlElement(name = "Blocked")
    protected Boolean blocked;
    protected CustomerPurchasePackageElementAccesses_RelStructure elementAccesses;
    protected CustomerPurchaseParameterAssignments_RelStructure validityParameterAssignments;
    protected CustomerPurchasePackagePrices_RelStructure prices;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the customerPurchasePackageRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public CustomerPurchasePackageRefStructure getCustomerPurchasePackageRef() {
        return customerPurchasePackageRef;
    }

    /**
     * Sets the value of the customerPurchasePackageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageRefStructure }
     *     
     */
    public void setCustomerPurchasePackageRef(CustomerPurchasePackageRefStructure value) {
        this.customerPurchasePackageRef = value;
    }

    /**
     * Gets the value of the salesOfferPackageElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public SalesOfferPackageElementRefStructure getSalesOfferPackageElementRef() {
        return salesOfferPackageElementRef;
    }

    /**
     * Sets the value of the salesOfferPackageElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageElementRefStructure }
     *     
     */
    public void setSalesOfferPackageElementRef(SalesOfferPackageElementRefStructure value) {
        this.salesOfferPackageElementRef = value;
    }

    /**
     * Gets the value of the markedAs property.
     * 
     * @return
     *     possible object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public MarkedAsEnumeration getMarkedAs() {
        return markedAs;
    }

    /**
     * Sets the value of the markedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkedAsEnumeration }
     *     
     */
    public void setMarkedAs(MarkedAsEnumeration value) {
        this.markedAs = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlocked(Boolean value) {
        this.blocked = value;
    }

    /**
     * Gets the value of the elementAccesses property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageElementAccesses_RelStructure }
     *     
     */
    public CustomerPurchasePackageElementAccesses_RelStructure getElementAccesses() {
        return elementAccesses;
    }

    /**
     * Sets the value of the elementAccesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageElementAccesses_RelStructure }
     *     
     */
    public void setElementAccesses(CustomerPurchasePackageElementAccesses_RelStructure value) {
        this.elementAccesses = value;
    }

    /**
     * Gets the value of the validityParameterAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchaseParameterAssignments_RelStructure }
     *     
     */
    public CustomerPurchaseParameterAssignments_RelStructure getValidityParameterAssignments() {
        return validityParameterAssignments;
    }

    /**
     * Sets the value of the validityParameterAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchaseParameterAssignments_RelStructure }
     *     
     */
    public void setValidityParameterAssignments(CustomerPurchaseParameterAssignments_RelStructure value) {
        this.validityParameterAssignments = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackagePrices_RelStructure }
     *     
     */
    public CustomerPurchasePackagePrices_RelStructure getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackagePrices_RelStructure }
     *     
     */
    public void setPrices(CustomerPurchasePackagePrices_RelStructure value) {
        this.prices = value;
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

    public CustomerPurchasePackageElement_VersionStructure withCustomerPurchasePackageRef(CustomerPurchasePackageRefStructure value) {
        setCustomerPurchasePackageRef(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withSalesOfferPackageElementRef(SalesOfferPackageElementRefStructure value) {
        setSalesOfferPackageElementRef(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withMarkedAs(MarkedAsEnumeration value) {
        setMarkedAs(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withBlocked(Boolean value) {
        setBlocked(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withElementAccesses(CustomerPurchasePackageElementAccesses_RelStructure value) {
        setElementAccesses(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withValidityParameterAssignments(CustomerPurchaseParameterAssignments_RelStructure value) {
        setValidityParameterAssignments(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withPrices(CustomerPurchasePackagePrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    public CustomerPurchasePackageElement_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElement_VersionStructure withId(String value) {
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