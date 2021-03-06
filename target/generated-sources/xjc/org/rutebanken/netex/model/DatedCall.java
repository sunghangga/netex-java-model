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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}DatedCall_VersionedChildStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}DatedCallGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}DatedCallIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DatedCall
    extends DatedCall_VersionedChildStructure
{


    @Override
    public DatedCall withDriverRef(DriverRefStructure value) {
        setDriverRef(value);
        return this;
    }

    @Override
    public DatedCall withArrivalDate(LocalDateTime value) {
        setArrivalDate(value);
        return this;
    }

    @Override
    public DatedCall withDepartureDate(LocalDateTime value) {
        setDepartureDate(value);
        return this;
    }

    @Override
    public DatedCall withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public DatedCall withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public DatedCall withScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        setScheduledStopPointView(value);
        return this;
    }

    @Override
    public DatedCall withOnwardTimingLinkView(OnwardTimingLinkView value) {
        setOnwardTimingLinkView(value);
        return this;
    }

    @Override
    public DatedCall withOnwardServiceLinkRef(ServiceLinkRefStructure value) {
        setOnwardServiceLinkRef(value);
        return this;
    }

    @Override
    public DatedCall withOnwardServiceLinkView(OnwardServiceLinkView value) {
        setOnwardServiceLinkView(value);
        return this;
    }

    @Override
    public DatedCall withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    @Override
    public DatedCall withServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        setServiceJourneyRef(value);
        return this;
    }

    @Override
    public DatedCall withPointInJourneyPatternRef(PointInJourneyPatternRefStructure value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    @Override
    public DatedCall withArrival(ArrivalStructure value) {
        setArrival(value);
        return this;
    }

    @Override
    public DatedCall withDeparture(DepartureStructure value) {
        setDeparture(value);
        return this;
    }

    @Override
    public DatedCall withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public DatedCall withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    @Override
    public DatedCall withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    @Override
    public DatedCall withVias(Vias_RelStructure value) {
        setVias(value);
        return this;
    }

    @Override
    public DatedCall withFlexiblePointProperties(FlexiblePointProperties value) {
        setFlexiblePointProperties(value);
        return this;
    }

    @Override
    public DatedCall withChangeOfDestinationDisplay(Boolean value) {
        setChangeOfDestinationDisplay(value);
        return this;
    }

    @Override
    public DatedCall withChangeOfServiceRequirements(Boolean value) {
        setChangeOfServiceRequirements(value);
        return this;
    }

    @Override
    public DatedCall withNoticeAssignments(org.rutebanken.netex.model.Call_VersionedChildStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public DatedCall withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    @Override
    public DatedCall withRequestMethod(RequestMethodTypeEnumeration value) {
        setRequestMethod(value);
        return this;
    }

    @Override
    public DatedCall withStopUse(StopUseEnumeration value) {
        setStopUse(value);
        return this;
    }

    @Override
    public DatedCall withBookingArrangements(BookingArrangementsStructure value) {
        setBookingArrangements(value);
        return this;
    }

    @Override
    public DatedCall withPrint(Boolean value) {
        setPrint(value);
        return this;
    }

    @Override
    public DatedCall withDynamic(DynamicAdvertisementEnumeration value) {
        setDynamic(value);
        return this;
    }

    @Override
    public DatedCall withPassengerCarryingRequirementRef(PassengerCarryingRequirementRefStructure value) {
        setPassengerCarryingRequirementRef(value);
        return this;
    }

    @Override
    public DatedCall withPassengerCarryingRequirementsView(PassengerCarryingRequirementsView value) {
        setPassengerCarryingRequirementsView(value);
        return this;
    }

    @Override
    public DatedCall withTrainSize(TrainSizeStructure value) {
        setTrainSize(value);
        return this;
    }

    @Override
    public DatedCall withEquipments(VehicleEquipments_RelStructure value) {
        setEquipments(value);
        return this;
    }

    @Override
    public DatedCall withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public DatedCall withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public DatedCall withConstrained(Boolean value) {
        setConstrained(value);
        return this;
    }

    @Override
    public DatedCall withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DatedCall withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DatedCall withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DatedCall withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DatedCall withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DatedCall withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DatedCall withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DatedCall withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DatedCall withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DatedCall withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DatedCall withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DatedCall withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DatedCall withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DatedCall withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DatedCall withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DatedCall withId(String value) {
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
