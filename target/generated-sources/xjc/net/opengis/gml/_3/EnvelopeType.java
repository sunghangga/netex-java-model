//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package net.opengis.gml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for EnvelopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="lowerCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/&gt;
 *           &lt;element name="upperCorner" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}pos" maxOccurs="2" minOccurs="2"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}SRSReferenceGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
    "lowerCorner",
    "upperCorner",
    "pos"
})
public class EnvelopeType {

    protected DirectPositionType lowerCorner;
    protected DirectPositionType upperCorner;
    protected List<DirectPositionType> pos;
    @XmlAttribute(name = "srsName")
    @XmlSchemaType(name = "anyURI")
    protected String srsName;
    @XmlAttribute(name = "srsDimension")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger srsDimension;

    /**
     * Gets the value of the lowerCorner property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLowerCorner() {
        return lowerCorner;
    }

    /**
     * Sets the value of the lowerCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLowerCorner(DirectPositionType value) {
        this.lowerCorner = value;
    }

    /**
     * Gets the value of the upperCorner property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getUpperCorner() {
        return upperCorner;
    }

    /**
     * Sets the value of the upperCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setUpperCorner(DirectPositionType value) {
        this.upperCorner = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * 
     * 
     */
    public List<DirectPositionType> getPos() {
        if (pos == null) {
            pos = new ArrayList<DirectPositionType>();
        }
        return this.pos;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Sets the value of the srsDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    public EnvelopeType withLowerCorner(DirectPositionType value) {
        setLowerCorner(value);
        return this;
    }

    public EnvelopeType withUpperCorner(DirectPositionType value) {
        setUpperCorner(value);
        return this;
    }

    public EnvelopeType withPos(DirectPositionType... values) {
        if (values!= null) {
            for (DirectPositionType value: values) {
                getPos().add(value);
            }
        }
        return this;
    }

    public EnvelopeType withPos(Collection<DirectPositionType> values) {
        if (values!= null) {
            getPos().addAll(values);
        }
        return this;
    }

    public EnvelopeType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    public EnvelopeType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
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
