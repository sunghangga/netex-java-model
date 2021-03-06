//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DistanceMatrixElement_DerivedViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceMatrixElement_DerivedViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StartStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure"/&gt;
 *           &lt;element name="StartTariffZoneRef" type="{http://www.netex.org.uk/netex}TariffZoneRefStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="StartName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="EndStopPointRef" type="{http://www.netex.org.uk/netex}ScheduledStopPointRefStructure"/&gt;
 *           &lt;element name="EndTariffZoneRef" type="{http://www.netex.org.uk/netex}TariffZoneRefStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EndName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceMatrixElement_DerivedViewStructure", propOrder = {
    "startStopPointRef",
    "startTariffZoneRef",
    "startName",
    "endStopPointRef",
    "endTariffZoneRef",
    "endName"
})
public class DistanceMatrixElement_DerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "StartStopPointRef")
    protected ScheduledStopPointRefStructure startStopPointRef;
    @XmlElement(name = "StartTariffZoneRef")
    protected TariffZoneRefStructure startTariffZoneRef;
    @XmlElement(name = "StartName")
    protected MultilingualString startName;
    @XmlElement(name = "EndStopPointRef")
    protected ScheduledStopPointRefStructure endStopPointRef;
    @XmlElement(name = "EndTariffZoneRef")
    protected TariffZoneRefStructure endTariffZoneRef;
    @XmlElement(name = "EndName")
    protected MultilingualString endName;

    /**
     * Gets the value of the startStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getStartStopPointRef() {
        return startStopPointRef;
    }

    /**
     * Sets the value of the startStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setStartStopPointRef(ScheduledStopPointRefStructure value) {
        this.startStopPointRef = value;
    }

    /**
     * Gets the value of the startTariffZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getStartTariffZoneRef() {
        return startTariffZoneRef;
    }

    /**
     * Sets the value of the startTariffZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setStartTariffZoneRef(TariffZoneRefStructure value) {
        this.startTariffZoneRef = value;
    }

    /**
     * Gets the value of the startName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getStartName() {
        return startName;
    }

    /**
     * Sets the value of the startName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setStartName(MultilingualString value) {
        this.startName = value;
    }

    /**
     * Gets the value of the endStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getEndStopPointRef() {
        return endStopPointRef;
    }

    /**
     * Sets the value of the endStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setEndStopPointRef(ScheduledStopPointRefStructure value) {
        this.endStopPointRef = value;
    }

    /**
     * Gets the value of the endTariffZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public TariffZoneRefStructure getEndTariffZoneRef() {
        return endTariffZoneRef;
    }

    /**
     * Sets the value of the endTariffZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefStructure }
     *     
     */
    public void setEndTariffZoneRef(TariffZoneRefStructure value) {
        this.endTariffZoneRef = value;
    }

    /**
     * Gets the value of the endName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getEndName() {
        return endName;
    }

    /**
     * Sets the value of the endName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setEndName(MultilingualString value) {
        this.endName = value;
    }

    public DistanceMatrixElement_DerivedViewStructure withStartStopPointRef(ScheduledStopPointRefStructure value) {
        setStartStopPointRef(value);
        return this;
    }

    public DistanceMatrixElement_DerivedViewStructure withStartTariffZoneRef(TariffZoneRefStructure value) {
        setStartTariffZoneRef(value);
        return this;
    }

    public DistanceMatrixElement_DerivedViewStructure withStartName(MultilingualString value) {
        setStartName(value);
        return this;
    }

    public DistanceMatrixElement_DerivedViewStructure withEndStopPointRef(ScheduledStopPointRefStructure value) {
        setEndStopPointRef(value);
        return this;
    }

    public DistanceMatrixElement_DerivedViewStructure withEndTariffZoneRef(TariffZoneRefStructure value) {
        setEndTariffZoneRef(value);
        return this;
    }

    public DistanceMatrixElement_DerivedViewStructure withEndName(MultilingualString value) {
        setEndName(value);
        return this;
    }

    @Override
    public DistanceMatrixElement_DerivedViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DistanceMatrixElement_DerivedViewStructure withId(String value) {
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
