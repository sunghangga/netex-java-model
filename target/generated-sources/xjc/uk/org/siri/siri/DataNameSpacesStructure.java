//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DataNameSpacesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataNameSpacesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopPointNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="LineNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategoryNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="ServiceFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="VehicleFeatureNameSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataNameSpacesStructure", propOrder = {
    "stopPointNameSpace",
    "lineNameSpace",
    "productCategoryNameSpace",
    "serviceFeatureNameSpace",
    "vehicleFeatureNameSpace"
})
public class DataNameSpacesStructure {

    @XmlElement(name = "StopPointNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String stopPointNameSpace;
    @XmlElement(name = "LineNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String lineNameSpace;
    @XmlElement(name = "ProductCategoryNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String productCategoryNameSpace;
    @XmlElement(name = "ServiceFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String serviceFeatureNameSpace;
    @XmlElement(name = "VehicleFeatureNameSpace")
    @XmlSchemaType(name = "anyURI")
    protected String vehicleFeatureNameSpace;

    /**
     * Gets the value of the stopPointNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopPointNameSpace() {
        return stopPointNameSpace;
    }

    /**
     * Sets the value of the stopPointNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopPointNameSpace(String value) {
        this.stopPointNameSpace = value;
    }

    /**
     * Gets the value of the lineNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNameSpace() {
        return lineNameSpace;
    }

    /**
     * Sets the value of the lineNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNameSpace(String value) {
        this.lineNameSpace = value;
    }

    /**
     * Gets the value of the productCategoryNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategoryNameSpace() {
        return productCategoryNameSpace;
    }

    /**
     * Sets the value of the productCategoryNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategoryNameSpace(String value) {
        this.productCategoryNameSpace = value;
    }

    /**
     * Gets the value of the serviceFeatureNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFeatureNameSpace() {
        return serviceFeatureNameSpace;
    }

    /**
     * Sets the value of the serviceFeatureNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFeatureNameSpace(String value) {
        this.serviceFeatureNameSpace = value;
    }

    /**
     * Gets the value of the vehicleFeatureNameSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFeatureNameSpace() {
        return vehicleFeatureNameSpace;
    }

    /**
     * Sets the value of the vehicleFeatureNameSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFeatureNameSpace(String value) {
        this.vehicleFeatureNameSpace = value;
    }

    public DataNameSpacesStructure withStopPointNameSpace(String value) {
        setStopPointNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withLineNameSpace(String value) {
        setLineNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withProductCategoryNameSpace(String value) {
        setProductCategoryNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withServiceFeatureNameSpace(String value) {
        setServiceFeatureNameSpace(value);
        return this;
    }

    public DataNameSpacesStructure withVehicleFeatureNameSpace(String value) {
        setVehicleFeatureNameSpace(value);
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