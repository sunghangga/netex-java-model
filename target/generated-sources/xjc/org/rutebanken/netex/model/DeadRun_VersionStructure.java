//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
 * <p>Java class for DeadRun_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeadRun_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleJourney_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRun_VersionStructure", propOrder = {
    "operatorRef",
    "lineRef",
    "directionType",
    "groupsOfServices",
    "trainNumbers",
    "origin",
    "destination",
    "deadRunType"
})
@XmlSeeAlso({
    DeadRunWithCalls_VersionStructure.class
})
public class DeadRun_VersionStructure
    extends VehicleJourney_VersionStructure
{

    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    protected GroupOfServicesRefs_RelStructure groupsOfServices;
    protected TrainNumberRefs_RelStructure trainNumbers;
    @XmlElement(name = "Origin")
    protected DeadRunEndpointStructure origin;
    @XmlElement(name = "Destination")
    protected DeadRunEndpointStructure destination;
    @XmlElement(name = "DeadRunType")
    @XmlSchemaType(name = "NMTOKEN")
    protected DeadRunTypeEnumeration deadRunType;

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
     * Gets the value of the directionType property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Sets the value of the directionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Gets the value of the groupsOfServices property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefs_RelStructure }
     *     
     */
    public GroupOfServicesRefs_RelStructure getGroupsOfServices() {
        return groupsOfServices;
    }

    /**
     * Sets the value of the groupsOfServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefs_RelStructure }
     *     
     */
    public void setGroupsOfServices(GroupOfServicesRefs_RelStructure value) {
        this.groupsOfServices = value;
    }

    /**
     * Gets the value of the trainNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefs_RelStructure }
     *     
     */
    public TrainNumberRefs_RelStructure getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Sets the value of the trainNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefs_RelStructure }
     *     
     */
    public void setTrainNumbers(TrainNumberRefs_RelStructure value) {
        this.trainNumbers = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public DeadRunEndpointStructure getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public void setOrigin(DeadRunEndpointStructure value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public DeadRunEndpointStructure getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunEndpointStructure }
     *     
     */
    public void setDestination(DeadRunEndpointStructure value) {
        this.destination = value;
    }

    /**
     * Gets the value of the deadRunType property.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunTypeEnumeration }
     *     
     */
    public DeadRunTypeEnumeration getDeadRunType() {
        return deadRunType;
    }

    /**
     * Sets the value of the deadRunType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunTypeEnumeration }
     *     
     */
    public void setDeadRunType(DeadRunTypeEnumeration value) {
        this.deadRunType = value;
    }

    public DeadRun_VersionStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public DeadRun_VersionStructure withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    public DeadRun_VersionStructure withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    public DeadRun_VersionStructure withGroupsOfServices(GroupOfServicesRefs_RelStructure value) {
        setGroupsOfServices(value);
        return this;
    }

    public DeadRun_VersionStructure withTrainNumbers(TrainNumberRefs_RelStructure value) {
        setTrainNumbers(value);
        return this;
    }

    public DeadRun_VersionStructure withOrigin(DeadRunEndpointStructure value) {
        setOrigin(value);
        return this;
    }

    public DeadRun_VersionStructure withDestination(DeadRunEndpointStructure value) {
        setDestination(value);
        return this;
    }

    public DeadRun_VersionStructure withDeadRunType(DeadRunTypeEnumeration value) {
        setDeadRunType(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDepartureTime(LocalTime value) {
        setDepartureTime(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withJourneyDuration(Duration value) {
        setJourneyDuration(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDayTypes(DayTypeRefs_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        setJourneyPatternRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTimingAlgorithmTypeRef(TimingAlgorithmTypeRefStructure value) {
        setTimingAlgorithmTypeRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withJourneyFrequencyGroupRef(JAXBElement<? extends JourneyFrequencyGroupRefStructure> value) {
        setJourneyFrequencyGroupRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        setBlockRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withCourseOfJourneysRef(CourseOfJourneysRefStructure value) {
        setCourseOfJourneysRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTimeDemandTypes(TimeDemandTypeRefs_RelStructure value) {
        setTimeDemandTypes(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withParts(JourneyParts_RelStructure value) {
        setParts(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTrainComponentLabelAssignments(TrainComponentLabelAssignments_RelStructure value) {
        setTrainComponentLabelAssignments(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withVehicleJourneyStopAssignments(VehicleJourneyStopAssignments_RelStructure value) {
        setVehicleJourneyStopAssignments(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withWaitTimes(VehicleJourneyWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withRunTimes(VehicleJourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withLayovers(VehicleJourneyLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withPassingTimes(TimetabledPassingTimes_RelStructure value) {
        setPassingTimes(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withExternalVehicleJourneyRef(ExternalObjectRefStructure value) {
        setExternalVehicleJourneyRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        setLinkSequenceProjectionRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withLinkSequenceProjection(LinkSequenceProjection value) {
        setLinkSequenceProjection(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withJourneyAccountings(JourneyAccountings_RelStructure value) {
        setJourneyAccountings(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DeadRun_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DeadRun_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DeadRun_VersionStructure withId(String value) {
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
