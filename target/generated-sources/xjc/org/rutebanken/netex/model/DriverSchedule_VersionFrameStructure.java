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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DriverSchedule_VersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverSchedule_VersionFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DriverScheduleFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverSchedule_VersionFrameStructure", propOrder = {
    "duties",
    "dutyParts",
    "driverTrips"
})
@XmlSeeAlso({
    DriverScheduleFrame.class
})
public class DriverSchedule_VersionFrameStructure
    extends Common_VersionFrameStructure
{

    protected DutiesInFrame_RelStructure duties;
    protected DriverSchedule_VersionFrameStructure.DutyParts dutyParts;
    protected DriverTripsInFrame_RelStructure driverTrips;

    /**
     * Gets the value of the duties property.
     * 
     * @return
     *     possible object is
     *     {@link DutiesInFrame_RelStructure }
     *     
     */
    public DutiesInFrame_RelStructure getDuties() {
        return duties;
    }

    /**
     * Sets the value of the duties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutiesInFrame_RelStructure }
     *     
     */
    public void setDuties(DutiesInFrame_RelStructure value) {
        this.duties = value;
    }

    /**
     * Gets the value of the dutyParts property.
     * 
     * @return
     *     possible object is
     *     {@link DriverSchedule_VersionFrameStructure.DutyParts }
     *     
     */
    public DriverSchedule_VersionFrameStructure.DutyParts getDutyParts() {
        return dutyParts;
    }

    /**
     * Sets the value of the dutyParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverSchedule_VersionFrameStructure.DutyParts }
     *     
     */
    public void setDutyParts(DriverSchedule_VersionFrameStructure.DutyParts value) {
        this.dutyParts = value;
    }

    /**
     * Gets the value of the driverTrips property.
     * 
     * @return
     *     possible object is
     *     {@link DriverTripsInFrame_RelStructure }
     *     
     */
    public DriverTripsInFrame_RelStructure getDriverTrips() {
        return driverTrips;
    }

    /**
     * Sets the value of the driverTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverTripsInFrame_RelStructure }
     *     
     */
    public void setDriverTrips(DriverTripsInFrame_RelStructure value) {
        this.driverTrips = value;
    }

    public DriverSchedule_VersionFrameStructure withDuties(DutiesInFrame_RelStructure value) {
        setDuties(value);
        return this;
    }

    public DriverSchedule_VersionFrameStructure withDutyParts(DriverSchedule_VersionFrameStructure.DutyParts value) {
        setDutyParts(value);
        return this;
    }

    public DriverSchedule_VersionFrameStructure withDriverTrips(DriverTripsInFrame_RelStructure value) {
        setDriverTrips(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DriverSchedule_VersionFrameStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.netex.org.uk/netex}dutyPartsInFrame_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DutyParts
        extends DutyPartsInFrame_RelStructure
    {


        @Override
        public DriverSchedule_VersionFrameStructure.DutyParts withDutyPart(DutyPart... values) {
            if (values!= null) {
                for (DutyPart value: values) {
                    getDutyPart().add(value);
                }
            }
            return this;
        }

        @Override
        public DriverSchedule_VersionFrameStructure.DutyParts withDutyPart(Collection<DutyPart> values) {
            if (values!= null) {
                getDutyPart().addAll(values);
            }
            return this;
        }

        @Override
        public DriverSchedule_VersionFrameStructure.DutyParts withModificationSet(ModificationSetEnumeration value) {
            setModificationSet(value);
            return this;
        }

        @Override
        public DriverSchedule_VersionFrameStructure.DutyParts withId(String value) {
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

}