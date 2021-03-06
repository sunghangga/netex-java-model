//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Level_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Level_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}LevelGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Level_VersionStructure", propOrder = {
    "name",
    "shortName",
    "description",
    "publicCode",
    "publicUse",
    "accessibilityAssessment",
    "allAreasWheelchairAccessible",
    "siteRef"
})
@XmlSeeAlso({
    Level.class
})
public class Level_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "PublicUse")
    protected Boolean publicUse;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessment_VersionedChildStructure accessibilityAssessment;
    @XmlElement(name = "AllAreasWheelchairAccessible", defaultValue = "true")
    protected Boolean allAreasWheelchairAccessible;
    @XmlElementRef(name = "SiteRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteRefStructure> siteRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

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
     * Gets the value of the publicUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicUse() {
        return publicUse;
    }

    /**
     * Sets the value of the publicUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicUse(Boolean value) {
        this.publicUse = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessment_VersionedChildStructure }
     *     
     */
    public AccessibilityAssessment_VersionedChildStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessment_VersionedChildStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessment_VersionedChildStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the allAreasWheelchairAccessible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllAreasWheelchairAccessible() {
        return allAreasWheelchairAccessible;
    }

    /**
     * Sets the value of the allAreasWheelchairAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllAreasWheelchairAccessible(Boolean value) {
        this.allAreasWheelchairAccessible = value;
    }

    /**
     * Gets the value of the siteRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteRefStructure> getSiteRef() {
        return siteRef;
    }

    /**
     * Sets the value of the siteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     
     */
    public void setSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        this.siteRef = value;
    }

    public Level_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public Level_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public Level_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public Level_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public Level_VersionStructure withPublicUse(Boolean value) {
        setPublicUse(value);
        return this;
    }

    public Level_VersionStructure withAccessibilityAssessment(AccessibilityAssessment_VersionedChildStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public Level_VersionStructure withAllAreasWheelchairAccessible(Boolean value) {
        setAllAreasWheelchairAccessible(value);
        return this;
    }

    public Level_VersionStructure withSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        setSiteRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Level_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Level_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Level_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Level_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Level_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Level_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Level_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Level_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Level_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Level_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Level_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Level_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Level_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Level_VersionStructure withId(String value) {
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
