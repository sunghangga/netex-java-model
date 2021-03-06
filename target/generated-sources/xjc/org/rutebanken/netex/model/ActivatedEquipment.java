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
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ActivatedEquipment_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}ActivatedEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ActivatedEquipmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ActivatedEquipment")
public class ActivatedEquipment
    extends ActivatedEquipment_VersionStructure
{


    @Override
    public ActivatedEquipment withTrafficControlPointRef(TrafficControlPointRefStructure value) {
        setTrafficControlPointRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withTypeOfActivationRef(TypeOfActivationRefStructure value) {
        setTypeOfActivationRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withAssignments(ActivationAssignments_RelStructure value) {
        setAssignments(value);
        return this;
    }

    @Override
    public ActivatedEquipment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ActivatedEquipment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ActivatedEquipment withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public ActivatedEquipment withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public ActivatedEquipment withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ActivatedEquipment withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public ActivatedEquipment withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ActivatedEquipment withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public ActivatedEquipment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ActivatedEquipment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ActivatedEquipment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ActivatedEquipment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ActivatedEquipment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ActivatedEquipment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ActivatedEquipment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ActivatedEquipment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ActivatedEquipment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ActivatedEquipment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ActivatedEquipment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ActivatedEquipment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ActivatedEquipment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ActivatedEquipment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ActivatedEquipment withId(String value) {
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
