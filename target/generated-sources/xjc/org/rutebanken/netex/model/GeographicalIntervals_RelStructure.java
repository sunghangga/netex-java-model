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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for geographicalIntervals_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geographicalIntervals_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}GeographicalIntervalRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}GeographicalInterval"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geographicalIntervals_RelStructure", propOrder = {
    "geographicalIntervalRefOrGeographicalInterval"
})
public class GeographicalIntervals_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "GeographicalIntervalRef", type = GeographicalIntervalRefStructure.class),
        @XmlElement(name = "GeographicalInterval", type = GeographicalInterval.class)
    })
    protected List<Object> geographicalIntervalRefOrGeographicalInterval;

    /**
     * Gets the value of the geographicalIntervalRefOrGeographicalInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicalIntervalRefOrGeographicalInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicalIntervalRefOrGeographicalInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicalIntervalRefStructure }
     * {@link GeographicalInterval }
     * 
     * 
     */
    public List<Object> getGeographicalIntervalRefOrGeographicalInterval() {
        if (geographicalIntervalRefOrGeographicalInterval == null) {
            geographicalIntervalRefOrGeographicalInterval = new ArrayList<Object>();
        }
        return this.geographicalIntervalRefOrGeographicalInterval;
    }

    public GeographicalIntervals_RelStructure withGeographicalIntervalRefOrGeographicalInterval(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getGeographicalIntervalRefOrGeographicalInterval().add(value);
            }
        }
        return this;
    }

    public GeographicalIntervals_RelStructure withGeographicalIntervalRefOrGeographicalInterval(Collection<Object> values) {
        if (values!= null) {
            getGeographicalIntervalRefOrGeographicalInterval().addAll(values);
        }
        return this;
    }

    @Override
    public GeographicalIntervals_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public GeographicalIntervals_RelStructure withId(String value) {
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