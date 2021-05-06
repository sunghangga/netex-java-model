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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Infrastructure_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionFrameGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}InfrastructureFrameGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}InfrastructureFrameIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class InfrastructureFrame
    extends Infrastructure_VersionFrameStructure
{


    @Override
    public InfrastructureFrame withMeetingsRestricted(Boolean value) {
        setMeetingsRestricted(value);
        return this;
    }

    @Override
    public InfrastructureFrame withRestrictedManoeuvres(Boolean value) {
        setRestrictedManoeuvres(value);
        return this;
    }

    @Override
    public InfrastructureFrame withOvertakingPossibilitiesRestricted(Boolean value) {
        setOvertakingPossibilitiesRestricted(value);
        return this;
    }

    @Override
    public InfrastructureFrame withSpatialFeatures(SpatialFeaturesInFrame_RelStructure value) {
        setSpatialFeatures(value);
        return this;
    }

    @Override
    public InfrastructureFrame withJunctions(InfrastructureJunctionsInFrame_RelStructure value) {
        setJunctions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withElements(InfrastructureElementsInFrame_RelStructure value) {
        setElements(value);
        return this;
    }

    @Override
    public InfrastructureFrame withRestrictions(NetworkRestrictionsInFrame_RelStructure value) {
        setRestrictions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withCrewBases(CrewBasesInFrame_RelStructure value) {
        setCrewBases(value);
        return this;
    }

    @Override
    public InfrastructureFrame withGarages(GaragesInFrame_RelStructure value) {
        setGarages(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVehicleAndCrewPoints(ReliefPointsInFrame_RelStructure value) {
        setVehicleAndCrewPoints(value);
        return this;
    }

    @Override
    public InfrastructureFrame withTrafficControlPoints(TrafficControlPointsInFrame_RelStructure value) {
        setTrafficControlPoints(value);
        return this;
    }

    @Override
    public InfrastructureFrame withActivationPoints(ActivationPointsInFrame_RelStructure value) {
        setActivationPoints(value);
        return this;
    }

    @Override
    public InfrastructureFrame withActivationLinks(ActivationLinksInFrame_RelStructure value) {
        setActivationLinks(value);
        return this;
    }

    @Override
    public InfrastructureFrame withActivatedEquipments(ActivatedEquipmentsInFrame_RelStructure value) {
        setActivatedEquipments(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVehicleTypes(VehicleTypesInFrame_RelStructure value) {
        setVehicleTypes(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVehicleModels(VehicleModelsInFrame_RelStructure value) {
        setVehicleModels(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVehicleEquipmentProfiles(VehicleEquipmenProfilesInFrame_RelStructure value) {
        setVehicleEquipmentProfiles(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVehicles(VehiclesInFrame_RelStructure value) {
        setVehicles(value);
        return this;
    }

    @Override
    public InfrastructureFrame withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public InfrastructureFrame withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public InfrastructureFrame withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public InfrastructureFrame withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public InfrastructureFrame withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public InfrastructureFrame withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public InfrastructureFrame withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public InfrastructureFrame withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public InfrastructureFrame withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureFrame withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureFrame withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public InfrastructureFrame withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public InfrastructureFrame withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public InfrastructureFrame withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public InfrastructureFrame withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public InfrastructureFrame withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public InfrastructureFrame withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public InfrastructureFrame withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public InfrastructureFrame withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public InfrastructureFrame withId(String value) {
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