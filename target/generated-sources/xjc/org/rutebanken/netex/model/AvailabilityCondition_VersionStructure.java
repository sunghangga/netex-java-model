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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for AvailabilityCondition_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityCondition_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}ValidBetween_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}AvailabilityConditionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityCondition_VersionStructure", propOrder = {
    "isAvailable",
    "dayTypes",
    "validDayBits",
    "timebands",
    "operatingDays"
})
@XmlSeeAlso({
    AvailabilityCondition.class
})
public class AvailabilityCondition_VersionStructure
    extends ValidBetween_VersionStructure
{

    @XmlElement(name = "IsAvailable", defaultValue = "true")
    protected Boolean isAvailable;
    protected DayTypes_RelStructure dayTypes;
    @XmlElement(name = "ValidDayBits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String validDayBits;
    protected Timebands_RelStructure timebands;
    protected OperatingDays_RelStructure operatingDays;

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the dayTypes property.
     * 
     * @return
     *     possible object is
     *     {@link DayTypes_RelStructure }
     *     
     */
    public DayTypes_RelStructure getDayTypes() {
        return dayTypes;
    }

    /**
     * Sets the value of the dayTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayTypes_RelStructure }
     *     
     */
    public void setDayTypes(DayTypes_RelStructure value) {
        this.dayTypes = value;
    }

    /**
     * Gets the value of the validDayBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidDayBits() {
        return validDayBits;
    }

    /**
     * Sets the value of the validDayBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidDayBits(String value) {
        this.validDayBits = value;
    }

    /**
     * Gets the value of the timebands property.
     * 
     * @return
     *     possible object is
     *     {@link Timebands_RelStructure }
     *     
     */
    public Timebands_RelStructure getTimebands() {
        return timebands;
    }

    /**
     * Sets the value of the timebands property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timebands_RelStructure }
     *     
     */
    public void setTimebands(Timebands_RelStructure value) {
        this.timebands = value;
    }

    /**
     * Gets the value of the operatingDays property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDays_RelStructure }
     *     
     */
    public OperatingDays_RelStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Sets the value of the operatingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDays_RelStructure }
     *     
     */
    public void setOperatingDays(OperatingDays_RelStructure value) {
        this.operatingDays = value;
    }

    public AvailabilityCondition_VersionStructure withIsAvailable(Boolean value) {
        setIsAvailable(value);
        return this;
    }

    public AvailabilityCondition_VersionStructure withDayTypes(DayTypes_RelStructure value) {
        setDayTypes(value);
        return this;
    }

    public AvailabilityCondition_VersionStructure withValidDayBits(String value) {
        setValidDayBits(value);
        return this;
    }

    public AvailabilityCondition_VersionStructure withTimebands(Timebands_RelStructure value) {
        setTimebands(value);
        return this;
    }

    public AvailabilityCondition_VersionStructure withOperatingDays(OperatingDays_RelStructure value) {
        setOperatingDays(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withFromDate(LocalDateTime value) {
        setFromDate(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withToDate(LocalDateTime value) {
        setToDate(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withConditionedObjectRef(VersionOfObjectRefStructure value) {
        setConditionedObjectRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withWithConditionRef(ValidityConditionRefStructure value) {
        setWithConditionRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public AvailabilityCondition_VersionStructure withId(String value) {
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