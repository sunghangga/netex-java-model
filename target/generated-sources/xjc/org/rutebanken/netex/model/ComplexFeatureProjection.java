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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ComplexFeatureProjection_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}ComplexFeatureProjectionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ComplexFeatureProjectionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ComplexFeatureProjection
    extends ComplexFeatureProjection_VersionStructure
{


    @Override
    public ComplexFeatureProjection withProjectedFeartureRef(ComplexFeatureRefStructure value) {
        setProjectedFeartureRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withOntoFeatureRef(ComplexFeatureRefStructure value) {
        setOntoFeatureRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withPointRef(JAXBElement<? extends PointRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends PointRefStructure> value: values) {
                getPointRef().add(value);
            }
        }
        return this;
    }

    @Override
    public ComplexFeatureProjection withPointRef(Collection<JAXBElement<? extends PointRefStructure>> values) {
        if (values!= null) {
            getPointRef().addAll(values);
        }
        return this;
    }

    @Override
    public ComplexFeatureProjection withFeatures(ComplexFeatureRefs_RelStructure value) {
        setFeatures(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ComplexFeatureProjection withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ComplexFeatureProjection withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ComplexFeatureProjection withId(String value) {
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
