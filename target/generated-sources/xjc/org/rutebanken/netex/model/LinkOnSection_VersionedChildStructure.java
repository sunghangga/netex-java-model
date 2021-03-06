//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for LinkOnSection_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkOnSection_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}LinkRef"/&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}Link"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Reverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkOnSection_VersionedChildStructure", propOrder = {
    "linkRef",
    "link",
    "reverse"
})
@XmlSeeAlso({
    LinkOnSection.class
})
public class LinkOnSection_VersionedChildStructure
    extends LinkInLinkSequence_VersionedChildStructure
{

    @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkRefStructure> linkRef;
    @XmlElementRef(name = "Link", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Link_VersionStructure> link;
    @XmlElement(name = "Reverse")
    protected Boolean reverse;

    /**
     * Gets the value of the linkRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LinkRefStructure> getLinkRef() {
        return linkRef;
    }

    /**
     * Sets the value of the linkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PathLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActivationLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineLinkRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinkRefStructure }{@code >}
     *     
     */
    public void setLinkRef(JAXBElement<? extends LinkRefStructure> value) {
        this.linkRef = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivationLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link Link_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link Link_VersionStructure }{@code >}
     *     
     */
    public JAXBElement<? extends Link_VersionStructure> getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivationLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link InfrastructureLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link SitePathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link WireElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RailwayElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoadElement }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathLink }{@code >}
     *     {@link JAXBElement }{@code <}{@link Link_VersionStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link Link_VersionStructure }{@code >}
     *     
     */
    public void setLink(JAXBElement<? extends Link_VersionStructure> value) {
        this.link = value;
    }

    /**
     * Gets the value of the reverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverse() {
        return reverse;
    }

    /**
     * Sets the value of the reverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverse(Boolean value) {
        this.reverse = value;
    }

    public LinkOnSection_VersionedChildStructure withLinkRef(JAXBElement<? extends LinkRefStructure> value) {
        setLinkRef(value);
        return this;
    }

    public LinkOnSection_VersionedChildStructure withLink(JAXBElement<? extends Link_VersionStructure> value) {
        setLink(value);
        return this;
    }

    public LinkOnSection_VersionedChildStructure withReverse(Boolean value) {
        setReverse(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LinkOnSection_VersionedChildStructure withId(String value) {
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
