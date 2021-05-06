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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}VehicleSchedule_VersionFrameStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehicleScheduleFrameGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}VehicleScheduleFrameIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class VehicleScheduleFrame
    extends VehicleSchedule_VersionFrameStructure
{


    @Override
    public VehicleScheduleFrame withServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        setServiceCalendarFrameRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withBlocks(BlocksInFrame_RelStructure value) {
        setBlocks(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withCoursesOfJourneys(CoursesOfJourneysInFrame_RelStructure value) {
        setCoursesOfJourneys(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withVehicleServices(VehicleServicesInFrame_RelStructure value) {
        setVehicleServices(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withReliefOpportunities(ReliefOpportunitiesInFrame_RelStructure value) {
        setReliefOpportunities(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleScheduleFrame withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleScheduleFrame withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleScheduleFrame withId(String value) {
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
