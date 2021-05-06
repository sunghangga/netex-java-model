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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Call_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Call_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CallGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="constrained" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Call_VersionedChildStructure", propOrder = {
    "visitNumber",
    "scheduledStopPointRef",
    "scheduledStopPointView",
    "onwardTimingLinkView",
    "onwardServiceLinkRef",
    "onwardServiceLinkView",
    "timingPointStatus",
    "serviceJourneyRef",
    "pointInJourneyPatternRef",
    "arrival",
    "departure",
    "frequency",
    "destinationDisplayRef",
    "destinationDisplayView",
    "vias",
    "flexiblePointProperties",
    "changeOfDestinationDisplay",
    "changeOfServiceRequirements",
    "noticeAssignments",
    "requestStop",
    "requestMethod",
    "stopUse",
    "bookingArrangements",
    "print",
    "dynamic",
    "passengerCarryingRequirementRef",
    "passengerCarryingRequirementsView",
    "trainSize",
    "equipments",
    "note"
})
@XmlSeeAlso({
    Call.class,
    CallZ.class,
    DatedCall_VersionedChildStructure.class,
    PreviousCall_VersionedChildStructure.class,
    OnwardCall_VersionedChildStructure.class,
    MonitoredCall_VersionedChildStructure.class
})
public class Call_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "VisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger visitNumber;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPoint_DerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "OnwardTimingLinkView")
    protected OnwardTimingLinkView onwardTimingLinkView;
    @XmlElement(name = "OnwardServiceLinkRef")
    protected ServiceLinkRefStructure onwardServiceLinkRef;
    @XmlElement(name = "OnwardServiceLinkView")
    protected OnwardServiceLinkView onwardServiceLinkView;
    @XmlElement(name = "TimingPointStatus")
    @XmlSchemaType(name = "normalizedString")
    protected TimingPointStatusEnumeration timingPointStatus;
    @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ServiceJourneyRefStructure> serviceJourneyRef;
    @XmlElement(name = "PointInJourneyPatternRef")
    protected PointInJourneyPatternRefStructure pointInJourneyPatternRef;
    @XmlElement(name = "Arrival")
    protected ArrivalStructure arrival;
    @XmlElement(name = "Departure")
    protected DepartureStructure departure;
    @XmlElement(name = "Frequency")
    protected FrequencyStructure frequency;
    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "DestinationDisplayView")
    protected DestinationDisplayView destinationDisplayView;
    protected Vias_RelStructure vias;
    @XmlElement(name = "FlexiblePointProperties")
    protected FlexiblePointProperties flexiblePointProperties;
    @XmlElement(name = "ChangeOfDestinationDisplay")
    protected Boolean changeOfDestinationDisplay;
    @XmlElement(name = "ChangeOfServiceRequirements")
    protected Boolean changeOfServiceRequirements;
    protected Call_VersionedChildStructure.NoticeAssignments noticeAssignments;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "RequestMethod", defaultValue = "noneRequired")
    @XmlSchemaType(name = "NMTOKEN")
    protected RequestMethodTypeEnumeration requestMethod;
    @XmlElement(name = "StopUse")
    @XmlSchemaType(name = "NMTOKEN")
    protected StopUseEnumeration stopUse;
    @XmlElement(name = "BookingArrangements")
    protected BookingArrangementsStructure bookingArrangements;
    @XmlElement(name = "Print", defaultValue = "true")
    protected Boolean print;
    @XmlElement(name = "Dynamic", defaultValue = "always")
    @XmlSchemaType(name = "NMTOKEN")
    protected DynamicAdvertisementEnumeration dynamic;
    @XmlElement(name = "PassengerCarryingRequirementRef")
    protected PassengerCarryingRequirementRefStructure passengerCarryingRequirementRef;
    @XmlElement(name = "PassengerCarryingRequirementsView")
    protected PassengerCarryingRequirementsView passengerCarryingRequirementsView;
    @XmlElement(name = "TrainSize")
    protected TrainSizeStructure trainSize;
    protected VehicleEquipments_RelStructure equipments;
    @XmlElement(name = "Note")
    protected MultilingualString note;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlAttribute(name = "constrained")
    protected Boolean constrained;

    /**
     * Gets the value of the visitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Sets the value of the visitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    /**
     * Gets the value of the scheduledStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Sets the value of the scheduledStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Gets the value of the scheduledStopPointView property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPoint_DerivedViewStructure }
     *     
     */
    public ScheduledStopPoint_DerivedViewStructure getScheduledStopPointView() {
        return scheduledStopPointView;
    }

    /**
     * Sets the value of the scheduledStopPointView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPoint_DerivedViewStructure }
     *     
     */
    public void setScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        this.scheduledStopPointView = value;
    }

    /**
     * Gets the value of the onwardTimingLinkView property.
     * 
     * @return
     *     possible object is
     *     {@link OnwardTimingLinkView }
     *     
     */
    public OnwardTimingLinkView getOnwardTimingLinkView() {
        return onwardTimingLinkView;
    }

    /**
     * Sets the value of the onwardTimingLinkView property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardTimingLinkView }
     *     
     */
    public void setOnwardTimingLinkView(OnwardTimingLinkView value) {
        this.onwardTimingLinkView = value;
    }

    /**
     * Gets the value of the onwardServiceLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public ServiceLinkRefStructure getOnwardServiceLinkRef() {
        return onwardServiceLinkRef;
    }

    /**
     * Sets the value of the onwardServiceLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinkRefStructure }
     *     
     */
    public void setOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        this.onwardServiceLinkRef = value;
    }

    /**
     * Gets the value of the onwardServiceLinkView property.
     * 
     * @return
     *     possible object is
     *     {@link OnwardServiceLinkView }
     *     
     */
    public OnwardServiceLinkView getOnwardServiceLinkView() {
        return onwardServiceLinkView;
    }

    /**
     * Sets the value of the onwardServiceLinkView property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardServiceLinkView }
     *     
     */
    public void setOnwardServiceLinkView(OnwardServiceLinkView value) {
        this.onwardServiceLinkView = value;
    }

    /**
     * Gets the value of the timingPointStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public TimingPointStatusEnumeration getTimingPointStatus() {
        return timingPointStatus;
    }

    /**
     * Sets the value of the timingPointStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointStatusEnumeration }
     *     
     */
    public void setTimingPointStatus(TimingPointStatusEnumeration value) {
        this.timingPointStatus = value;
    }

    /**
     * Gets the value of the serviceJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceJourneyRefStructure> getServiceJourneyRef() {
        return serviceJourneyRef;
    }

    /**
     * Sets the value of the serviceJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        this.serviceJourneyRef = value;
    }

    /**
     * Gets the value of the pointInJourneyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public PointInJourneyPatternRefStructure getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Sets the value of the pointInJourneyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInJourneyPatternRefStructure }
     *     
     */
    public void setPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        this.pointInJourneyPatternRef = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalStructure }
     *     
     */
    public ArrivalStructure getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalStructure }
     *     
     */
    public void setArrival(ArrivalStructure value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureStructure }
     *     
     */
    public DepartureStructure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureStructure }
     *     
     */
    public void setDeparture(DepartureStructure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyStructure }
     *     
     */
    public FrequencyStructure getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyStructure }
     *     
     */
    public void setFrequency(FrequencyStructure value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the destinationDisplayRef property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public DestinationDisplayRefStructure getDestinationDisplayRef() {
        return destinationDisplayRef;
    }

    /**
     * Sets the value of the destinationDisplayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public void setDestinationDisplayRef(DestinationDisplayRefStructure value) {
        this.destinationDisplayRef = value;
    }

    /**
     * Gets the value of the destinationDisplayView property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayView }
     *     
     */
    public DestinationDisplayView getDestinationDisplayView() {
        return destinationDisplayView;
    }

    /**
     * Sets the value of the destinationDisplayView property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayView }
     *     
     */
    public void setDestinationDisplayView(DestinationDisplayView value) {
        this.destinationDisplayView = value;
    }

    /**
     * Gets the value of the vias property.
     * 
     * @return
     *     possible object is
     *     {@link Vias_RelStructure }
     *     
     */
    public Vias_RelStructure getVias() {
        return vias;
    }

    /**
     * Sets the value of the vias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vias_RelStructure }
     *     
     */
    public void setVias(Vias_RelStructure value) {
        this.vias = value;
    }

    /**
     * Gets the value of the flexiblePointProperties property.
     * 
     * @return
     *     possible object is
     *     {@link FlexiblePointProperties }
     *     
     */
    public FlexiblePointProperties getFlexiblePointProperties() {
        return flexiblePointProperties;
    }

    /**
     * Sets the value of the flexiblePointProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexiblePointProperties }
     *     
     */
    public void setFlexiblePointProperties(FlexiblePointProperties value) {
        this.flexiblePointProperties = value;
    }

    /**
     * Gets the value of the changeOfDestinationDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfDestinationDisplay() {
        return changeOfDestinationDisplay;
    }

    /**
     * Sets the value of the changeOfDestinationDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfDestinationDisplay(Boolean value) {
        this.changeOfDestinationDisplay = value;
    }

    /**
     * Gets the value of the changeOfServiceRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfServiceRequirements() {
        return changeOfServiceRequirements;
    }

    /**
     * Sets the value of the changeOfServiceRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfServiceRequirements(Boolean value) {
        this.changeOfServiceRequirements = value;
    }

    /**
     * Gets the value of the noticeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link Call_VersionedChildStructure.NoticeAssignments }
     *     
     */
    public Call_VersionedChildStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Call_VersionedChildStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(Call_VersionedChildStructure.NoticeAssignments value) {
        this.noticeAssignments = value;
    }

    /**
     * Gets the value of the requestStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Sets the value of the requestStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the requestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public RequestMethodTypeEnumeration getRequestMethod() {
        return requestMethod;
    }

    /**
     * Sets the value of the requestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public void setRequestMethod(RequestMethodTypeEnumeration value) {
        this.requestMethod = value;
    }

    /**
     * Gets the value of the stopUse property.
     * 
     * @return
     *     possible object is
     *     {@link StopUseEnumeration }
     *     
     */
    public StopUseEnumeration getStopUse() {
        return stopUse;
    }

    /**
     * Sets the value of the stopUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopUseEnumeration }
     *     
     */
    public void setStopUse(StopUseEnumeration value) {
        this.stopUse = value;
    }

    /**
     * Gets the value of the bookingArrangements property.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsStructure }
     *     
     */
    public BookingArrangementsStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Sets the value of the bookingArrangements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Gets the value of the print property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrint() {
        return print;
    }

    /**
     * Sets the value of the print property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrint(Boolean value) {
        this.print = value;
    }

    /**
     * Gets the value of the dynamic property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public DynamicAdvertisementEnumeration getDynamic() {
        return dynamic;
    }

    /**
     * Sets the value of the dynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAdvertisementEnumeration }
     *     
     */
    public void setDynamic(DynamicAdvertisementEnumeration value) {
        this.dynamic = value;
    }

    /**
     * Gets the value of the passengerCarryingRequirementRef property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirementRefStructure }
     *     
     */
    public PassengerCarryingRequirementRefStructure getPassengerCarryingRequirementRef() {
        return passengerCarryingRequirementRef;
    }

    /**
     * Sets the value of the passengerCarryingRequirementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirementRefStructure }
     *     
     */
    public void setPassengerCarryingRequirementRef(PassengerCarryingRequirementRefStructure value) {
        this.passengerCarryingRequirementRef = value;
    }

    /**
     * Gets the value of the passengerCarryingRequirementsView property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCarryingRequirementsView }
     *     
     */
    public PassengerCarryingRequirementsView getPassengerCarryingRequirementsView() {
        return passengerCarryingRequirementsView;
    }

    /**
     * Sets the value of the passengerCarryingRequirementsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCarryingRequirementsView }
     *     
     */
    public void setPassengerCarryingRequirementsView(PassengerCarryingRequirementsView value) {
        this.passengerCarryingRequirementsView = value;
    }

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
     * Gets the value of the equipments property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipments_RelStructure }
     *     
     */
    public VehicleEquipments_RelStructure getEquipments() {
        return equipments;
    }

    /**
     * Sets the value of the equipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipments_RelStructure }
     *     
     */
    public void setEquipments(VehicleEquipments_RelStructure value) {
        this.equipments = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNote(MultilingualString value) {
        this.note = value;
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

    /**
     * Gets the value of the constrained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstrained() {
        return constrained;
    }

    /**
     * Sets the value of the constrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstrained(Boolean value) {
        this.constrained = value;
    }

    public Call_VersionedChildStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    public Call_VersionedChildStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    public Call_VersionedChildStructure withScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        setScheduledStopPointView(value);
        return this;
    }

    public Call_VersionedChildStructure withOnwardTimingLinkView(OnwardTimingLinkView value) {
        setOnwardTimingLinkView(value);
        return this;
    }

    public Call_VersionedChildStructure withOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        setOnwardServiceLinkRef(value);
        return this;
    }

    public Call_VersionedChildStructure withOnwardServiceLinkView(OnwardServiceLinkView value) {
        setOnwardServiceLinkView(value);
        return this;
    }

    public Call_VersionedChildStructure withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    public Call_VersionedChildStructure withServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        setServiceJourneyRef(value);
        return this;
    }

    public Call_VersionedChildStructure withPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    public Call_VersionedChildStructure withArrival(ArrivalStructure value) {
        setArrival(value);
        return this;
    }

    public Call_VersionedChildStructure withDeparture(DepartureStructure value) {
        setDeparture(value);
        return this;
    }

    public Call_VersionedChildStructure withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    public Call_VersionedChildStructure withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    public Call_VersionedChildStructure withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    public Call_VersionedChildStructure withVias(Vias_RelStructure value) {
        setVias(value);
        return this;
    }

    public Call_VersionedChildStructure withFlexiblePointProperties(FlexiblePointProperties value) {
        setFlexiblePointProperties(value);
        return this;
    }

    public Call_VersionedChildStructure withChangeOfDestinationDisplay(Boolean value) {
        setChangeOfDestinationDisplay(value);
        return this;
    }

    public Call_VersionedChildStructure withChangeOfServiceRequirements(Boolean value) {
        setChangeOfServiceRequirements(value);
        return this;
    }

    public Call_VersionedChildStructure withNoticeAssignments(Call_VersionedChildStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    public Call_VersionedChildStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public Call_VersionedChildStructure withRequestMethod(RequestMethodTypeEnumeration value) {
        setRequestMethod(value);
        return this;
    }

    public Call_VersionedChildStructure withStopUse(StopUseEnumeration value) {
        setStopUse(value);
        return this;
    }

    public Call_VersionedChildStructure withBookingArrangements(BookingArrangementsStructure value) {
        setBookingArrangements(value);
        return this;
    }

    public Call_VersionedChildStructure withPrint(Boolean value) {
        setPrint(value);
        return this;
    }

    public Call_VersionedChildStructure withDynamic(DynamicAdvertisementEnumeration value) {
        setDynamic(value);
        return this;
    }

    public Call_VersionedChildStructure withPassengerCarryingRequirementRef(PassengerCarryingRequirementRefStructure value) {
        setPassengerCarryingRequirementRef(value);
        return this;
    }

    public Call_VersionedChildStructure withPassengerCarryingRequirementsView(PassengerCarryingRequirementsView value) {
        setPassengerCarryingRequirementsView(value);
        return this;
    }

    public Call_VersionedChildStructure withTrainSize(TrainSizeStructure value) {
        setTrainSize(value);
        return this;
    }

    public Call_VersionedChildStructure withEquipments(VehicleEquipments_RelStructure value) {
        setEquipments(value);
        return this;
    }

    public Call_VersionedChildStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    public Call_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public Call_VersionedChildStructure withConstrained(Boolean value) {
        setConstrained(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Call_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Call_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Call_VersionedChildStructure withId(String value) {
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
     *     &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NoticeAssignments
        extends NoticeAssignments_RelStructure
    {


        @Override
        public Call_VersionedChildStructure.NoticeAssignments withNoticeAssignment_OrNoticeAssignmentView(JAXBElement<?> ... values) {
            if (values!= null) {
                for (JAXBElement<?> value: values) {
                    getNoticeAssignment_OrNoticeAssignmentView().add(value);
                }
            }
            return this;
        }

        @Override
        public Call_VersionedChildStructure.NoticeAssignments withNoticeAssignment_OrNoticeAssignmentView(Collection<JAXBElement<?>> values) {
            if (values!= null) {
                getNoticeAssignment_OrNoticeAssignmentView().addAll(values);
            }
            return this;
        }

        @Override
        public Call_VersionedChildStructure.NoticeAssignments withModificationSet(ModificationSetEnumeration value) {
            setModificationSet(value);
            return this;
        }

        @Override
        public Call_VersionedChildStructure.NoticeAssignments withId(String value) {
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