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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for WaitingRoomEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaitingRoomEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}WaitingEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}WaitingRoomGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaitingRoomEquipment_VersionStructure", propOrder = {
    "fareClass",
    "womenOnly",
    "sanitary",
    "classOfUseRef"
})
@XmlSeeAlso({
    WaitingRoomEquipment.class
})
public class WaitingRoomEquipment_VersionStructure
    extends WaitingEquipment_VersionStructure
{

    @XmlList
    @XmlElement(name = "FareClass")
    protected List<FareClassEnumeration> fareClass;
    @XmlElement(name = "WomenOnly")
    protected Boolean womenOnly;
    @XmlList
    @XmlElement(name = "Sanitary")
    protected List<SanitaryFacilityEnumeration> sanitary;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;

    /**
     * Gets the value of the fareClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassEnumeration }
     * 
     * 
     */
    public List<FareClassEnumeration> getFareClass() {
        if (fareClass == null) {
            fareClass = new ArrayList<FareClassEnumeration>();
        }
        return this.fareClass;
    }

    /**
     * Gets the value of the womenOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWomenOnly() {
        return womenOnly;
    }

    /**
     * Sets the value of the womenOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWomenOnly(Boolean value) {
        this.womenOnly = value;
    }

    /**
     * Gets the value of the sanitary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitary() {
        if (sanitary == null) {
            sanitary = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitary;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    public WaitingRoomEquipment_VersionStructure withFareClass(FareClassEnumeration... values) {
        if (values!= null) {
            for (FareClassEnumeration value: values) {
                getFareClass().add(value);
            }
        }
        return this;
    }

    public WaitingRoomEquipment_VersionStructure withFareClass(Collection<FareClassEnumeration> values) {
        if (values!= null) {
            getFareClass().addAll(values);
        }
        return this;
    }

    public WaitingRoomEquipment_VersionStructure withWomenOnly(Boolean value) {
        setWomenOnly(value);
        return this;
    }

    public WaitingRoomEquipment_VersionStructure withSanitary(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitary().add(value);
            }
        }
        return this;
    }

    public WaitingRoomEquipment_VersionStructure withSanitary(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitary().addAll(values);
        }
        return this;
    }

    public WaitingRoomEquipment_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withSeats(BigInteger value) {
        setSeats(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withStepFree(Boolean value) {
        setStepFree(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withWheelchairAreaWidth(BigDecimal value) {
        setWheelchairAreaWidth(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withWheelchairAreaLength(BigDecimal value) {
        setWheelchairAreaLength(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withSmokingAllowed(Boolean value) {
        setSmokingAllowed(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withHeated(Boolean value) {
        setHeated(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withAirConditioned(Boolean value) {
        setAirConditioned(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public WaitingRoomEquipment_VersionStructure withId(String value) {
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
