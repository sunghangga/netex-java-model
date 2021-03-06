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
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for validableElementPrices_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validableElementPrices_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidableElementPriceRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidableElementPrice"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}CellRef_"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validableElementPrices_RelStructure", propOrder = {
    "validableElementPriceRefOrValidableElementPriceOrCellRef_"
})
public class ValidableElementPrices_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "CellRef_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidableElementPrice", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidableElementPriceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> validableElementPriceRefOrValidableElementPriceOrCellRef_;

    /**
     * Gets the value of the validableElementPriceRefOrValidableElementPriceOrCellRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validableElementPriceRefOrValidableElementPriceOrCellRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidableElementPriceRefOrValidableElementPriceOrCellRef_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VersionOfObjectRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElementPrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CellRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidableElementPriceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getValidableElementPriceRefOrValidableElementPriceOrCellRef_() {
        if (validableElementPriceRefOrValidableElementPriceOrCellRef_ == null) {
            validableElementPriceRefOrValidableElementPriceOrCellRef_ = new ArrayList<JAXBElement<?>>();
        }
        return this.validableElementPriceRefOrValidableElementPriceOrCellRef_;
    }

    public ValidableElementPrices_RelStructure withValidableElementPriceRefOrValidableElementPriceOrCellRef_(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getValidableElementPriceRefOrValidableElementPriceOrCellRef_().add(value);
            }
        }
        return this;
    }

    public ValidableElementPrices_RelStructure withValidableElementPriceRefOrValidableElementPriceOrCellRef_(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getValidableElementPriceRefOrValidableElementPriceOrCellRef_().addAll(values);
        }
        return this;
    }

    @Override
    public ValidableElementPrices_RelStructure withId(String value) {
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
