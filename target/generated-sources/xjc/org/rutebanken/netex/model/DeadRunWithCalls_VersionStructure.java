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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DeadRunWithCalls_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeadRunWithCalls_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DeadRun_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunWithCallsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRunWithCalls_VersionStructure", propOrder = {
    "calls"
})
@XmlSeeAlso({
    DeadRun.class
})
public class DeadRunWithCalls_VersionStructure
    extends DeadRun_VersionStructure
{

    protected DeadRunCalls_RelStructure calls;

    /**
     * Gets the value of the calls property.
     * 
     * @return
     *     possible object is
     *     {@link DeadRunCalls_RelStructure }
     *     
     */
    public DeadRunCalls_RelStructure getCalls() {
        return calls;
    }

    /**
     * Sets the value of the calls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadRunCalls_RelStructure }
     *     
     */
    public void setCalls(DeadRunCalls_RelStructure value) {
        this.calls = value;
    }

    public DeadRunWithCalls_VersionStructure withCalls(DeadRunCalls_RelStructure value) {
        setCalls(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withGroupsOfServices(GroupOfServicesRefs_RelStructure value) {
        setGroupsOfServices(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTrainNumbers(TrainNumberRefs_RelStructure value) {
        setTrainNumbers(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withOrigin(DeadRunEndpointStructure value) {
        setOrigin(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDestination(DeadRunEndpointStructure value) {
        setDestination(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDeadRunType(DeadRunTypeEnumeration value) {
        setDeadRunType(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDepartureTime(LocalTime value) {
        setDepartureTime(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withJourneyDuration(Duration value) {
        setJourneyDuration(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDayTypes(DayTypeRefs_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        setJourneyPatternRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTimingAlgorithmTypeRef(TimingAlgorithmTypeRefStructure value) {
        setTimingAlgorithmTypeRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withJourneyFrequencyGroupRef(JAXBElement<? extends JourneyFrequencyGroupRefStructure> value) {
        setJourneyFrequencyGroupRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        setBlockRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withCourseOfJourneysRef(CourseOfJourneysRefStructure value) {
        setCourseOfJourneysRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTimeDemandTypes(TimeDemandTypeRefs_RelStructure value) {
        setTimeDemandTypes(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withParts(JourneyParts_RelStructure value) {
        setParts(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTrainComponentLabelAssignments(TrainComponentLabelAssignments_RelStructure value) {
        setTrainComponentLabelAssignments(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withVehicleJourneyStopAssignments(VehicleJourneyStopAssignments_RelStructure value) {
        setVehicleJourneyStopAssignments(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withWaitTimes(VehicleJourneyWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withRunTimes(VehicleJourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withLayovers(VehicleJourneyLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withPassingTimes(TimetabledPassingTimes_RelStructure value) {
        setPassingTimes(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withExternalVehicleJourneyRef(ExternalObjectRefStructure value) {
        setExternalVehicleJourneyRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        setLinkSequenceProjectionRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withLinkSequenceProjection(LinkSequenceProjection value) {
        setLinkSequenceProjection(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withJourneyAccountings(JourneyAccountings_RelStructure value) {
        setJourneyAccountings(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DeadRunWithCalls_VersionStructure withId(String value) {
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
