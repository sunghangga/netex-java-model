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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}CycleStorageEquipment_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}CycleStorageEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CycleStorageEquipmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CycleStorageEquipment
    extends CycleStorageEquipment_VersionStructure
{


    @Override
    public CycleStorageEquipment withNumberOfSpaces(BigInteger value) {
        setNumberOfSpaces(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withCycleStorageType(CycleStorageEnumeration value) {
        setCycleStorageType(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withCage(Boolean value) {
        setCage(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withCovered(Boolean value) {
        setCovered(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CycleStorageEquipment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CycleStorageEquipment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CycleStorageEquipment withId(String value) {
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
