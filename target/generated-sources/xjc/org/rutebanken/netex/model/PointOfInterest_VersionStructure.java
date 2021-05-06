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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PointOfInterest_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfInterest_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Site_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PointOfInterestGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterest_VersionStructure", propOrder = {
    "classifications",
    "spaces",
    "nearTopographicPlaces",
    "pathLinks",
    "pathJunctions",
    "accesses",
    "navigationPaths"
})
@XmlSeeAlso({
    PointOfInterest.class
})
public class PointOfInterest_VersionStructure
    extends Site_VersionStructure
{

    protected PointOfInterestClassificationsViews_RelStructure classifications;
    protected PointOfInterestSpaces_RelStructure spaces;
    protected TopographicPlaceRefs_RelStructure nearTopographicPlaces;
    protected SitePathLinks_RelStructure pathLinks;
    protected PathJunctions_RelStructure pathJunctions;
    protected Accesses_RelStructure accesses;
    protected NavigationPaths_RelStructure navigationPaths;

    /**
     * Gets the value of the classifications property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestClassificationsViews_RelStructure }
     *     
     */
    public PointOfInterestClassificationsViews_RelStructure getClassifications() {
        return classifications;
    }

    /**
     * Sets the value of the classifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestClassificationsViews_RelStructure }
     *     
     */
    public void setClassifications(PointOfInterestClassificationsViews_RelStructure value) {
        this.classifications = value;
    }

    /**
     * Gets the value of the spaces property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInterestSpaces_RelStructure }
     *     
     */
    public PointOfInterestSpaces_RelStructure getSpaces() {
        return spaces;
    }

    /**
     * Sets the value of the spaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInterestSpaces_RelStructure }
     *     
     */
    public void setSpaces(PointOfInterestSpaces_RelStructure value) {
        this.spaces = value;
    }

    /**
     * Gets the value of the nearTopographicPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefs_RelStructure }
     *     
     */
    public TopographicPlaceRefs_RelStructure getNearTopographicPlaces() {
        return nearTopographicPlaces;
    }

    /**
     * Sets the value of the nearTopographicPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefs_RelStructure }
     *     
     */
    public void setNearTopographicPlaces(TopographicPlaceRefs_RelStructure value) {
        this.nearTopographicPlaces = value;
    }

    /**
     * Gets the value of the pathLinks property.
     * 
     * @return
     *     possible object is
     *     {@link SitePathLinks_RelStructure }
     *     
     */
    public SitePathLinks_RelStructure getPathLinks() {
        return pathLinks;
    }

    /**
     * Sets the value of the pathLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SitePathLinks_RelStructure }
     *     
     */
    public void setPathLinks(SitePathLinks_RelStructure value) {
        this.pathLinks = value;
    }

    /**
     * Gets the value of the pathJunctions property.
     * 
     * @return
     *     possible object is
     *     {@link PathJunctions_RelStructure }
     *     
     */
    public PathJunctions_RelStructure getPathJunctions() {
        return pathJunctions;
    }

    /**
     * Sets the value of the pathJunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathJunctions_RelStructure }
     *     
     */
    public void setPathJunctions(PathJunctions_RelStructure value) {
        this.pathJunctions = value;
    }

    /**
     * Gets the value of the accesses property.
     * 
     * @return
     *     possible object is
     *     {@link Accesses_RelStructure }
     *     
     */
    public Accesses_RelStructure getAccesses() {
        return accesses;
    }

    /**
     * Sets the value of the accesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accesses_RelStructure }
     *     
     */
    public void setAccesses(Accesses_RelStructure value) {
        this.accesses = value;
    }

    /**
     * Gets the value of the navigationPaths property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPaths_RelStructure }
     *     
     */
    public NavigationPaths_RelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Sets the value of the navigationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPaths_RelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPaths_RelStructure value) {
        this.navigationPaths = value;
    }

    public PointOfInterest_VersionStructure withClassifications(PointOfInterestClassificationsViews_RelStructure value) {
        setClassifications(value);
        return this;
    }

    public PointOfInterest_VersionStructure withSpaces(PointOfInterestSpaces_RelStructure value) {
        setSpaces(value);
        return this;
    }

    public PointOfInterest_VersionStructure withNearTopographicPlaces(TopographicPlaceRefs_RelStructure value) {
        setNearTopographicPlaces(value);
        return this;
    }

    public PointOfInterest_VersionStructure withPathLinks(SitePathLinks_RelStructure value) {
        setPathLinks(value);
        return this;
    }

    public PointOfInterest_VersionStructure withPathJunctions(PathJunctions_RelStructure value) {
        setPathJunctions(value);
        return this;
    }

    public PointOfInterest_VersionStructure withAccesses(Accesses_RelStructure value) {
        setAccesses(value);
        return this;
    }

    public PointOfInterest_VersionStructure withNavigationPaths(NavigationPaths_RelStructure value) {
        setNavigationPaths(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAdditionalTopographicPlaces(TopographicPlaceRefs_RelStructure value) {
        setAdditionalTopographicPlaces(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withSiteType(SiteTypeEnumeration value) {
        setSiteType(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAtCentre(Boolean value) {
        setAtCentre(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setOrganisationRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withOperatingOrganisationView(Organisation_DerivedViewStructure value) {
        setOperatingOrganisationView(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withParentSiteRef(SiteRefStructure value) {
        setParentSiteRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAdjacentSites(SiteRefs_RelStructure value) {
        setAdjacentSites(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withContainedInPlaceRef(TopographicPlaceRefStructure value) {
        setContainedInPlaceRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withLevels(Levels_RelStructure value) {
        setLevels(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withEntrances(SiteEntrances_RelStructure value) {
        setEntrances(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPostalAddress(PostalAddress value) {
        setPostalAddress(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withRoadAddress(RoadAddress value) {
        setRoadAddress(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointOfInterest_VersionStructure withId(String value) {
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
