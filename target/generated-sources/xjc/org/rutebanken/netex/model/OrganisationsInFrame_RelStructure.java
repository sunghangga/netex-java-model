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
 * <p>Java class for organisationsInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationsInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}Organisation_" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationsInFrame_RelStructure", propOrder = {
    "organisation_"
})
public class OrganisationsInFrame_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRef(name = "Organisation_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> organisation_;

    /**
     * Gets the value of the organisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisation_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ManagementAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link RetailConsortium }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Authority }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicedOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link Organisation_VersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link Organisation }{@code >}
     * {@link JAXBElement }{@code <}{@link OtherOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link TravelAgent }{@code >}
     * {@link JAXBElement }{@code <}{@link Operator }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getOrganisation_() {
        if (organisation_ == null) {
            organisation_ = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.organisation_;
    }

    public OrganisationsInFrame_RelStructure withOrganisation_(JAXBElement<? extends DataManagedObjectStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends DataManagedObjectStructure> value: values) {
                getOrganisation_().add(value);
            }
        }
        return this;
    }

    public OrganisationsInFrame_RelStructure withOrganisation_(Collection<JAXBElement<? extends DataManagedObjectStructure>> values) {
        if (values!= null) {
            getOrganisation_().addAll(values);
        }
        return this;
    }

    @Override
    public OrganisationsInFrame_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public OrganisationsInFrame_RelStructure withId(String value) {
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