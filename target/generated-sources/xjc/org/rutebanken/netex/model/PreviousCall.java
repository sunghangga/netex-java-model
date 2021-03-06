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
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PreviousCall_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}CallGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PreviousCallGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PreviousCallIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PreviousCall")
public class PreviousCall
    extends PreviousCall_VersionedChildStructure
{


    @Override
    public PreviousCall withTargetPassingTimeView(TargetPassingTimeView value) {
        setTargetPassingTimeView(value);
        return this;
    }

    @Override
    public PreviousCall withEstimatedPassingTimeView(EstimatedPassingTime_ViewStructure value) {
        setEstimatedPassingTimeView(value);
        return this;
    }

    @Override
    public PreviousCall withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public PreviousCall withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public PreviousCall withScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        setScheduledStopPointView(value);
        return this;
    }

    @Override
    public PreviousCall withOnwardTimingLinkView(OnwardTimingLinkView value) {
        setOnwardTimingLinkView(value);
        return this;
    }

    @Override
    public PreviousCall withOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        setOnwardServiceLinkRef(value);
        return this;
    }

    @Override
    public PreviousCall withOnwardServiceLinkView(OnwardServiceLinkView value) {
        setOnwardServiceLinkView(value);
        return this;
    }

    @Override
    public PreviousCall withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    @Override
    public PreviousCall withServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        setServiceJourneyRef(value);
        return this;
    }

    @Override
    public PreviousCall withPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    @Override
    public PreviousCall withArrival(ArrivalStructure value) {
        setArrival(value);
        return this;
    }

    @Override
    public PreviousCall withDeparture(DepartureStructure value) {
        setDeparture(value);
        return this;
    }

    @Override
    public PreviousCall withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public PreviousCall withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    @Override
    public PreviousCall withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    @Override
    public PreviousCall withVias(Vias_RelStructure value) {
        setVias(value);
        return this;
    }

    @Override
    public PreviousCall withFlexiblePointProperties(FlexiblePointProperties value) {
        setFlexiblePointProperties(value);
        return this;
    }

    @Override
    public PreviousCall withChangeOfDestinationDisplay(Boolean value) {
        setChangeOfDestinationDisplay(value);
        return this;
    }

    @Override
    public PreviousCall withChangeOfServiceRequirements(Boolean value) {
        setChangeOfServiceRequirements(value);
        return this;
    }

    @Override
    public PreviousCall withNoticeAssignments(org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public PreviousCall withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    @Override
    public PreviousCall withRequestMethod(RequestMethodTypeEnumeration value) {
        setRequestMethod(value);
        return this;
    }

    @Override
    public PreviousCall withStopUse(StopUseEnumeration value) {
        setStopUse(value);
        return this;
    }

    @Override
    public PreviousCall withBookingArrangements(BookingArrangementsStructure value) {
        setBookingArrangements(value);
        return this;
    }

    @Override
    public PreviousCall withPrint(Boolean value) {
        setPrint(value);
        return this;
    }

    @Override
    public PreviousCall withDynamic(DynamicAdvertisementEnumeration value) {
        setDynamic(value);
        return this;
    }

    @Override
    public PreviousCall withPassengerCarryingRequirementRef(PassengerCarryingRequirementRefStructure value) {
        setPassengerCarryingRequirementRef(value);
        return this;
    }

    @Override
    public PreviousCall withPassengerCarryingRequirementsView(PassengerCarryingRequirementsView value) {
        setPassengerCarryingRequirementsView(value);
        return this;
    }

    @Override
    public PreviousCall withTrainSize(TrainSizeStructure value) {
        setTrainSize(value);
        return this;
    }

    @Override
    public PreviousCall withEquipments(VehicleEquipments_RelStructure value) {
        setEquipments(value);
        return this;
    }

    @Override
    public PreviousCall withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public PreviousCall withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PreviousCall withConstrained(Boolean value) {
        setConstrained(value);
        return this;
    }

    @Override
    public PreviousCall withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PreviousCall withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PreviousCall withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PreviousCall withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PreviousCall withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PreviousCall withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PreviousCall withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PreviousCall withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PreviousCall withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PreviousCall withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PreviousCall withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PreviousCall withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PreviousCall withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PreviousCall withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PreviousCall withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PreviousCall withId(String value) {
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
