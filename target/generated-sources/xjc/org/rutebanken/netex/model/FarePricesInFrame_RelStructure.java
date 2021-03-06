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
 * <p>Java class for farePricesInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farePricesInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}PriceGroup_"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farePricesInFrame_RelStructure", propOrder = {
    "priceGroup_"
})
public class FarePricesInFrame_RelStructure
    extends FrameContainmentStructure
{

    @XmlElementRef(name = "PriceGroup_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends GroupOfEntities_VersionStructure>> priceGroup_;

    /**
     * Gets the value of the priceGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceGroup_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PriceGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfEntities_VersionStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GroupOfEntities_VersionStructure>> getPriceGroup_() {
        if (priceGroup_ == null) {
            priceGroup_ = new ArrayList<JAXBElement<? extends GroupOfEntities_VersionStructure>>();
        }
        return this.priceGroup_;
    }

    public FarePricesInFrame_RelStructure withPriceGroup_(JAXBElement<? extends GroupOfEntities_VersionStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends GroupOfEntities_VersionStructure> value: values) {
                getPriceGroup_().add(value);
            }
        }
        return this;
    }

    public FarePricesInFrame_RelStructure withPriceGroup_(Collection<JAXBElement<? extends GroupOfEntities_VersionStructure>> values) {
        if (values!= null) {
            getPriceGroup_().addAll(values);
        }
        return this;
    }

    @Override
    public FarePricesInFrame_RelStructure withId(String value) {
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
