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
 * <p>Java class for linkRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}LinkRefByValue"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkRefs_RelStructure", propOrder = {
    "linkRefOrLinkRefByValue"
})
public class LinkRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "LinkRefByValue", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> linkRefOrLinkRefByValue;

    /**
     * Gets the value of the linkRefOrLinkRefByValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkRefOrLinkRefByValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkRefOrLinkRefByValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ModalLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WireLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PathLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivationLinkRefByValueStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getLinkRefOrLinkRefByValue() {
        if (linkRefOrLinkRefByValue == null) {
            linkRefOrLinkRefByValue = new ArrayList<JAXBElement<?>>();
        }
        return this.linkRefOrLinkRefByValue;
    }

    public LinkRefs_RelStructure withLinkRefOrLinkRefByValue(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getLinkRefOrLinkRefByValue().add(value);
            }
        }
        return this;
    }

    public LinkRefs_RelStructure withLinkRefOrLinkRefByValue(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getLinkRefOrLinkRefByValue().addAll(values);
        }
        return this;
    }

    @Override
    public LinkRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public LinkRefs_RelStructure withId(String value) {
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