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
 * <p>Java class for propertiesOfDay_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertiesOfDay_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}PropertyOfDay" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertiesOfDay_RelStructure", propOrder = {
    "propertyOfDay"
})
public class PropertiesOfDay_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "PropertyOfDay", required = true)
    protected List<PropertyOfDay> propertyOfDay;

    /**
     * Gets the value of the propertyOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyOfDay }
     * 
     * 
     */
    public List<PropertyOfDay> getPropertyOfDay() {
        if (propertyOfDay == null) {
            propertyOfDay = new ArrayList<PropertyOfDay>();
        }
        return this.propertyOfDay;
    }

    public PropertiesOfDay_RelStructure withPropertyOfDay(PropertyOfDay... values) {
        if (values!= null) {
            for (PropertyOfDay value: values) {
                getPropertyOfDay().add(value);
            }
        }
        return this;
    }

    public PropertiesOfDay_RelStructure withPropertyOfDay(Collection<PropertyOfDay> values) {
        if (values!= null) {
            getPropertyOfDay().addAll(values);
        }
        return this;
    }

    @Override
    public PropertiesOfDay_RelStructure withId(String value) {
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
