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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.LineStringType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for pointsOnLink_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pointsOnLink_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}PointOnLink" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LineString" type="{http://www.opengis.net/gml/3.2}LineStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointsOnLink_RelStructure", propOrder = {
    "pointOnLink",
    "lineString"
})
public class PointsOnLink_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "PointOnLink", required = true)
    protected List<PointOnLink> pointOnLink;
    @XmlElement(name = "LineString")
    protected LineStringType lineString;

    /**
     * Gets the value of the pointOnLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOnLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOnLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOnLink }
     * 
     * 
     */
    public List<PointOnLink> getPointOnLink() {
        if (pointOnLink == null) {
            pointOnLink = new ArrayList<PointOnLink>();
        }
        return this.pointOnLink;
    }

    /**
     * Gets the value of the lineString property.
     * 
     * @return
     *     possible object is
     *     {@link LineStringType }
     *     
     */
    public LineStringType getLineString() {
        return lineString;
    }

    /**
     * Sets the value of the lineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStringType }
     *     
     */
    public void setLineString(LineStringType value) {
        this.lineString = value;
    }

    public PointsOnLink_RelStructure withPointOnLink(PointOnLink... values) {
        if (values!= null) {
            for (PointOnLink value: values) {
                getPointOnLink().add(value);
            }
        }
        return this;
    }

    public PointsOnLink_RelStructure withPointOnLink(Collection<PointOnLink> values) {
        if (values!= null) {
            getPointOnLink().addAll(values);
        }
        return this;
    }

    public PointsOnLink_RelStructure withLineString(LineStringType value) {
        setLineString(value);
        return this;
    }

    @Override
    public PointsOnLink_RelStructure withId(String value) {
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