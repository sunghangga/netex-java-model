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
 * <p>Java class for ShelterEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShelterEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}WaitingEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ShelterEquipmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShelterEquipment_VersionStructure", propOrder = {
    "enclosed",
    "distanceFromNearestKerb"
})
@XmlSeeAlso({
    ShelterEquipment.class
})
public class ShelterEquipment_VersionStructure
    extends WaitingEquipment_VersionStructure
{

    @XmlElement(name = "Enclosed", defaultValue = "false")
    protected Boolean enclosed;
    @XmlElement(name = "DistanceFromNearestKerb")
    protected BigDecimal distanceFromNearestKerb;

    /**
     * Gets the value of the enclosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnclosed() {
        return enclosed;
    }

    /**
     * Sets the value of the enclosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnclosed(Boolean value) {
        this.enclosed = value;
    }

    /**
     * Gets the value of the distanceFromNearestKerb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromNearestKerb() {
        return distanceFromNearestKerb;
    }

    /**
     * Sets the value of the distanceFromNearestKerb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromNearestKerb(BigDecimal value) {
        this.distanceFromNearestKerb = value;
    }

    public ShelterEquipment_VersionStructure withEnclosed(Boolean value) {
        setEnclosed(value);
        return this;
    }

    public ShelterEquipment_VersionStructure withDistanceFromNearestKerb(BigDecimal value) {
        setDistanceFromNearestKerb(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withSeats(BigInteger value) {
        setSeats(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withStepFree(Boolean value) {
        setStepFree(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withWheelchairAreaWidth(BigDecimal value) {
        setWheelchairAreaWidth(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withWheelchairAreaLength(BigDecimal value) {
        setWheelchairAreaLength(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withSmokingAllowed(Boolean value) {
        setSmokingAllowed(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withHeated(Boolean value) {
        setHeated(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withAirConditioned(Boolean value) {
        setAirConditioned(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ShelterEquipment_VersionStructure withId(String value) {
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