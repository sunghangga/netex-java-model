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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}VehicleStoppingPosition_VersionStructure"&gt;
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
 *         &lt;sequence&gt;
 *           &lt;element name="placeTypes" type="{http://www.netex.org.uk/netex}typeOfPlaceRefs_RelStructure" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}AccessibilityAssessment" minOccurs="0"/&gt;
 *           &lt;element name="AccessModes" type="{http://www.netex.org.uk/netex}AccessModeListOfEnumerations" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteElementNamesGroup"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RelativeLocationGroup"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteElementPropertiesGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteComponentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceComponentPropertyGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehicleStoppingPositionGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}VehicleStoppingPositionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class VehicleStoppingPosition
    extends VehicleStoppingPosition_VersionStructure
{


    @Override
    public VehicleStoppingPosition withVehicleStoppingPlaceRef(VehicleStoppingPlaceRefStructure value) {
        setVehicleStoppingPlaceRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withRelationToVehicle(RelationToVehicleEnumeration value) {
        setRelationToVehicle(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withBearing(BigInteger value) {
        setBearing(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withVehiclePositionAlignments(VehiclePositionAlignments_RelStructure value) {
        setVehiclePositionAlignments(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withAirSubmode(AirSubmodeEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withBusSubmode(BusSubmodeEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCoachSubmode(CoachSubmodeEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withFunicularSubmode(FunicularSubmodeEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withMetroSubmode(MetroSubmodeEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withTramSubmode(TramSubmodeEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withRailSubmode(RailSubmodeEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withWaterSubmode(WaterSubmodeEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        setSnowAndIceSubmode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withOtherTransportModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getOtherTransportModes().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withOtherTransportModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getOtherTransportModes().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleStoppingPosition withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleStoppingPosition withId(String value) {
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