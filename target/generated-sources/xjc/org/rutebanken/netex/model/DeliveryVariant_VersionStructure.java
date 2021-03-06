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
 * <p>Java class for DeliveryVariant_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryVariant_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeliveryVariantGroup"/&gt;
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
@XmlType(name = "DeliveryVariant_VersionStructure", propOrder = {
    "parentRef",
    "deliveryVariantMediaType",
    "typeOfDeliveryVariantRef",
    "variantText"
})
@XmlSeeAlso({
    DeliveryVariant.class
})
public class DeliveryVariant_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "ParentRef")
    protected VersionOfObjectRefStructure parentRef;
    @XmlElement(name = "DeliveryVariantMediaType", defaultValue = "other")
    @XmlSchemaType(name = "normalizedString")
    protected DeliveryVariantTypeEnumeration deliveryVariantMediaType;
    @XmlElement(name = "TypeOfDeliveryVariantRef")
    protected TypeOfDeliveryVariantRefStructure typeOfDeliveryVariantRef;
    @XmlElement(name = "VariantText")
    protected MultilingualString variantText;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setParentRef(VersionOfObjectRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the deliveryVariantMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public DeliveryVariantTypeEnumeration getDeliveryVariantMediaType() {
        return deliveryVariantMediaType;
    }

    /**
     * Sets the value of the deliveryVariantMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryVariantTypeEnumeration }
     *     
     */
    public void setDeliveryVariantMediaType(DeliveryVariantTypeEnumeration value) {
        this.deliveryVariantMediaType = value;
    }

    /**
     * Gets the value of the typeOfDeliveryVariantRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfDeliveryVariantRefStructure }
     *     
     */
    public TypeOfDeliveryVariantRefStructure getTypeOfDeliveryVariantRef() {
        return typeOfDeliveryVariantRef;
    }

    /**
     * Sets the value of the typeOfDeliveryVariantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfDeliveryVariantRefStructure }
     *     
     */
    public void setTypeOfDeliveryVariantRef(TypeOfDeliveryVariantRefStructure value) {
        this.typeOfDeliveryVariantRef = value;
    }

    /**
     * Gets the value of the variantText property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVariantText() {
        return variantText;
    }

    /**
     * Sets the value of the variantText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVariantText(MultilingualString value) {
        this.variantText = value;
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

    public DeliveryVariant_VersionStructure withParentRef(VersionOfObjectRefStructure value) {
        setParentRef(value);
        return this;
    }

    public DeliveryVariant_VersionStructure withDeliveryVariantMediaType(DeliveryVariantTypeEnumeration value) {
        setDeliveryVariantMediaType(value);
        return this;
    }

    public DeliveryVariant_VersionStructure withTypeOfDeliveryVariantRef(TypeOfDeliveryVariantRefStructure value) {
        setTypeOfDeliveryVariantRef(value);
        return this;
    }

    public DeliveryVariant_VersionStructure withVariantText(MultilingualString value) {
        setVariantText(value);
        return this;
    }

    public DeliveryVariant_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DeliveryVariant_VersionStructure withId(String value) {
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
