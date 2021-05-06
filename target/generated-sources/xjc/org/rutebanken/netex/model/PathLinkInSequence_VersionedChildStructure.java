//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PathLinkInSequence_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PathLinkInSequence_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PathLinkInSequenceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkInSequence_VersionedChildStructure", propOrder = {
    "rest"
})
@XmlSeeAlso({
    PathLinkInSequence.class
})
public class PathLinkInSequence_VersionedChildStructure
    extends LinkInLinkSequence_VersionedChildStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "PathLinkRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Transition", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Instruction", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Label", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Description", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Heading", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "views", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Reverse", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Description" is used by two different parts of a schema. See: 
     * line 168 of file:/mnt/d/Projects/netex-java-model-v1/src/main/resources/xsd/1.12/netex_part_1/part1_ifopt/netex_ifopt_navigationPath_version.xsd
     * line 70 of file:/mnt/d/Projects/netex-java-model-v1/src/main/resources/xsd/1.12/netex_framework/netex_genericFramework/netex_pointAndLinkSequence_version.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PathLinkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransitionEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link MultilingualString }{@code >}
     * {@link JAXBElement }{@code <}{@link MultilingualString }{@code >}
     * {@link JAXBElement }{@code <}{@link MultilingualString }{@code >}
     * {@link JAXBElement }{@code <}{@link PathHeadingEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link PathLinkInSequence_VersionedChildStructure.Views }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    public PathLinkInSequence_VersionedChildStructure withRest(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getRest().add(value);
            }
        }
        return this;
    }

    public PathLinkInSequence_VersionedChildStructure withRest(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getRest().addAll(values);
        }
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PathLinkInSequence_VersionedChildStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.netex.org.uk/netex}PathLinkView"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pathLinkView"
    })
    public static class Views {

        @XmlElement(name = "PathLinkView", required = true)
        protected PathLinkView pathLinkView;

        /**
         * Gets the value of the pathLinkView property.
         * 
         * @return
         *     possible object is
         *     {@link PathLinkView }
         *     
         */
        public PathLinkView getPathLinkView() {
            return pathLinkView;
        }

        /**
         * Sets the value of the pathLinkView property.
         * 
         * @param value
         *     allowed object is
         *     {@link PathLinkView }
         *     
         */
        public void setPathLinkView(PathLinkView value) {
            this.pathLinkView = value;
        }

        public PathLinkInSequence_VersionedChildStructure.Views withPathLinkView(PathLinkView value) {
            setPathLinkView(value);
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

}