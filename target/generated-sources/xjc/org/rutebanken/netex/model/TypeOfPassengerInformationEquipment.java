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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TypeOfPassengerInformationEquipment_ValueStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TypeOfValueGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TypeOfPassengerInformationEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TypeOfPassengerInformationEquipmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TypeOfPassengerInformationEquipment
    extends TypeOfPassengerInformationEquipment_ValueStructure
{


    @Override
    public TypeOfPassengerInformationEquipment withBroadType(MultilingualString value) {
        setBroadType(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withNameOfClassifiedEntityClass(String value) {
        setNameOfClassifiedEntityClass(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TypeOfPassengerInformationEquipment withId(String value) {
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
