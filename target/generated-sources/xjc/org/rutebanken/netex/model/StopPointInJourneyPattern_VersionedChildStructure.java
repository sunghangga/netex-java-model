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
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for StopPointInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPointInJourneyPattern_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPointInJourneyPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPointInJourneyPattern_VersionedChildStructure", propOrder = {
    "scheduledStopPointRef",
    "onwardTimingLinkRef",
    "isWaitPoint",
    "waitTime",
    "waitTimes",
    "headways",
    "onwardServiceLinkRef",
    "forAlighting",
    "forBoarding",
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
    "dynamic"
})
@XmlSeeAlso({
    StopPointInJourneyPattern.class
})
public class StopPointInJourneyPattern_VersionedChildStructure
    extends PointInLinkSequence_VersionedChildStructure
{

    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "OnwardTimingLinkRef")
    protected TimingLinkRefStructure onwardTimingLinkRef;
    @XmlElement(name = "IsWaitPoint", defaultValue = "false")
    protected Boolean isWaitPoint;
    @XmlElement(name = "WaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration waitTime;
    protected JourneyPatternWaitTimes_RelStructure waitTimes;
    protected JourneyPatternHeadways_RelStructure headways;
    @XmlElement(name = "OnwardServiceLinkRef")
    protected ServiceLinkRefStructure onwardServiceLinkRef;
    @XmlElement(name = "ForAlighting", defaultValue = "true")
    protected Boolean forAlighting;
    @XmlElement(name = "ForBoarding", defaultValue = "true")
    protected Boolean forBoarding;
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
    protected org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments noticeAssignments;
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
     * Gets the value of the onwardTimingLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public TimingLinkRefStructure getOnwardTimingLinkRef() {
        return onwardTimingLinkRef;
    }

    /**
     * Sets the value of the onwardTimingLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public void setOnwardTimingLinkRef(TimingLinkRefStructure value) {
        this.onwardTimingLinkRef = value;
    }

    /**
     * Gets the value of the isWaitPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaitPoint() {
        return isWaitPoint;
    }

    /**
     * Sets the value of the isWaitPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaitPoint(Boolean value) {
        this.isWaitPoint = value;
    }

    /**
     * Gets the value of the waitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Sets the value of the waitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

    /**
     * Gets the value of the waitTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternWaitTimes_RelStructure }
     *     
     */
    public JourneyPatternWaitTimes_RelStructure getWaitTimes() {
        return waitTimes;
    }

    /**
     * Sets the value of the waitTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternWaitTimes_RelStructure }
     *     
     */
    public void setWaitTimes(JourneyPatternWaitTimes_RelStructure value) {
        this.waitTimes = value;
    }

    /**
     * Gets the value of the headways property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternHeadways_RelStructure }
     *     
     */
    public JourneyPatternHeadways_RelStructure getHeadways() {
        return headways;
    }

    /**
     * Sets the value of the headways property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternHeadways_RelStructure }
     *     
     */
    public void setHeadways(JourneyPatternHeadways_RelStructure value) {
        this.headways = value;
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
     * Gets the value of the forAlighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForAlighting() {
        return forAlighting;
    }

    /**
     * Sets the value of the forAlighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForAlighting(Boolean value) {
        this.forAlighting = value;
    }

    /**
     * Gets the value of the forBoarding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForBoarding() {
        return forBoarding;
    }

    /**
     * Sets the value of the forBoarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForBoarding(Boolean value) {
        this.forBoarding = value;
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
     *     {@link org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments }
     *     
     */
    public org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments value) {
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

    public StopPointInJourneyPattern_VersionedChildStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withOnwardTimingLinkRef(TimingLinkRefStructure value) {
        setOnwardTimingLinkRef(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withIsWaitPoint(Boolean value) {
        setIsWaitPoint(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withWaitTime(Duration value) {
        setWaitTime(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withWaitTimes(JourneyPatternWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withHeadways(JourneyPatternHeadways_RelStructure value) {
        setHeadways(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        setOnwardServiceLinkRef(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withForAlighting(Boolean value) {
        setForAlighting(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withForBoarding(Boolean value) {
        setForBoarding(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withVias(Vias_RelStructure value) {
        setVias(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withFlexiblePointProperties(FlexiblePointProperties value) {
        setFlexiblePointProperties(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withChangeOfDestinationDisplay(Boolean value) {
        setChangeOfDestinationDisplay(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withChangeOfServiceRequirements(Boolean value) {
        setChangeOfServiceRequirements(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withNoticeAssignments(org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withRequestMethod(RequestMethodTypeEnumeration value) {
        setRequestMethod(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withStopUse(StopUseEnumeration value) {
        setStopUse(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withBookingArrangements(BookingArrangementsStructure value) {
        setBookingArrangements(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withPrint(Boolean value) {
        setPrint(value);
        return this;
    }

    public StopPointInJourneyPattern_VersionedChildStructure withDynamic(DynamicAdvertisementEnumeration value) {
        setDynamic(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public StopPointInJourneyPattern_VersionedChildStructure withId(String value) {
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
