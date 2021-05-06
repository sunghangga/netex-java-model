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
 * <p>Java class for travelSpecificationRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="travelSpecificationRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TravelSpecificationRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "travelSpecificationRefs_RelStructure", propOrder = {
    "travelSpecificationRef"
})
public class TravelSpecificationRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "TravelSpecificationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends TravelSpecificationRefStructure>> travelSpecificationRef;

    /**
     * Gets the value of the travelSpecificationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelSpecificationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelSpecificationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OfferedTravelSpecificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelSpecificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestedTravelSpecificationRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TravelSpecificationRefStructure>> getTravelSpecificationRef() {
        if (travelSpecificationRef == null) {
            travelSpecificationRef = new ArrayList<JAXBElement<? extends TravelSpecificationRefStructure>>();
        }
        return this.travelSpecificationRef;
    }

    public TravelSpecificationRefs_RelStructure withTravelSpecificationRef(JAXBElement<? extends TravelSpecificationRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends TravelSpecificationRefStructure> value: values) {
                getTravelSpecificationRef().add(value);
            }
        }
        return this;
    }

    public TravelSpecificationRefs_RelStructure withTravelSpecificationRef(Collection<JAXBElement<? extends TravelSpecificationRefStructure>> values) {
        if (values!= null) {
            getTravelSpecificationRef().addAll(values);
        }
        return this;
    }

    @Override
    public TravelSpecificationRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public TravelSpecificationRefs_RelStructure withId(String value) {
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
