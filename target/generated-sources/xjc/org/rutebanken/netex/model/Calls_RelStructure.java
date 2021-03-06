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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for calls_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calls_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}Call_" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calls_RelStructure", propOrder = {
    "call_"
})
public class Calls_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRef(name = "Call_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends VersionedChildStructure>> call_;

    /**
     * Gets the value of the call property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the call property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCall_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Call }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedCall }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedCallZ }{@code >}
     * {@link JAXBElement }{@code <}{@link CallZ }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionedChildStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionedChildStructure>> getCall_() {
        if (call_ == null) {
            call_ = new ArrayList<JAXBElement<? extends VersionedChildStructure>>();
        }
        return this.call_;
    }

    public Calls_RelStructure withCall_(JAXBElement<? extends VersionedChildStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends VersionedChildStructure> value: values) {
                getCall_().add(value);
            }
        }
        return this;
    }

    public Calls_RelStructure withCall_(Collection<JAXBElement<? extends VersionedChildStructure>> values) {
        if (values!= null) {
            getCall_().addAll(values);
        }
        return this;
    }

    @Override
    public Calls_RelStructure withId(String value) {
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
