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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ControllableElement_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControllableElement_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PriceableObject_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ControllableElementGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControllableElement_VersionStructure", propOrder = {
    "accessRightParameterAssignments",
    "controllableElementsInSequence",
    "prices"
})
@XmlSeeAlso({
    ControllableElement.class
})
public class ControllableElement_VersionStructure
    extends PriceableObject_VersionStructure
{

    protected AccessRightParameterAssignments_RelStructure accessRightParameterAssignments;
    protected ControllableElementsInSequence_RelStructure controllableElementsInSequence;
    protected ControllableElementPrices_RelStructure prices;

    /**
     * Gets the value of the accessRightParameterAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRightParameterAssignments_RelStructure }
     *     
     */
    public AccessRightParameterAssignments_RelStructure getAccessRightParameterAssignments() {
        return accessRightParameterAssignments;
    }

    /**
     * Sets the value of the accessRightParameterAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRightParameterAssignments_RelStructure }
     *     
     */
    public void setAccessRightParameterAssignments(AccessRightParameterAssignments_RelStructure value) {
        this.accessRightParameterAssignments = value;
    }

    /**
     * Gets the value of the controllableElementsInSequence property.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementsInSequence_RelStructure }
     *     
     */
    public ControllableElementsInSequence_RelStructure getControllableElementsInSequence() {
        return controllableElementsInSequence;
    }

    /**
     * Sets the value of the controllableElementsInSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementsInSequence_RelStructure }
     *     
     */
    public void setControllableElementsInSequence(ControllableElementsInSequence_RelStructure value) {
        this.controllableElementsInSequence = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link ControllableElementPrices_RelStructure }
     *     
     */
    public ControllableElementPrices_RelStructure getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControllableElementPrices_RelStructure }
     *     
     */
    public void setPrices(ControllableElementPrices_RelStructure value) {
        this.prices = value;
    }

    public ControllableElement_VersionStructure withAccessRightParameterAssignments(AccessRightParameterAssignments_RelStructure value) {
        setAccessRightParameterAssignments(value);
        return this;
    }

    public ControllableElement_VersionStructure withControllableElementsInSequence(ControllableElementsInSequence_RelStructure value) {
        setControllableElementsInSequence(value);
        return this;
    }

    public ControllableElement_VersionStructure withPrices(ControllableElementPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withInfoLinks(PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ControllableElement_VersionStructure withId(String value) {
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