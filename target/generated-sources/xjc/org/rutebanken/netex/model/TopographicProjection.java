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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TopographicProjection_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}TopographicProjectionGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ProjectionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TopographicProjection
    extends TopographicProjection_VersionStructure
{


    @Override
    public TopographicProjection withProjectedObjectRef(VersionOfObjectRefStructure value) {
        setProjectedObjectRef(value);
        return this;
    }

    @Override
    public TopographicProjection withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public TopographicProjection withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    @Override
    public TopographicProjection withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public TopographicProjection withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TopographicProjection withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public TopographicProjection withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public TopographicProjection withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TopographicProjection withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TopographicProjection withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TopographicProjection withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TopographicProjection withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TopographicProjection withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TopographicProjection withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TopographicProjection withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TopographicProjection withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TopographicProjection withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TopographicProjection withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TopographicProjection withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TopographicProjection withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TopographicProjection withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicProjection withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicProjection withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TopographicProjection withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TopographicProjection withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TopographicProjection withId(String value) {
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
