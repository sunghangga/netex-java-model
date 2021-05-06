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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CheckConstraint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckConstraint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CheckConstraintGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckConstraint_VersionStructure", propOrder = {
    "placeRef",
    "checkDirection",
    "checkProcess",
    "checkService",
    "accessFeatureType",
    "congestion",
    "typeOfCongestionRef",
    "classOfUseRef",
    "typeOfEquipmentRef",
    "facilityRef",
    "equipmentRef",
    "delays",
    "throughput"
})
@XmlSeeAlso({
    CheckConstraint.class
})
public class CheckConstraint_VersionStructure
    extends Assignment_VersionStructure
{

    @XmlElement(name = "PlaceRef")
    protected PlaceRef placeRef;
    @XmlElement(name = "CheckDirection")
    @XmlSchemaType(name = "NMTOKEN")
    protected CheckDirectionEnumeration checkDirection;
    @XmlElement(name = "CheckProcess")
    @XmlSchemaType(name = "string")
    protected CheckProcessTypeEnumeration checkProcess;
    @XmlElement(name = "CheckService")
    @XmlSchemaType(name = "string")
    protected CheckServiceEnumeration checkService;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Congestion")
    @XmlSchemaType(name = "string")
    protected CongestionEnumeration congestion;
    @XmlElement(name = "TypeOfCongestionRef")
    protected TypeOfCongestionRefStructure typeOfCongestionRef;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElement(name = "TypeOfEquipmentRef")
    protected TypeOfEquipmentRefStructure typeOfEquipmentRef;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElementRef(name = "EquipmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EquipmentRefStructure> equipmentRef;
    protected CheckConstraint_VersionStructure.Delays delays;
    protected CheckConstraint_VersionStructure.Throughput throughput;

    /**
     * Gets the value of the placeRef property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRef }
     *     
     */
    public PlaceRef getPlaceRef() {
        return placeRef;
    }

    /**
     * Sets the value of the placeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRef }
     *     
     */
    public void setPlaceRef(PlaceRef value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the checkDirection property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDirectionEnumeration }
     *     
     */
    public CheckDirectionEnumeration getCheckDirection() {
        return checkDirection;
    }

    /**
     * Sets the value of the checkDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDirectionEnumeration }
     *     
     */
    public void setCheckDirection(CheckDirectionEnumeration value) {
        this.checkDirection = value;
    }

    /**
     * Gets the value of the checkProcess property.
     * 
     * @return
     *     possible object is
     *     {@link CheckProcessTypeEnumeration }
     *     
     */
    public CheckProcessTypeEnumeration getCheckProcess() {
        return checkProcess;
    }

    /**
     * Sets the value of the checkProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckProcessTypeEnumeration }
     *     
     */
    public void setCheckProcess(CheckProcessTypeEnumeration value) {
        this.checkProcess = value;
    }

    /**
     * Gets the value of the checkService property.
     * 
     * @return
     *     possible object is
     *     {@link CheckServiceEnumeration }
     *     
     */
    public CheckServiceEnumeration getCheckService() {
        return checkService;
    }

    /**
     * Sets the value of the checkService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckServiceEnumeration }
     *     
     */
    public void setCheckService(CheckServiceEnumeration value) {
        this.checkService = value;
    }

    /**
     * Gets the value of the accessFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public AccessFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Sets the value of the accessFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Gets the value of the congestion property.
     * 
     * @return
     *     possible object is
     *     {@link CongestionEnumeration }
     *     
     */
    public CongestionEnumeration getCongestion() {
        return congestion;
    }

    /**
     * Sets the value of the congestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CongestionEnumeration }
     *     
     */
    public void setCongestion(CongestionEnumeration value) {
        this.congestion = value;
    }

    /**
     * Gets the value of the typeOfCongestionRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfCongestionRefStructure }
     *     
     */
    public TypeOfCongestionRefStructure getTypeOfCongestionRef() {
        return typeOfCongestionRef;
    }

    /**
     * Sets the value of the typeOfCongestionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCongestionRefStructure }
     *     
     */
    public void setTypeOfCongestionRef(TypeOfCongestionRefStructure value) {
        this.typeOfCongestionRef = value;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Gets the value of the typeOfEquipmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfEquipmentRefStructure }
     *     
     */
    public TypeOfEquipmentRefStructure getTypeOfEquipmentRef() {
        return typeOfEquipmentRef;
    }

    /**
     * Sets the value of the typeOfEquipmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfEquipmentRefStructure }
     *     
     */
    public void setTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        this.typeOfEquipmentRef = value;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Sets the value of the facilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Gets the value of the equipmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends EquipmentRefStructure> getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Sets the value of the equipmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HireServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceBookingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerInformationEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LeftLuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrolleyStandEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HeadingSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StaircaseEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivatedEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlaceSignRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EntranceEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MoneyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailDeviceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessVehicleEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link HelpPointEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerSafetyEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeatingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoughSurfaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommunicationServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketValidatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CycleStorageEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CateringServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssistanceServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplaintsServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LuggageLockerEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleChargingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RubbishDisposalEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RetailServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WaitingRoomEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AccessEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeetingPointServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SanitaryEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ShelterEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TravelatorEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TicketingEquipmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LostPropertyServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstalledEquipmentRefStructure }{@code >}
     *     
     */
    public void setEquipmentRef(JAXBElement<? extends EquipmentRefStructure> value) {
        this.equipmentRef = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraint_VersionStructure.Delays }
     *     
     */
    public CheckConstraint_VersionStructure.Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraint_VersionStructure.Delays }
     *     
     */
    public void setDelays(CheckConstraint_VersionStructure.Delays value) {
        this.delays = value;
    }

    /**
     * Gets the value of the throughput property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraint_VersionStructure.Throughput }
     *     
     */
    public CheckConstraint_VersionStructure.Throughput getThroughput() {
        return throughput;
    }

    /**
     * Sets the value of the throughput property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraint_VersionStructure.Throughput }
     *     
     */
    public void setThroughput(CheckConstraint_VersionStructure.Throughput value) {
        this.throughput = value;
    }

    public CheckConstraint_VersionStructure withPlaceRef(PlaceRef value) {
        setPlaceRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withCheckDirection(CheckDirectionEnumeration value) {
        setCheckDirection(value);
        return this;
    }

    public CheckConstraint_VersionStructure withCheckProcess(CheckProcessTypeEnumeration value) {
        setCheckProcess(value);
        return this;
    }

    public CheckConstraint_VersionStructure withCheckService(CheckServiceEnumeration value) {
        setCheckService(value);
        return this;
    }

    public CheckConstraint_VersionStructure withAccessFeatureType(AccessFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public CheckConstraint_VersionStructure withCongestion(CongestionEnumeration value) {
        setCongestion(value);
        return this;
    }

    public CheckConstraint_VersionStructure withTypeOfCongestionRef(TypeOfCongestionRefStructure value) {
        setTypeOfCongestionRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withEquipmentRef(JAXBElement<? extends EquipmentRefStructure> value) {
        setEquipmentRef(value);
        return this;
    }

    public CheckConstraint_VersionStructure withDelays(CheckConstraint_VersionStructure.Delays value) {
        setDelays(value);
        return this;
    }

    public CheckConstraint_VersionStructure withThroughput(CheckConstraint_VersionStructure.Throughput value) {
        setThroughput(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CheckConstraint_VersionStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.netex.org.uk/netex}checkConstraintDelays_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Delays
        extends CheckConstraintDelays_RelStructure
    {


        @Override
        public CheckConstraint_VersionStructure.Delays withCheckConstraintDelayRefOrCheckConstraintDelay(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getCheckConstraintDelayRefOrCheckConstraintDelay().add(value);
                }
            }
            return this;
        }

        @Override
        public CheckConstraint_VersionStructure.Delays withCheckConstraintDelayRefOrCheckConstraintDelay(Collection<Object> values) {
            if (values!= null) {
                getCheckConstraintDelayRefOrCheckConstraintDelay().addAll(values);
            }
            return this;
        }

        @Override
        public CheckConstraint_VersionStructure.Delays withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.netex.org.uk/netex}checkConstraintThroughputs_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Throughput
        extends CheckConstraintThroughputs_RelStructure
    {


        @Override
        public CheckConstraint_VersionStructure.Throughput withCheckConstraintThroughputRefOrCheckConstraintThroughput(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getCheckConstraintThroughputRefOrCheckConstraintThroughput().add(value);
                }
            }
            return this;
        }

        @Override
        public CheckConstraint_VersionStructure.Throughput withCheckConstraintThroughputRefOrCheckConstraintThroughput(Collection<Object> values) {
            if (values!= null) {
                getCheckConstraintThroughputRefOrCheckConstraintThroughput().addAll(values);
            }
            return this;
        }

        @Override
        public CheckConstraint_VersionStructure.Throughput withId(String value) {
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

}