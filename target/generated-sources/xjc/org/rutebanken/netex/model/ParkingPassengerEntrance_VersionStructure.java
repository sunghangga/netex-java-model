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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ParkingPassengerEntrance_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingPassengerEntrance_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEntrance_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}ParkingPassengerEntranceGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingPassengerEntrance_VersionStructure", propOrder = {
    "areas"
})
@XmlSeeAlso({
    ParkingPassengerEntrance.class
})
public class ParkingPassengerEntrance_VersionStructure
    extends SiteEntrance_VersionStructure
{

    protected ParkingAreaRefs_RelStructure areas;

    /**
     * Gets the value of the areas property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingAreaRefs_RelStructure }
     *     
     */
    public ParkingAreaRefs_RelStructure getAreas() {
        return areas;
    }

    /**
     * Sets the value of the areas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingAreaRefs_RelStructure }
     *     
     */
    public void setAreas(ParkingAreaRefs_RelStructure value) {
        this.areas = value;
    }

    public ParkingPassengerEntrance_VersionStructure withAreas(ParkingAreaRefs_RelStructure value) {
        setAreas(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withEntranceType(EntranceEnumeration value) {
        setEntranceType(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withIsExternal(Boolean value) {
        setIsExternal(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withIsEntry(Boolean value) {
        setIsEntry(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withIsExit(Boolean value) {
        setIsExit(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDroppedKerbOutside(Boolean value) {
        setDroppedKerbOutside(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDropOffPointClose(Boolean value) {
        setDropOffPointClose(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ParkingPassengerEntrance_VersionStructure withId(String value) {
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
