//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for AssistanceService_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssistanceService_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}AssistanceServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssistanceService_VersionStructure", propOrder = {
    "assistanceFacilityList",
    "assistanceAvailability",
    "staffing",
    "accessibilityToolList",
    "languages",
    "accessibilityTrainedStaff",
    "emergencyServiceList",
    "safetyFacilityList"
})
@XmlSeeAlso({
    AssistanceService.class
})
public class AssistanceService_VersionStructure
    extends LocalService_VersionStructure
{

    @XmlList
    @XmlElement(name = "AssistanceFacilityList")
    protected List<AssistanceFacilityEnumeration> assistanceFacilityList;
    @XmlElement(name = "AssistanceAvailability")
    @XmlSchemaType(name = "string")
    protected AssistanceAvailabilityEnumeration assistanceAvailability;
    @XmlElement(name = "Staffing")
    @XmlSchemaType(name = "normalizedString")
    protected StaffingEnumeration staffing;
    @XmlList
    @XmlElement(name = "AccessibilityToolList")
    protected List<AccessibilityToolEnumeration> accessibilityToolList;
    @XmlList
    @XmlElement(name = "Languages")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> languages;
    @XmlElement(name = "AccessibilityTrainedStaff")
    protected Boolean accessibilityTrainedStaff;
    @XmlList
    @XmlElement(name = "EmergencyServiceList")
    protected List<EmergencyServiceEnumeration> emergencyServiceList;
    @XmlList
    @XmlElement(name = "SafetyFacilityList")
    protected List<SafetyFacilityEnumeration> safetyFacilityList;

    /**
     * Gets the value of the assistanceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistanceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistanceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistanceFacilityEnumeration }
     * 
     * 
     */
    public List<AssistanceFacilityEnumeration> getAssistanceFacilityList() {
        if (assistanceFacilityList == null) {
            assistanceFacilityList = new ArrayList<AssistanceFacilityEnumeration>();
        }
        return this.assistanceFacilityList;
    }

    /**
     * Gets the value of the assistanceAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceAvailabilityEnumeration }
     *     
     */
    public AssistanceAvailabilityEnumeration getAssistanceAvailability() {
        return assistanceAvailability;
    }

    /**
     * Sets the value of the assistanceAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceAvailabilityEnumeration }
     *     
     */
    public void setAssistanceAvailability(AssistanceAvailabilityEnumeration value) {
        this.assistanceAvailability = value;
    }

    /**
     * Gets the value of the staffing property.
     * 
     * @return
     *     possible object is
     *     {@link StaffingEnumeration }
     *     
     */
    public StaffingEnumeration getStaffing() {
        return staffing;
    }

    /**
     * Sets the value of the staffing property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffingEnumeration }
     *     
     */
    public void setStaffing(StaffingEnumeration value) {
        this.staffing = value;
    }

    /**
     * Gets the value of the accessibilityToolList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityToolList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityToolList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityToolEnumeration }
     * 
     * 
     */
    public List<AccessibilityToolEnumeration> getAccessibilityToolList() {
        if (accessibilityToolList == null) {
            accessibilityToolList = new ArrayList<AccessibilityToolEnumeration>();
        }
        return this.accessibilityToolList;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<String>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the accessibilityTrainedStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessibilityTrainedStaff() {
        return accessibilityTrainedStaff;
    }

    /**
     * Sets the value of the accessibilityTrainedStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessibilityTrainedStaff(Boolean value) {
        this.accessibilityTrainedStaff = value;
    }

    /**
     * Gets the value of the emergencyServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmergencyServiceEnumeration }
     * 
     * 
     */
    public List<EmergencyServiceEnumeration> getEmergencyServiceList() {
        if (emergencyServiceList == null) {
            emergencyServiceList = new ArrayList<EmergencyServiceEnumeration>();
        }
        return this.emergencyServiceList;
    }

    /**
     * Gets the value of the safetyFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafetyFacilityEnumeration }
     * 
     * 
     */
    public List<SafetyFacilityEnumeration> getSafetyFacilityList() {
        if (safetyFacilityList == null) {
            safetyFacilityList = new ArrayList<SafetyFacilityEnumeration>();
        }
        return this.safetyFacilityList;
    }

    public AssistanceService_VersionStructure withAssistanceFacilityList(AssistanceFacilityEnumeration... values) {
        if (values!= null) {
            for (AssistanceFacilityEnumeration value: values) {
                getAssistanceFacilityList().add(value);
            }
        }
        return this;
    }

    public AssistanceService_VersionStructure withAssistanceFacilityList(Collection<AssistanceFacilityEnumeration> values) {
        if (values!= null) {
            getAssistanceFacilityList().addAll(values);
        }
        return this;
    }

    public AssistanceService_VersionStructure withAssistanceAvailability(AssistanceAvailabilityEnumeration value) {
        setAssistanceAvailability(value);
        return this;
    }

    public AssistanceService_VersionStructure withStaffing(StaffingEnumeration value) {
        setStaffing(value);
        return this;
    }

    public AssistanceService_VersionStructure withAccessibilityToolList(AccessibilityToolEnumeration... values) {
        if (values!= null) {
            for (AccessibilityToolEnumeration value: values) {
                getAccessibilityToolList().add(value);
            }
        }
        return this;
    }

    public AssistanceService_VersionStructure withAccessibilityToolList(Collection<AccessibilityToolEnumeration> values) {
        if (values!= null) {
            getAccessibilityToolList().addAll(values);
        }
        return this;
    }

    public AssistanceService_VersionStructure withLanguages(String... values) {
        if (values!= null) {
            for (String value: values) {
                getLanguages().add(value);
            }
        }
        return this;
    }

    public AssistanceService_VersionStructure withLanguages(Collection<String> values) {
        if (values!= null) {
            getLanguages().addAll(values);
        }
        return this;
    }

    public AssistanceService_VersionStructure withAccessibilityTrainedStaff(Boolean value) {
        setAccessibilityTrainedStaff(value);
        return this;
    }

    public AssistanceService_VersionStructure withEmergencyServiceList(EmergencyServiceEnumeration... values) {
        if (values!= null) {
            for (EmergencyServiceEnumeration value: values) {
                getEmergencyServiceList().add(value);
            }
        }
        return this;
    }

    public AssistanceService_VersionStructure withEmergencyServiceList(Collection<EmergencyServiceEnumeration> values) {
        if (values!= null) {
            getEmergencyServiceList().addAll(values);
        }
        return this;
    }

    public AssistanceService_VersionStructure withSafetyFacilityList(SafetyFacilityEnumeration... values) {
        if (values!= null) {
            for (SafetyFacilityEnumeration value: values) {
                getSafetyFacilityList().add(value);
            }
        }
        return this;
    }

    public AssistanceService_VersionStructure withSafetyFacilityList(Collection<SafetyFacilityEnumeration> values) {
        if (values!= null) {
            getSafetyFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        setTypesOfServiceFeature(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public AssistanceService_VersionStructure withId(String value) {
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