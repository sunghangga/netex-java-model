//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TrainSizeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainSizeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumberOfCars" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TrainSizeType" type="{http://www.netex.org.uk/netex}TrainSizeEnumeration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainSizeStructure", propOrder = {
    "numberOfCars",
    "trainSizeType"
})
public class TrainSizeStructure {

    @XmlElement(name = "NumberOfCars")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfCars;
    @XmlElement(name = "TrainSizeType", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainSizeEnumeration trainSizeType;

    /**
     * Gets the value of the numberOfCars property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Sets the value of the numberOfCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCars(BigInteger value) {
        this.numberOfCars = value;
    }

    /**
     * Gets the value of the trainSizeType property.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public TrainSizeEnumeration getTrainSizeType() {
        return trainSizeType;
    }

    /**
     * Sets the value of the trainSizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public void setTrainSizeType(TrainSizeEnumeration value) {
        this.trainSizeType = value;
    }

    public TrainSizeStructure withNumberOfCars(BigInteger value) {
        setNumberOfCars(value);
        return this;
    }

    public TrainSizeStructure withTrainSizeType(TrainSizeEnumeration value) {
        setTrainSizeType(value);
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
