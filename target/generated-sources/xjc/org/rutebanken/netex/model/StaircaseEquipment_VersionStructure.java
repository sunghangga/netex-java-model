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
 * <p>Java class for StaircaseEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaircaseEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}StairEquipment_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}StaircaseGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaircaseEquipment_VersionStructure", propOrder = {
    "continuousHandrail",
    "withoutRiser",
    "spiralStair",
    "numberOfFlights",
    "flights"
})
@XmlSeeAlso({
    StaircaseEquipment.class
})
public class StaircaseEquipment_VersionStructure
    extends StairEquipment_VersionStructure
{

    @XmlElement(name = "ContinuousHandrail")
    protected Boolean continuousHandrail;
    @XmlElement(name = "WithoutRiser")
    protected Boolean withoutRiser;
    @XmlElement(name = "SpiralStair")
    protected Boolean spiralStair;
    @XmlElement(name = "NumberOfFlights")
    protected BigInteger numberOfFlights;
    protected StairFlights_RelStructure flights;

    /**
     * Gets the value of the continuousHandrail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinuousHandrail() {
        return continuousHandrail;
    }

    /**
     * Sets the value of the continuousHandrail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinuousHandrail(Boolean value) {
        this.continuousHandrail = value;
    }

    /**
     * Gets the value of the withoutRiser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutRiser() {
        return withoutRiser;
    }

    /**
     * Sets the value of the withoutRiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithoutRiser(Boolean value) {
        this.withoutRiser = value;
    }

    /**
     * Gets the value of the spiralStair property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpiralStair() {
        return spiralStair;
    }

    /**
     * Sets the value of the spiralStair property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpiralStair(Boolean value) {
        this.spiralStair = value;
    }

    /**
     * Gets the value of the numberOfFlights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFlights() {
        return numberOfFlights;
    }

    /**
     * Sets the value of the numberOfFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFlights(BigInteger value) {
        this.numberOfFlights = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     * @return
     *     possible object is
     *     {@link StairFlights_RelStructure }
     *     
     */
    public StairFlights_RelStructure getFlights() {
        return flights;
    }

    /**
     * Sets the value of the flights property.
     * 
     * @param value
     *     allowed object is
     *     {@link StairFlights_RelStructure }
     *     
     */
    public void setFlights(StairFlights_RelStructure value) {
        this.flights = value;
    }

    public StaircaseEquipment_VersionStructure withContinuousHandrail(Boolean value) {
        setContinuousHandrail(value);
        return this;
    }

    public StaircaseEquipment_VersionStructure withWithoutRiser(Boolean value) {
        setWithoutRiser(value);
        return this;
    }

    public StaircaseEquipment_VersionStructure withSpiralStair(Boolean value) {
        setSpiralStair(value);
        return this;
    }

    public StaircaseEquipment_VersionStructure withNumberOfFlights(BigInteger value) {
        setNumberOfFlights(value);
        return this;
    }

    public StaircaseEquipment_VersionStructure withFlights(StairFlights_RelStructure value) {
        setFlights(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDepth(BigDecimal value) {
        setDepth(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withNumberOfSteps(BigInteger value) {
        setNumberOfSteps(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withStepHeight(BigDecimal value) {
        setStepHeight(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withStepColourContrast(Boolean value) {
        setStepColourContrast(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withHandrailType(HandrailEnumeration value) {
        setHandrailType(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withHandrailHeight(BigDecimal value) {
        setHandrailHeight(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withLowerHandrailHeight(BigDecimal value) {
        setLowerHandrailHeight(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withTopEnd(StairEndStructure value) {
        setTopEnd(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withBottomEnd(StairEndStructure value) {
        setBottomEnd(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDirectionOfUse(DirectionOfUseEnumeration value) {
        setDirectionOfUse(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withPassengersPerMinute(BigInteger value) {
        setPassengersPerMinute(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withRelativeWeighting(BigInteger value) {
        setRelativeWeighting(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withSafeForGuideDog(Boolean value) {
        setSafeForGuideDog(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public StaircaseEquipment_VersionStructure withId(String value) {
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
