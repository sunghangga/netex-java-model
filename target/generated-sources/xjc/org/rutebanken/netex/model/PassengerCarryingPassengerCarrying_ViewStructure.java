//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PassengerCarryingPassengerCarrying_ViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerCarryingPassengerCarrying_ViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerCarryingRequirementGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCarryingPassengerCarrying_ViewStructure", propOrder = {
    "passengerCapacity",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "boardingHeight",
    "gapToPlatform"
})
public class PassengerCarryingPassengerCarrying_ViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "PassengerCapacity")
    protected PassengerCapacity passengerCapacity;
    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HasLiftOrRamp")
    protected Boolean hasLiftOrRamp;
    @XmlElement(name = "HasHoist")
    protected Boolean hasHoist;
    @XmlElement(name = "BoardingHeight")
    protected BigDecimal boardingHeight;
    @XmlElement(name = "GapToPlatform")
    protected BigDecimal gapToPlatform;

    /**
     * Gets the value of the passengerCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCapacity }
     *     
     */
    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Sets the value of the passengerCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCapacity }
     *     
     */
    public void setPassengerCapacity(PassengerCapacity value) {
        this.passengerCapacity = value;
    }

    /**
     * Gets the value of the lowFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowFloor() {
        return lowFloor;
    }

    /**
     * Sets the value of the lowFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFloor(Boolean value) {
        this.lowFloor = value;
    }

    /**
     * Gets the value of the hasLiftOrRamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiftOrRamp() {
        return hasLiftOrRamp;
    }

    /**
     * Sets the value of the hasLiftOrRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiftOrRamp(Boolean value) {
        this.hasLiftOrRamp = value;
    }

    /**
     * Gets the value of the hasHoist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHoist() {
        return hasHoist;
    }

    /**
     * Sets the value of the hasHoist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHoist(Boolean value) {
        this.hasHoist = value;
    }

    /**
     * Gets the value of the boardingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBoardingHeight() {
        return boardingHeight;
    }

    /**
     * Sets the value of the boardingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBoardingHeight(BigDecimal value) {
        this.boardingHeight = value;
    }

    /**
     * Gets the value of the gapToPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGapToPlatform() {
        return gapToPlatform;
    }

    /**
     * Sets the value of the gapToPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGapToPlatform(BigDecimal value) {
        this.gapToPlatform = value;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withPassengerCapacity(PassengerCapacity value) {
        setPassengerCapacity(value);
        return this;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withBoardingHeight(BigDecimal value) {
        setBoardingHeight(value);
        return this;
    }

    public PassengerCarryingPassengerCarrying_ViewStructure withGapToPlatform(BigDecimal value) {
        setGapToPlatform(value);
        return this;
    }

    @Override
    public PassengerCarryingPassengerCarrying_ViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PassengerCarryingPassengerCarrying_ViewStructure withId(String value) {
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