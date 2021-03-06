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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TopographicPlace_DerivedViewStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlace_DerivedViewStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TopographicPlaceRef" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}CountryRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlace_DerivedViewStructure", propOrder = {
    "topographicPlaceRef",
    "name",
    "shortName",
    "qualifierName",
    "countryRef"
})
@XmlSeeAlso({
    TopographicPlaceView.class
})
public class TopographicPlace_DerivedViewStructure
    extends DerivedViewStructure
{

    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "QualifierName")
    protected MultilingualString qualifierName;
    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;

    /**
     * Gets the value of the topographicPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Sets the value of the topographicPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
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

    /**
     * Gets the value of the qualifierName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getQualifierName() {
        return qualifierName;
    }

    /**
     * Sets the value of the qualifierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setQualifierName(MultilingualString value) {
        this.qualifierName = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    public TopographicPlace_DerivedViewStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public TopographicPlace_DerivedViewStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public TopographicPlace_DerivedViewStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public TopographicPlace_DerivedViewStructure withQualifierName(MultilingualString value) {
        setQualifierName(value);
        return this;
    }

    public TopographicPlace_DerivedViewStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public TopographicPlace_DerivedViewStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TopographicPlace_DerivedViewStructure withId(String value) {
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
