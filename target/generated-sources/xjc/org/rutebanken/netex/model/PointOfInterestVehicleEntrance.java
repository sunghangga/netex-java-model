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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PointOfInterestVehicleEntrance_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteEntranceGroup"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ExternalEntranceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PointOfInterestEntranceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PointOfInterestVehicleEntrance
    extends PointOfInterestVehicleEntrance_VersionStructure
{


    @Override
    public PointOfInterestVehicleEntrance withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withEntranceType(EntranceEnumeration value) {
        setEntranceType(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withIsExternal(Boolean value) {
        setIsExternal(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withIsEntry(Boolean value) {
        setIsEntry(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withIsExit(Boolean value) {
        setIsExit(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDroppedKerbOutside(Boolean value) {
        setDroppedKerbOutside(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDropOffPointClose(Boolean value) {
        setDropOffPointClose(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointOfInterestVehicleEntrance withId(String value) {
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
