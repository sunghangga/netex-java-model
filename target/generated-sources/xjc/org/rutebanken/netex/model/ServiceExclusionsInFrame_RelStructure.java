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
 * <p>Java class for serviceExclusionsInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceExclusionsInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceExclusion" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceExclusionsInFrame_RelStructure", propOrder = {
    "serviceExclusion"
})
public class ServiceExclusionsInFrame_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElement(name = "ServiceExclusion", required = true)
    protected List<ServiceExclusion> serviceExclusion;

    /**
     * Gets the value of the serviceExclusion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceExclusion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceExclusion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceExclusion }
     * 
     * 
     */
    public List<ServiceExclusion> getServiceExclusion() {
        if (serviceExclusion == null) {
            serviceExclusion = new ArrayList<ServiceExclusion>();
        }
        return this.serviceExclusion;
    }

    public ServiceExclusionsInFrame_RelStructure withServiceExclusion(ServiceExclusion... values) {
        if (values!= null) {
            for (ServiceExclusion value: values) {
                getServiceExclusion().add(value);
            }
        }
        return this;
    }

    public ServiceExclusionsInFrame_RelStructure withServiceExclusion(Collection<ServiceExclusion> values) {
        if (values!= null) {
            getServiceExclusion().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceExclusionsInFrame_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public ServiceExclusionsInFrame_RelStructure withId(String value) {
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
