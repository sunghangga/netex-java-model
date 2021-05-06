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
 * <p>Java class for RampEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}RampEquipmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RampEquipment_VersionStructure", propOrder = {
    "length",
    "gradient",
    "gradientType",
    "pedestal",
    "handrailHeight",
    "handrailType",
    "tactileGuidanceStrips",
    "visualGuidanceBands",
    "temporary",
    "suitableForCycles"
})
@XmlSeeAlso({
    RampEquipment.class
})
public class RampEquipment_VersionStructure
    extends AccessEquipment_VersionStructure
{

    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Gradient")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gradient;
    @XmlElement(name = "GradientType")
    @XmlSchemaType(name = "string")
    protected GradientEnumeration gradientType;
    @XmlElement(name = "Pedestal")
    protected Boolean pedestal;
    @XmlElement(name = "HandrailHeight")
    protected BigDecimal handrailHeight;
    @XmlElement(name = "HandrailType")
    @XmlSchemaType(name = "string")
    protected HandrailEnumeration handrailType;
    @XmlElement(name = "TactileGuidanceStrips")
    protected Boolean tactileGuidanceStrips;
    @XmlElement(name = "VisualGuidanceBands")
    protected Boolean visualGuidanceBands;
    @XmlElement(name = "Temporary")
    protected Boolean temporary;
    @XmlElement(name = "SuitableForCycles")
    protected Boolean suitableForCycles;

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the gradient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGradient() {
        return gradient;
    }

    /**
     * Sets the value of the gradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGradient(BigInteger value) {
        this.gradient = value;
    }

    /**
     * Gets the value of the gradientType property.
     * 
     * @return
     *     possible object is
     *     {@link GradientEnumeration }
     *     
     */
    public GradientEnumeration getGradientType() {
        return gradientType;
    }

    /**
     * Sets the value of the gradientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradientEnumeration }
     *     
     */
    public void setGradientType(GradientEnumeration value) {
        this.gradientType = value;
    }

    /**
     * Gets the value of the pedestal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPedestal() {
        return pedestal;
    }

    /**
     * Sets the value of the pedestal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPedestal(Boolean value) {
        this.pedestal = value;
    }

    /**
     * Gets the value of the handrailHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandrailHeight() {
        return handrailHeight;
    }

    /**
     * Sets the value of the handrailHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandrailHeight(BigDecimal value) {
        this.handrailHeight = value;
    }

    /**
     * Gets the value of the handrailType property.
     * 
     * @return
     *     possible object is
     *     {@link HandrailEnumeration }
     *     
     */
    public HandrailEnumeration getHandrailType() {
        return handrailType;
    }

    /**
     * Sets the value of the handrailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandrailEnumeration }
     *     
     */
    public void setHandrailType(HandrailEnumeration value) {
        this.handrailType = value;
    }

    /**
     * Gets the value of the tactileGuidanceStrips property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileGuidanceStrips() {
        return tactileGuidanceStrips;
    }

    /**
     * Sets the value of the tactileGuidanceStrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileGuidanceStrips(Boolean value) {
        this.tactileGuidanceStrips = value;
    }

    /**
     * Gets the value of the visualGuidanceBands property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualGuidanceBands() {
        return visualGuidanceBands;
    }

    /**
     * Sets the value of the visualGuidanceBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualGuidanceBands(Boolean value) {
        this.visualGuidanceBands = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporary(Boolean value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the suitableForCycles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitableForCycles() {
        return suitableForCycles;
    }

    /**
     * Sets the value of the suitableForCycles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitableForCycles(Boolean value) {
        this.suitableForCycles = value;
    }

    public RampEquipment_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    public RampEquipment_VersionStructure withGradient(BigInteger value) {
        setGradient(value);
        return this;
    }

    public RampEquipment_VersionStructure withGradientType(GradientEnumeration value) {
        setGradientType(value);
        return this;
    }

    public RampEquipment_VersionStructure withPedestal(Boolean value) {
        setPedestal(value);
        return this;
    }

    public RampEquipment_VersionStructure withHandrailHeight(BigDecimal value) {
        setHandrailHeight(value);
        return this;
    }

    public RampEquipment_VersionStructure withHandrailType(HandrailEnumeration value) {
        setHandrailType(value);
        return this;
    }

    public RampEquipment_VersionStructure withTactileGuidanceStrips(Boolean value) {
        setTactileGuidanceStrips(value);
        return this;
    }

    public RampEquipment_VersionStructure withVisualGuidanceBands(Boolean value) {
        setVisualGuidanceBands(value);
        return this;
    }

    public RampEquipment_VersionStructure withTemporary(Boolean value) {
        setTemporary(value);
        return this;
    }

    public RampEquipment_VersionStructure withSuitableForCycles(Boolean value) {
        setSuitableForCycles(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withDirectionOfUse(DirectionOfUseEnumeration value) {
        setDirectionOfUse(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withPassengersPerMinute(BigInteger value) {
        setPassengersPerMinute(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withRelativeWeighting(BigInteger value) {
        setRelativeWeighting(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withSafeForGuideDog(Boolean value) {
        setSafeForGuideDog(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RampEquipment_VersionStructure withId(String value) {
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
