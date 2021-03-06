//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ServiceFacilitySet_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FacilitySetGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ServiceFacilitySetGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ServiceFacilitySetIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ServiceFacilitySet
    extends ServiceFacilitySet_VersionStructure
{


    @Override
    public ServiceFacilitySet withVehicleAccessFacilityList(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getVehicleAccessFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withVehicleAccessFacilityList(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getVehicleAccessFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccommodationAccessList(AccommodationAccessEnumeration... values) {
        if (values!= null) {
            for (AccommodationAccessEnumeration value: values) {
                getAccommodationAccessList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccommodationAccessList(Collection<AccommodationAccessEnumeration> values) {
        if (values!= null) {
            getAccommodationAccessList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccommodationFacilityList(AccommodationFacilityEnumeration... values) {
        if (values!= null) {
            for (AccommodationFacilityEnumeration value: values) {
                getAccommodationFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccommodationFacilityList(Collection<AccommodationFacilityEnumeration> values) {
        if (values!= null) {
            getAccommodationFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withBoardingPermission(BoardingPermissionEnumeration value) {
        setBoardingPermission(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withBookingProcessFacilityList(BookingProcessEnumeration... values) {
        if (values!= null) {
            for (BookingProcessEnumeration value: values) {
                getBookingProcessFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withBookingProcessFacilityList(Collection<BookingProcessEnumeration> values) {
        if (values!= null) {
            getBookingProcessFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCouchetteFacilityList(CouchetteFacilityEnumeration... values) {
        if (values!= null) {
            for (CouchetteFacilityEnumeration value: values) {
                getCouchetteFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCouchetteFacilityList(Collection<CouchetteFacilityEnumeration> values) {
        if (values!= null) {
            getCouchetteFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withGroupBookingFacility(GroupBookingEnumeration value) {
        setGroupBookingFacility(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withLuggageCarriageFacilityList(LuggageCarriageEnumeration... values) {
        if (values!= null) {
            for (LuggageCarriageEnumeration value: values) {
                getLuggageCarriageFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withLuggageCarriageFacilityList(Collection<LuggageCarriageEnumeration> values) {
        if (values!= null) {
            getLuggageCarriageFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withServiceReservationFacilityList(ReservationEnumeration... values) {
        if (values!= null) {
            for (ReservationEnumeration value: values) {
                getServiceReservationFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withServiceReservationFacilityList(Collection<ReservationEnumeration> values) {
        if (values!= null) {
            getServiceReservationFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withUicProductCharacteristicList(UicProductCharacteristicEnumeration... values) {
        if (values!= null) {
            for (UicProductCharacteristicEnumeration value: values) {
                getUicProductCharacteristicList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withUicProductCharacteristicList(Collection<UicProductCharacteristicEnumeration> values) {
        if (values!= null) {
            getUicProductCharacteristicList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withUicTrainRate(UicRateTypeEnumeration value) {
        setUicTrainRate(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withAccommodations(Accommodations_RelStructure value) {
        setAccommodations(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withOnboardStays(OnboardStays_RelStructure value) {
        setOnboardStays(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withProvidedByRef(OrganisationRefStructure value) {
        setProvidedByRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withTypeOfFacilityRef(TypeOfFacilityRefStructure value) {
        setTypeOfFacilityRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withOtherFacilities(TypesOfEquipment_RelStructure value) {
        setOtherFacilities(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withAccessibilityInfoFacilityList(AccessibilityInfoFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessibilityInfoFacilityEnumeration value: values) {
                getAccessibilityInfoFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccessibilityInfoFacilityList(Collection<AccessibilityInfoFacilityEnumeration> values) {
        if (values!= null) {
            getAccessibilityInfoFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAssistanceFacilityList(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAssistanceFacilityList(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccessibilityToolList(AccessibilityToolEnumeration... values) {
        if (values!= null) {
            for (AccessibilityToolEnumeration value: values) {
                getAccessibilityToolList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAccessibilityToolList(Collection<AccessibilityToolEnumeration> values) {
        if (values!= null) {
            getAccessibilityToolList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCarServiceFacilityList(CarServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (CarServiceFacilityEnumeration value: values) {
                getCarServiceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCarServiceFacilityList(Collection<CarServiceFacilityEnumeration> values) {
        if (values!= null) {
            getCarServiceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCateringFacilityList(CateringFacilityEnumeration... values) {
        if (values!= null) {
            for (CateringFacilityEnumeration value: values) {
                getCateringFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withCateringFacilityList(Collection<CateringFacilityEnumeration> values) {
        if (values!= null) {
            getCateringFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withFamilyFacilityList(FamilyFacilityEnumeration... values) {
        if (values!= null) {
            for (FamilyFacilityEnumeration value: values) {
                getFamilyFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withFamilyFacilityList(Collection<FamilyFacilityEnumeration> values) {
        if (values!= null) {
            getFamilyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withFareClasses(FareClassEnumeration... values) {
        if (values!= null) {
            for (FareClassEnumeration value: values) {
                getFareClasses().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withFareClasses(Collection<FareClassEnumeration> values) {
        if (values!= null) {
            getFareClasses().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withGenderLimitation(GenderLimitationEnumeration value) {
        setGenderLimitation(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withMealFacilityList(MealFacilityEnumeration... values) {
        if (values!= null) {
            for (MealFacilityEnumeration value: values) {
                getMealFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withMealFacilityList(Collection<MealFacilityEnumeration> values) {
        if (values!= null) {
            getMealFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withMedicalFacilityList(MedicalFacilityEnumeration... values) {
        if (values!= null) {
            for (MedicalFacilityEnumeration value: values) {
                getMedicalFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withMedicalFacilityList(Collection<MedicalFacilityEnumeration> values) {
        if (values!= null) {
            getMedicalFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withMobilityFacilityList(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withMobilityFacilityList(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withNuisanceFacilityList(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withNuisanceFacilityList(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withPassengerCommsFacilityList(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withPassengerCommsFacilityList(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withPassengerInformationEquipmentList(PassengerInformationEquipmentEnumeration value) {
        setPassengerInformationEquipmentList(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withPassengerInformationFacilityList(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withPassengerInformationFacilityList(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withRetailFacilityList(RetailFacilityEnumeration... values) {
        if (values!= null) {
            for (RetailFacilityEnumeration value: values) {
                getRetailFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withRetailFacilityList(Collection<RetailFacilityEnumeration> values) {
        if (values!= null) {
            getRetailFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withSafetyFacilityList(SafetyFacilityEnumeration... values) {
        if (values!= null) {
            for (SafetyFacilityEnumeration value: values) {
                getSafetyFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withSafetyFacilityList(Collection<SafetyFacilityEnumeration> values) {
        if (values!= null) {
            getSafetyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withSanitaryFacilityList(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withSanitaryFacilityList(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withTicketingFacilityList(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withTicketingFacilityList(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withTicketingServiceFacilityList(TicketingServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingServiceFacilityEnumeration value: values) {
                getTicketingServiceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withTicketingServiceFacilityList(Collection<TicketingServiceFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingServiceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFacilitySet withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceFacilitySet withId(String value) {
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
