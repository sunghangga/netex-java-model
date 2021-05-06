//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Country_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfEntitiesGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfPointsGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ZoneGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PlaceGroup"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}CountryGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CountryCodeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Country
    extends Country_VersionStructure
{


    @Override
    public Country withUicCode(PrivateCodeStructure value) {
        setUicCode(value);
        return this;
    }

    @Override
    public Country withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Country withPrincipality(String value) {
        setPrincipality(value);
        return this;
    }

    @Override
    public Country withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public Country withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public Country withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public Country withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public Country withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public Country withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public Country withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public Country withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Country withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Country withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Country withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public Country withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Country withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Country withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Country withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Country withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Country withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Country withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Country withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Country withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Country withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Country withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Country withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Country withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Country withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Country withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Country withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Country withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Country withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Country withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Country withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Country withId(String value) {
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
