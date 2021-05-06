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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ParkingBay_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}ParkingComponentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ParkingBayGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ParkingBayIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ParkingBay
    extends ParkingBay_VersionStructure
{


    @Override
    public ParkingBay withParkingVehicleType(ParkingVehicleEnumeration value) {
        setParkingVehicleType(value);
        return this;
    }

    @Override
    public ParkingBay withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    @Override
    public ParkingBay withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public ParkingBay withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public ParkingBay withWeight(BigDecimal value) {
        setWeight(value);
        return this;
    }

    @Override
    public ParkingBay withRechargingAvailable(Boolean value) {
        setRechargingAvailable(value);
        return this;
    }

    @Override
    public ParkingBay withParkingPaymentCode(String value) {
        setParkingPaymentCode(value);
        return this;
    }

    @Override
    public ParkingBay withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public ParkingBay withMaximumLength(BigDecimal value) {
        setMaximumLength(value);
        return this;
    }

    @Override
    public ParkingBay withMaximumWidth(BigDecimal value) {
        setMaximumWidth(value);
        return this;
    }

    @Override
    public ParkingBay withMaximumHeight(BigDecimal value) {
        setMaximumHeight(value);
        return this;
    }

    @Override
    public ParkingBay withMaximumWeight(BigDecimal value) {
        setMaximumWeight(value);
        return this;
    }

    @Override
    public ParkingBay withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public ParkingBay withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public ParkingBay withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public ParkingBay withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public ParkingBay withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public ParkingBay withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public ParkingBay withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public ParkingBay withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public ParkingBay withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingBay withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingBay withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public ParkingBay withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public ParkingBay withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public ParkingBay withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public ParkingBay withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public ParkingBay withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public ParkingBay withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public ParkingBay withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public ParkingBay withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public ParkingBay withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public ParkingBay withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public ParkingBay withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ParkingBay withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public ParkingBay withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public ParkingBay withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public ParkingBay withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public ParkingBay withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public ParkingBay withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public ParkingBay withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public ParkingBay withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public ParkingBay withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public ParkingBay withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public ParkingBay withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ParkingBay withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ParkingBay withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ParkingBay withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public ParkingBay withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ParkingBay withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ParkingBay withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ParkingBay withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ParkingBay withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ParkingBay withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ParkingBay withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ParkingBay withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingBay withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingBay withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ParkingBay withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ParkingBay withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ParkingBay withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ParkingBay withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ParkingBay withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ParkingBay withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingBay withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingBay withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ParkingBay withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ParkingBay withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ParkingBay withId(String value) {
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
