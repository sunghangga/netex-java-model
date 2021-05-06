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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for BoardingPosition_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingPosition_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}BoardingPositionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingPosition_VersionStructure", propOrder = {
    "publicCode",
    "boardingPositionType",
    "boardingPositionEntrances"
})
@XmlSeeAlso({
    BoardingPosition.class
})
public class BoardingPosition_VersionStructure
    extends StopPlaceSpace_VersionStructure
{

    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "BoardingPositionType")
    @XmlSchemaType(name = "string")
    protected BoardingPositionTypeEnumeration boardingPositionType;
    protected EntranceRefs_RelStructure boardingPositionEntrances;

    /**
     * Gets the value of the publicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicCode() {
        return publicCode;
    }

    /**
     * Sets the value of the publicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicCode(String value) {
        this.publicCode = value;
    }

    /**
     * Gets the value of the boardingPositionType property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionTypeEnumeration }
     *     
     */
    public BoardingPositionTypeEnumeration getBoardingPositionType() {
        return boardingPositionType;
    }

    /**
     * Sets the value of the boardingPositionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionTypeEnumeration }
     *     
     */
    public void setBoardingPositionType(BoardingPositionTypeEnumeration value) {
        this.boardingPositionType = value;
    }

    /**
     * Gets the value of the boardingPositionEntrances property.
     * 
     * @return
     *     possible object is
     *     {@link EntranceRefs_RelStructure }
     *     
     */
    public EntranceRefs_RelStructure getBoardingPositionEntrances() {
        return boardingPositionEntrances;
    }

    /**
     * Sets the value of the boardingPositionEntrances property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceRefs_RelStructure }
     *     
     */
    public void setBoardingPositionEntrances(EntranceRefs_RelStructure value) {
        this.boardingPositionEntrances = value;
    }

    public BoardingPosition_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public BoardingPosition_VersionStructure withBoardingPositionType(BoardingPositionTypeEnumeration value) {
        setBoardingPositionType(value);
        return this;
    }

    public BoardingPosition_VersionStructure withBoardingPositionEntrances(EntranceRefs_RelStructure value) {
        setBoardingPositionEntrances(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withEntrances(SiteEntrances_RelStructure value) {
        setEntrances(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAirSubmode(AirSubmodeEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withBusSubmode(BusSubmodeEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCoachSubmode(CoachSubmodeEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withFunicularSubmode(FunicularSubmodeEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withMetroSubmode(MetroSubmodeEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withTramSubmode(TramSubmodeEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withRailSubmode(RailSubmodeEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withWaterSubmode(WaterSubmodeEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        setSnowAndIceSubmode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withOtherTransportModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getOtherTransportModes().add(value);
            }
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withOtherTransportModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getOtherTransportModes().addAll(values);
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public BoardingPosition_VersionStructure withId(String value) {
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