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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for defaultDeadRunRunTimes_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="defaultDeadRunRunTimes_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}DefaultDeadRunRunTime" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaultDeadRunRunTimes_RelStructure", propOrder = {
    "defaultDeadRunRunTime"
})
public class DefaultDeadRunRunTimes_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "DefaultDeadRunRunTime", required = true)
    protected List<DefaultDeadRunRunTime> defaultDeadRunRunTime;

    /**
     * Gets the value of the defaultDeadRunRunTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultDeadRunRunTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultDeadRunRunTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultDeadRunRunTime }
     * 
     * 
     */
    public List<DefaultDeadRunRunTime> getDefaultDeadRunRunTime() {
        if (defaultDeadRunRunTime == null) {
            defaultDeadRunRunTime = new ArrayList<DefaultDeadRunRunTime>();
        }
        return this.defaultDeadRunRunTime;
    }

    public DefaultDeadRunRunTimes_RelStructure withDefaultDeadRunRunTime(DefaultDeadRunRunTime... values) {
        if (values!= null) {
            for (DefaultDeadRunRunTime value: values) {
                getDefaultDeadRunRunTime().add(value);
            }
        }
        return this;
    }

    public DefaultDeadRunRunTimes_RelStructure withDefaultDeadRunRunTime(Collection<DefaultDeadRunRunTime> values) {
        if (values!= null) {
            getDefaultDeadRunRunTime().addAll(values);
        }
        return this;
    }

    @Override
    public DefaultDeadRunRunTimes_RelStructure withId(String value) {
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
