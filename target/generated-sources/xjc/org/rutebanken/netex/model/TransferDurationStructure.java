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
 * <p>Java class for TransferDurationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDurationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="FrequentTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="OccasionalTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="MobilityRestrictedTravellerDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferDurationStructure", propOrder = {
    "defaultDuration",
    "frequentTravellerDuration",
    "occasionalTravellerDuration",
    "mobilityRestrictedTravellerDuration"
})
public class TransferDurationStructure {

    @XmlElement(name = "DefaultDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration defaultDuration;
    @XmlElement(name = "FrequentTravellerDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration frequentTravellerDuration;
    @XmlElement(name = "OccasionalTravellerDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration occasionalTravellerDuration;
    @XmlElement(name = "MobilityRestrictedTravellerDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration mobilityRestrictedTravellerDuration;

    /**
     * Gets the value of the defaultDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDefaultDuration() {
        return defaultDuration;
    }

    /**
     * Sets the value of the defaultDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultDuration(Duration value) {
        this.defaultDuration = value;
    }

    /**
     * Gets the value of the frequentTravellerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getFrequentTravellerDuration() {
        return frequentTravellerDuration;
    }

    /**
     * Sets the value of the frequentTravellerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentTravellerDuration(Duration value) {
        this.frequentTravellerDuration = value;
    }

    /**
     * Gets the value of the occasionalTravellerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getOccasionalTravellerDuration() {
        return occasionalTravellerDuration;
    }

    /**
     * Sets the value of the occasionalTravellerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasionalTravellerDuration(Duration value) {
        this.occasionalTravellerDuration = value;
    }

    /**
     * Gets the value of the mobilityRestrictedTravellerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMobilityRestrictedTravellerDuration() {
        return mobilityRestrictedTravellerDuration;
    }

    /**
     * Sets the value of the mobilityRestrictedTravellerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityRestrictedTravellerDuration(Duration value) {
        this.mobilityRestrictedTravellerDuration = value;
    }

    public TransferDurationStructure withDefaultDuration(Duration value) {
        setDefaultDuration(value);
        return this;
    }

    public TransferDurationStructure withFrequentTravellerDuration(Duration value) {
        setFrequentTravellerDuration(value);
        return this;
    }

    public TransferDurationStructure withOccasionalTravellerDuration(Duration value) {
        setOccasionalTravellerDuration(value);
        return this;
    }

    public TransferDurationStructure withMobilityRestrictedTravellerDuration(Duration value) {
        setMobilityRestrictedTravellerDuration(value);
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