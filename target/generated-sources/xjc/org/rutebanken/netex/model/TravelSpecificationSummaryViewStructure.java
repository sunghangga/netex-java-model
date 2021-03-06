//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Java class for TravelSpecificationSummaryViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelSpecificationSummaryViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Origin" type="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndpointStructure" minOccurs="0"/&gt;
 *         &lt;element name="Destination" type="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndpointStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryJourneyGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryFareGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummarySeatingGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSpecificationSummaryViewStructure", propOrder = {
    "origin",
    "destination",
    "start",
    "end",
    "duration",
    "journeys",
    "seriesConstraints",
    "operatorRef",
    "groupOfOperatorsRef",
    "typeOfProductCategoryRef",
    "typeOfFareProductRef",
    "fareClass",
    "classOfUseRef",
    "userProfileRef",
    "groupTicketRef",
    "maximumNumberOfUsers",
    "trainElementRef",
    "trainComponentLabelAssignmentRef",
    "passengerSeatRef",
    "serviceFacilitySet"
})
public class TravelSpecificationSummaryViewStructure {

    @XmlElement(name = "Origin")
    protected TravelSpecificationSummaryEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected TravelSpecificationSummaryEndpointStructure destination;
    @XmlElement(name = "Start", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime start;
    @XmlElement(name = "End", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime end;
    @XmlElement(name = "Duration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    protected TravelSpecificationJourneyRefs_RelStructure journeys;
    protected SeriesConstraintRefs_RelStructure seriesConstraints;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfFareProductRef")
    protected TypeOfFareProductRefStructure typeOfFareProductRef;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElementRef(name = "UserProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UserProfileRefStructure> userProfileRef;
    @XmlElement(name = "GroupTicketRef")
    protected GroupTicketRefStructure groupTicketRef;
    @XmlElement(name = "MaximumNumberOfUsers")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfUsers;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementRefStructure trainElementRef;
    @XmlElement(name = "TrainComponentLabelAssignmentRef")
    protected TrainComponentLabelAssignmentRefStructure trainComponentLabelAssignmentRef;
    @XmlElement(name = "PassengerSeatRef")
    protected PassengerSeatRefStructure passengerSeatRef;
    @XmlElement(name = "ServiceFacilitySet")
    protected ServiceFacilitySet serviceFacilitySet;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public TravelSpecificationSummaryEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public void setOrigin(TravelSpecificationSummaryEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public TravelSpecificationSummaryEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationSummaryEndpointStructure }
     *     
     */
    public void setDestination(TravelSpecificationSummaryEndpointStructure value) {
        this.destination = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(LocalDateTime value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(LocalDateTime value) {
        this.end = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the journeys property.
     * 
     * @return
     *     possible object is
     *     {@link TravelSpecificationJourneyRefs_RelStructure }
     *     
     */
    public TravelSpecificationJourneyRefs_RelStructure getJourneys() {
        return journeys;
    }

    /**
     * Sets the value of the journeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSpecificationJourneyRefs_RelStructure }
     *     
     */
    public void setJourneys(TravelSpecificationJourneyRefs_RelStructure value) {
        this.journeys = value;
    }

    /**
     * Gets the value of the seriesConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesConstraintRefs_RelStructure }
     *     
     */
    public SeriesConstraintRefs_RelStructure getSeriesConstraints() {
        return seriesConstraints;
    }

    /**
     * Sets the value of the seriesConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesConstraintRefs_RelStructure }
     *     
     */
    public void setSeriesConstraints(SeriesConstraintRefs_RelStructure value) {
        this.seriesConstraints = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the groupOfOperatorsRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public GroupOfOperatorsRefStructure getGroupOfOperatorsRef() {
        return groupOfOperatorsRef;
    }

    /**
     * Sets the value of the groupOfOperatorsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public void setGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        this.groupOfOperatorsRef = value;
    }

    /**
     * Gets the value of the typeOfProductCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Sets the value of the typeOfProductCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Gets the value of the typeOfFareProductRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public TypeOfFareProductRefStructure getTypeOfFareProductRef() {
        return typeOfFareProductRef;
    }

    /**
     * Sets the value of the typeOfFareProductRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public void setTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        this.typeOfFareProductRef = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
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
     * Gets the value of the userProfileRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UserProfileRefStructure> getUserProfileRef() {
        return userProfileRef;
    }

    /**
     * Sets the value of the userProfileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     
     */
    public void setUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        this.userProfileRef = value;
    }

    /**
     * Gets the value of the groupTicketRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupTicketRefStructure }
     *     
     */
    public GroupTicketRefStructure getGroupTicketRef() {
        return groupTicketRef;
    }

    /**
     * Sets the value of the groupTicketRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupTicketRefStructure }
     *     
     */
    public void setGroupTicketRef(GroupTicketRefStructure value) {
        this.groupTicketRef = value;
    }

    /**
     * Gets the value of the maximumNumberOfUsers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfUsers() {
        return maximumNumberOfUsers;
    }

    /**
     * Sets the value of the maximumNumberOfUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfUsers(BigInteger value) {
        this.maximumNumberOfUsers = value;
    }

    /**
     * Gets the value of the trainElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public TrainElementRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Sets the value of the trainElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Gets the value of the trainComponentLabelAssignmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentLabelAssignmentRefStructure }
     *     
     */
    public TrainComponentLabelAssignmentRefStructure getTrainComponentLabelAssignmentRef() {
        return trainComponentLabelAssignmentRef;
    }

    /**
     * Sets the value of the trainComponentLabelAssignmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentLabelAssignmentRefStructure }
     *     
     */
    public void setTrainComponentLabelAssignmentRef(TrainComponentLabelAssignmentRefStructure value) {
        this.trainComponentLabelAssignmentRef = value;
    }

    /**
     * Gets the value of the passengerSeatRef property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerSeatRefStructure }
     *     
     */
    public PassengerSeatRefStructure getPassengerSeatRef() {
        return passengerSeatRef;
    }

    /**
     * Sets the value of the passengerSeatRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerSeatRefStructure }
     *     
     */
    public void setPassengerSeatRef(PassengerSeatRefStructure value) {
        this.passengerSeatRef = value;
    }

    /**
     * Gets the value of the serviceFacilitySet property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySet }
     *     
     */
    public ServiceFacilitySet getServiceFacilitySet() {
        return serviceFacilitySet;
    }

    /**
     * Sets the value of the serviceFacilitySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySet }
     *     
     */
    public void setServiceFacilitySet(ServiceFacilitySet value) {
        this.serviceFacilitySet = value;
    }

    public TravelSpecificationSummaryViewStructure withOrigin(TravelSpecificationSummaryEndpointStructure value) {
        setOrigin(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withDestination(TravelSpecificationSummaryEndpointStructure value) {
        setDestination(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withStart(LocalDateTime value) {
        setStart(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withEnd(LocalDateTime value) {
        setEnd(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withJourneys(TravelSpecificationJourneyRefs_RelStructure value) {
        setJourneys(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withSeriesConstraints(SeriesConstraintRefs_RelStructure value) {
        setSeriesConstraints(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        setGroupOfOperatorsRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        setTypeOfFareProductRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        setUserProfileRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withGroupTicketRef(GroupTicketRefStructure value) {
        setGroupTicketRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withMaximumNumberOfUsers(BigInteger value) {
        setMaximumNumberOfUsers(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withTrainComponentLabelAssignmentRef(TrainComponentLabelAssignmentRefStructure value) {
        setTrainComponentLabelAssignmentRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withPassengerSeatRef(PassengerSeatRefStructure value) {
        setPassengerSeatRef(value);
        return this;
    }

    public TravelSpecificationSummaryViewStructure withServiceFacilitySet(ServiceFacilitySet value) {
        setServiceFacilitySet(value);
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
