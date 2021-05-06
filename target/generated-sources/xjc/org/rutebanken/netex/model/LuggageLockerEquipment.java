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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}LuggageLockerEquipment_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}LuggageLockerEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}LuggageLockerIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class LuggageLockerEquipment
    extends LuggageLockerEquipment_VersionStructure
{


    @Override
    public LuggageLockerEquipment withNumberOfLockers(BigInteger value) {
        setNumberOfLockers(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withLockerWidth(BigDecimal value) {
        setLockerWidth(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withLockerHeight(BigDecimal value) {
        setLockerHeight(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withLockerDepth(BigDecimal value) {
        setLockerDepth(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withLockerType(LockerTypeEnumeration value) {
        setLockerType(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withLockingType(LockingTypeEnumeration value) {
        setLockingType(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withWheelchairAccepted(Boolean value) {
        setWheelchairAccepted(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withBlindAccessible(Boolean value) {
        setBlindAccessible(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LuggageLockerEquipment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LuggageLockerEquipment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LuggageLockerEquipment withId(String value) {
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
