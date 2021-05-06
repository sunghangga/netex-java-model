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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TravelatorEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelatorEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelatorGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelatorEquipment_VersionStructure", propOrder = {
    "tactileActuators",
    "energySaving",
    "speed",
    "length",
    "gradient",
    "integratesAnEscalatorPart"
})
@XmlSeeAlso({
    TravelatorEquipment.class
})
public class TravelatorEquipment_VersionStructure
    extends AccessEquipment_VersionStructure
{

    @XmlElement(name = "TactileActuators")
    protected Boolean tactileActuators;
    @XmlElement(name = "EnergySaving")
    protected Boolean energySaving;
    @XmlElement(name = "Speed")
    protected BigDecimal speed;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Gradient")
    protected BigDecimal gradient;
    @XmlElement(name = "IntegratesAnEscalatorPart")
    protected Boolean integratesAnEscalatorPart;

    /**
     * Gets the value of the tactileActuators property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileActuators() {
        return tactileActuators;
    }

    /**
     * Sets the value of the tactileActuators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileActuators(Boolean value) {
        this.tactileActuators = value;
    }

    /**
     * Gets the value of the energySaving property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnergySaving() {
        return energySaving;
    }

    /**
     * Sets the value of the energySaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnergySaving(Boolean value) {
        this.energySaving = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeed(BigDecimal value) {
        this.speed = value;
    }

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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGradient() {
        return gradient;
    }

    /**
     * Sets the value of the gradient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGradient(BigDecimal value) {
        this.gradient = value;
    }

    /**
     * Gets the value of the integratesAnEscalatorPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratesAnEscalatorPart() {
        return integratesAnEscalatorPart;
    }

    /**
     * Sets the value of the integratesAnEscalatorPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratesAnEscalatorPart(Boolean value) {
        this.integratesAnEscalatorPart = value;
    }

    public TravelatorEquipment_VersionStructure withTactileActuators(Boolean value) {
        setTactileActuators(value);
        return this;
    }

    public TravelatorEquipment_VersionStructure withEnergySaving(Boolean value) {
        setEnergySaving(value);
        return this;
    }

    public TravelatorEquipment_VersionStructure withSpeed(BigDecimal value) {
        setSpeed(value);
        return this;
    }

    public TravelatorEquipment_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    public TravelatorEquipment_VersionStructure withGradient(BigDecimal value) {
        setGradient(value);
        return this;
    }

    public TravelatorEquipment_VersionStructure withIntegratesAnEscalatorPart(Boolean value) {
        setIntegratesAnEscalatorPart(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withDirectionOfUse(DirectionOfUseEnumeration value) {
        setDirectionOfUse(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withPassengersPerMinute(BigInteger value) {
        setPassengersPerMinute(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withRelativeWeighting(BigInteger value) {
        setRelativeWeighting(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withSafeForGuideDog(Boolean value) {
        setSafeForGuideDog(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TravelatorEquipment_VersionStructure withId(String value) {
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