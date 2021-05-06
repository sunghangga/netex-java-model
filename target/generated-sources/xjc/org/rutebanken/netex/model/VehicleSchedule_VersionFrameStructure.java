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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VehicleSchedule_VersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSchedule_VersionFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleScheduleFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSchedule_VersionFrameStructure", propOrder = {
    "serviceCalendarFrameRef",
    "blocks",
    "coursesOfJourneys",
    "vehicleServices",
    "reliefOpportunities"
})
@XmlSeeAlso({
    VehicleScheduleFrame.class
})
public class VehicleSchedule_VersionFrameStructure
    extends Common_VersionFrameStructure
{

    @XmlElement(name = "ServiceCalendarFrameRef")
    protected ServiceCalendarFrameRef serviceCalendarFrameRef;
    protected BlocksInFrame_RelStructure blocks;
    protected CoursesOfJourneysInFrame_RelStructure coursesOfJourneys;
    protected VehicleServicesInFrame_RelStructure vehicleServices;
    protected ReliefOpportunitiesInFrame_RelStructure reliefOpportunities;

    /**
     * Gets the value of the serviceCalendarFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public ServiceCalendarFrameRef getServiceCalendarFrameRef() {
        return serviceCalendarFrameRef;
    }

    /**
     * Sets the value of the serviceCalendarFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCalendarFrameRef }
     *     
     */
    public void setServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        this.serviceCalendarFrameRef = value;
    }

    /**
     * Gets the value of the blocks property.
     * 
     * @return
     *     possible object is
     *     {@link BlocksInFrame_RelStructure }
     *     
     */
    public BlocksInFrame_RelStructure getBlocks() {
        return blocks;
    }

    /**
     * Sets the value of the blocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlocksInFrame_RelStructure }
     *     
     */
    public void setBlocks(BlocksInFrame_RelStructure value) {
        this.blocks = value;
    }

    /**
     * Gets the value of the coursesOfJourneys property.
     * 
     * @return
     *     possible object is
     *     {@link CoursesOfJourneysInFrame_RelStructure }
     *     
     */
    public CoursesOfJourneysInFrame_RelStructure getCoursesOfJourneys() {
        return coursesOfJourneys;
    }

    /**
     * Sets the value of the coursesOfJourneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoursesOfJourneysInFrame_RelStructure }
     *     
     */
    public void setCoursesOfJourneys(CoursesOfJourneysInFrame_RelStructure value) {
        this.coursesOfJourneys = value;
    }

    /**
     * Gets the value of the vehicleServices property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServicesInFrame_RelStructure }
     *     
     */
    public VehicleServicesInFrame_RelStructure getVehicleServices() {
        return vehicleServices;
    }

    /**
     * Sets the value of the vehicleServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServicesInFrame_RelStructure }
     *     
     */
    public void setVehicleServices(VehicleServicesInFrame_RelStructure value) {
        this.vehicleServices = value;
    }

    /**
     * Gets the value of the reliefOpportunities property.
     * 
     * @return
     *     possible object is
     *     {@link ReliefOpportunitiesInFrame_RelStructure }
     *     
     */
    public ReliefOpportunitiesInFrame_RelStructure getReliefOpportunities() {
        return reliefOpportunities;
    }

    /**
     * Sets the value of the reliefOpportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliefOpportunitiesInFrame_RelStructure }
     *     
     */
    public void setReliefOpportunities(ReliefOpportunitiesInFrame_RelStructure value) {
        this.reliefOpportunities = value;
    }

    public VehicleSchedule_VersionFrameStructure withServiceCalendarFrameRef(ServiceCalendarFrameRef value) {
        setServiceCalendarFrameRef(value);
        return this;
    }

    public VehicleSchedule_VersionFrameStructure withBlocks(BlocksInFrame_RelStructure value) {
        setBlocks(value);
        return this;
    }

    public VehicleSchedule_VersionFrameStructure withCoursesOfJourneys(CoursesOfJourneysInFrame_RelStructure value) {
        setCoursesOfJourneys(value);
        return this;
    }

    public VehicleSchedule_VersionFrameStructure withVehicleServices(VehicleServicesInFrame_RelStructure value) {
        setVehicleServices(value);
        return this;
    }

    public VehicleSchedule_VersionFrameStructure withReliefOpportunities(ReliefOpportunitiesInFrame_RelStructure value) {
        setReliefOpportunities(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleSchedule_VersionFrameStructure withId(String value) {
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
