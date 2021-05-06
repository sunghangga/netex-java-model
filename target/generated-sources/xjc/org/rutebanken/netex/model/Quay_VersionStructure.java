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
 * <p>Java class for Quay_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quay_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopPlaceSpace_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}QuayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quay_VersionStructure", propOrder = {
    "publicCode",
    "plateCode",
    "shortCode",
    "destinations",
    "compassBearing",
    "compassOctant",
    "quayType",
    "parentQuayRef",
    "boardingPositions"
})
@XmlSeeAlso({
    Quay.class
})
public class Quay_VersionStructure
    extends StopPlaceSpace_VersionStructure
{

    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "PlateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String plateCode;
    @XmlElement(name = "ShortCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger shortCode;
    protected DestinationDisplayViews_RelStructure destinations;
    @XmlElement(name = "CompassBearing")
    protected Float compassBearing;
    @XmlElement(name = "CompassOctant")
    @XmlSchemaType(name = "string")
    protected CompassBearing8Enumeration compassOctant;
    @XmlElement(name = "QuayType")
    @XmlSchemaType(name = "string")
    protected QuayTypeEnumeration quayType;
    @XmlElement(name = "ParentQuayRef")
    protected QuayRefStructure parentQuayRef;
    protected BoardingPositions_RelStructure boardingPositions;

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
     * Gets the value of the plateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateCode() {
        return plateCode;
    }

    /**
     * Sets the value of the plateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateCode(String value) {
        this.plateCode = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShortCode(BigInteger value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayViews_RelStructure }
     *     
     */
    public DestinationDisplayViews_RelStructure getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayViews_RelStructure }
     *     
     */
    public void setDestinations(DestinationDisplayViews_RelStructure value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the compassBearing property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCompassBearing() {
        return compassBearing;
    }

    /**
     * Sets the value of the compassBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCompassBearing(Float value) {
        this.compassBearing = value;
    }

    /**
     * Gets the value of the compassOctant property.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public CompassBearing8Enumeration getCompassOctant() {
        return compassOctant;
    }

    /**
     * Sets the value of the compassOctant property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing8Enumeration }
     *     
     */
    public void setCompassOctant(CompassBearing8Enumeration value) {
        this.compassOctant = value;
    }

    /**
     * Gets the value of the quayType property.
     * 
     * @return
     *     possible object is
     *     {@link QuayTypeEnumeration }
     *     
     */
    public QuayTypeEnumeration getQuayType() {
        return quayType;
    }

    /**
     * Sets the value of the quayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayTypeEnumeration }
     *     
     */
    public void setQuayType(QuayTypeEnumeration value) {
        this.quayType = value;
    }

    /**
     * Gets the value of the parentQuayRef property.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getParentQuayRef() {
        return parentQuayRef;
    }

    /**
     * Sets the value of the parentQuayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setParentQuayRef(QuayRefStructure value) {
        this.parentQuayRef = value;
    }

    /**
     * Gets the value of the boardingPositions property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositions_RelStructure }
     *     
     */
    public BoardingPositions_RelStructure getBoardingPositions() {
        return boardingPositions;
    }

    /**
     * Sets the value of the boardingPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositions_RelStructure }
     *     
     */
    public void setBoardingPositions(BoardingPositions_RelStructure value) {
        this.boardingPositions = value;
    }

    public Quay_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public Quay_VersionStructure withPlateCode(String value) {
        setPlateCode(value);
        return this;
    }

    public Quay_VersionStructure withShortCode(BigInteger value) {
        setShortCode(value);
        return this;
    }

    public Quay_VersionStructure withDestinations(DestinationDisplayViews_RelStructure value) {
        setDestinations(value);
        return this;
    }

    public Quay_VersionStructure withCompassBearing(Float value) {
        setCompassBearing(value);
        return this;
    }

    public Quay_VersionStructure withCompassOctant(CompassBearing8Enumeration value) {
        setCompassOctant(value);
        return this;
    }

    public Quay_VersionStructure withQuayType(QuayTypeEnumeration value) {
        setQuayType(value);
        return this;
    }

    public Quay_VersionStructure withParentQuayRef(QuayRefStructure value) {
        setParentQuayRef(value);
        return this;
    }

    public Quay_VersionStructure withBoardingPositions(BoardingPositions_RelStructure value) {
        setBoardingPositions(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withEntrances(SiteEntrances_RelStructure value) {
        setEntrances(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAirSubmode(AirSubmodeEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withBusSubmode(BusSubmodeEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCoachSubmode(CoachSubmodeEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withFunicularSubmode(FunicularSubmodeEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withMetroSubmode(MetroSubmodeEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withTramSubmode(TramSubmodeEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withRailSubmode(RailSubmodeEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withWaterSubmode(WaterSubmodeEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        setSnowAndIceSubmode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withOtherTransportModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getOtherTransportModes().add(value);
            }
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withOtherTransportModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getOtherTransportModes().addAll(values);
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Quay_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Quay_VersionStructure withId(String value) {
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