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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}RouteInstruction_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RouteInstructionGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}RouteInstructionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RouteInstruction
    extends RouteInstruction_VersionStructure
{


    @Override
    public RouteInstruction withPointOnRouteRef(PointOnRouteRefStructure value) {
        setPointOnRouteRef(value);
        return this;
    }

    @Override
    public RouteInstruction withInstruction(MultilingualString value) {
        setInstruction(value);
        return this;
    }

    @Override
    public RouteInstruction withPathHeading(PathHeadingEnumeration value) {
        setPathHeading(value);
        return this;
    }

    @Override
    public RouteInstruction withHeading(CompassBearing16Enumeration value) {
        setHeading(value);
        return this;
    }

    @Override
    public RouteInstruction withBearing(Float value) {
        setBearing(value);
        return this;
    }

    @Override
    public RouteInstruction withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public RouteInstruction withTransition(TransitionEnumeration value) {
        setTransition(value);
        return this;
    }

    @Override
    public RouteInstruction withRoadName(MultilingualString value) {
        setRoadName(value);
        return this;
    }

    @Override
    public RouteInstruction withSimpleFeatureRef(SimpleFeatureRefStructure value) {
        setSimpleFeatureRef(value);
        return this;
    }

    @Override
    public RouteInstruction withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public RouteInstruction withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RouteInstruction withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RouteInstruction withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RouteInstruction withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RouteInstruction withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RouteInstruction withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RouteInstruction withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RouteInstruction withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RouteInstruction withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RouteInstruction withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RouteInstruction withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RouteInstruction withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RouteInstruction withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RouteInstruction withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RouteInstruction withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RouteInstruction withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RouteInstruction withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RouteInstruction withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RouteInstruction withId(String value) {
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