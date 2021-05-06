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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.LineStringType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for SitePathLink_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SitePathLink_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PathLink_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteComponentGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SitePathLinkGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitePathLink_VersionStructure", propOrder = {
    "siteRef",
    "levelRef",
    "classOfUseRef",
    "checkConstraints",
    "equipmentPlaces",
    "placeEquipments",
    "localServices",
    "label"
})
@XmlSeeAlso({
    SitePathLink.class
})
public class SitePathLink_VersionStructure
    extends PathLink_VersionStructure
{

    @XmlElement(name = "SiteRef")
    protected SiteRefStructure siteRef;
    @XmlElement(name = "LevelRef")
    protected LevelRefStructure levelRef;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    protected CheckConstraints_RelStructure checkConstraints;
    protected EquipmentPlaces_RelStructure equipmentPlaces;
    protected PlaceEquipments_RelStructure placeEquipments;
    protected LocalServices_RelStructure localServices;
    @XmlElement(name = "Label")
    protected MultilingualString label;

    /**
     * Gets the value of the siteRef property.
     * 
     * @return
     *     possible object is
     *     {@link SiteRefStructure }
     *     
     */
    public SiteRefStructure getSiteRef() {
        return siteRef;
    }

    /**
     * Sets the value of the siteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRefStructure }
     *     
     */
    public void setSiteRef(SiteRefStructure value) {
        this.siteRef = value;
    }

    /**
     * Gets the value of the levelRef property.
     * 
     * @return
     *     possible object is
     *     {@link LevelRefStructure }
     *     
     */
    public LevelRefStructure getLevelRef() {
        return levelRef;
    }

    /**
     * Sets the value of the levelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelRefStructure }
     *     
     */
    public void setLevelRef(LevelRefStructure value) {
        this.levelRef = value;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Gets the value of the checkConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraints_RelStructure }
     *     
     */
    public CheckConstraints_RelStructure getCheckConstraints() {
        return checkConstraints;
    }

    /**
     * Sets the value of the checkConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraints_RelStructure }
     *     
     */
    public void setCheckConstraints(CheckConstraints_RelStructure value) {
        this.checkConstraints = value;
    }

    /**
     * Gets the value of the equipmentPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPlaces_RelStructure }
     *     
     */
    public EquipmentPlaces_RelStructure getEquipmentPlaces() {
        return equipmentPlaces;
    }

    /**
     * Sets the value of the equipmentPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPlaces_RelStructure }
     *     
     */
    public void setEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        this.equipmentPlaces = value;
    }

    /**
     * Gets the value of the placeEquipments property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceEquipments_RelStructure }
     *     
     */
    public PlaceEquipments_RelStructure getPlaceEquipments() {
        return placeEquipments;
    }

    /**
     * Sets the value of the placeEquipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceEquipments_RelStructure }
     *     
     */
    public void setPlaceEquipments(PlaceEquipments_RelStructure value) {
        this.placeEquipments = value;
    }

    /**
     * Gets the value of the localServices property.
     * 
     * @return
     *     possible object is
     *     {@link LocalServices_RelStructure }
     *     
     */
    public LocalServices_RelStructure getLocalServices() {
        return localServices;
    }

    /**
     * Sets the value of the localServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServices_RelStructure }
     *     
     */
    public void setLocalServices(LocalServices_RelStructure value) {
        this.localServices = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    public SitePathLink_VersionStructure withSiteRef(SiteRefStructure value) {
        setSiteRef(value);
        return this;
    }

    public SitePathLink_VersionStructure withLevelRef(LevelRefStructure value) {
        setLevelRef(value);
        return this;
    }

    public SitePathLink_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public SitePathLink_VersionStructure withCheckConstraints(CheckConstraints_RelStructure value) {
        setCheckConstraints(value);
        return this;
    }

    public SitePathLink_VersionStructure withEquipmentPlaces(EquipmentPlaces_RelStructure value) {
        setEquipmentPlaces(value);
        return this;
    }

    public SitePathLink_VersionStructure withPlaceEquipments(PlaceEquipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    public SitePathLink_VersionStructure withLocalServices(LocalServices_RelStructure value) {
        setLocalServices(value);
        return this;
    }

    public SitePathLink_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withFrom(PathLinkEndStructure value) {
        setFrom(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTo(PathLinkEndStructure value) {
        setTo(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAccessibilityAssessmentRef(AccessibilityAssessmentRefStructure value) {
        setAccessibilityAssessmentRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAccessModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getAccessModes().add(value);
            }
        }
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAccessModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getAccessModes().addAll(values);
        }
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withPublicUse(PublicUseEnumeration value) {
        setPublicUse(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withCovered(CoveredEnumeration value) {
        setCovered(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withGated(GatedEnumeration value) {
        setGated(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withLighting(LightingEnumeration value) {
        setLighting(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withPersonCapacity(BigInteger value) {
        setPersonCapacity(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withFacilities(SiteFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTowards(MultilingualString value) {
        setTowards(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withBack(MultilingualString value) {
        setBack(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withNumberOfSteps(BigInteger value) {
        setNumberOfSteps(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withMinimumHeight(BigDecimal value) {
        setMinimumHeight(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withMinimumWidth(BigDecimal value) {
        setMinimumWidth(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAllowedUse(PathDirectionEnumeration value) {
        setAllowedUse(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTransition(TransitionEnumeration value) {
        setTransition(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withGradient(BigInteger value) {
        setGradient(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withGradienType(GradientEnumeration value) {
        setGradienType(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTiltAngle(BigInteger value) {
        setTiltAngle(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTiltType(TiltTypeEnumeration value) {
        setTiltType(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAccessFeatureType(AccessFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withPassageType(PassageTypeEnumeration value) {
        setPassageType(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withFlooringType(FlooringTypeEnumeration value) {
        setFlooringType(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withRightSideBorder(BorderTypeEnumeration value) {
        setRightSideBorder(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withLeftSideBorder(BorderTypeEnumeration value) {
        setLeftSideBorder(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTactileWarningStrip(TactileWarningStripEnumeration value) {
        setTactileWarningStrip(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTactileGuidingStrip(Boolean value) {
        setTactileGuidingStrip(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withMaximumFlowPerMinute(BigInteger value) {
        setMaximumFlowPerMinute(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTransferDuration(TransferDurationStructure value) {
        setTransferDuration(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withTypes(LinkTypeRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withLineString(LineStringType value) {
        setLineString(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withPassingThrough(PointsOnLink_RelStructure value) {
        setPassingThrough(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SitePathLink_VersionStructure withId(String value) {
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
