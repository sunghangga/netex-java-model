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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VehicleType_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleType_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleTypeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleType_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "privateCode",
    "reversingDirection",
    "selfPropelled",
    "typeOfFuel",
    "euroClass",
    "passengerCapacity",
    "capacities",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "boardingHeight",
    "gapToPlatform",
    "length",
    "width",
    "height",
    "weight",
    "includedIn",
    "classifiedAsRef",
    "facilities",
    "canCarry",
    "canManoeuvre",
    "satisfiesFacilityRequirements"
})
@XmlSeeAlso({
    VehicleType.class,
    Train_VersionStructure.class,
    CompoundTrain_VersionStructure.class
})
public class VehicleType_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ReversingDirection", defaultValue = "true")
    protected Boolean reversingDirection;
    @XmlElement(name = "SelfPropelled", defaultValue = "true")
    protected Boolean selfPropelled;
    @XmlElement(name = "TypeOfFuel")
    @XmlSchemaType(name = "normalizedString")
    protected TypeOfFuelEnumeration typeOfFuel;
    @XmlElement(name = "EuroClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String euroClass;
    @XmlElement(name = "PassengerCapacity")
    protected PassengerCapacityStructure passengerCapacity;
    protected PassengerCapacities_RelStructure capacities;
    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HasLiftOrRamp")
    protected Boolean hasLiftOrRamp;
    @XmlElement(name = "HasHoist")
    protected Boolean hasHoist;
    @XmlElement(name = "BoardingHeight")
    protected BigDecimal boardingHeight;
    @XmlElement(name = "GapToPlatform")
    protected BigDecimal gapToPlatform;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "IncludedIn")
    protected VehicleTypeRefStructure includedIn;
    @XmlElement(name = "ClassifiedAsRef")
    protected VehicleModelRefStructure classifiedAsRef;
    protected ServiceFacilitySets_RelStructure facilities;
    protected PassengerCarryingRequirements_RelStructure canCarry;
    protected VehicleManoeuvringRequirements_RelStructure canManoeuvre;
    protected FacilityRequirements_RelStructure satisfiesFacilityRequirements;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the reversingDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversingDirection() {
        return reversingDirection;
    }

    /**
     * Sets the value of the reversingDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversingDirection(Boolean value) {
        this.reversingDirection = value;
    }

    /**
     * Gets the value of the selfPropelled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * Sets the value of the selfPropelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfPropelled(Boolean value) {
        this.selfPropelled = value;
    }

    /**
     * Gets the value of the typeOfFuel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public TypeOfFuelEnumeration getTypeOfFuel() {
        return typeOfFuel;
    }

    /**
     * Sets the value of the typeOfFuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public void setTypeOfFuel(TypeOfFuelEnumeration value) {
        this.typeOfFuel = value;
    }

    /**
     * Gets the value of the euroClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroClass() {
        return euroClass;
    }

    /**
     * Sets the value of the euroClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroClass(String value) {
        this.euroClass = value;
    }

    /**
     * Gets the value of the passengerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public PassengerCapacityStructure getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Sets the value of the passengerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacityStructure }
     *     
     */
    public void setPassengerCapacity(PassengerCapacityStructure value) {
        this.passengerCapacity = value;
    }

    /**
     * Gets the value of the capacities property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacities_RelStructure }
     *     
     */
    public PassengerCapacities_RelStructure getCapacities() {
        return capacities;
    }

    /**
     * Sets the value of the capacities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacities_RelStructure }
     *     
     */
    public void setCapacities(PassengerCapacities_RelStructure value) {
        this.capacities = value;
    }

    /**
     * Gets the value of the lowFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowFloor() {
        return lowFloor;
    }

    /**
     * Sets the value of the lowFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFloor(Boolean value) {
        this.lowFloor = value;
    }

    /**
     * Gets the value of the hasLiftOrRamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiftOrRamp() {
        return hasLiftOrRamp;
    }

    /**
     * Sets the value of the hasLiftOrRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiftOrRamp(Boolean value) {
        this.hasLiftOrRamp = value;
    }

    /**
     * Gets the value of the hasHoist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHoist() {
        return hasHoist;
    }

    /**
     * Sets the value of the hasHoist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHoist(Boolean value) {
        this.hasHoist = value;
    }

    /**
     * Gets the value of the boardingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardingHeight() {
        return boardingHeight;
    }

    /**
     * Sets the value of the boardingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardingHeight(BigDecimal value) {
        this.boardingHeight = value;
    }

    /**
     * Gets the value of the gapToPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGapToPlatform() {
        return gapToPlatform;
    }

    /**
     * Sets the value of the gapToPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGapToPlatform(BigDecimal value) {
        this.gapToPlatform = value;
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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Gets the value of the includedIn property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public VehicleTypeRefStructure getIncludedIn() {
        return includedIn;
    }

    /**
     * Sets the value of the includedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public void setIncludedIn(VehicleTypeRefStructure value) {
        this.includedIn = value;
    }

    /**
     * Gets the value of the classifiedAsRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public VehicleModelRefStructure getClassifiedAsRef() {
        return classifiedAsRef;
    }

    /**
     * Sets the value of the classifiedAsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelRefStructure }
     *     
     */
    public void setClassifiedAsRef(VehicleModelRefStructure value) {
        this.classifiedAsRef = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySets_RelStructure }
     *     
     */
    public ServiceFacilitySets_RelStructure getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySets_RelStructure }
     *     
     */
    public void setFacilities(ServiceFacilitySets_RelStructure value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the canCarry property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirements_RelStructure }
     *     
     */
    public PassengerCarryingRequirements_RelStructure getCanCarry() {
        return canCarry;
    }

    /**
     * Sets the value of the canCarry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirements_RelStructure }
     *     
     */
    public void setCanCarry(PassengerCarryingRequirements_RelStructure value) {
        this.canCarry = value;
    }

    /**
     * Gets the value of the canManoeuvre property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleManoeuvringRequirements_RelStructure }
     *     
     */
    public VehicleManoeuvringRequirements_RelStructure getCanManoeuvre() {
        return canManoeuvre;
    }

    /**
     * Sets the value of the canManoeuvre property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleManoeuvringRequirements_RelStructure }
     *     
     */
    public void setCanManoeuvre(VehicleManoeuvringRequirements_RelStructure value) {
        this.canManoeuvre = value;
    }

    /**
     * Gets the value of the satisfiesFacilityRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRequirements_RelStructure }
     *     
     */
    public FacilityRequirements_RelStructure getSatisfiesFacilityRequirements() {
        return satisfiesFacilityRequirements;
    }

    /**
     * Sets the value of the satisfiesFacilityRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRequirements_RelStructure }
     *     
     */
    public void setSatisfiesFacilityRequirements(FacilityRequirements_RelStructure value) {
        this.satisfiesFacilityRequirements = value;
    }

    public VehicleType_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public VehicleType_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public VehicleType_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public VehicleType_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public VehicleType_VersionStructure withReversingDirection(Boolean value) {
        setReversingDirection(value);
        return this;
    }

    public VehicleType_VersionStructure withSelfPropelled(Boolean value) {
        setSelfPropelled(value);
        return this;
    }

    public VehicleType_VersionStructure withTypeOfFuel(TypeOfFuelEnumeration value) {
        setTypeOfFuel(value);
        return this;
    }

    public VehicleType_VersionStructure withEuroClass(String value) {
        setEuroClass(value);
        return this;
    }

    public VehicleType_VersionStructure withPassengerCapacity(PassengerCapacityStructure value) {
        setPassengerCapacity(value);
        return this;
    }

    public VehicleType_VersionStructure withCapacities(PassengerCapacities_RelStructure value) {
        setCapacities(value);
        return this;
    }

    public VehicleType_VersionStructure withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    public VehicleType_VersionStructure withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    public VehicleType_VersionStructure withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    public VehicleType_VersionStructure withBoardingHeight(BigDecimal value) {
        setBoardingHeight(value);
        return this;
    }

    public VehicleType_VersionStructure withGapToPlatform(BigDecimal value) {
        setGapToPlatform(value);
        return this;
    }

    public VehicleType_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    public VehicleType_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    public VehicleType_VersionStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    public VehicleType_VersionStructure withWeight(BigDecimal value) {
        setWeight(value);
        return this;
    }

    public VehicleType_VersionStructure withIncludedIn(VehicleTypeRefStructure value) {
        setIncludedIn(value);
        return this;
    }

    public VehicleType_VersionStructure withClassifiedAsRef(VehicleModelRefStructure value) {
        setClassifiedAsRef(value);
        return this;
    }

    public VehicleType_VersionStructure withFacilities(ServiceFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    public VehicleType_VersionStructure withCanCarry(PassengerCarryingRequirements_RelStructure value) {
        setCanCarry(value);
        return this;
    }

    public VehicleType_VersionStructure withCanManoeuvre(VehicleManoeuvringRequirements_RelStructure value) {
        setCanManoeuvre(value);
        return this;
    }

    public VehicleType_VersionStructure withSatisfiesFacilityRequirements(FacilityRequirements_RelStructure value) {
        setSatisfiesFacilityRequirements(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleType_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleType_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleType_VersionStructure withId(String value) {
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
