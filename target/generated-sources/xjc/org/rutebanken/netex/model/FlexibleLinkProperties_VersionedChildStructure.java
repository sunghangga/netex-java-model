//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FlexibleLinkProperties_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexibleLinkProperties_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FlexibleLinkPropertiesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleLinkProperties_VersionedChildStructure", propOrder = {
    "linkRef",
    "mayBeSkipped",
    "onMainRoute",
    "unscheduledPath",
    "flexibleLinkType"
})
@XmlSeeAlso({
    FlexibleLinkProperties.class
})
public class FlexibleLinkProperties_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "LinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LinkRefStructure> linkRef;
    @XmlElement(name = "MayBeSkipped")
    protected Boolean mayBeSkipped;
    @XmlElement(name = "OnMainRoute")
    protected Boolean onMainRoute;
    @XmlElement(name = "UnscheduledPath")
    protected Boolean unscheduledPath;
    @XmlElement(name = "FlexibleLinkType")
    @XmlSchemaType(name = "string")
    protected FlexibleLinkTypeEnumeration flexibleLinkType;

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
     * Gets the value of the mayBeSkipped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMayBeSkipped() {
        return mayBeSkipped;
    }

    /**
     * Sets the value of the mayBeSkipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMayBeSkipped(Boolean value) {
        this.mayBeSkipped = value;
    }

    /**
     * Gets the value of the onMainRoute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnMainRoute() {
        return onMainRoute;
    }

    /**
     * Sets the value of the onMainRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnMainRoute(Boolean value) {
        this.onMainRoute = value;
    }

    /**
     * Gets the value of the unscheduledPath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnscheduledPath() {
        return unscheduledPath;
    }

    /**
     * Sets the value of the unscheduledPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnscheduledPath(Boolean value) {
        this.unscheduledPath = value;
    }

    /**
     * Gets the value of the flexibleLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleLinkTypeEnumeration }
     *     
     */
    public FlexibleLinkTypeEnumeration getFlexibleLinkType() {
        return flexibleLinkType;
    }

    /**
     * Sets the value of the flexibleLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleLinkTypeEnumeration }
     *     
     */
    public void setFlexibleLinkType(FlexibleLinkTypeEnumeration value) {
        this.flexibleLinkType = value;
    }

    public FlexibleLinkProperties_VersionedChildStructure withLinkRef(JAXBElement<? extends LinkRefStructure> value) {
        setLinkRef(value);
        return this;
    }

    public FlexibleLinkProperties_VersionedChildStructure withMayBeSkipped(Boolean value) {
        setMayBeSkipped(value);
        return this;
    }

    public FlexibleLinkProperties_VersionedChildStructure withOnMainRoute(Boolean value) {
        setOnMainRoute(value);
        return this;
    }

    public FlexibleLinkProperties_VersionedChildStructure withUnscheduledPath(Boolean value) {
        setUnscheduledPath(value);
        return this;
    }

    public FlexibleLinkProperties_VersionedChildStructure withFlexibleLinkType(FlexibleLinkTypeEnumeration value) {
        setFlexibleLinkType(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FlexibleLinkProperties_VersionedChildStructure withId(String value) {
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
