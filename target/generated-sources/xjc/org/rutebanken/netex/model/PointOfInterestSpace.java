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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PointOfInterestSpace_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}AddressablePlaceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteElementGroup"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteComponentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestSpaceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PointOfInterestSpaceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PointOfInterestSpace
    extends PointOfInterestSpace_VersionStructure
{


    @Override
    public PointOfInterestSpace withAccessSpaceType(AccessSpaceTypeEnumeration value) {
        setAccessSpaceType(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPointOfInterestSpaceType(PointOfInterestSpaceTypeEnumeration value) {
        setPointOfInterestSpaceType(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPassageType(PassageTypeEnumeration value) {
        setPassageType(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withParentPointOfInterestSpaceRef(PointOfInterestSpaceRefStructure value) {
        setParentPointOfInterestSpaceRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withEntrances(PointOfInterestEntrances_RelStructure value) {
        setEntrances(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterestSpace withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterestSpace withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterestSpace withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterestSpace withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointOfInterestSpace withId(String value) {
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