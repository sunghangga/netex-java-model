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
 * <p>Java class for fareTableRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fareTableRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}FareTableRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fareTableRefs_RelStructure", propOrder = {
    "fareTableRef"
})
public class FareTableRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends FareTableRefStructure>> fareTableRef;

    /**
     * Gets the value of the fareTableRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTableRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareTableRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FareTableRefStructure>> getFareTableRef() {
        if (fareTableRef == null) {
            fareTableRef = new ArrayList<JAXBElement<? extends FareTableRefStructure>>();
        }
        return this.fareTableRef;
    }

    public FareTableRefs_RelStructure withFareTableRef(JAXBElement<? extends FareTableRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends FareTableRefStructure> value: values) {
                getFareTableRef().add(value);
            }
        }
        return this;
    }

    public FareTableRefs_RelStructure withFareTableRef(Collection<JAXBElement<? extends FareTableRefStructure>> values) {
        if (values!= null) {
            getFareTableRef().addAll(values);
        }
        return this;
    }

    @Override
    public FareTableRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public FareTableRefs_RelStructure withId(String value) {
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
