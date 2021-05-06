//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ScheduledStopPoint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledStopPoint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimingPoint_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ScheduledStopPointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledStopPoint_VersionStructure", propOrder = {
    "stopAreas",
    "tariffZones",
    "shortName",
    "nameSuffix",
    "description",
    "label",
    "shortStopCode",
    "publicCode",
    "privateCode",
    "externalStopPointRef",
    "url",
    "stopType",
    "compassBearing",
    "presentation",
    "vehicleModes",
    "forAlighting",
    "forBoarding",
    "requestStop",
    "requestMethodType",
    "countryRef",
    "topographicPlaceRef",
    "topographicPlaceView",
    "atCentre"
})
@XmlSeeAlso({
    ScheduledStopPoint.class,
    FareScheduledStopPoint_VersionStructure.class
})
public class ScheduledStopPoint_VersionStructure
    extends TimingPoint_VersionStructure
{

    protected StopAreaRefs_RelStructure stopAreas;
    protected TariffZoneRefs_RelStructure tariffZones;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "NameSuffix")
    protected MultilingualString nameSuffix;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElement(name = "ShortStopCode")
    protected PrivateCodeStructure shortStopCode;
    @XmlElement(name = "PublicCode")
    protected PrivateCodeStructure publicCode;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "ExternalStopPointRef")
    protected ExternalObjectRefStructure externalStopPointRef;
    @XmlElement(name = "Url")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "StopType")
    @XmlSchemaType(name = "string")
    protected StopTypeEnumeration stopType;
    @XmlElement(name = "CompassBearing")
    protected Float compassBearing;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<VehicleModeEnumeration> vehicleModes;
    @XmlElement(name = "ForAlighting")
    protected Boolean forAlighting;
    @XmlElement(name = "ForBoarding")
    protected Boolean forBoarding;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "RequestMethodType", defaultValue = "noneRequired")
    @XmlSchemaType(name = "NMTOKEN")
    protected RequestMethodTypeEnumeration requestMethodType;
    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;
    @XmlElement(name = "AtCentre", defaultValue = "false")
    protected Boolean atCentre;

    /**
     * Gets the value of the stopAreas property.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefs_RelStructure }
     *     
     */
    public StopAreaRefs_RelStructure getStopAreas() {
        return stopAreas;
    }

    /**
     * Sets the value of the stopAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefs_RelStructure }
     *     
     */
    public void setStopAreas(StopAreaRefs_RelStructure value) {
        this.stopAreas = value;
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
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameSuffix(MultilingualString value) {
        this.nameSuffix = value;
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

    /**
     * Gets the value of the shortStopCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getShortStopCode() {
        return shortStopCode;
    }

    /**
     * Sets the value of the shortStopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setShortStopCode(PrivateCodeStructure value) {
        this.shortStopCode = value;
    }

    /**
     * Gets the value of the publicCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPublicCode() {
        return publicCode;
    }

    /**
     * Sets the value of the publicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPublicCode(PrivateCodeStructure value) {
        this.publicCode = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the externalStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalStopPointRef() {
        return externalStopPointRef;
    }

    /**
     * Sets the value of the externalStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalStopPointRef(ExternalObjectRefStructure value) {
        this.externalStopPointRef = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the stopType property.
     * 
     * @return
     *     possible object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public StopTypeEnumeration getStopType() {
        return stopType;
    }

    /**
     * Sets the value of the stopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTypeEnumeration }
     *     
     */
    public void setStopType(StopTypeEnumeration value) {
        this.stopType = value;
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
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModeEnumeration }
     * 
     * 
     */
    public List<VehicleModeEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<VehicleModeEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Gets the value of the forAlighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForAlighting() {
        return forAlighting;
    }

    /**
     * Sets the value of the forAlighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForAlighting(Boolean value) {
        this.forAlighting = value;
    }

    /**
     * Gets the value of the forBoarding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForBoarding() {
        return forBoarding;
    }

    /**
     * Sets the value of the forBoarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForBoarding(Boolean value) {
        this.forBoarding = value;
    }

    /**
     * Gets the value of the requestStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Sets the value of the requestStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the requestMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public RequestMethodTypeEnumeration getRequestMethodType() {
        return requestMethodType;
    }

    /**
     * Sets the value of the requestMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMethodTypeEnumeration }
     *     
     */
    public void setRequestMethodType(RequestMethodTypeEnumeration value) {
        this.requestMethodType = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the topographicPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Sets the value of the topographicPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Gets the value of the topographicPlaceView property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Sets the value of the topographicPlaceView property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    /**
     * Gets the value of the atCentre property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtCentre() {
        return atCentre;
    }

    /**
     * Sets the value of the atCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtCentre(Boolean value) {
        this.atCentre = value;
    }

    public ScheduledStopPoint_VersionStructure withStopAreas(StopAreaRefs_RelStructure value) {
        setStopAreas(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withShortStopCode(PrivateCodeStructure value) {
        setShortStopCode(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withExternalStopPointRef(ExternalObjectRefStructure value) {
        setExternalStopPointRef(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withStopType(StopTypeEnumeration value) {
        setStopType(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withCompassBearing(Float value) {
        setCompassBearing(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withVehicleModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getVehicleModes().add(value);
            }
        }
        return this;
    }

    public ScheduledStopPoint_VersionStructure withVehicleModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getVehicleModes().addAll(values);
        }
        return this;
    }

    public ScheduledStopPoint_VersionStructure withForAlighting(Boolean value) {
        setForAlighting(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withForBoarding(Boolean value) {
        setForBoarding(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withRequestMethodType(RequestMethodTypeEnumeration value) {
        setRequestMethodType(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    public ScheduledStopPoint_VersionStructure withAtCentre(Boolean value) {
        setAtCentre(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withAllowedForWaitTime(Duration value) {
        setAllowedForWaitTime(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withPointNumber(String value) {
        setPointNumber(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withTypes(TypeOfPointRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withGroupMemberships(GroupMembershipRefs_RelStructure value) {
        setGroupMemberships(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ScheduledStopPoint_VersionStructure withId(String value) {
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
