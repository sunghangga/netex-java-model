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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PointOnRoute_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.netex.org.uk/netex}Extensions" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.netex.org.uk/netex}LinkSequenceRef" minOccurs="0"/&gt;
 *             &lt;element name="projections" type="{http://www.netex.org.uk/netex}projections_RelStructure" minOccurs="0"/&gt;
 *             &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}PointRef"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PointOnRouteGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PointOnRouteIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PointOnRoute
    extends PointOnRoute_VersionedChildStructure
{


    @Override
    public PointOnRoute withPointRef(JAXBElement<? extends PointRefStructure> value) {
        setPointRef(value);
        return this;
    }

    @Override
    public PointOnRoute withOnwardRouteLinkRef(RouteLinkRefStructure value) {
        setOnwardRouteLinkRef(value);
        return this;
    }

    @Override
    public PointOnRoute withRouteInstructions(RouteInstructions_RelStructure value) {
        setRouteInstructions(value);
        return this;
    }

    @Override
    public PointOnRoute withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public PointOnRoute withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PointOnRoute withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PointOnRoute withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PointOnRoute withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointOnRoute withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointOnRoute withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOnRoute withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointOnRoute withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointOnRoute withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointOnRoute withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointOnRoute withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointOnRoute withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointOnRoute withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointOnRoute withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOnRoute withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOnRoute withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointOnRoute withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointOnRoute withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointOnRoute withId(String value) {
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
