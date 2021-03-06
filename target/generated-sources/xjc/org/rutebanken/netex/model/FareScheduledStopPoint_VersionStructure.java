//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FareScheduledStopPoint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareScheduledStopPoint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}ScheduledStopPoint_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareScheduledStopPointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareScheduledStopPoint_VersionStructure", propOrder = {
    "siteFacilitySetRef",
    "siteFacilitySet",
    "nameOnRouting",
    "accountingStopPointRef",
    "borderPointRef"
})
@XmlSeeAlso({
    FareScheduledStopPoint.class
})
public class FareScheduledStopPoint_VersionStructure
    extends ScheduledStopPoint_VersionStructure
{

    @XmlElement(name = "SiteFacilitySetRef")
    protected SiteFacilitySetRefStructure siteFacilitySetRef;
    @XmlElement(name = "SiteFacilitySet")
    protected SiteFacilitySet siteFacilitySet;
    @XmlElement(name = "NameOnRouting")
    protected MultilingualString nameOnRouting;
    @XmlElement(name = "AccountingStopPointRef")
    protected FareScheduledStopPointRefStructure accountingStopPointRef;
    @XmlElement(name = "BorderPointRef")
    protected BorderPointRefStructure borderPointRef;

    /**
     * Gets the value of the siteFacilitySetRef property.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySetRefStructure }
     *     
     */
    public SiteFacilitySetRefStructure getSiteFacilitySetRef() {
        return siteFacilitySetRef;
    }

    /**
     * Sets the value of the siteFacilitySetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySetRefStructure }
     *     
     */
    public void setSiteFacilitySetRef(SiteFacilitySetRefStructure value) {
        this.siteFacilitySetRef = value;
    }

    /**
     * Gets the value of the siteFacilitySet property.
     * 
     * @return
     *     possible object is
     *     {@link SiteFacilitySet }
     *     
     */
    public SiteFacilitySet getSiteFacilitySet() {
        return siteFacilitySet;
    }

    /**
     * Sets the value of the siteFacilitySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteFacilitySet }
     *     
     */
    public void setSiteFacilitySet(SiteFacilitySet value) {
        this.siteFacilitySet = value;
    }

    /**
     * Gets the value of the nameOnRouting property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameOnRouting() {
        return nameOnRouting;
    }

    /**
     * Sets the value of the nameOnRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameOnRouting(MultilingualString value) {
        this.nameOnRouting = value;
    }

    /**
     * Gets the value of the accountingStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareScheduledStopPointRefStructure }
     *     
     */
    public FareScheduledStopPointRefStructure getAccountingStopPointRef() {
        return accountingStopPointRef;
    }

    /**
     * Sets the value of the accountingStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareScheduledStopPointRefStructure }
     *     
     */
    public void setAccountingStopPointRef(FareScheduledStopPointRefStructure value) {
        this.accountingStopPointRef = value;
    }

    /**
     * Gets the value of the borderPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link BorderPointRefStructure }
     *     
     */
    public BorderPointRefStructure getBorderPointRef() {
        return borderPointRef;
    }

    /**
     * Sets the value of the borderPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderPointRefStructure }
     *     
     */
    public void setBorderPointRef(BorderPointRefStructure value) {
        this.borderPointRef = value;
    }

    public FareScheduledStopPoint_VersionStructure withSiteFacilitySetRef(SiteFacilitySetRefStructure value) {
        setSiteFacilitySetRef(value);
        return this;
    }

    public FareScheduledStopPoint_VersionStructure withSiteFacilitySet(SiteFacilitySet value) {
        setSiteFacilitySet(value);
        return this;
    }

    public FareScheduledStopPoint_VersionStructure withNameOnRouting(MultilingualString value) {
        setNameOnRouting(value);
        return this;
    }

    public FareScheduledStopPoint_VersionStructure withAccountingStopPointRef(FareScheduledStopPointRefStructure value) {
        setAccountingStopPointRef(value);
        return this;
    }

    public FareScheduledStopPoint_VersionStructure withBorderPointRef(BorderPointRefStructure value) {
        setBorderPointRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withStopAreas(StopAreaRefs_RelStructure value) {
        setStopAreas(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withShortStopCode(PrivateCodeStructure value) {
        setShortStopCode(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withExternalStopPointRef(ExternalObjectRefStructure value) {
        setExternalStopPointRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withStopType(StopTypeEnumeration value) {
        setStopType(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withCompassBearing(Float value) {
        setCompassBearing(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withVehicleModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getVehicleModes().add(value);
            }
        }
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withVehicleModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getVehicleModes().addAll(values);
        }
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withForAlighting(Boolean value) {
        setForAlighting(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withForBoarding(Boolean value) {
        setForBoarding(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withRequestMethodType(RequestMethodTypeEnumeration value) {
        setRequestMethodType(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withAtCentre(Boolean value) {
        setAtCentre(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withAllowedForWaitTime(Duration value) {
        setAllowedForWaitTime(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withPointNumber(String value) {
        setPointNumber(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withTypes(TypeOfPointRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withGroupMemberships(GroupMembershipRefs_RelStructure value) {
        setGroupMemberships(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FareScheduledStopPoint_VersionStructure withId(String value) {
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
