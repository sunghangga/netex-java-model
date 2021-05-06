//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FrequencyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}HeadwayIntervalGroup"/&gt;
 *         &lt;element name="HeadwayDisplay" type="{http://www.netex.org.uk/netex}HeadwayUseEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyRegulated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyStructure", propOrder = {
    "scheduledHeadwayInterval",
    "minimumHeadwayInterval",
    "maximumHeadwayInterval",
    "headwayDisplay",
    "frequencyRegulated",
    "description"
})
public class FrequencyStructure {

    @XmlElement(name = "ScheduledHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration scheduledHeadwayInterval;
    @XmlElement(name = "MinimumHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumHeadwayInterval;
    @XmlElement(name = "MaximumHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumHeadwayInterval;
    @XmlElement(name = "HeadwayDisplay", defaultValue = "DisplayInsteadOfPassingTimes")
    @XmlSchemaType(name = "normalizedString")
    protected HeadwayUseEnumeration headwayDisplay;
    @XmlElement(name = "FrequencyRegulated")
    protected Boolean frequencyRegulated;
    @XmlElement(name = "Description")
    protected MultilingualString description;

    /**
     * Gets the value of the scheduledHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getScheduledHeadwayInterval() {
        return scheduledHeadwayInterval;
    }

    /**
     * Sets the value of the scheduledHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledHeadwayInterval(Duration value) {
        this.scheduledHeadwayInterval = value;
    }

    /**
     * Gets the value of the minimumHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumHeadwayInterval() {
        return minimumHeadwayInterval;
    }

    /**
     * Sets the value of the minimumHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumHeadwayInterval(Duration value) {
        this.minimumHeadwayInterval = value;
    }

    /**
     * Gets the value of the maximumHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumHeadwayInterval() {
        return maximumHeadwayInterval;
    }

    /**
     * Sets the value of the maximumHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumHeadwayInterval(Duration value) {
        this.maximumHeadwayInterval = value;
    }

    /**
     * Gets the value of the headwayDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link HeadwayUseEnumeration }
     *     
     */
    public HeadwayUseEnumeration getHeadwayDisplay() {
        return headwayDisplay;
    }

    /**
     * Sets the value of the headwayDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadwayUseEnumeration }
     *     
     */
    public void setHeadwayDisplay(HeadwayUseEnumeration value) {
        this.headwayDisplay = value;
    }

    /**
     * Gets the value of the frequencyRegulated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequencyRegulated() {
        return frequencyRegulated;
    }

    /**
     * Sets the value of the frequencyRegulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequencyRegulated(Boolean value) {
        this.frequencyRegulated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    public FrequencyStructure withScheduledHeadwayInterval(Duration value) {
        setScheduledHeadwayInterval(value);
        return this;
    }

    public FrequencyStructure withMinimumHeadwayInterval(Duration value) {
        setMinimumHeadwayInterval(value);
        return this;
    }

    public FrequencyStructure withMaximumHeadwayInterval(Duration value) {
        setMaximumHeadwayInterval(value);
        return this;
    }

    public FrequencyStructure withHeadwayDisplay(HeadwayUseEnumeration value) {
        setHeadwayDisplay(value);
        return this;
    }

    public FrequencyStructure withFrequencyRegulated(Boolean value) {
        setFrequencyRegulated(value);
        return this;
    }

    public FrequencyStructure withDescription(MultilingualString value) {
        setDescription(value);
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
