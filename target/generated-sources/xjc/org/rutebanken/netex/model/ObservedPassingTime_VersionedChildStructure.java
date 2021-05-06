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
 * <p>Java class for ObservedPassingTime_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservedPassingTime_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DatedPassingTime_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ObservedPassingTimeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservedPassingTime_VersionedChildStructure", propOrder = {
    "actualArrivalTime",
    "arrivalDayOffset",
    "actualDepartureTime",
    "departureDayOffset",
    "actualWaitingTime",
    "actualNonstopPassingTime",
    "passingTimeDayOffset",
    "actualHeadway"
})
@XmlSeeAlso({
    ObservedPassingTime.class
})
public class ObservedPassingTime_VersionedChildStructure
    extends DatedPassingTime_VersionedChildStructure
{

    @XmlElement(name = "ActualArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime actualArrivalTime;
    @XmlElement(name = "ArrivalDayOffset")
    protected BigInteger arrivalDayOffset;
    @XmlElement(name = "ActualDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime actualDepartureTime;
    @XmlElement(name = "DepartureDayOffset")
    protected BigInteger departureDayOffset;
    @XmlElement(name = "ActualWaitingTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration actualWaitingTime;
    @XmlElement(name = "ActualNonstopPassingTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime actualNonstopPassingTime;
    @XmlElement(name = "PassingTimeDayOffset")
    protected BigInteger passingTimeDayOffset;
    @XmlElement(name = "ActualHeadway")
    protected HeadwayIntervalStructure actualHeadway;

    /**
     * Gets the value of the actualArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Sets the value of the actualArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualArrivalTime(LocalTime value) {
        this.actualArrivalTime = value;
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
     * Gets the value of the actualDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Sets the value of the actualDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepartureTime(LocalTime value) {
        this.actualDepartureTime = value;
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
     * Gets the value of the actualWaitingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getActualWaitingTime() {
        return actualWaitingTime;
    }

    /**
     * Sets the value of the actualWaitingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualWaitingTime(Duration value) {
        this.actualWaitingTime = value;
    }

    /**
     * Gets the value of the actualNonstopPassingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getActualNonstopPassingTime() {
        return actualNonstopPassingTime;
    }

    /**
     * Sets the value of the actualNonstopPassingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualNonstopPassingTime(LocalTime value) {
        this.actualNonstopPassingTime = value;
    }

    /**
     * Gets the value of the passingTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassingTimeDayOffset() {
        return passingTimeDayOffset;
    }

    /**
     * Sets the value of the passingTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassingTimeDayOffset(BigInteger value) {
        this.passingTimeDayOffset = value;
    }

    /**
     * Gets the value of the actualHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public HeadwayIntervalStructure getActualHeadway() {
        return actualHeadway;
    }

    /**
     * Sets the value of the actualHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayIntervalStructure }
     *     
     */
    public void setActualHeadway(HeadwayIntervalStructure value) {
        this.actualHeadway = value;
    }

    public ObservedPassingTime_VersionedChildStructure withActualArrivalTime(LocalTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withArrivalDayOffset(BigInteger value) {
        setArrivalDayOffset(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withActualDepartureTime(LocalTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withDepartureDayOffset(BigInteger value) {
        setDepartureDayOffset(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withActualWaitingTime(Duration value) {
        setActualWaitingTime(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withActualNonstopPassingTime(LocalTime value) {
        setActualNonstopPassingTime(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withPassingTimeDayOffset(BigInteger value) {
        setPassingTimeDayOffset(value);
        return this;
    }

    public ObservedPassingTime_VersionedChildStructure withActualHeadway(HeadwayIntervalStructure value) {
        setActualHeadway(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withDatedJourneyRef(JourneyRefStructure value) {
        setDatedJourneyRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withAlightAndReboard(Boolean value) {
        setAlightAndReboard(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ObservedPassingTime_VersionedChildStructure withId(String value) {
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
