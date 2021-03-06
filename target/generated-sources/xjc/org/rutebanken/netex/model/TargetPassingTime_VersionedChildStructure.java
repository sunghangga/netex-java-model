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
import javax.xml.bind.JAXBElement;
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
 * <p>Java class for TargetPassingTime_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetPassingTime_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DatedPassingTime_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TargetPassingTimeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPassingTime_VersionedChildStructure", propOrder = {
    "aimedArrivalTime",
    "arrivalDayOffset",
    "aimedDepartureTime",
    "departureDayOffset",
    "aimedWaitingTime",
    "aimedNonstopPassingTime",
    "passingDayOffset",
    "aimedHeadway"
})
@XmlSeeAlso({
    TargetPassingTime.class
})
public class TargetPassingTime_VersionedChildStructure
    extends DatedPassingTime_VersionedChildStructure
{

    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime aimedArrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime aimedDepartureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "AimedWaitingTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedWaitingTime;
    @XmlElement(name = "AimedNonstopPassingTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime aimedNonstopPassingTime;
    @XmlElement(name = "PassingDayOffset")
    protected BigInteger passingDayOffset;
    @XmlElement(name = "AimedHeadway")
    protected HeadwayIntervalStructure aimedHeadway;

    /**
     * Gets the value of the aimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Sets the value of the aimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(LocalTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Gets the value of the arrivalDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrivalDayOffset() {
        return arrivalDayOffset;
    }

    /**
     * Sets the value of the arrivalDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrivalDayOffset(BigInteger value) {
        this.arrivalDayOffset = value;
    }

    /**
     * Gets the value of the aimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Sets the value of the aimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(LocalTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Gets the value of the departureDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureDayOffset() {
        return departureDayOffset;
    }

    /**
     * Sets the value of the departureDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureDayOffset(BigInteger value) {
        this.departureDayOffset = value;
    }

    /**
     * Gets the value of the aimedWaitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAimedWaitingTime() {
        return aimedWaitingTime;
    }

    /**
     * Sets the value of the aimedWaitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedWaitingTime(Duration value) {
        this.aimedWaitingTime = value;
    }

    /**
     * Gets the value of the aimedNonstopPassingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getAimedNonstopPassingTime() {
        return aimedNonstopPassingTime;
    }

    /**
     * Sets the value of the aimedNonstopPassingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedNonstopPassingTime(LocalTime value) {
        this.aimedNonstopPassingTime = value;
    }

    /**
     * Gets the value of the passingDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassingDayOffset() {
        return passingDayOffset;
    }

    /**
     * Sets the value of the passingDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassingDayOffset(BigInteger value) {
        this.passingDayOffset = value;
    }

    /**
     * Gets the value of the aimedHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getAimedHeadway() {
        return aimedHeadway;
    }

    /**
     * Sets the value of the aimedHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setAimedHeadway(HeadwayIntervalStructure value) {
        this.aimedHeadway = value;
    }

    public TargetPassingTime_VersionedChildStructure withAimedArrivalTime(LocalTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withArrivalDayOffset(BigInteger value) {
        setArrivalDayOffset(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withAimedDepartureTime(LocalTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withAimedWaitingTime(Duration value) {
        setAimedWaitingTime(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withAimedNonstopPassingTime(LocalTime value) {
        setAimedNonstopPassingTime(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withPassingDayOffset(BigInteger value) {
        setPassingDayOffset(value);
        return this;
    }

    public TargetPassingTime_VersionedChildStructure withAimedHeadway(HeadwayIntervalStructure value) {
        setAimedHeadway(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withDatedJourneyRef(JourneyRefStructure value) {
        setDatedJourneyRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withAlightAndReboard(Boolean value) {
        setAlightAndReboard(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TargetPassingTime_VersionedChildStructure withId(String value) {
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
