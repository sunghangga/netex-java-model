//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java class for JourneyPart_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPart_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartGroup"/&gt;
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
@XmlType(name = "JourneyPart_VersionStructure", propOrder = {
    "description",
    "parentJourneyRef",
    "mainPartRef",
    "journeyPartCoupleRef",
    "trainNumberRef",
    "blockPartRef",
    "fromStopPointRef",
    "toStopPointRef",
    "startTime",
    "startTimeDayOffset",
    "endTime",
    "endTimeDayOffset",
    "vehicleOrientation",
    "purposeOfJourneyPartitionRef",
    "facilities",
    "journeyPartPositions"
})
@XmlSeeAlso({
    JourneyPart.class
})
public class JourneyPart_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "ParentJourneyRef")
    protected VehicleJourneyRefStructure parentJourneyRef;
    @XmlElement(name = "MainPartRef", required = true)
    protected JourneyPartCoupleRefStructure mainPartRef;
    @XmlElement(name = "JourneyPartCoupleRef")
    protected JourneyPartCoupleRefStructure journeyPartCoupleRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElementRef(name = "BlockPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends BlockPartRefStructure> blockPartRef;
    @XmlElement(name = "FromStopPointRef")
    protected ScheduledStopPointRefStructure fromStopPointRef;
    @XmlElement(name = "ToStopPointRef")
    protected ScheduledStopPointRefStructure toStopPointRef;
    @XmlElement(name = "StartTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTime;
    @XmlElement(name = "StartTimeDayOffset", defaultValue = "0")
    protected BigInteger startTimeDayOffset;
    @XmlElement(name = "EndTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTime;
    @XmlElement(name = "EndTimeDayOffset", defaultValue = "0")
    protected BigInteger endTimeDayOffset;
    @XmlElement(name = "VehicleOrientation", defaultValue = "true")
    protected Boolean vehicleOrientation;
    @XmlElement(name = "PurposeOfJourneyPartitionRef")
    protected PurposeOfJourneyPartitionRefStructure purposeOfJourneyPartitionRef;
    protected ServiceFacilitySets_RelStructure facilities;
    protected JourneyPartPositions_RelStructure journeyPartPositions;
    @XmlAttribute(name = "order")
    protected BigInteger order;

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
     * Gets the value of the parentJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getParentJourneyRef() {
        return parentJourneyRef;
    }

    /**
     * Sets the value of the parentJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setParentJourneyRef(VehicleJourneyRefStructure value) {
        this.parentJourneyRef = value;
    }

    /**
     * Gets the value of the mainPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public JourneyPartCoupleRefStructure getMainPartRef() {
        return mainPartRef;
    }

    /**
     * Sets the value of the mainPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public void setMainPartRef(JourneyPartCoupleRefStructure value) {
        this.mainPartRef = value;
    }

    /**
     * Gets the value of the journeyPartCoupleRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public JourneyPartCoupleRefStructure getJourneyPartCoupleRef() {
        return journeyPartCoupleRef;
    }

    /**
     * Sets the value of the journeyPartCoupleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartCoupleRefStructure }
     *     
     */
    public void setJourneyPartCoupleRef(JourneyPartCoupleRefStructure value) {
        this.journeyPartCoupleRef = value;
    }

    /**
     * Gets the value of the trainNumberRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Sets the value of the trainNumberRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Gets the value of the blockPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends BlockPartRefStructure> getBlockPartRef() {
        return blockPartRef;
    }

    /**
     * Sets the value of the blockPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     *     
     */
    public void setBlockPartRef(JAXBElement<? extends BlockPartRefStructure> value) {
        this.blockPartRef = value;
    }

    /**
     * Gets the value of the fromStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromStopPointRef() {
        return fromStopPointRef;
    }

    /**
     * Sets the value of the fromStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromStopPointRef(ScheduledStopPointRefStructure value) {
        this.fromStopPointRef = value;
    }

    /**
     * Gets the value of the toStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToStopPointRef() {
        return toStopPointRef;
    }

    /**
     * Sets the value of the toStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToStopPointRef(ScheduledStopPointRefStructure value) {
        this.toStopPointRef = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(LocalTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartTimeDayOffset() {
        return startTimeDayOffset;
    }

    /**
     * Sets the value of the startTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartTimeDayOffset(BigInteger value) {
        this.startTimeDayOffset = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(LocalTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndTimeDayOffset() {
        return endTimeDayOffset;
    }

    /**
     * Sets the value of the endTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndTimeDayOffset(BigInteger value) {
        this.endTimeDayOffset = value;
    }

    /**
     * Gets the value of the vehicleOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleOrientation() {
        return vehicleOrientation;
    }

    /**
     * Sets the value of the vehicleOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleOrientation(Boolean value) {
        this.vehicleOrientation = value;
    }

    /**
     * Gets the value of the purposeOfJourneyPartitionRef property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeOfJourneyPartitionRefStructure }
     *     
     */
    public PurposeOfJourneyPartitionRefStructure getPurposeOfJourneyPartitionRef() {
        return purposeOfJourneyPartitionRef;
    }

    /**
     * Sets the value of the purposeOfJourneyPartitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeOfJourneyPartitionRefStructure }
     *     
     */
    public void setPurposeOfJourneyPartitionRef(PurposeOfJourneyPartitionRefStructure value) {
        this.purposeOfJourneyPartitionRef = value;
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
     * Gets the value of the journeyPartPositions property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartPositions_RelStructure }
     *     
     */
    public JourneyPartPositions_RelStructure getJourneyPartPositions() {
        return journeyPartPositions;
    }

    /**
     * Sets the value of the journeyPartPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartPositions_RelStructure }
     *     
     */
    public void setJourneyPartPositions(JourneyPartPositions_RelStructure value) {
        this.journeyPartPositions = value;
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

    public JourneyPart_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public JourneyPart_VersionStructure withParentJourneyRef(VehicleJourneyRefStructure value) {
        setParentJourneyRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withMainPartRef(JourneyPartCoupleRefStructure value) {
        setMainPartRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withJourneyPartCoupleRef(JourneyPartCoupleRefStructure value) {
        setJourneyPartCoupleRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withBlockPartRef(JAXBElement<? extends BlockPartRefStructure> value) {
        setBlockPartRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withFromStopPointRef(ScheduledStopPointRefStructure value) {
        setFromStopPointRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withToStopPointRef(ScheduledStopPointRefStructure value) {
        setToStopPointRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    public JourneyPart_VersionStructure withStartTimeDayOffset(BigInteger value) {
        setStartTimeDayOffset(value);
        return this;
    }

    public JourneyPart_VersionStructure withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    public JourneyPart_VersionStructure withEndTimeDayOffset(BigInteger value) {
        setEndTimeDayOffset(value);
        return this;
    }

    public JourneyPart_VersionStructure withVehicleOrientation(Boolean value) {
        setVehicleOrientation(value);
        return this;
    }

    public JourneyPart_VersionStructure withPurposeOfJourneyPartitionRef(PurposeOfJourneyPartitionRefStructure value) {
        setPurposeOfJourneyPartitionRef(value);
        return this;
    }

    public JourneyPart_VersionStructure withFacilities(ServiceFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    public JourneyPart_VersionStructure withJourneyPartPositions(JourneyPartPositions_RelStructure value) {
        setJourneyPartPositions(value);
        return this;
    }

    public JourneyPart_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyPart_VersionStructure withId(String value) {
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
