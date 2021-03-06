//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ServiceJourneyInterchange_DerivedViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyInterchange_DerivedViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceJourneyInterchangeRef" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangePropertyGroup"/&gt;
 *         &lt;element name="noticeAssignments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.netex.org.uk/netex}noticeAssignments_RelStructure"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ConnectingJourneyRef" type="{http://www.netex.org.uk/netex}VehicleJourneyRefStructure"/&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}ConnectingJourneyView"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ConnectingLineView" type="{http://www.netex.org.uk/netex}Line_DerivedViewStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}InterchangeTimesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyInterchange_DerivedViewStructure", propOrder = {
    "serviceJourneyInterchangeRef",
    "description",
    "staySeated",
    "crossBorder",
    "planned",
    "guaranteed",
    "advertised",
    "controlled",
    "connectionCertainty",
    "noticeAssignments",
    "connectingJourneyRef",
    "connectingJourneyView",
    "connectingLineView",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime",
    "controlCentreNotifyThreshold"
})
public class ServiceJourneyInterchange_DerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "ServiceJourneyInterchangeRef")
    protected ServiceJourneyInterchangeRefStructure serviceJourneyInterchangeRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
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
    protected ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments noticeAssignments;
    @XmlElement(name = "ConnectingJourneyRef")
    protected VehicleJourneyRefStructure connectingJourneyRef;
    @XmlElement(name = "ConnectingJourneyView")
    protected ConnectingJourney_DerivedViewStructure connectingJourneyView;
    @XmlElement(name = "ConnectingLineView")
    protected Line_DerivedViewStructure connectingLineView;
    @XmlElement(name = "StandardWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumTransferTime;
    @XmlElement(name = "ControlCentreNotifyThreshold", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration controlCentreNotifyThreshold;

    /**
     * Gets the value of the serviceJourneyInterchangeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyInterchangeRefStructure }
     *     
     */
    public ServiceJourneyInterchangeRefStructure getServiceJourneyInterchangeRef() {
        return serviceJourneyInterchangeRef;
    }

    /**
     * Sets the value of the serviceJourneyInterchangeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyInterchangeRefStructure }
     *     
     */
    public void setServiceJourneyInterchangeRef(ServiceJourneyInterchangeRefStructure value) {
        this.serviceJourneyInterchangeRef = value;
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
     * Gets the value of the noticeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments }
     *     
     */
    public ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments }
     *     
     */
    public void setNoticeAssignments(ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments value) {
        this.noticeAssignments = value;
    }

    /**
     * Gets the value of the connectingJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getConnectingJourneyRef() {
        return connectingJourneyRef;
    }

    /**
     * Sets the value of the connectingJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setConnectingJourneyRef(VehicleJourneyRefStructure value) {
        this.connectingJourneyRef = value;
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
     * Gets the value of the standardWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Sets the value of the standardWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
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
     * Gets the value of the maximumAutomaticWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Sets the value of the maximumAutomaticWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    /**
     * Gets the value of the standardTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Sets the value of the standardTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    /**
     * Gets the value of the minimumTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Sets the value of the minimumTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    /**
     * Gets the value of the maximumTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Sets the value of the maximumTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

    /**
     * Gets the value of the controlCentreNotifyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getControlCentreNotifyThreshold() {
        return controlCentreNotifyThreshold;
    }

    /**
     * Sets the value of the controlCentreNotifyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlCentreNotifyThreshold(Duration value) {
        this.controlCentreNotifyThreshold = value;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withServiceJourneyInterchangeRef(ServiceJourneyInterchangeRefStructure value) {
        setServiceJourneyInterchangeRef(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withNoticeAssignments(ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withConnectingJourneyRef(VehicleJourneyRefStructure value) {
        setConnectingJourneyRef(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withConnectingJourneyView(ConnectingJourney_DerivedViewStructure value) {
        setConnectingJourneyView(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withConnectingLineView(Line_DerivedViewStructure value) {
        setConnectingLineView(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    public ServiceJourneyInterchange_DerivedViewStructure withControlCentreNotifyThreshold(Duration value) {
        setControlCentreNotifyThreshold(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchange_DerivedViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchange_DerivedViewStructure withId(String value) {
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
        public ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments withNoticeAssignment_OrNoticeAssignmentView(JAXBElement<?> ... values) {
            if (values!= null) {
                for (JAXBElement<?> value: values) {
                    getNoticeAssignment_OrNoticeAssignmentView().add(value);
                }
            }
            return this;
        }

        @Override
        public ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments withNoticeAssignment_OrNoticeAssignmentView(Collection<JAXBElement<?>> values) {
            if (values!= null) {
                getNoticeAssignment_OrNoticeAssignmentView().addAll(values);
            }
            return this;
        }

        @Override
        public ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments withModificationSet(ModificationSetEnumeration value) {
            setModificationSet(value);
            return this;
        }

        @Override
        public ServiceJourneyInterchange_DerivedViewStructure.NoticeAssignments withId(String value) {
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
