//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PassengerSafetyEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Fixed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PassengerSafetyEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PassengerSafetyEquipmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PassengerSafetyEquipment
    extends PassengerSafetyEquipment_VersionStructure
{


    @Override
    public PassengerSafetyEquipment withCctv(Boolean value) {
        setCctv(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withMobilePhoneCoverage(Boolean value) {
        setMobilePhoneCoverage(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withPanicButton(Boolean value) {
        setPanicButton(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withSosPhones(Boolean value) {
        setSosPhones(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withHeightOfSosPanel(BigDecimal value) {
        setHeightOfSosPanel(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withAudioAnnouncements(Boolean value) {
        setAudioAnnouncements(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withAcousticAnnouncements(Boolean value) {
        setAcousticAnnouncements(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withAudioAnnouncementType(AudioAnnouncementTypeEnumeration value) {
        setAudioAnnouncementType(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withAudioAnnouncementsTrigger(AudioTriggerMethodEnumeration value) {
        setAudioAnnouncementsTrigger(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withFixed(Boolean value) {
        setFixed(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PassengerSafetyEquipment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerSafetyEquipment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PassengerSafetyEquipment withId(String value) {
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