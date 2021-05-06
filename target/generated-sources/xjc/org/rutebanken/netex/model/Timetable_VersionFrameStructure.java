//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Timetable_VersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Timetable_VersionFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimetableFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timetable_VersionFrameStructure", propOrder = {
    "vehicleModes",
    "headwayService",
    "monitored",
    "networkView",
    "lineView",
    "operatorView",
    "serviceCalendarFrameRef",
    "defaultMode",
    "journeyAccountingRef",
    "bookingTimes",
    "accessibilityAssessment",
    "vehicleTypeRef",
    "timeDemandTypes",
    "timeDemandTypeAssignments",
    "timingLinkGroups",
    "vehicleJourneys",
    "frequencyGroups",
    "groupsOfServices",
    "trainNumbers",
    "journeyPartCouples",
    "coupledJourneys",
    "serviceFacilitySets",
    "typesOfService",
    "flexibleServiceProperties",
    "vehicleJourneyStopAssignments",
    "notices",
    "noticeAssignments",
    "journeyMeetings",
    "journeyInterchanges",
    "defaultInterchanges",
    "interchangeRules",
    "vehicleTypes",
    "journeyAccountings"
})
@XmlSeeAlso({
    TimetableFrame.class
})
public class Timetable_VersionFrameStructure
    extends Common_VersionFrameStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<VehicleModeEnumeration> vehicleModes;
    @XmlElement(name = "HeadwayService")
    protected Boolean headwayService;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "NetworkView")
    protected NetworkView networkView;
    @XmlElement(name = "LineView")
    protected LineView lineView;
    @XmlElement(name = "OperatorView")
    protected OperatorView operatorView;
    @XmlElement(name = "ServiceCalendarFrameRef")
    protected ServiceCalendarFrameRef serviceCalendarFrameRef;
    @XmlElement(name = "DefaultMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModeEnumeration defaultMode;
    @XmlElement(name = "JourneyAccountingRef")
    protected JourneyAccountingRefStructure journeyAccountingRef;
    protected ContainedAvailabilityConditions_RelStructure bookingTimes;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment accessibilityAssessment;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    protected TimeDemandTypesInFrame_RelStructure timeDemandTypes;
    protected TimeDemandTypeAssignmentsInFrame_RelStructure timeDemandTypeAssignments;
    protected GroupOfLinksInFrame_RelStructure timingLinkGroups;
    protected JourneysInFrame_RelStructure vehicleJourneys;
    protected FrequencyGroupsInFrame_RelStructure frequencyGroups;
    protected GroupsOfServicesInFrame_RelStructure groupsOfServices;
    protected TrainNumbersInFrame_RelStructure trainNumbers;
    protected JourneyPartCouplesInFrame_RelStructure journeyPartCouples;
    protected CoupledJourneysInFrame_RelStructure coupledJourneys;
    protected ServiceFacilitySetsInFrame_RelStructure serviceFacilitySets;
    protected TypesOfServiceInFrame_RelStructure typesOfService;
    protected FlexibleServicePropertiesInFrame_RelStructure flexibleServiceProperties;
    protected VehicleJourneyStopAssignmentsInFrame_RelStructure vehicleJourneyStopAssignments;
    protected NoticesInFrame_RelStructure notices;
    protected NoticeAssignmentsInFrame_RelStructure noticeAssignments;
    protected JourneyMeetingsInFrame_RelStructure journeyMeetings;
    protected JourneyInterchangesInFrame_RelStructure journeyInterchanges;
    protected DefaultInterchangseInFrame_RelStructure defaultInterchanges;
    protected InterchangeRulesInFrame_RelStructure interchangeRules;
    protected VehicleTypesInFrame_RelStructure vehicleTypes;
    protected JourneyAccountingsInFrame_RelStructure journeyAccountings;

    /**
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModeEnumeration }
     * 
     * 
     */
    public List<VehicleModeEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<VehicleModeEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Gets the value of the headwayService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Sets the value of the headwayService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    /**
     * Gets the value of the monitored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the networkView property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkView }
     *     
     */
    public NetworkView getNetworkView() {
        return networkView;
    }

    /**
     * Sets the value of the networkView property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkView }
     *     
     */
    public void setNetworkView(NetworkView value) {
        this.networkView = value;
    }

    /**
     * Gets the value of the lineView property.
     * 
     * @return
     *     possible object is
     *     {@link LineView }
     *     
     */
    public LineView getLineView() {
        return lineView;
    }

    /**
     * Sets the value of the lineView property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineView }
     *     
     */
    public void setLineView(LineView value) {
        this.lineView = value;
    }

    /**
     * Gets the value of the operatorView property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorView }
     *     
     */
    public OperatorView getOperatorView() {
        return operatorView;
    }

    /**
     * Sets the value of the operatorView property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorView }
     *     
     */
    public void setOperatorView(OperatorView value) {
        this.operatorView = value;
    }

    /**
     * Gets the value of the serviceCalendarFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public ServiceCalendarFrameRef getServiceCalendarFrameRef() {
        return serviceCalendarFrameRef;
    }

    /**
     * Sets the value of the serviceCalendarFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public void setServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        this.serviceCalendarFrameRef = value;
    }

    /**
     * Gets the value of the defaultMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public VehicleModeEnumeration getDefaultMode() {
        return defaultMode;
    }

    /**
     * Sets the value of the defaultMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public void setDefaultMode(VehicleModeEnumeration value) {
        this.defaultMode = value;
    }

    /**
     * Gets the value of the journeyAccountingRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAccountingRefStructure }
     *     
     */
    public JourneyAccountingRefStructure getJourneyAccountingRef() {
        return journeyAccountingRef;
    }

    /**
     * Sets the value of the journeyAccountingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAccountingRefStructure }
     *     
     */
    public void setJourneyAccountingRef(JourneyAccountingRefStructure value) {
        this.journeyAccountingRef = value;
    }

    /**
     * Gets the value of the bookingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ContainedAvailabilityConditions_RelStructure }
     *     
     */
    public ContainedAvailabilityConditions_RelStructure getBookingTimes() {
        return bookingTimes;
    }

    /**
     * Sets the value of the bookingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainedAvailabilityConditions_RelStructure }
     *     
     */
    public void setBookingTimes(ContainedAvailabilityConditions_RelStructure value) {
        this.bookingTimes = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public AccessibilityAssessment getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the vehicleTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Sets the value of the vehicleTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Gets the value of the timeDemandTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypesInFrame_RelStructure }
     *     
     */
    public TimeDemandTypesInFrame_RelStructure getTimeDemandTypes() {
        return timeDemandTypes;
    }

    /**
     * Sets the value of the timeDemandTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypesInFrame_RelStructure }
     *     
     */
    public void setTimeDemandTypes(TimeDemandTypesInFrame_RelStructure value) {
        this.timeDemandTypes = value;
    }

    /**
     * Gets the value of the timeDemandTypeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeAssignmentsInFrame_RelStructure }
     *     
     */
    public TimeDemandTypeAssignmentsInFrame_RelStructure getTimeDemandTypeAssignments() {
        return timeDemandTypeAssignments;
    }

    /**
     * Sets the value of the timeDemandTypeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeAssignmentsInFrame_RelStructure }
     *     
     */
    public void setTimeDemandTypeAssignments(TimeDemandTypeAssignmentsInFrame_RelStructure value) {
        this.timeDemandTypeAssignments = value;
    }

    /**
     * Gets the value of the timingLinkGroups property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinksInFrame_RelStructure }
     *     
     */
    public GroupOfLinksInFrame_RelStructure getTimingLinkGroups() {
        return timingLinkGroups;
    }

    /**
     * Sets the value of the timingLinkGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinksInFrame_RelStructure }
     *     
     */
    public void setTimingLinkGroups(GroupOfLinksInFrame_RelStructure value) {
        this.timingLinkGroups = value;
    }

    /**
     * Gets the value of the vehicleJourneys property.
     * 
     * @return
     *     possible object is
     *     {@link JourneysInFrame_RelStructure }
     *     
     */
    public JourneysInFrame_RelStructure getVehicleJourneys() {
        return vehicleJourneys;
    }

    /**
     * Sets the value of the vehicleJourneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneysInFrame_RelStructure }
     *     
     */
    public void setVehicleJourneys(JourneysInFrame_RelStructure value) {
        this.vehicleJourneys = value;
    }

    /**
     * Gets the value of the frequencyGroups property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyGroupsInFrame_RelStructure }
     *     
     */
    public FrequencyGroupsInFrame_RelStructure getFrequencyGroups() {
        return frequencyGroups;
    }

    /**
     * Sets the value of the frequencyGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyGroupsInFrame_RelStructure }
     *     
     */
    public void setFrequencyGroups(FrequencyGroupsInFrame_RelStructure value) {
        this.frequencyGroups = value;
    }

    /**
     * Gets the value of the groupsOfServices property.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfServicesInFrame_RelStructure }
     *     
     */
    public GroupsOfServicesInFrame_RelStructure getGroupsOfServices() {
        return groupsOfServices;
    }

    /**
     * Sets the value of the groupsOfServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfServicesInFrame_RelStructure }
     *     
     */
    public void setGroupsOfServices(GroupsOfServicesInFrame_RelStructure value) {
        this.groupsOfServices = value;
    }

    /**
     * Gets the value of the trainNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumbersInFrame_RelStructure }
     *     
     */
    public TrainNumbersInFrame_RelStructure getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Sets the value of the trainNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumbersInFrame_RelStructure }
     *     
     */
    public void setTrainNumbers(TrainNumbersInFrame_RelStructure value) {
        this.trainNumbers = value;
    }

    /**
     * Gets the value of the journeyPartCouples property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartCouplesInFrame_RelStructure }
     *     
     */
    public JourneyPartCouplesInFrame_RelStructure getJourneyPartCouples() {
        return journeyPartCouples;
    }

    /**
     * Sets the value of the journeyPartCouples property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartCouplesInFrame_RelStructure }
     *     
     */
    public void setJourneyPartCouples(JourneyPartCouplesInFrame_RelStructure value) {
        this.journeyPartCouples = value;
    }

    /**
     * Gets the value of the coupledJourneys property.
     * 
     * @return
     *     possible object is
     *     {@link CoupledJourneysInFrame_RelStructure }
     *     
     */
    public CoupledJourneysInFrame_RelStructure getCoupledJourneys() {
        return coupledJourneys;
    }

    /**
     * Sets the value of the coupledJourneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoupledJourneysInFrame_RelStructure }
     *     
     */
    public void setCoupledJourneys(CoupledJourneysInFrame_RelStructure value) {
        this.coupledJourneys = value;
    }

    /**
     * Gets the value of the serviceFacilitySets property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetsInFrame_RelStructure }
     *     
     */
    public ServiceFacilitySetsInFrame_RelStructure getServiceFacilitySets() {
        return serviceFacilitySets;
    }

    /**
     * Sets the value of the serviceFacilitySets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetsInFrame_RelStructure }
     *     
     */
    public void setServiceFacilitySets(ServiceFacilitySetsInFrame_RelStructure value) {
        this.serviceFacilitySets = value;
    }

    /**
     * Gets the value of the typesOfService property.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfServiceInFrame_RelStructure }
     *     
     */
    public TypesOfServiceInFrame_RelStructure getTypesOfService() {
        return typesOfService;
    }

    /**
     * Sets the value of the typesOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfServiceInFrame_RelStructure }
     *     
     */
    public void setTypesOfService(TypesOfServiceInFrame_RelStructure value) {
        this.typesOfService = value;
    }

    /**
     * Gets the value of the flexibleServiceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleServicePropertiesInFrame_RelStructure }
     *     
     */
    public FlexibleServicePropertiesInFrame_RelStructure getFlexibleServiceProperties() {
        return flexibleServiceProperties;
    }

    /**
     * Sets the value of the flexibleServiceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleServicePropertiesInFrame_RelStructure }
     *     
     */
    public void setFlexibleServiceProperties(FlexibleServicePropertiesInFrame_RelStructure value) {
        this.flexibleServiceProperties = value;
    }

    /**
     * Gets the value of the vehicleJourneyStopAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyStopAssignmentsInFrame_RelStructure }
     *     
     */
    public VehicleJourneyStopAssignmentsInFrame_RelStructure getVehicleJourneyStopAssignments() {
        return vehicleJourneyStopAssignments;
    }

    /**
     * Sets the value of the vehicleJourneyStopAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyStopAssignmentsInFrame_RelStructure }
     *     
     */
    public void setVehicleJourneyStopAssignments(VehicleJourneyStopAssignmentsInFrame_RelStructure value) {
        this.vehicleJourneyStopAssignments = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link NoticesInFrame_RelStructure }
     *     
     */
    public NoticesInFrame_RelStructure getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticesInFrame_RelStructure }
     *     
     */
    public void setNotices(NoticesInFrame_RelStructure value) {
        this.notices = value;
    }

    /**
     * Gets the value of the noticeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignmentsInFrame_RelStructure }
     *     
     */
    public NoticeAssignmentsInFrame_RelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignmentsInFrame_RelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignmentsInFrame_RelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Gets the value of the journeyMeetings property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyMeetingsInFrame_RelStructure }
     *     
     */
    public JourneyMeetingsInFrame_RelStructure getJourneyMeetings() {
        return journeyMeetings;
    }

    /**
     * Sets the value of the journeyMeetings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyMeetingsInFrame_RelStructure }
     *     
     */
    public void setJourneyMeetings(JourneyMeetingsInFrame_RelStructure value) {
        this.journeyMeetings = value;
    }

    /**
     * Gets the value of the journeyInterchanges property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInterchangesInFrame_RelStructure }
     *     
     */
    public JourneyInterchangesInFrame_RelStructure getJourneyInterchanges() {
        return journeyInterchanges;
    }

    /**
     * Sets the value of the journeyInterchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInterchangesInFrame_RelStructure }
     *     
     */
    public void setJourneyInterchanges(JourneyInterchangesInFrame_RelStructure value) {
        this.journeyInterchanges = value;
    }

    /**
     * Gets the value of the defaultInterchanges property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultInterchangseInFrame_RelStructure }
     *     
     */
    public DefaultInterchangseInFrame_RelStructure getDefaultInterchanges() {
        return defaultInterchanges;
    }

    /**
     * Sets the value of the defaultInterchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultInterchangseInFrame_RelStructure }
     *     
     */
    public void setDefaultInterchanges(DefaultInterchangseInFrame_RelStructure value) {
        this.defaultInterchanges = value;
    }

    /**
     * Gets the value of the interchangeRules property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRulesInFrame_RelStructure }
     *     
     */
    public InterchangeRulesInFrame_RelStructure getInterchangeRules() {
        return interchangeRules;
    }

    /**
     * Sets the value of the interchangeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRulesInFrame_RelStructure }
     *     
     */
    public void setInterchangeRules(InterchangeRulesInFrame_RelStructure value) {
        this.interchangeRules = value;
    }

    /**
     * Gets the value of the vehicleTypes property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypesInFrame_RelStructure }
     *     
     */
    public VehicleTypesInFrame_RelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Sets the value of the vehicleTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypesInFrame_RelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypesInFrame_RelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Gets the value of the journeyAccountings property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyAccountingsInFrame_RelStructure }
     *     
     */
    public JourneyAccountingsInFrame_RelStructure getJourneyAccountings() {
        return journeyAccountings;
    }

    /**
     * Sets the value of the journeyAccountings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyAccountingsInFrame_RelStructure }
     *     
     */
    public void setJourneyAccountings(JourneyAccountingsInFrame_RelStructure value) {
        this.journeyAccountings = value;
    }

    public Timetable_VersionFrameStructure withVehicleModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getVehicleModes().add(value);
            }
        }
        return this;
    }

    public Timetable_VersionFrameStructure withVehicleModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getVehicleModes().addAll(values);
        }
        return this;
    }

    public Timetable_VersionFrameStructure withHeadwayService(Boolean value) {
        setHeadwayService(value);
        return this;
    }

    public Timetable_VersionFrameStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    public Timetable_VersionFrameStructure withNetworkView(NetworkView value) {
        setNetworkView(value);
        return this;
    }

    public Timetable_VersionFrameStructure withLineView(LineView value) {
        setLineView(value);
        return this;
    }

    public Timetable_VersionFrameStructure withOperatorView(OperatorView value) {
        setOperatorView(value);
        return this;
    }

    public Timetable_VersionFrameStructure withServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        setServiceCalendarFrameRef(value);
        return this;
    }

    public Timetable_VersionFrameStructure withDefaultMode(VehicleModeEnumeration value) {
        setDefaultMode(value);
        return this;
    }

    public Timetable_VersionFrameStructure withJourneyAccountingRef(JourneyAccountingRefStructure value) {
        setJourneyAccountingRef(value);
        return this;
    }

    public Timetable_VersionFrameStructure withBookingTimes(ContainedAvailabilityConditions_RelStructure value) {
        setBookingTimes(value);
        return this;
    }

    public Timetable_VersionFrameStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public Timetable_VersionFrameStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    public Timetable_VersionFrameStructure withTimeDemandTypes(TimeDemandTypesInFrame_RelStructure value) {
        setTimeDemandTypes(value);
        return this;
    }

    public Timetable_VersionFrameStructure withTimeDemandTypeAssignments(TimeDemandTypeAssignmentsInFrame_RelStructure value) {
        setTimeDemandTypeAssignments(value);
        return this;
    }

    public Timetable_VersionFrameStructure withTimingLinkGroups(GroupOfLinksInFrame_RelStructure value) {
        setTimingLinkGroups(value);
        return this;
    }

    public Timetable_VersionFrameStructure withVehicleJourneys(JourneysInFrame_RelStructure value) {
        setVehicleJourneys(value);
        return this;
    }

    public Timetable_VersionFrameStructure withFrequencyGroups(FrequencyGroupsInFrame_RelStructure value) {
        setFrequencyGroups(value);
        return this;
    }

    public Timetable_VersionFrameStructure withGroupsOfServices(GroupsOfServicesInFrame_RelStructure value) {
        setGroupsOfServices(value);
        return this;
    }

    public Timetable_VersionFrameStructure withTrainNumbers(TrainNumbersInFrame_RelStructure value) {
        setTrainNumbers(value);
        return this;
    }

    public Timetable_VersionFrameStructure withJourneyPartCouples(JourneyPartCouplesInFrame_RelStructure value) {
        setJourneyPartCouples(value);
        return this;
    }

    public Timetable_VersionFrameStructure withCoupledJourneys(CoupledJourneysInFrame_RelStructure value) {
        setCoupledJourneys(value);
        return this;
    }

    public Timetable_VersionFrameStructure withServiceFacilitySets(ServiceFacilitySetsInFrame_RelStructure value) {
        setServiceFacilitySets(value);
        return this;
    }

    public Timetable_VersionFrameStructure withTypesOfService(TypesOfServiceInFrame_RelStructure value) {
        setTypesOfService(value);
        return this;
    }

    public Timetable_VersionFrameStructure withFlexibleServiceProperties(FlexibleServicePropertiesInFrame_RelStructure value) {
        setFlexibleServiceProperties(value);
        return this;
    }

    public Timetable_VersionFrameStructure withVehicleJourneyStopAssignments(VehicleJourneyStopAssignmentsInFrame_RelStructure value) {
        setVehicleJourneyStopAssignments(value);
        return this;
    }

    public Timetable_VersionFrameStructure withNotices(NoticesInFrame_RelStructure value) {
        setNotices(value);
        return this;
    }

    public Timetable_VersionFrameStructure withNoticeAssignments(NoticeAssignmentsInFrame_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    public Timetable_VersionFrameStructure withJourneyMeetings(JourneyMeetingsInFrame_RelStructure value) {
        setJourneyMeetings(value);
        return this;
    }

    public Timetable_VersionFrameStructure withJourneyInterchanges(JourneyInterchangesInFrame_RelStructure value) {
        setJourneyInterchanges(value);
        return this;
    }

    public Timetable_VersionFrameStructure withDefaultInterchanges(DefaultInterchangseInFrame_RelStructure value) {
        setDefaultInterchanges(value);
        return this;
    }

    public Timetable_VersionFrameStructure withInterchangeRules(InterchangeRulesInFrame_RelStructure value) {
        setInterchangeRules(value);
        return this;
    }

    public Timetable_VersionFrameStructure withVehicleTypes(VehicleTypesInFrame_RelStructure value) {
        setVehicleTypes(value);
        return this;
    }

    public Timetable_VersionFrameStructure withJourneyAccountings(JourneyAccountingsInFrame_RelStructure value) {
        setJourneyAccountings(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withContentValidityConditions(AvailabilityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withValidityConditions(AvailabilityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Timetable_VersionFrameStructure withId(String value) {
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
