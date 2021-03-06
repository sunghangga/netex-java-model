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
 * <p>Java class for PointOfInterest_DerivedViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterest_DerivedViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointOfInterestRef" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="placeTypes" type="{http://www.netex.org.uk/netex}typeOfPlaceRefs_RelStructure" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterest_DerivedViewStructure", propOrder = {
    "pointOfInterestRef",
    "name",
    "placeTypes",
    "shortName"
})
public class PointOfInterest_DerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "PointOfInterestRef")
    protected PointOfInterestRefStructure pointOfInterestRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    protected TypeOfPlaceRefs_RelStructure placeTypes;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;

    /**
     * Gets the value of the pointOfInterestRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public PointOfInterestRefStructure getPointOfInterestRef() {
        return pointOfInterestRef;
    }

    /**
     * Sets the value of the pointOfInterestRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestRefStructure }
     *     
     */
    public void setPointOfInterestRef(PointOfInterestRefStructure value) {
        this.pointOfInterestRef = value;
    }

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
     * Gets the value of the placeTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPlaceRefs_RelStructure }
     *     
     */
    public TypeOfPlaceRefs_RelStructure getPlaceTypes() {
        return placeTypes;
    }

    /**
     * Sets the value of the placeTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPlaceRefs_RelStructure }
     *     
     */
    public void setPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        this.placeTypes = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    public PointOfInterest_DerivedViewStructure withPointOfInterestRef(PointOfInterestRefStructure value) {
        setPointOfInterestRef(value);
        return this;
    }

    public PointOfInterest_DerivedViewStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public PointOfInterest_DerivedViewStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    public PointOfInterest_DerivedViewStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public PointOfInterest_DerivedViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PointOfInterest_DerivedViewStructure withId(String value) {
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
