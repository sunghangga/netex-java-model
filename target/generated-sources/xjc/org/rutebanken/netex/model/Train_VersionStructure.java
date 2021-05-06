//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 * <p>Java class for Train_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Train_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleType_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}TrainGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train_VersionStructure", propOrder = {
    "trainSize",
    "components"
})
@XmlSeeAlso({
    Train.class
})
public class Train_VersionStructure
    extends VehicleType_VersionStructure
{

    @XmlElement(name = "TrainSize")
    protected TrainSizeStructure trainSize;
    protected TrainComponents_RelStructure components;

    /**
     * Gets the value of the trainSize property.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeStructure }
     *     
     */
    public TrainSizeStructure getTrainSize() {
        return trainSize;
    }

    /**
     * Sets the value of the trainSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeStructure }
     *     
     */
    public void setTrainSize(TrainSizeStructure value) {
        this.trainSize = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponents_RelStructure }
     *     
     */
    public TrainComponents_RelStructure getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponents_RelStructure }
     *     
     */
    public void setComponents(TrainComponents_RelStructure value) {
        this.components = value;
    }

    public Train_VersionStructure withTrainSize(TrainSizeStructure value) {
        setTrainSize(value);
        return this;
    }

    public Train_VersionStructure withComponents(TrainComponents_RelStructure value) {
        setComponents(value);
        return this;
    }

    @Override
    public Train_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Train_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Train_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Train_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Train_VersionStructure withReversingDirection(Boolean value) {
        setReversingDirection(value);
        return this;
    }

    @Override
    public Train_VersionStructure withSelfPropelled(Boolean value) {
        setSelfPropelled(value);
        return this;
    }

    @Override
    public Train_VersionStructure withTypeOfFuel(TypeOfFuelEnumeration value) {
        setTypeOfFuel(value);
        return this;
    }

    @Override
    public Train_VersionStructure withEuroClass(String value) {
        setEuroClass(value);
        return this;
    }

    @Override
    public Train_VersionStructure withPassengerCapacity(PassengerCapacityStructure value) {
        setPassengerCapacity(value);
        return this;
    }

    @Override
    public Train_VersionStructure withCapacities(PassengerCapacities_RelStructure value) {
        setCapacities(value);
        return this;
    }

    @Override
    public Train_VersionStructure withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    @Override
    public Train_VersionStructure withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    @Override
    public Train_VersionStructure withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    @Override
    public Train_VersionStructure withBoardingHeight(BigDecimal value) {
        setBoardingHeight(value);
        return this;
    }

    @Override
    public Train_VersionStructure withGapToPlatform(BigDecimal value) {
        setGapToPlatform(value);
        return this;
    }

    @Override
    public Train_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public Train_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public Train_VersionStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public Train_VersionStructure withWeight(BigDecimal value) {
        setWeight(value);
        return this;
    }

    @Override
    public Train_VersionStructure withIncludedIn(VehicleTypeRefStructure value) {
        setIncludedIn(value);
        return this;
    }

    @Override
    public Train_VersionStructure withClassifiedAsRef(VehicleModelRefStructure value) {
        setClassifiedAsRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withFacilities(ServiceFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public Train_VersionStructure withCanCarry(PassengerCarryingRequirements_RelStructure value) {
        setCanCarry(value);
        return this;
    }

    @Override
    public Train_VersionStructure withCanManoeuvre(VehicleManoeuvringRequirements_RelStructure value) {
        setCanManoeuvre(value);
        return this;
    }

    @Override
    public Train_VersionStructure withSatisfiesFacilityRequirements(FacilityRequirements_RelStructure value) {
        setSatisfiesFacilityRequirements(value);
        return this;
    }

    @Override
    public Train_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Train_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Train_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Train_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Train_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Train_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Train_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Train_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Train_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Train_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Train_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Train_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Train_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Train_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Train_VersionStructure withId(String value) {
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