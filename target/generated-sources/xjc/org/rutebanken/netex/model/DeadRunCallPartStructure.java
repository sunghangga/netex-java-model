//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java class for DeadRunCallPartStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeadRunCallPartStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="DayOffset" type="{http://www.netex.org.uk/netex}DayOffsetType" minOccurs="0"/&gt;
 *         &lt;element name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DeadRunCallPartGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadRunCallPartStructure", propOrder = {
    "time",
    "dayOffset",
    "waitTime",
    "journeyPartRef",
    "timeDemandTypeRef",
    "dutyPartRef"
})
public class DeadRunCallPartStructure {

    @XmlElement(name = "Time", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime time;
    @XmlElement(name = "DayOffset")
    protected BigInteger dayOffset;
    @XmlElement(name = "WaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration waitTime;
    @XmlElement(name = "JourneyPartRef")
    protected JourneyPartRefStructure journeyPartRef;
    @XmlElement(name = "TimeDemandTypeRef")
    protected TimeDemandTypeRefStructure timeDemandTypeRef;
    @XmlElement(name = "DutyPartRef")
    protected DutyPartRefStructure dutyPartRef;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(LocalTime value) {
        this.time = value;
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
     * Gets the value of the waitTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getWaitTime() {
        return waitTime;
    }

    /**
     * Sets the value of the waitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaitTime(Duration value) {
        this.waitTime = value;
    }

    /**
     * Gets the value of the journeyPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getJourneyPartRef() {
        return journeyPartRef;
    }

    /**
     * Sets the value of the journeyPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setJourneyPartRef(JourneyPartRefStructure value) {
        this.journeyPartRef = value;
    }

    /**
     * Gets the value of the timeDemandTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public TimeDemandTypeRefStructure getTimeDemandTypeRef() {
        return timeDemandTypeRef;
    }

    /**
     * Sets the value of the timeDemandTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDemandTypeRefStructure }
     *     
     */
    public void setTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        this.timeDemandTypeRef = value;
    }

    /**
     * Gets the value of the dutyPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public DutyPartRefStructure getDutyPartRef() {
        return dutyPartRef;
    }

    /**
     * Sets the value of the dutyPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyPartRefStructure }
     *     
     */
    public void setDutyPartRef(DutyPartRefStructure value) {
        this.dutyPartRef = value;
    }

    public DeadRunCallPartStructure withTime(LocalTime value) {
        setTime(value);
        return this;
    }

    public DeadRunCallPartStructure withDayOffset(BigInteger value) {
        setDayOffset(value);
        return this;
    }

    public DeadRunCallPartStructure withWaitTime(Duration value) {
        setWaitTime(value);
        return this;
    }

    public DeadRunCallPartStructure withJourneyPartRef(JourneyPartRefStructure value) {
        setJourneyPartRef(value);
        return this;
    }

    public DeadRunCallPartStructure withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    public DeadRunCallPartStructure withDutyPartRef(DutyPartRefStructure value) {
        setDutyPartRef(value);
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
