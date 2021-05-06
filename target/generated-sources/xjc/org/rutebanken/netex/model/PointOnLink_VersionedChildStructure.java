//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 * <p>Java class for PointOnLink_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOnLink_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOnLinkGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOnLink_VersionedChildStructure", propOrder = {
    "name",
    "linkRef",
    "distanceFromStart",
    "pointRef",
    "point"
})
@XmlSeeAlso({
    PointOnLink.class
})
public class PointOnLink_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "LinkRef")
    protected LinkRefStructure linkRef;
    @XmlElement(name = "DistanceFromStart")
    protected BigDecimal distanceFromStart;
    @XmlElementRef(name = "PointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointRefStructure> pointRef;
    @XmlElementRef(name = "Point", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Point_VersionStructure> point;
    @XmlAttribute(name = "order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;

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
     * Gets the value of the linkRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getLinkRef() {
        return linkRef;
    }

    /**
     * Sets the value of the linkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setLinkRef(LinkRefStructure value) {
        this.linkRef = value;
    }

    /**
     * Gets the value of the distanceFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Sets the value of the distanceFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanceFromStart(BigDecimal value) {
        this.distanceFromStart = value;
    }

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
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayJunction }{@code >}
     *     
     */
    public JAXBElement<? extends Point_VersionStructure> getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link BeaconPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TrafficControlPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructurePoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link BorderPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPoint_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoutePoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadJunction }{@code >}
     *     {@link JAXBElement }{@code <}{@link Point_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParkingPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPoint }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayJunction }{@code >}
     *     
     */
    public void setPoint(JAXBElement<? extends Point_VersionStructure> value) {
        this.point = value;
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

    public PointOnLink_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public PointOnLink_VersionedChildStructure withLinkRef(LinkRefStructure value) {
        setLinkRef(value);
        return this;
    }

    public PointOnLink_VersionedChildStructure withDistanceFromStart(BigDecimal value) {
        setDistanceFromStart(value);
        return this;
    }

    public PointOnLink_VersionedChildStructure withPointRef(JAXBElement<? extends PointRefStructure> value) {
        setPointRef(value);
        return this;
    }

    public PointOnLink_VersionedChildStructure withPoint(JAXBElement<? extends Point_VersionStructure> value) {
        setPoint(value);
        return this;
    }

    public PointOnLink_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointOnLink_VersionedChildStructure withId(String value) {
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