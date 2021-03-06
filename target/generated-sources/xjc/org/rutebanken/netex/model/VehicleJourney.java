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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}VehicleJourney_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LinkSequenceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyGroup"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehicleJourneyGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}VehicleJourneyIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class VehicleJourney
    extends VehicleJourney_VersionStructure
{


    @Override
    public VehicleJourney withDepartureTime(LocalTime value) {
        setDepartureTime(value);
        return this;
    }

    @Override
    public VehicleJourney withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    @Override
    public VehicleJourney withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public VehicleJourney withJourneyDuration(Duration value) {
        setJourneyDuration(value);
        return this;
    }

    @Override
    public VehicleJourney withDayTypes(DayTypeRefs_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    @Override
    public VehicleJourney withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    @Override
    public VehicleJourney withJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        setJourneyPatternRef(value);
        return this;
    }

    @Override
    public VehicleJourney withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public VehicleJourney withTimingAlgorithmTypeRef(TimingAlgorithmTypeRefStructure value) {
        setTimingAlgorithmTypeRef(value);
        return this;
    }

    @Override
    public VehicleJourney withJourneyFrequencyGroupRef(JAXBElement<? extends JourneyFrequencyGroupRefStructure> value) {
        setJourneyFrequencyGroupRef(value);
        return this;
    }

    @Override
    public VehicleJourney withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    @Override
    public VehicleJourney withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public VehicleJourney withBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        setBlockRef(value);
        return this;
    }

    @Override
    public VehicleJourney withCourseOfJourneysRef(CourseOfJourneysRefStructure value) {
        setCourseOfJourneysRef(value);
        return this;
    }

    @Override
    public VehicleJourney withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public VehicleJourney withTimeDemandTypes(TimeDemandTypeRefs_RelStructure value) {
        setTimeDemandTypes(value);
        return this;
    }

    @Override
    public VehicleJourney withParts(JourneyParts_RelStructure value) {
        setParts(value);
        return this;
    }

    @Override
    public VehicleJourney withTrainComponentLabelAssignments(TrainComponentLabelAssignments_RelStructure value) {
        setTrainComponentLabelAssignments(value);
        return this;
    }

    @Override
    public VehicleJourney withVehicleJourneyStopAssignments(VehicleJourneyStopAssignments_RelStructure value) {
        setVehicleJourneyStopAssignments(value);
        return this;
    }

    @Override
    public VehicleJourney withWaitTimes(VehicleJourneyWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public VehicleJourney withRunTimes(VehicleJourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public VehicleJourney withLayovers(VehicleJourneyLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public VehicleJourney withPassingTimes(TimetabledPassingTimes_RelStructure value) {
        setPassingTimes(value);
        return this;
    }

    @Override
    public VehicleJourney withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public VehicleJourney withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public VehicleJourney withExternalVehicleJourneyRef(ExternalObjectRefStructure value) {
        setExternalVehicleJourneyRef(value);
        return this;
    }

    @Override
    public VehicleJourney withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public VehicleJourney withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public VehicleJourney withLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        setLinkSequenceProjectionRef(value);
        return this;
    }

    @Override
    public VehicleJourney withLinkSequenceProjection(LinkSequenceProjection value) {
        setLinkSequenceProjection(value);
        return this;
    }

    @Override
    public VehicleJourney withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public VehicleJourney withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public VehicleJourney withJourneyAccountings(JourneyAccountings_RelStructure value) {
        setJourneyAccountings(value);
        return this;
    }

    @Override
    public VehicleJourney withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public VehicleJourney withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleJourney withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public VehicleJourney withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public VehicleJourney withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public VehicleJourney withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public VehicleJourney withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public VehicleJourney withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public VehicleJourney withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public VehicleJourney withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleJourney withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleJourney withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleJourney withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleJourney withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleJourney withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleJourney withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleJourney withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleJourney withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleJourney withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleJourney withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleJourney withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleJourney withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleJourney withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleJourney withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleJourney withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleJourney withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleJourney withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleJourney withId(String value) {
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
