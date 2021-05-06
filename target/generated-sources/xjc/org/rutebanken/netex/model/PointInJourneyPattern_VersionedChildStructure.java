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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PointInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointInJourneyPattern_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PointInLinkSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointInJourneyPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointInJourneyPattern_VersionedChildStructure", propOrder = {
    "pointRef",
    "destinationDisplayRef",
    "destinationDisplayView",
    "vias",
    "flexiblePointProperties",
    "changeOfDestinationDisplay",
    "changeOfServiceRequirements",
    "noticeAssignments"
})
@XmlSeeAlso({
    PointInJourneyPattern.class,
    FarePointInPattern_VersionedChildStructure.class
})
public class PointInJourneyPattern_VersionedChildStructure
    extends PointInLinkSequence_VersionedChildStructure
{

    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointRefStructure> pointRef;
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

    /**
     * Gets the value of the pointRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointRefStructure> getPointRef() {
        return pointRef;
    }

    /**
     * Sets the value of the pointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WirePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOnLinkRefStructure }{@code >}
     *     
     */
    public void setPointRef(JAXBElement<? extends PointRefStructure> value) {
        this.pointRef = value;
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

    public PointInJourneyPattern_VersionedChildStructure withPointRef(JAXBElement<? extends PointRefStructure> value) {
        setPointRef(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withVias(Vias_RelStructure value) {
        setVias(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withFlexiblePointProperties(FlexiblePointProperties value) {
        setFlexiblePointProperties(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withChangeOfDestinationDisplay(Boolean value) {
        setChangeOfDestinationDisplay(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withChangeOfServiceRequirements(Boolean value) {
        setChangeOfServiceRequirements(value);
        return this;
    }

    public PointInJourneyPattern_VersionedChildStructure withNoticeAssignments(org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointInJourneyPattern_VersionedChildStructure withId(String value) {
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