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
 * <p>Java class for cappingRules_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cappingRules_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}CappingRule" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cappingRules_RelStructure", propOrder = {
    "cappingRule"
})
public class CappingRules_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "CappingRule", required = true)
    protected List<CappingRule> cappingRule;

    /**
     * Gets the value of the cappingRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cappingRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCappingRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CappingRule }
     * 
     * 
     */
    public List<CappingRule> getCappingRule() {
        if (cappingRule == null) {
            cappingRule = new ArrayList<CappingRule>();
        }
        return this.cappingRule;
    }

    public CappingRules_RelStructure withCappingRule(CappingRule... values) {
        if (values!= null) {
            for (CappingRule value: values) {
                getCappingRule().add(value);
            }
        }
        return this;
    }

    public CappingRules_RelStructure withCappingRule(Collection<CappingRule> values) {
        if (values!= null) {
            getCappingRule().addAll(values);
        }
        return this;
    }

    @Override
    public CappingRules_RelStructure withId(String value) {
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
