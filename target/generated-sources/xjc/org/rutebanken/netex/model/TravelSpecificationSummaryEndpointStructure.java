//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TravelSpecificationSummaryEndpointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelSpecificationSummaryEndpointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationSummaryEndPointPlaceGroup"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ScheduledStopPointView" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}QuayRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}BoardingPositionRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TariffZoneRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSpecificationSummaryEndpointStructure", propOrder = {
    "topographicPlaceView",
    "addressRef",
    "scheduledStopPointView",
    "quayRef",
    "boardingPositionRef",
    "tariffZoneRef"
})
public class TravelSpecificationSummaryEndpointStructure {

    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;
    @XmlElementRef(name = "AddressRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AddressRefStructure> addressRef;
    @XmlElement(name = "ScheduledStopPointView")
    protected ScheduledStopPoint_DerivedViewStructure scheduledStopPointView;
    @XmlElement(name = "QuayRef")
    protected QuayRefStructure quayRef;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "TariffZoneRef")
    protected List<TariffZoneRef> tariffZoneRef;

    /**
     * Gets the value of the topographicPlaceView property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Sets the value of the topographicPlaceView property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    /**
     * Gets the value of the addressRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AddressRefStructure> getAddressRef() {
        return addressRef;
    }

    /**
     * Sets the value of the addressRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     *     
     */
    public void setAddressRef(JAXBElement<? extends AddressRefStructure> value) {
        this.addressRef = value;
    }

    /**
     * Gets the value of the scheduledStopPointView property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPoint_DerivedViewStructure }
     *     
     */
    public ScheduledStopPoint_DerivedViewStructure getScheduledStopPointView() {
        return scheduledStopPointView;
    }

    /**
     * Sets the value of the scheduledStopPointView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPoint_DerivedViewStructure }
     *     
     */
    public void setScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        this.scheduledStopPointView = value;
    }

    /**
     * Gets the value of the quayRef property.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getQuayRef() {
        return quayRef;
    }

    /**
     * Sets the value of the quayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setQuayRef(QuayRefStructure value) {
        this.quayRef = value;
    }

    /**
     * Gets the value of the boardingPositionRef property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getBoardingPositionRef() {
        return boardingPositionRef;
    }

    /**
     * Sets the value of the boardingPositionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setBoardingPositionRef(BoardingPositionRefStructure value) {
        this.boardingPositionRef = value;
    }

    /**
     * Gets the value of the tariffZoneRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffZoneRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffZoneRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffZoneRef }
     * 
     * 
     */
    public List<TariffZoneRef> getTariffZoneRef() {
        if (tariffZoneRef == null) {
            tariffZoneRef = new ArrayList<TariffZoneRef>();
        }
        return this.tariffZoneRef;
    }

    public TravelSpecificationSummaryEndpointStructure withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withAddressRef(JAXBElement<? extends AddressRefStructure> value) {
        setAddressRef(value);
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withScheduledStopPointView(ScheduledStopPoint_DerivedViewStructure value) {
        setScheduledStopPointView(value);
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withQuayRef(QuayRefStructure value) {
        setQuayRef(value);
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withBoardingPositionRef(BoardingPositionRefStructure value) {
        setBoardingPositionRef(value);
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withTariffZoneRef(TariffZoneRef... values) {
        if (values!= null) {
            for (TariffZoneRef value: values) {
                getTariffZoneRef().add(value);
            }
        }
        return this;
    }

    public TravelSpecificationSummaryEndpointStructure withTariffZoneRef(Collection<TariffZoneRef> values) {
        if (values!= null) {
            getTariffZoneRef().addAll(values);
        }
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
