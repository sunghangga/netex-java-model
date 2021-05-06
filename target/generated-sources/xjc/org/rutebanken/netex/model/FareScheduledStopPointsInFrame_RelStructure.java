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
 * <p>Java class for fareScheduledStopPointsInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareScheduledStopPointsInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ScheduledStopPoint"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareScheduledStopPoint"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareScheduledStopPointsInFrame_RelStructure", propOrder = {
    "scheduledStopPointOrFareScheduledStopPoint"
})
public class FareScheduledStopPointsInFrame_RelStructure
    extends FrameContainmentStructure
{

    @XmlElements({
        @XmlElement(name = "ScheduledStopPoint", type = ScheduledStopPoint.class),
        @XmlElement(name = "FareScheduledStopPoint", type = FareScheduledStopPoint.class)
    })
    protected List<ScheduledStopPoint_VersionStructure> scheduledStopPointOrFareScheduledStopPoint;

    /**
     * Gets the value of the scheduledStopPointOrFareScheduledStopPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledStopPointOrFareScheduledStopPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledStopPointOrFareScheduledStopPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduledStopPoint }
     * {@link FareScheduledStopPoint }
     * 
     * 
     */
    public List<ScheduledStopPoint_VersionStructure> getScheduledStopPointOrFareScheduledStopPoint() {
        if (scheduledStopPointOrFareScheduledStopPoint == null) {
            scheduledStopPointOrFareScheduledStopPoint = new ArrayList<ScheduledStopPoint_VersionStructure>();
        }
        return this.scheduledStopPointOrFareScheduledStopPoint;
    }

    public FareScheduledStopPointsInFrame_RelStructure withScheduledStopPointOrFareScheduledStopPoint(ScheduledStopPoint_VersionStructure... values) {
        if (values!= null) {
            for (ScheduledStopPoint_VersionStructure value: values) {
                getScheduledStopPointOrFareScheduledStopPoint().add(value);
            }
        }
        return this;
    }

    public FareScheduledStopPointsInFrame_RelStructure withScheduledStopPointOrFareScheduledStopPoint(Collection<ScheduledStopPoint_VersionStructure> values) {
        if (values!= null) {
            getScheduledStopPointOrFareScheduledStopPoint().addAll(values);
        }
        return this;
    }

    @Override
    public FareScheduledStopPointsInFrame_RelStructure withId(String value) {
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