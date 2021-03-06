//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}RailwayElement_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}LinkGroup"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RailwayElementGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}RailwayLinkIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RailwayElement
    extends RailwayElement_VersionStructure
{


    @Override
    public RailwayElement withFromPointRef(RailwayPointRefStructure value) {
        setFromPointRef(value);
        return this;
    }

    @Override
    public RailwayElement withToPointRef(RailwayPointRefStructure value) {
        setToPointRef(value);
        return this;
    }

    @Override
    public RailwayElement withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RailwayElement withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public RailwayElement withTypes(LinkTypeRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public RailwayElement withLineString(LineStringType value) {
        setLineString(value);
        return this;
    }

    @Override
    public RailwayElement withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public RailwayElement withPassingThrough(PointsOnLink_RelStructure value) {
        setPassingThrough(value);
        return this;
    }

    @Override
    public RailwayElement withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RailwayElement withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RailwayElement withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RailwayElement withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RailwayElement withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RailwayElement withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RailwayElement withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RailwayElement withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RailwayElement withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RailwayElement withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RailwayElement withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RailwayElement withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RailwayElement withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RailwayElement withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RailwayElement withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RailwayElement withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RailwayElement withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RailwayElement withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RailwayElement withId(String value) {
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
