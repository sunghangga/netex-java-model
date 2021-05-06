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
 * <p>Java class for journeyRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeyRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}JourneyDesignator"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ServiceDesignator"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeyRefs_RelStructure", propOrder = {
    "journeyRefOrJourneyDesignatorOrServiceDesignator"
})
public class JourneyRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "JourneyDesignator", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceDesignator", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> journeyRefOrJourneyDesignatorOrServiceDesignator;

    /**
     * Gets the value of the journeyRefOrJourneyDesignatorOrServiceDesignator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyRefOrJourneyDesignatorOrServiceDesignator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyRefOrJourneyDesignatorOrServiceDesignator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyDesignatorStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceDesignatorStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getJourneyRefOrJourneyDesignatorOrServiceDesignator() {
        if (journeyRefOrJourneyDesignatorOrServiceDesignator == null) {
            journeyRefOrJourneyDesignatorOrServiceDesignator = new ArrayList<JAXBElement<?>>();
        }
        return this.journeyRefOrJourneyDesignatorOrServiceDesignator;
    }

    public JourneyRefs_RelStructure withJourneyRefOrJourneyDesignatorOrServiceDesignator(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getJourneyRefOrJourneyDesignatorOrServiceDesignator().add(value);
            }
        }
        return this;
    }

    public JourneyRefs_RelStructure withJourneyRefOrJourneyDesignatorOrServiceDesignator(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getJourneyRefOrJourneyDesignatorOrServiceDesignator().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public JourneyRefs_RelStructure withId(String value) {
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
