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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for StopPlaceVehicleEntrance_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceVehicleEntrance_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleEntrance_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopPlaceComponentPropertyGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceVehicleEntrance_VersionStructure", propOrder = {
    "transportMode",
    "airSubmode",
    "busSubmode",
    "coachSubmode",
    "funicularSubmode",
    "metroSubmode",
    "tramSubmode",
    "telecabinSubmode",
    "railSubmode",
    "waterSubmode",
    "snowAndIceSubmode",
    "otherTransportModes",
    "tariffZones"
})
@XmlSeeAlso({
    StopPlaceVehicleEntrance.class
})
public class StopPlaceVehicleEntrance_VersionStructure
    extends VehicleEntrance_VersionStructure
{

    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModeEnumeration transportMode;
    @XmlElement(name = "AirSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AirSubmodeEnumeration airSubmode;
    @XmlElement(name = "BusSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected BusSubmodeEnumeration busSubmode;
    @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CoachSubmodeEnumeration coachSubmode;
    @XmlElement(name = "FunicularSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FunicularSubmodeEnumeration funicularSubmode;
    @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MetroSubmodeEnumeration metroSubmode;
    @XmlElement(name = "TramSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TramSubmodeEnumeration tramSubmode;
    @XmlElement(name = "TelecabinSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TelecabinSubmodeEnumeration telecabinSubmode;
    @XmlElement(name = "RailSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RailSubmodeEnumeration railSubmode;
    @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected WaterSubmodeEnumeration waterSubmode;
    @XmlElement(name = "SnowAndIceSubmode", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SnowAndIceSubmodeEnumeration snowAndIceSubmode;
    @XmlList
    @XmlElement(name = "OtherTransportModes")
    protected List<VehicleModeEnumeration> otherTransportModes;
    protected TariffZoneRefs_RelStructure tariffZones;

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public VehicleModeEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public void setTransportMode(VehicleModeEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Gets the value of the airSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link AirSubmodeEnumeration }
     *     
     */
    public AirSubmodeEnumeration getAirSubmode() {
        return airSubmode;
    }

    /**
     * Sets the value of the airSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSubmodeEnumeration }
     *     
     */
    public void setAirSubmode(AirSubmodeEnumeration value) {
        this.airSubmode = value;
    }

    /**
     * Gets the value of the busSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link BusSubmodeEnumeration }
     *     
     */
    public BusSubmodeEnumeration getBusSubmode() {
        return busSubmode;
    }

    /**
     * Sets the value of the busSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusSubmodeEnumeration }
     *     
     */
    public void setBusSubmode(BusSubmodeEnumeration value) {
        this.busSubmode = value;
    }

    /**
     * Gets the value of the coachSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link CoachSubmodeEnumeration }
     *     
     */
    public CoachSubmodeEnumeration getCoachSubmode() {
        return coachSubmode;
    }

    /**
     * Sets the value of the coachSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachSubmodeEnumeration }
     *     
     */
    public void setCoachSubmode(CoachSubmodeEnumeration value) {
        this.coachSubmode = value;
    }

    /**
     * Gets the value of the funicularSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link FunicularSubmodeEnumeration }
     *     
     */
    public FunicularSubmodeEnumeration getFunicularSubmode() {
        return funicularSubmode;
    }

    /**
     * Sets the value of the funicularSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunicularSubmodeEnumeration }
     *     
     */
    public void setFunicularSubmode(FunicularSubmodeEnumeration value) {
        this.funicularSubmode = value;
    }

    /**
     * Gets the value of the metroSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link MetroSubmodeEnumeration }
     *     
     */
    public MetroSubmodeEnumeration getMetroSubmode() {
        return metroSubmode;
    }

    /**
     * Sets the value of the metroSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetroSubmodeEnumeration }
     *     
     */
    public void setMetroSubmode(MetroSubmodeEnumeration value) {
        this.metroSubmode = value;
    }

    /**
     * Gets the value of the tramSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link TramSubmodeEnumeration }
     *     
     */
    public TramSubmodeEnumeration getTramSubmode() {
        return tramSubmode;
    }

    /**
     * Sets the value of the tramSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TramSubmodeEnumeration }
     *     
     */
    public void setTramSubmode(TramSubmodeEnumeration value) {
        this.tramSubmode = value;
    }

    /**
     * Gets the value of the telecabinSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link TelecabinSubmodeEnumeration }
     *     
     */
    public TelecabinSubmodeEnumeration getTelecabinSubmode() {
        return telecabinSubmode;
    }

    /**
     * Sets the value of the telecabinSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecabinSubmodeEnumeration }
     *     
     */
    public void setTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        this.telecabinSubmode = value;
    }

    /**
     * Gets the value of the railSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link RailSubmodeEnumeration }
     *     
     */
    public RailSubmodeEnumeration getRailSubmode() {
        return railSubmode;
    }

    /**
     * Sets the value of the railSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSubmodeEnumeration }
     *     
     */
    public void setRailSubmode(RailSubmodeEnumeration value) {
        this.railSubmode = value;
    }

    /**
     * Gets the value of the waterSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link WaterSubmodeEnumeration }
     *     
     */
    public WaterSubmodeEnumeration getWaterSubmode() {
        return waterSubmode;
    }

    /**
     * Sets the value of the waterSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSubmodeEnumeration }
     *     
     */
    public void setWaterSubmode(WaterSubmodeEnumeration value) {
        this.waterSubmode = value;
    }

    /**
     * Gets the value of the snowAndIceSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link SnowAndIceSubmodeEnumeration }
     *     
     */
    public SnowAndIceSubmodeEnumeration getSnowAndIceSubmode() {
        return snowAndIceSubmode;
    }

    /**
     * Sets the value of the snowAndIceSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnowAndIceSubmodeEnumeration }
     *     
     */
    public void setSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        this.snowAndIceSubmode = value;
    }

    /**
     * Gets the value of the otherTransportModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherTransportModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherTransportModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModeEnumeration }
     * 
     * 
     */
    public List<VehicleModeEnumeration> getOtherTransportModes() {
        if (otherTransportModes == null) {
            otherTransportModes = new ArrayList<VehicleModeEnumeration>();
        }
        return this.otherTransportModes;
    }

    /**
     * Gets the value of the tariffZones property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public TariffZoneRefs_RelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Sets the value of the tariffZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public void setTariffZones(TariffZoneRefs_RelStructure value) {
        this.tariffZones = value;
    }

    public StopPlaceVehicleEntrance_VersionStructure withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withAirSubmode(AirSubmodeEnumeration value) {
        setAirSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withBusSubmode(BusSubmodeEnumeration value) {
        setBusSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withCoachSubmode(CoachSubmodeEnumeration value) {
        setCoachSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withFunicularSubmode(FunicularSubmodeEnumeration value) {
        setFunicularSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withMetroSubmode(MetroSubmodeEnumeration value) {
        setMetroSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withTramSubmode(TramSubmodeEnumeration value) {
        setTramSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withTelecabinSubmode(TelecabinSubmodeEnumeration value) {
        setTelecabinSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withRailSubmode(RailSubmodeEnumeration value) {
        setRailSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withWaterSubmode(WaterSubmodeEnumeration value) {
        setWaterSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withSnowAndIceSubmode(SnowAndIceSubmodeEnumeration value) {
        setSnowAndIceSubmode(value);
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withOtherTransportModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getOtherTransportModes().add(value);
            }
        }
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withOtherTransportModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getOtherTransportModes().addAll(values);
        }
        return this;
    }

    public StopPlaceVehicleEntrance_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPublic(Boolean value) {
        setPublic(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withEntranceType(EntranceEnumeration value) {
        setEntranceType(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withIsExternal(Boolean value) {
        setIsExternal(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withIsEntry(Boolean value) {
        setIsEntry(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withIsExit(Boolean value) {
        setIsExit(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDroppedKerbOutside(Boolean value) {
        setDroppedKerbOutside(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDropOffPointClose(Boolean value) {
        setDropOffPointClose(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public StopPlaceVehicleEntrance_VersionStructure withId(String value) {
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