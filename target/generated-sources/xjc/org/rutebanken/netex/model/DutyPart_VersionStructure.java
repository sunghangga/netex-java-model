//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java class for DutyPart_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyPart_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccountableElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DutyPartGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyPart_VersionStructure", propOrder = {
    "driverAccessDuration",
    "driverReturnDuration",
    "dutyRef",
    "startTime",
    "dayOffset",
    "endTime",
    "endDayOffset",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    DutyPart.class
})
public class DutyPart_VersionStructure
    extends AccountableElementStructure
{

    @XmlElement(name = "DriverAccessDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration driverAccessDuration;
    @XmlElement(name = "DriverReturnDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration driverReturnDuration;
    @XmlElement(name = "DutyRef")
    protected DutyRefStructure dutyRef;
    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTime;
    @XmlElement(name = "DayOffset", defaultValue = "0")
    protected BigInteger dayOffset;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTime;
    @XmlElement(name = "EndDayOffset", defaultValue = "0")
    protected BigInteger endDayOffset;
    @XmlElement(name = "StartPointRef")
    protected TimingPointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected TimingPointRefStructure endPointRef;

    /**
     * Gets the value of the driverAccessDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDriverAccessDuration() {
        return driverAccessDuration;
    }

    /**
     * Sets the value of the driverAccessDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverAccessDuration(Duration value) {
        this.driverAccessDuration = value;
    }

    /**
     * Gets the value of the driverReturnDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDriverReturnDuration() {
        return driverReturnDuration;
    }

    /**
     * Sets the value of the driverReturnDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverReturnDuration(Duration value) {
        this.driverReturnDuration = value;
    }

    /**
     * Gets the value of the dutyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DutyRefStructure }
     *     
     */
    public DutyRefStructure getDutyRef() {
        return dutyRef;
    }

    /**
     * Sets the value of the dutyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyRefStructure }
     *     
     */
    public void setDutyRef(DutyRefStructure value) {
        this.dutyRef = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(LocalTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the dayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayOffset() {
        return dayOffset;
    }

    /**
     * Sets the value of the dayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayOffset(BigInteger value) {
        this.dayOffset = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(LocalTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndDayOffset() {
        return endDayOffset;
    }

    /**
     * Sets the value of the endDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndDayOffset(BigInteger value) {
        this.endDayOffset = value;
    }

    /**
     * Gets the value of the startPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Sets the value of the startPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setStartPointRef(TimingPointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public TimingPointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Sets the value of the endPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointRefStructure }
     *     
     */
    public void setEndPointRef(TimingPointRefStructure value) {
        this.endPointRef = value;
    }

    public DutyPart_VersionStructure withDriverAccessDuration(Duration value) {
        setDriverAccessDuration(value);
        return this;
    }

    public DutyPart_VersionStructure withDriverReturnDuration(Duration value) {
        setDriverReturnDuration(value);
        return this;
    }

    public DutyPart_VersionStructure withDutyRef(DutyRefStructure value) {
        setDutyRef(value);
        return this;
    }

    public DutyPart_VersionStructure withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    public DutyPart_VersionStructure withDayOffset(BigInteger value) {
        setDayOffset(value);
        return this;
    }

    public DutyPart_VersionStructure withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    public DutyPart_VersionStructure withEndDayOffset(BigInteger value) {
        setEndDayOffset(value);
        return this;
    }

    public DutyPart_VersionStructure withStartPointRef(TimingPointRefStructure value) {
        setStartPointRef(value);
        return this;
    }

    public DutyPart_VersionStructure withEndPointRef(TimingPointRefStructure value) {
        setEndPointRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withAccountingTime(Duration value) {
        setAccountingTime(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withAccountingFactor(Duration value) {
        setAccountingFactor(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withPreparationDuration(Duration value) {
        setPreparationDuration(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withFinishingDuration(Duration value) {
        setFinishingDuration(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DutyPart_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DutyPart_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DutyPart_VersionStructure withId(String value) {
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