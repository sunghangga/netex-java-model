//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java class for JourneyMeeting_DerivedViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyMeeting_DerivedViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyMeetingRef" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyMeetingPropertiesGroup"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="MaximumWaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyMeetingConnectionGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangePropertyGroup"/&gt;
 *         &lt;element name="TransferDuration" type="{http://www.netex.org.uk/netex}TransferDurationStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyMeeting_DerivedViewStructure", propOrder = {
    "journeyMeetingRef",
    "description",
    "earliestTime",
    "earliestTimeDayOffset",
    "latestTime",
    "latestTimeDayOffset",
    "reason",
    "maximumWaitTime",
    "connectionRef",
    "connectingStopPointRef",
    "connectingStopPointName",
    "journeyRef",
    "connectingJourneyView",
    "lineRef",
    "connectingLineView",
    "staySeated",
    "crossBorder",
    "planned",
    "guaranteed",
    "advertised",
    "controlled",
    "connectionCertainty",
    "transferDuration"
})
public class JourneyMeeting_DerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "JourneyMeetingRef")
    protected JourneyMeetingRefStructure journeyMeetingRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "EarliestTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime earliestTime;
    @XmlElement(name = "EarliestTimeDayOffset")
    protected BigInteger earliestTimeDayOffset;
    @XmlElement(name = "LatestTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime latestTime;
    @XmlElement(name = "LatestTimeDayOffset")
    protected BigInteger latestTimeDayOffset;
    @XmlElement(name = "Reason")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReasonForMeetingEnumeration reason;
    @XmlElement(name = "MaximumWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumWaitTime;
    @XmlElement(name = "ConnectionRef")
    protected ConnectionRefStructure connectionRef;
    @XmlElement(name = "ConnectingStopPointRef")
    protected List<ScheduledStopPointRefStructure> connectingStopPointRef;
    @XmlElement(name = "ConnectingStopPointName")
    protected List<MultilingualString> connectingStopPointName;
    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "ConnectingJourneyView")
    protected ConnectingJourney_DerivedViewStructure connectingJourneyView;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "ConnectingLineView")
    protected Line_DerivedViewStructure connectingLineView;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "CrossBorder", defaultValue = "false")
    protected Boolean crossBorder;
    @XmlElement(name = "Planned", defaultValue = "true")
    protected Boolean planned;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "true")
    protected Boolean advertised;
    @XmlElement(name = "Controlled", defaultValue = "true")
    protected Boolean controlled;
    @XmlElement(name = "ConnectionCertainty")
    @XmlSchemaType(name = "NMTOKEN")
    protected ConnectionCertaintyEnumeration connectionCertainty;
    @XmlElement(name = "TransferDuration")
    protected TransferDurationStructure transferDuration;

    /**
     * Gets the value of the journeyMeetingRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyMeetingRefStructure }
     *     
     */
    public JourneyMeetingRefStructure getJourneyMeetingRef() {
        return journeyMeetingRef;
    }

    /**
     * Sets the value of the journeyMeetingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyMeetingRefStructure }
     *     
     */
    public void setJourneyMeetingRef(JourneyMeetingRefStructure value) {
        this.journeyMeetingRef = value;
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
     * Gets the value of the earliestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEarliestTime() {
        return earliestTime;
    }

    /**
     * Sets the value of the earliestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTime(LocalTime value) {
        this.earliestTime = value;
    }

    /**
     * Gets the value of the earliestTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEarliestTimeDayOffset() {
        return earliestTimeDayOffset;
    }

    /**
     * Sets the value of the earliestTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEarliestTimeDayOffset(BigInteger value) {
        this.earliestTimeDayOffset = value;
    }

    /**
     * Gets the value of the latestTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getLatestTime() {
        return latestTime;
    }

    /**
     * Sets the value of the latestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTime(LocalTime value) {
        this.latestTime = value;
    }

    /**
     * Gets the value of the latestTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLatestTimeDayOffset() {
        return latestTimeDayOffset;
    }

    /**
     * Sets the value of the latestTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLatestTimeDayOffset(BigInteger value) {
        this.latestTimeDayOffset = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonForMeetingEnumeration }
     *     
     */
    public ReasonForMeetingEnumeration getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonForMeetingEnumeration }
     *     
     */
    public void setReason(ReasonForMeetingEnumeration value) {
        this.reason = value;
    }

    /**
     * Gets the value of the maximumWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Sets the value of the maximumWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Gets the value of the connectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public ConnectionRefStructure getConnectionRef() {
        return connectionRef;
    }

    /**
     * Sets the value of the connectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionRefStructure }
     *     
     */
    public void setConnectionRef(ConnectionRefStructure value) {
        this.connectionRef = value;
    }

    /**
     * Gets the value of the connectingStopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledStopPointRefStructure }
     * 
     * 
     */
    public List<ScheduledStopPointRefStructure> getConnectingStopPointRef() {
        if (connectingStopPointRef == null) {
            connectingStopPointRef = new ArrayList<ScheduledStopPointRefStructure>();
        }
        return this.connectingStopPointRef;
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectingStopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectingStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getConnectingStopPointName() {
        if (connectingStopPointName == null) {
            connectingStopPointName = new ArrayList<MultilingualString>();
        }
        return this.connectingStopPointName;
    }

    /**
     * Gets the value of the journeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Sets the value of the journeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Gets the value of the connectingJourneyView property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourney_DerivedViewStructure }
     *     
     */
    public ConnectingJourney_DerivedViewStructure getConnectingJourneyView() {
        return connectingJourneyView;
    }

    /**
     * Sets the value of the connectingJourneyView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourney_DerivedViewStructure }
     *     
     */
    public void setConnectingJourneyView(ConnectingJourney_DerivedViewStructure value) {
        this.connectingJourneyView = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the connectingLineView property.
     * 
     * @return
     *     possible object is
     *     {@link Line_DerivedViewStructure }
     *     
     */
    public Line_DerivedViewStructure getConnectingLineView() {
        return connectingLineView;
    }

    /**
     * Sets the value of the connectingLineView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line_DerivedViewStructure }
     *     
     */
    public void setConnectingLineView(Line_DerivedViewStructure value) {
        this.connectingLineView = value;
    }

    /**
     * Gets the value of the staySeated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Sets the value of the staySeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Gets the value of the crossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Sets the value of the crossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Gets the value of the planned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Sets the value of the planned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Gets the value of the guaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Sets the value of the guaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Gets the value of the advertised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Sets the value of the advertised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Gets the value of the controlled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isControlled() {
        return controlled;
    }

    /**
     * Sets the value of the controlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setControlled(Boolean value) {
        this.controlled = value;
    }

    /**
     * Gets the value of the connectionCertainty property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public ConnectionCertaintyEnumeration getConnectionCertainty() {
        return connectionCertainty;
    }

    /**
     * Sets the value of the connectionCertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCertaintyEnumeration }
     *     
     */
    public void setConnectionCertainty(ConnectionCertaintyEnumeration value) {
        this.connectionCertainty = value;
    }

    /**
     * Gets the value of the transferDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TransferDurationStructure }
     *     
     */
    public TransferDurationStructure getTransferDuration() {
        return transferDuration;
    }

    /**
     * Sets the value of the transferDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferDurationStructure }
     *     
     */
    public void setTransferDuration(TransferDurationStructure value) {
        this.transferDuration = value;
    }

    public JourneyMeeting_DerivedViewStructure withJourneyMeetingRef(JourneyMeetingRefStructure value) {
        setJourneyMeetingRef(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withEarliestTime(LocalTime value) {
        setEarliestTime(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withEarliestTimeDayOffset(BigInteger value) {
        setEarliestTimeDayOffset(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withLatestTime(LocalTime value) {
        setLatestTime(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withLatestTimeDayOffset(BigInteger value) {
        setLatestTimeDayOffset(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withReason(ReasonForMeetingEnumeration value) {
        setReason(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectionRef(ConnectionRefStructure value) {
        setConnectionRef(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingStopPointRef(ScheduledStopPointRefStructure... values) {
        if (values!= null) {
            for (ScheduledStopPointRefStructure value: values) {
                getConnectingStopPointRef().add(value);
            }
        }
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingStopPointRef(Collection<ScheduledStopPointRefStructure> values) {
        if (values!= null) {
            getConnectingStopPointRef().addAll(values);
        }
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingStopPointName(MultilingualString... values) {
        if (values!= null) {
            for (MultilingualString value: values) {
                getConnectingStopPointName().add(value);
            }
        }
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingStopPointName(Collection<MultilingualString> values) {
        if (values!= null) {
            getConnectingStopPointName().addAll(values);
        }
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingJourneyView(ConnectingJourney_DerivedViewStructure value) {
        setConnectingJourneyView(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectingLineView(Line_DerivedViewStructure value) {
        setConnectingLineView(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    public JourneyMeeting_DerivedViewStructure withTransferDuration(TransferDurationStructure value) {
        setTransferDuration(value);
        return this;
    }

    @Override
    public JourneyMeeting_DerivedViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public JourneyMeeting_DerivedViewStructure withId(String value) {
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
