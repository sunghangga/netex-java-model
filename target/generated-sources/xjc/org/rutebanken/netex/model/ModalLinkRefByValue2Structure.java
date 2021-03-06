//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Java class for ModalLinkRefByValue2Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModalLinkRefByValue2Structure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure"/&gt;
 *         &lt;element name="ToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfLinkRef" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}VehicleMode" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}ReferenceModificationDetailsGroup"/&gt;
 *       &lt;attribute name="nameOfClass" type="{http://www.netex.org.uk/netex}NameOfClass" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalLinkRefByValue2Structure", propOrder = {
    "fromPointRef",
    "toPointRef",
    "typeOfLinkRef",
    "vehicleMode"
})
public class ModalLinkRefByValue2Structure {

    @XmlElement(name = "FromPointRef", required = true)
    protected PointRefStructure fromPointRef;
    @XmlElement(name = "ToPointRef", required = true)
    protected PointRefStructure toPointRef;
    @XmlElement(name = "TypeOfLinkRef")
    protected TypeOfLinkRefStructure typeOfLinkRef;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllModesEnumeration vehicleMode;
    @XmlAttribute(name = "nameOfClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClass;
    @XmlAttribute(name = "created")
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime created;
    @XmlAttribute(name = "changed")
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime changed;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the fromPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Sets the value of the fromPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setFromPointRef(PointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Gets the value of the toPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Sets the value of the toPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setToPointRef(PointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Gets the value of the typeOfLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLinkRefStructure }
     *     
     */
    public TypeOfLinkRefStructure getTypeOfLinkRef() {
        return typeOfLinkRef;
    }

    /**
     * Sets the value of the typeOfLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLinkRefStructure }
     *     
     */
    public void setTypeOfLinkRef(TypeOfLinkRefStructure value) {
        this.typeOfLinkRef = value;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * @return
     *     possible object is
     *     {@link AllModesEnumeration }
     *     
     */
    public AllModesEnumeration getVehicleMode() {
        return vehicleMode;
    }

    /**
     * Sets the value of the vehicleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllModesEnumeration }
     *     
     */
    public void setVehicleMode(AllModesEnumeration value) {
        this.vehicleMode = value;
    }

    /**
     * Gets the value of the nameOfClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * Sets the value of the nameOfClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(LocalDateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanged(LocalDateTime value) {
        this.changed = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public ModalLinkRefByValue2Structure withFromPointRef(PointRefStructure value) {
        setFromPointRef(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withToPointRef(PointRefStructure value) {
        setToPointRef(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withTypeOfLinkRef(TypeOfLinkRefStructure value) {
        setTypeOfLinkRef(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withVehicleMode(AllModesEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    public ModalLinkRefByValue2Structure withVersion(String value) {
        setVersion(value);
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
