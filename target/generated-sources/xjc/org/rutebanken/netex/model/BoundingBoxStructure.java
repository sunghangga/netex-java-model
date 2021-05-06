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
 * <p>Java class for BoundingBoxStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBoxStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpperLeft" type="{http://www.netex.org.uk/netex}LocationStructure"/&gt;
 *         &lt;element name="LowerRight" type="{http://www.netex.org.uk/netex}LocationStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBoxStructure", propOrder = {
    "upperLeft",
    "lowerRight"
})
public class BoundingBoxStructure {

    @XmlElement(name = "UpperLeft", required = true)
    protected LocationStructure upperLeft;
    @XmlElement(name = "LowerRight", required = true)
    protected LocationStructure lowerRight;

    /**
     * Gets the value of the upperLeft property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getUpperLeft() {
        return upperLeft;
    }

    /**
     * Sets the value of the upperLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setUpperLeft(LocationStructure value) {
        this.upperLeft = value;
    }

    /**
     * Gets the value of the lowerRight property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLowerRight() {
        return lowerRight;
    }

    /**
     * Sets the value of the lowerRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLowerRight(LocationStructure value) {
        this.lowerRight = value;
    }

    public BoundingBoxStructure withUpperLeft(LocationStructure value) {
        setUpperLeft(value);
        return this;
    }

    public BoundingBoxStructure withLowerRight(LocationStructure value) {
        setLowerRight(value);
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
