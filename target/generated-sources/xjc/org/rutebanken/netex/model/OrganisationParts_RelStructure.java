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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for organisationParts_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organisationParts_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}OrganisationPartRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}OrganisationPart_"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationParts_RelStructure", propOrder = {
    "organisationPartRefOrOrganisationPart_"
})
@XmlSeeAlso({
    org.rutebanken.netex.model.Organisation_VersionStructure.Parts.class
})
public class OrganisationParts_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "OrganisationPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OrganisationPart_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> organisationPartRefOrOrganisationPart_;

    /**
     * Gets the value of the organisationPartRefOrOrganisationPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationPartRefOrOrganisationPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationPartRefOrOrganisationPart_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OrganisationPartRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlCentreRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationalUnitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link DepartmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatingDepartment }{@code >}
     * {@link JAXBElement }{@code <}{@link ControlCentre }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getOrganisationPartRefOrOrganisationPart_() {
        if (organisationPartRefOrOrganisationPart_ == null) {
            organisationPartRefOrOrganisationPart_ = new ArrayList<JAXBElement<?>>();
        }
        return this.organisationPartRefOrOrganisationPart_;
    }

    public OrganisationParts_RelStructure withOrganisationPartRefOrOrganisationPart_(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getOrganisationPartRefOrOrganisationPart_().add(value);
            }
        }
        return this;
    }

    public OrganisationParts_RelStructure withOrganisationPartRefOrOrganisationPart_(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getOrganisationPartRefOrOrganisationPart_().addAll(values);
        }
        return this;
    }

    @Override
    public OrganisationParts_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public OrganisationParts_RelStructure withId(String value) {
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
