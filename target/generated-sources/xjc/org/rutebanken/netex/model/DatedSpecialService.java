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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}DatedSpecialService_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}SpecialServiceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}DatedVehicleJourneyReferencesGroup"/&gt;
 *             &lt;element name="datedPassingTimes" type="{http://www.netex.org.uk/netex}targetPassingTimes_RelStructure" minOccurs="0"/&gt;
 *             &lt;element name="datedCalls" type="{http://www.netex.org.uk/netex}datedCalls_RelStructure" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}DatedSpecialServiceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DatedSpecialService
    extends DatedSpecialService_VersionStructure
{


    @Override
    public DatedSpecialService withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withExternalDatedVehicleJourneyRef(ExternalObjectRefStructure value) {
        setExternalDatedVehicleJourneyRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withDatedJourneyPatternRef(JourneyPatternRefStructure value) {
        setDatedJourneyPatternRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withDriverRef(DriverRefStructure value) {
        setDriverRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withDatedPassingTimes(TargetPassingTimes_RelStructure value) {
        setDatedPassingTimes(value);
        return this;
    }

    @Override
    public DatedSpecialService withDatedCalls(DatedCalls_RelStructure value) {
        setDatedCalls(value);
        return this;
    }

    @Override
    public DatedSpecialService withDepartureTime(LocalTime value) {
        setDepartureTime(value);
        return this;
    }

    @Override
    public DatedSpecialService withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    @Override
    public DatedSpecialService withFrequency(FrequencyStructure value) {
        setFrequency(value);
        return this;
    }

    @Override
    public DatedSpecialService withJourneyDuration(Duration value) {
        setJourneyDuration(value);
        return this;
    }

    @Override
    public DatedSpecialService withClient(MultilingualString value) {
        setClient(value);
        return this;
    }

    @Override
    public DatedSpecialService withDayTypes(DayTypeRefs_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    @Override
    public DatedSpecialService withJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        setJourneyPatternRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withOrigin(JourneyEndpointStructure value) {
        setOrigin(value);
        return this;
    }

    @Override
    public DatedSpecialService withDestination(JourneyEndpointStructure value) {
        setDestination(value);
        return this;
    }

    @Override
    public DatedSpecialService withPrint(Boolean value) {
        setPrint(value);
        return this;
    }

    @Override
    public DatedSpecialService withDynamic(DynamicAdvertisementEnumeration value) {
        setDynamic(value);
        return this;
    }

    @Override
    public DatedSpecialService withTypeOfFlexibleServiceRef(TypeOfFlexibleServiceRefStructure value) {
        setTypeOfFlexibleServiceRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withFlexibleServiceType(FlexibleServiceEnumeration value) {
        setFlexibleServiceType(value);
        return this;
    }

    @Override
    public DatedSpecialService withCancellationPossible(Boolean value) {
        setCancellationPossible(value);
        return this;
    }

    @Override
    public DatedSpecialService withChangeOfTimePossible(Boolean value) {
        setChangeOfTimePossible(value);
        return this;
    }

    @Override
    public DatedSpecialService withBookingContact(ContactStructure value) {
        setBookingContact(value);
        return this;
    }

    @Override
    public DatedSpecialService withBookingMethods(BookingMethodEnumeration... values) {
        if (values!= null) {
            for (BookingMethodEnumeration value: values) {
                getBookingMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public DatedSpecialService withBookingMethods(Collection<BookingMethodEnumeration> values) {
        if (values!= null) {
            getBookingMethods().addAll(values);
        }
        return this;
    }

    @Override
    public DatedSpecialService withBookingAccess(BookingAccessEnumeration value) {
        setBookingAccess(value);
        return this;
    }

    @Override
    public DatedSpecialService withBookWhen(PurchaseWhenEnumeration value) {
        setBookWhen(value);
        return this;
    }

    @Override
    public DatedSpecialService withBuyWhen(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getBuyWhen().add(value);
            }
        }
        return this;
    }

    @Override
    public DatedSpecialService withBuyWhen(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getBuyWhen().addAll(values);
        }
        return this;
    }

    @Override
    public DatedSpecialService withLatestBookingTime(LocalTime value) {
        setLatestBookingTime(value);
        return this;
    }

    @Override
    public DatedSpecialService withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    @Override
    public DatedSpecialService withBookingUrl(String value) {
        setBookingUrl(value);
        return this;
    }

    @Override
    public DatedSpecialService withBookingNote(MultilingualString value) {
        setBookingNote(value);
        return this;
    }

    @Override
    public DatedSpecialService withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public DatedSpecialService withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public DatedSpecialService withExternalVehicleJourneyRef(ExternalObjectRefStructure value) {
        setExternalVehicleJourneyRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withLinkSequenceProjectionRef(LinkSequenceProjectionRefStructure value) {
        setLinkSequenceProjectionRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withLinkSequenceProjection(LinkSequenceProjection value) {
        setLinkSequenceProjection(value);
        return this;
    }

    @Override
    public DatedSpecialService withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public DatedSpecialService withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public DatedSpecialService withJourneyAccountings(JourneyAccountings_RelStructure value) {
        setJourneyAccountings(value);
        return this;
    }

    @Override
    public DatedSpecialService withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public DatedSpecialService withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DatedSpecialService withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public DatedSpecialService withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DatedSpecialService withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public DatedSpecialService withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public DatedSpecialService withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public DatedSpecialService withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public DatedSpecialService withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public DatedSpecialService withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DatedSpecialService withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DatedSpecialService withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DatedSpecialService withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DatedSpecialService withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DatedSpecialService withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DatedSpecialService withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DatedSpecialService withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DatedSpecialService withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DatedSpecialService withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DatedSpecialService withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DatedSpecialService withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DatedSpecialService withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DatedSpecialService withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DatedSpecialService withId(String value) {
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
