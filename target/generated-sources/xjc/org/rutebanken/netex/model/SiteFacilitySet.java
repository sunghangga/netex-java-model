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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}SiteFacilitySetStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteFacilitySetGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}SiteFacilitySetIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class SiteFacilitySet
    extends SiteFacilitySetStructure
{


    @Override
    public SiteFacilitySet withAccessFacilityList(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAccessFacilityList(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withEmergencyServiceList(EmergencyServiceEnumeration... values) {
        if (values!= null) {
            for (EmergencyServiceEnumeration value: values) {
                getEmergencyServiceList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withEmergencyServiceList(Collection<EmergencyServiceEnumeration> values) {
        if (values!= null) {
            getEmergencyServiceList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withHireFacilityList(HireFacilityEnumeration... values) {
        if (values!= null) {
            for (HireFacilityEnumeration value: values) {
                getHireFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withHireFacilityList(Collection<HireFacilityEnumeration> values) {
        if (values!= null) {
            getHireFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withLuggageLockerFacilityList(LuggageLockerFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageLockerFacilityEnumeration value: values) {
                getLuggageLockerFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withLuggageLockerFacilityList(Collection<LuggageLockerFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageLockerFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withLuggageServiceFacilityList(LuggageServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageServiceFacilityEnumeration value: values) {
                getLuggageServiceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withLuggageServiceFacilityList(Collection<LuggageServiceFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageServiceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMoneyFacilityList(MoneyFacilityEnumeration... values) {
        if (values!= null) {
            for (MoneyFacilityEnumeration value: values) {
                getMoneyFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMoneyFacilityList(Collection<MoneyFacilityEnumeration> values) {
        if (values!= null) {
            getMoneyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withParkingFacilityList(ParkingFacilityEnumeration... values) {
        if (values!= null) {
            for (ParkingFacilityEnumeration value: values) {
                getParkingFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withParkingFacilityList(Collection<ParkingFacilityEnumeration> values) {
        if (values!= null) {
            getParkingFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withStaffing(StaffingEnumeration value) {
        setStaffing(value);
        return this;
    }

    @Override
    public SiteFacilitySet withProvidedByRef(OrganisationRefStructure value) {
        setProvidedByRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SiteFacilitySet withTypeOfFacilityRef(TypeOfFacilityRefStructure value) {
        setTypeOfFacilityRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withOtherFacilities(TypesOfEquipment_RelStructure value) {
        setOtherFacilities(value);
        return this;
    }

    @Override
    public SiteFacilitySet withAccessibilityInfoFacilityList(AccessibilityInfoFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessibilityInfoFacilityEnumeration value: values) {
                getAccessibilityInfoFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAccessibilityInfoFacilityList(Collection<AccessibilityInfoFacilityEnumeration> values) {
        if (values!= null) {
            getAccessibilityInfoFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAssistanceFacilityList(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAssistanceFacilityList(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAccessibilityToolList(AccessibilityToolEnumeration... values) {
        if (values!= null) {
            for (AccessibilityToolEnumeration value: values) {
                getAccessibilityToolList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAccessibilityToolList(Collection<AccessibilityToolEnumeration> values) {
        if (values!= null) {
            getAccessibilityToolList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withCarServiceFacilityList(CarServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (CarServiceFacilityEnumeration value: values) {
                getCarServiceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withCarServiceFacilityList(Collection<CarServiceFacilityEnumeration> values) {
        if (values!= null) {
            getCarServiceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withCateringFacilityList(CateringFacilityEnumeration... values) {
        if (values!= null) {
            for (CateringFacilityEnumeration value: values) {
                getCateringFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withCateringFacilityList(Collection<CateringFacilityEnumeration> values) {
        if (values!= null) {
            getCateringFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withFamilyFacilityList(FamilyFacilityEnumeration... values) {
        if (values!= null) {
            for (FamilyFacilityEnumeration value: values) {
                getFamilyFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withFamilyFacilityList(Collection<FamilyFacilityEnumeration> values) {
        if (values!= null) {
            getFamilyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withFareClasses(FareClassEnumeration... values) {
        if (values!= null) {
            for (FareClassEnumeration value: values) {
                getFareClasses().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withFareClasses(Collection<FareClassEnumeration> values) {
        if (values!= null) {
            getFareClasses().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withGenderLimitation(GenderLimitationEnumeration value) {
        setGenderLimitation(value);
        return this;
    }

    @Override
    public SiteFacilitySet withMealFacilityList(MealFacilityEnumeration... values) {
        if (values!= null) {
            for (MealFacilityEnumeration value: values) {
                getMealFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMealFacilityList(Collection<MealFacilityEnumeration> values) {
        if (values!= null) {
            getMealFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMedicalFacilityList(MedicalFacilityEnumeration... values) {
        if (values!= null) {
            for (MedicalFacilityEnumeration value: values) {
                getMedicalFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMedicalFacilityList(Collection<MedicalFacilityEnumeration> values) {
        if (values!= null) {
            getMedicalFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMobilityFacilityList(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withMobilityFacilityList(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withNuisanceFacilityList(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withNuisanceFacilityList(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withPassengerCommsFacilityList(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withPassengerCommsFacilityList(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withPassengerInformationEquipmentList(PassengerInformationEquipmentEnumeration value) {
        setPassengerInformationEquipmentList(value);
        return this;
    }

    @Override
    public SiteFacilitySet withPassengerInformationFacilityList(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withPassengerInformationFacilityList(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withRetailFacilityList(RetailFacilityEnumeration... values) {
        if (values!= null) {
            for (RetailFacilityEnumeration value: values) {
                getRetailFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withRetailFacilityList(Collection<RetailFacilityEnumeration> values) {
        if (values!= null) {
            getRetailFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withSafetyFacilityList(SafetyFacilityEnumeration... values) {
        if (values!= null) {
            for (SafetyFacilityEnumeration value: values) {
                getSafetyFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withSafetyFacilityList(Collection<SafetyFacilityEnumeration> values) {
        if (values!= null) {
            getSafetyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withSanitaryFacilityList(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withSanitaryFacilityList(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withTicketingFacilityList(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withTicketingFacilityList(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withTicketingServiceFacilityList(TicketingServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingServiceFacilityEnumeration value: values) {
                getTicketingServiceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withTicketingServiceFacilityList(Collection<TicketingServiceFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingServiceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SiteFacilitySet withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SiteFacilitySet withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SiteFacilitySet withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteFacilitySet withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SiteFacilitySet withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SiteFacilitySet withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SiteFacilitySet withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SiteFacilitySet withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SiteFacilitySet withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SiteFacilitySet withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteFacilitySet withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteFacilitySet withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SiteFacilitySet withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SiteFacilitySet withId(String value) {
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
