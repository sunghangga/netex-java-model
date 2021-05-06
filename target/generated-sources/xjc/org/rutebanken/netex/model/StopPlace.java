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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}StopPlace_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}StopPlaceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class StopPlace
    extends StopPlace_VersionStructure
{


    @Override
    public StopPlace withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public StopPlace withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public StopPlace withAirSubmode(AirSubmodeEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    @Override
    public StopPlace withBusSubmode(BusSubmodeEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    @Override
    public StopPlace withCoachSubmode(CoachSubmodeEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    @Override
    public StopPlace withFunicularSubmode(FunicularSubmodeEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    @Override
    public StopPlace withMetroSubmode(MetroSubmodeEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    @Override
    public StopPlace withTramSubmode(TramSubmodeEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    @Override
    public StopPlace withTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    @Override
    public StopPlace withRailSubmode(RailSubmodeEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    @Override
    public StopPlace withWaterSubmode(WaterSubmodeEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    @Override
    public StopPlace withSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        setSnowAndIceSubmode(value);
        return this;
    }

    @Override
    public StopPlace withOtherTransportModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getOtherTransportModes().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPlace withOtherTransportModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getOtherTransportModes().addAll(values);
        }
        return this;
    }

    @Override
    public StopPlace withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public StopPlace withStopPlaceType(StopTypeEnumeration value) {
        setStopPlaceType(value);
        return this;
    }

    @Override
    public StopPlace withBorderCrossing(Boolean value) {
        setBorderCrossing(value);
        return this;
    }

    @Override
    public StopPlace withUnlocalisedEquipments(ExplicitEquipments_RelStructure value) {
        setUnlocalisedEquipments(value);
        return this;
    }

    @Override
    public StopPlace withServedPlaces(TopographicPlaceRefs_RelStructure value) {
        setServedPlaces(value);
        return this;
    }

    @Override
    public StopPlace withMainTerminusForPlaces(TopographicPlaceRefs_RelStructure value) {
        setMainTerminusForPlaces(value);
        return this;
    }

    @Override
    public StopPlace withLimitedUse(LimitedUseTypeEnumeration value) {
        setLimitedUse(value);
        return this;
    }

    @Override
    public StopPlace withWeighting(InterchangeWeightingEnumeration value) {
        setWeighting(value);
        return this;
    }

    @Override
    public StopPlace withStopPlaceWeight(StopPlaceWeightEnumeration value) {
        setStopPlaceWeight(value);
        return this;
    }

    @Override
    public StopPlace withQuays(Quays_RelStructure value) {
        setQuays(value);
        return this;
    }

    @Override
    public StopPlace withAccessSpaces(AccessSpaces_RelStructure value) {
        setAccessSpaces(value);
        return this;
    }

    @Override
    public StopPlace withPathLinks(SitePathLinks_RelStructure value) {
        setPathLinks(value);
        return this;
    }

    @Override
    public StopPlace withPathJunctions(PathJunctions_RelStructure value) {
        setPathJunctions(value);
        return this;
    }

    @Override
    public StopPlace withAccesses(Accesses_RelStructure value) {
        setAccesses(value);
        return this;
    }

    @Override
    public StopPlace withNavigationPaths(NavigationPaths_RelStructure value) {
        setNavigationPaths(value);
        return this;
    }

    @Override
    public StopPlace withVehicleStoppingPlaces(VehicleStoppingPlaces_RelStructure value) {
        setVehicleStoppingPlaces(value);
        return this;
    }

    @Override
    public StopPlace withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    @Override
    public StopPlace withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    @Override
    public StopPlace withAdditionalTopographicPlaces(TopographicPlaceRefs_RelStructure value) {
        setAdditionalTopographicPlaces(value);
        return this;
    }

    @Override
    public StopPlace withSiteType(SiteTypeEnumeration value) {
        setSiteType(value);
        return this;
    }

    @Override
    public StopPlace withAtCentre(Boolean value) {
        setAtCentre(value);
        return this;
    }

    @Override
    public StopPlace withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public StopPlace withOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setOrganisationRef(value);
        return this;
    }

    @Override
    public StopPlace withOperatingOrganisationView(Organisation_DerivedViewStructure value) {
        setOperatingOrganisationView(value);
        return this;
    }

    @Override
    public StopPlace withParentSiteRef(SiteRefStructure value) {
        setParentSiteRef(value);
        return this;
    }

    @Override
    public StopPlace withAdjacentSites(SiteRefs_RelStructure value) {
        setAdjacentSites(value);
        return this;
    }

    @Override
    public StopPlace withContainedInPlaceRef(TopographicPlaceRefStructure value) {
        setContainedInPlaceRef(value);
        return this;
    }

    @Override
    public StopPlace withLevels(Levels_RelStructure value) {
        setLevels(value);
        return this;
    }

    @Override
    public StopPlace withEntrances(SiteEntrances_RelStructure value) {
        setEntrances(value);
        return this;
    }

    @Override
    public StopPlace withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public StopPlace withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public StopPlace withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public StopPlace withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public StopPlace withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPlace withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public StopPlace withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public StopPlace withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public StopPlace withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public StopPlace withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public StopPlace withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public StopPlace withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public StopPlace withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public StopPlace withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public StopPlace withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public StopPlace withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public StopPlace withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public StopPlace withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public StopPlace withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public StopPlace withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public StopPlace withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public StopPlace withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public StopPlace withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public StopPlace withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public StopPlace withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public StopPlace withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public StopPlace withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public StopPlace withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public StopPlace withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public StopPlace withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public StopPlace withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public StopPlace withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public StopPlace withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public StopPlace withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public StopPlace withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public StopPlace withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public StopPlace withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public StopPlace withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public StopPlace withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public StopPlace withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPlace withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public StopPlace withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public StopPlace withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public StopPlace withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StopPlace withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public StopPlace withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public StopPlace withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public StopPlace withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPlace withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPlace withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public StopPlace withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public StopPlace withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public StopPlace withId(String value) {
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
