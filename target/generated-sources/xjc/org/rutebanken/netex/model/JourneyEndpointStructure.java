//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for JourneyEndpointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyEndpointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ScheduledStopPointRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}DestinationDisplayRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}PlaceRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyEndpointStructure", propOrder = {
    "name",
    "scheduledStopPointRef",
    "destinationDisplayRef",
    "placeRef"
})
public class JourneyEndpointStructure {

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ScheduledStopPointRefStructure> scheduledStopPointRef;
    @XmlElement(name = "DestinationDisplayRef")
    protected DestinationDisplayRefStructure destinationDisplayRef;
    @XmlElement(name = "PlaceRef")
    protected PlaceRef placeRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the scheduledStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ScheduledStopPointRefStructure> getScheduledStopPointRef() {
        return scheduledStopPointRef;
    }

    /**
     * Sets the value of the scheduledStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     *     
     */
    public void setScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        this.scheduledStopPointRef = value;
    }

    /**
     * Gets the value of the destinationDisplayRef property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public DestinationDisplayRefStructure getDestinationDisplayRef() {
        return destinationDisplayRef;
    }

    /**
     * Sets the value of the destinationDisplayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefStructure }
     *     
     */
    public void setDestinationDisplayRef(DestinationDisplayRefStructure value) {
        this.destinationDisplayRef = value;
    }

    /**
     * Gets the value of the placeRef property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRef }
     *     
     */
    public PlaceRef getPlaceRef() {
        return placeRef;
    }

    /**
     * Sets the value of the placeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRef }
     *     
     */
    public void setPlaceRef(PlaceRef value) {
        this.placeRef = value;
    }

    public JourneyEndpointStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public JourneyEndpointStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    public JourneyEndpointStructure withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    public JourneyEndpointStructure withPlaceRef(PlaceRef value) {
        setPlaceRef(value);
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
