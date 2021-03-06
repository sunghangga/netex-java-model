//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ServiceCalendar_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ServiceCalendarGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ServiceCalendarIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ServiceCalendar
    extends ServiceCalendar_VersionStructure
{


    @Override
    public ServiceCalendar withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ServiceCalendar withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ServiceCalendar withFromDate(LocalDateTime value) {
        setFromDate(value);
        return this;
    }

    @Override
    public ServiceCalendar withToDate(LocalDateTime value) {
        setToDate(value);
        return this;
    }

    @Override
    public ServiceCalendar withEarliestTime(LocalTime value) {
        setEarliestTime(value);
        return this;
    }

    @Override
    public ServiceCalendar withDayLength(Duration value) {
        setDayLength(value);
        return this;
    }

    @Override
    public ServiceCalendar withDayTypes(DayTypes_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    @Override
    public ServiceCalendar withTimebands(Timebands_RelStructure value) {
        setTimebands(value);
        return this;
    }

    @Override
    public ServiceCalendar withOperatingDays(OperatingDays_RelStructure value) {
        setOperatingDays(value);
        return this;
    }

    @Override
    public ServiceCalendar withOperatingPeriods(OperatingPeriods_RelStructure value) {
        setOperatingPeriods(value);
        return this;
    }

    @Override
    public ServiceCalendar withDayTypeAssignments(DayTypeAssignments_RelStructure value) {
        setDayTypeAssignments(value);
        return this;
    }

    @Override
    public ServiceCalendar withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceCalendar withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceCalendar withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceCalendar withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceCalendar withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceCalendar withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceCalendar withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceCalendar withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceCalendar withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceCalendar withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceCalendar withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceCalendar withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceCalendar withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceCalendar withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceCalendar withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceCalendar withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceCalendar withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceCalendar withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceCalendar withId(String value) {
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
