//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CustomerPurchasePackageElementAccess_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPurchasePackageElementAccess_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackageElementAccessGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPurchasePackageElementAccess_VersionedChildStructure", propOrder = {
    "customerPurchasePackageElementRef",
    "validableElementRef",
    "fareStructureElementRef",
    "fareStructureElementInSequenceRef",
    "markedAs",
    "validityParameterAssignments"
})
@XmlSeeAlso({
    CustomerPurchasePackageElementAccess.class
})
public class CustomerPurchasePackageElementAccess_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "CustomerPurchasePackageElementRef")
    protected CustomerPurchasePackageElementRefStructure customerPurchasePackageElementRef;
    @XmlElement(name = "ValidableElementRef")
    protected ValidableElementRefStructure validableElementRef;
    @XmlElement(name = "FareStructureElementRef")
    protected FareStructureElementRefStructure fareStructureElementRef;
    @XmlElement(name = "FareStructureElementInSequenceRef")
    protected FareStructureElementInSequenceRefStructure fareStructureElementInSequenceRef;
    @XmlElement(name = "MarkedAs")
    @XmlSchemaType(name = "normalizedString")
    protected MarkedAsEnumeration markedAs;
    protected CustomerPurchaseParameterAssignments_RelStructure validityParameterAssignments;

    /**
     * Gets the value of the customerPurchasePackageElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPurchasePackageElementRefStructure }
     *     
     */
    public CustomerPurchasePackageElementRefStructure getCustomerPurchasePackageElementRef() {
        return customerPurchasePackageElementRef;
    }

    /**
     * Sets the value of the customerPurchasePackageElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPurchasePackageElementRefStructure }
     *     
     */
    public void setCustomerPurchasePackageElementRef(CustomerPurchasePackageElementRefStructure value) {
        this.customerPurchasePackageElementRef = value;
    }

    /**
     * Gets the value of the validableElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public ValidableElementRefStructure getValidableElementRef() {
        return validableElementRef;
    }

    /**
     * Sets the value of the validableElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidableElementRefStructure }
     *     
     */
    public void setValidableElementRef(ValidableElementRefStructure value) {
        this.validableElementRef = value;
    }

    /**
     * Gets the value of the fareStructureElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public FareStructureElementRefStructure getFareStructureElementRef() {
        return fareStructureElementRef;
    }

    /**
     * Sets the value of the fareStructureElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementRefStructure }
     *     
     */
    public void setFareStructureElementRef(FareStructureElementRefStructure value) {
        this.fareStructureElementRef = value;
    }

    /**
     * Gets the value of the fareStructureElementInSequenceRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareStructureElementInSequenceRefStructure }
     *     
     */
    public FareStructureElementInSequenceRefStructure getFareStructureElementInSequenceRef() {
        return fareStructureElementInSequenceRef;
    }

    /**
     * Sets the value of the fareStructureElementInSequenceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStructureElementInSequenceRefStructure }
     *     
     */
    public void setFareStructureElementInSequenceRef(FareStructureElementInSequenceRefStructure value) {
        this.fareStructureElementInSequenceRef = value;
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

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withCustomerPurchasePackageElementRef(CustomerPurchasePackageElementRefStructure value) {
        setCustomerPurchasePackageElementRef(value);
        return this;
    }

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withValidableElementRef(ValidableElementRefStructure value) {
        setValidableElementRef(value);
        return this;
    }

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withFareStructureElementRef(FareStructureElementRefStructure value) {
        setFareStructureElementRef(value);
        return this;
    }

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withFareStructureElementInSequenceRef(FareStructureElementInSequenceRefStructure value) {
        setFareStructureElementInSequenceRef(value);
        return this;
    }

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withMarkedAs(MarkedAsEnumeration value) {
        setMarkedAs(value);
        return this;
    }

    public CustomerPurchasePackageElementAccess_VersionedChildStructure withValidityParameterAssignments(CustomerPurchaseParameterAssignments_RelStructure value) {
        setValidityParameterAssignments(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CustomerPurchasePackageElementAccess_VersionedChildStructure withId(String value) {
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