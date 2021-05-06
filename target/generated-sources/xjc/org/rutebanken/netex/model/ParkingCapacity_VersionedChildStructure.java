//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ParkingCapacity_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingCapacity_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingCapacityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingCapacity_VersionedChildStructure", propOrder = {
    "parkingRef",
    "parentRef",
    "parkingPropertiesRef",
    "parkingUserType",
    "parkingVehicleType",
    "parkingStayType",
    "numberOfSpaces",
    "numberOfSpacesWithRechargePoint"
})
@XmlSeeAlso({
    ParkingCapacity.class
})
public class ParkingCapacity_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "ParkingRef")
    protected ParkingRefStructure parkingRef;
    @XmlElement(name = "ParentRef")
    protected ParkingPropertiesRefStructure parentRef;
    @XmlElement(name = "ParkingPropertiesRef")
    protected ParkingPropertiesRefStructure parkingPropertiesRef;
    @XmlElement(name = "ParkingUserType")
    @XmlSchemaType(name = "string")
    protected ParkingUserEnumeration parkingUserType;
    @XmlElement(name = "ParkingVehicleType")
    @XmlSchemaType(name = "string")
    protected ParkingVehicleEnumeration parkingVehicleType;
    @XmlElement(name = "ParkingStayType")
    @XmlSchemaType(name = "string")
    protected ParkingStayEnumeration parkingStayType;
    @XmlElement(name = "NumberOfSpaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSpaces;
    @XmlElement(name = "NumberOfSpacesWithRechargePoint")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSpacesWithRechargePoint;

    /**
     * Gets the value of the parkingRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRefStructure }
     *     
     */
    public ParkingRefStructure getParkingRef() {
        return parkingRef;
    }

    /**
     * Sets the value of the parkingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRefStructure }
     *     
     */
    public void setParkingRef(ParkingRefStructure value) {
        this.parkingRef = value;
    }

    /**
     * Gets the value of the parentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public ParkingPropertiesRefStructure getParentRef() {
        return parentRef;
    }

    /**
     * Sets the value of the parentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public void setParentRef(ParkingPropertiesRefStructure value) {
        this.parentRef = value;
    }

    /**
     * Gets the value of the parkingPropertiesRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public ParkingPropertiesRefStructure getParkingPropertiesRef() {
        return parkingPropertiesRef;
    }

    /**
     * Sets the value of the parkingPropertiesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public void setParkingPropertiesRef(ParkingPropertiesRefStructure value) {
        this.parkingPropertiesRef = value;
    }

    /**
     * Gets the value of the parkingUserType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public ParkingUserEnumeration getParkingUserType() {
        return parkingUserType;
    }

    /**
     * Sets the value of the parkingUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUserEnumeration }
     *     
     */
    public void setParkingUserType(ParkingUserEnumeration value) {
        this.parkingUserType = value;
    }

    /**
     * Gets the value of the parkingVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public ParkingVehicleEnumeration getParkingVehicleType() {
        return parkingVehicleType;
    }

    /**
     * Sets the value of the parkingVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public void setParkingVehicleType(ParkingVehicleEnumeration value) {
        this.parkingVehicleType = value;
    }

    /**
     * Gets the value of the parkingStayType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public ParkingStayEnumeration getParkingStayType() {
        return parkingStayType;
    }

    /**
     * Sets the value of the parkingStayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingStayEnumeration }
     *     
     */
    public void setParkingStayType(ParkingStayEnumeration value) {
        this.parkingStayType = value;
    }

    /**
     * Gets the value of the numberOfSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpaces() {
        return numberOfSpaces;
    }

    /**
     * Sets the value of the numberOfSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpaces(BigInteger value) {
        this.numberOfSpaces = value;
    }

    /**
     * Gets the value of the numberOfSpacesWithRechargePoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpacesWithRechargePoint() {
        return numberOfSpacesWithRechargePoint;
    }

    /**
     * Sets the value of the numberOfSpacesWithRechargePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpacesWithRechargePoint(BigInteger value) {
        this.numberOfSpacesWithRechargePoint = value;
    }

    public ParkingCapacity_VersionedChildStructure withParkingRef(ParkingRefStructure value) {
        setParkingRef(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withParentRef(ParkingPropertiesRefStructure value) {
        setParentRef(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withParkingPropertiesRef(ParkingPropertiesRefStructure value) {
        setParkingPropertiesRef(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withParkingUserType(ParkingUserEnumeration value) {
        setParkingUserType(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withParkingVehicleType(ParkingVehicleEnumeration value) {
        setParkingVehicleType(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withParkingStayType(ParkingStayEnumeration value) {
        setParkingStayType(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withNumberOfSpaces(BigInteger value) {
        setNumberOfSpaces(value);
        return this;
    }

    public ParkingCapacity_VersionedChildStructure withNumberOfSpacesWithRechargePoint(BigInteger value) {
        setNumberOfSpacesWithRechargePoint(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ParkingCapacity_VersionedChildStructure withId(String value) {
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
