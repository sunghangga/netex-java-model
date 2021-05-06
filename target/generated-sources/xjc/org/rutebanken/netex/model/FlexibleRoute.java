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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FlexibleRoute_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LinkSequenceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RouteGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FlexibleRouteGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}FlexibleRouteIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FlexibleRoute
    extends FlexibleRoute_VersionStructure
{


    @Override
    public FlexibleRoute withFlexibleRouteType(FlexibleRouteTypeEnumeration value) {
        setFlexibleRouteType(value);
        return this;
    }

    @Override
    public FlexibleRoute withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    @Override
    public FlexibleRoute withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withPointsInSequence(PointsOnRoute_RelStructure value) {
        setPointsInSequence(value);
        return this;
    }

    @Override
    public FlexibleRoute withInverseRouteRef(RouteRefStructure value) {
        setInverseRouteRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FlexibleRoute withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public FlexibleRoute withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FlexibleRoute withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public FlexibleRoute withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public FlexibleRoute withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public FlexibleRoute withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public FlexibleRoute withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public FlexibleRoute withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FlexibleRoute withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FlexibleRoute withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FlexibleRoute withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleRoute withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleRoute withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FlexibleRoute withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FlexibleRoute withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FlexibleRoute withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FlexibleRoute withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlexibleRoute withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleRoute withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleRoute withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FlexibleRoute withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FlexibleRoute withId(String value) {
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