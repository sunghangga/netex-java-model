//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.LineStringType;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}LinkSequenceProjection_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ProjectionGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ProjectedLinkSequenceRef" type="{http://www.netex.org.uk/netex}LinkSequenceRefStructure" minOccurs="0"/&gt;
 *           &lt;element name="Distance" type="{http://www.netex.org.uk/netex}DistanceType" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LinkSequenceProjectionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}LinkSequenceProjectionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class LinkSequenceProjection
    extends LinkSequenceProjection_VersionStructure
{


    @Override
    public LinkSequenceProjection withProjectedLinkSequenceRef(LinkSequenceRefStructure value) {
        setProjectedLinkSequenceRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withPoints(PointRefs_RelStructure value) {
        setPoints(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withLineString(LineStringType value) {
        setLineString(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LinkSequenceProjection withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LinkSequenceProjection withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LinkSequenceProjection withId(String value) {
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
