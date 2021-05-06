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
 * <p>Java class for quays_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quays_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}QuayRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}Quay"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quays_RelStructure", propOrder = {
    "quayRefOrQuay"
})
public class Quays_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "QuayRef", type = QuayRefStructure.class),
        @XmlElement(name = "Quay", type = Quay.class)
    })
    protected List<Object> quayRefOrQuay;

    /**
     * Gets the value of the quayRefOrQuay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quayRefOrQuay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuayRefOrQuay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuayRefStructure }
     * {@link Quay }
     * 
     * 
     */
    public List<Object> getQuayRefOrQuay() {
        if (quayRefOrQuay == null) {
            quayRefOrQuay = new ArrayList<Object>();
        }
        return this.quayRefOrQuay;
    }

    public Quays_RelStructure withQuayRefOrQuay(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getQuayRefOrQuay().add(value);
            }
        }
        return this;
    }

    public Quays_RelStructure withQuayRefOrQuay(Collection<Object> values) {
        if (values!= null) {
            getQuayRefOrQuay().addAll(values);
        }
        return this;
    }

    @Override
    public Quays_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public Quays_RelStructure withId(String value) {
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
