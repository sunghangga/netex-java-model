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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TrainElement_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TrainElementGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TrainElementIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TrainElement
    extends TrainElement_VersionStructure
{


    @Override
    public TrainElement withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TrainElement withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TrainElement withTrainElementType(TrainElementTypeEnumeration value) {
        setTrainElementType(value);
        return this;
    }

    @Override
    public TrainElement withFareClasses(FareClassEnumeration... values) {
        if (values!= null) {
            for (FareClassEnumeration value: values) {
                getFareClasses().add(value);
            }
        }
        return this;
    }

    @Override
    public TrainElement withFareClasses(Collection<FareClassEnumeration> values) {
        if (values!= null) {
            getFareClasses().addAll(values);
        }
        return this;
    }

    @Override
    public TrainElement withPassengerCapacity(PassengerCapacityStructure value) {
        setPassengerCapacity(value);
        return this;
    }

    @Override
    public TrainElement withCapacities(PassengerCapacities_RelStructure value) {
        setCapacities(value);
        return this;
    }

    @Override
    public TrainElement withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public TrainElement withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public TrainElement withTrainSize(TrainSizeStructure value) {
        setTrainSize(value);
        return this;
    }

    @Override
    public TrainElement withFacilities(ServiceFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public TrainElement withEquipments(Equipments_RelStructure value) {
        setEquipments(value);
        return this;
    }

    @Override
    public TrainElement withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TrainElement withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TrainElement withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TrainElement withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TrainElement withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TrainElement withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TrainElement withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TrainElement withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TrainElement withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TrainElement withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TrainElement withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TrainElement withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TrainElement withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TrainElement withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrainElement withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrainElement withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TrainElement withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TrainElement withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TrainElement withId(String value) {
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
