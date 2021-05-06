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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TimeDemandType_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TimeDemandTypeGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TimeDemandTypeIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TimeDemandType
    extends TimeDemandType_VersionStructure
{


    @Override
    public TimeDemandType withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TimeDemandType withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TimeDemandType withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TimeDemandType withTypeOfTimeDemandTypeRef(TypeOfTimeDemandTypeRefStructure value) {
        setTypeOfTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public TimeDemandType withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    @Override
    public TimeDemandType withRunTimes(JourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public TimeDemandType withWaitTimes(JourneyWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public TimeDemandType withLayovers(JourneyLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public TimeDemandType withHeadways(JourneyHeadways_RelStructure value) {
        setHeadways(value);
        return this;
    }

    @Override
    public TimeDemandType withVehiclePreferences(VehicleTypePreferences_RelStructure value) {
        setVehiclePreferences(value);
        return this;
    }

    @Override
    public TimeDemandType withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TimeDemandType withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TimeDemandType withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TimeDemandType withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TimeDemandType withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TimeDemandType withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeDemandType withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TimeDemandType withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TimeDemandType withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TimeDemandType withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TimeDemandType withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TimeDemandType withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TimeDemandType withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TimeDemandType withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeDemandType withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeDemandType withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TimeDemandType withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TimeDemandType withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TimeDemandType withId(String value) {
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
