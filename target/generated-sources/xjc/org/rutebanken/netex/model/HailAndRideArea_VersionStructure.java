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
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for HailAndRideArea_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HailAndRideArea_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}FlexibleQuay_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}HailAndRideAreaGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HailAndRideArea_VersionStructure", propOrder = {
    "bearingCompass",
    "bearingDegrees",
    "destinations",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    HailAndRideArea.class
})
public class HailAndRideArea_VersionStructure
    extends FlexibleQuay_VersionStructure
{

    @XmlElement(name = "BearingCompass")
    @XmlSchemaType(name = "string")
    protected CompassBearing16Enumeration bearingCompass;
    @XmlElement(name = "BearingDegrees")
    protected BigInteger bearingDegrees;
    protected DestinationDisplayViews_RelStructure destinations;
    @XmlElement(name = "StartPointRef", required = true)
    protected PointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef", required = true)
    protected PointRefStructure endPointRef;

    /**
     * Gets the value of the bearingCompass property.
     * 
     * @return
     *     possible object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public CompassBearing16Enumeration getBearingCompass() {
        return bearingCompass;
    }

    /**
     * Sets the value of the bearingCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompassBearing16Enumeration }
     *     
     */
    public void setBearingCompass(CompassBearing16Enumeration value) {
        this.bearingCompass = value;
    }

    /**
     * Gets the value of the bearingDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBearingDegrees() {
        return bearingDegrees;
    }

    /**
     * Sets the value of the bearingDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBearingDegrees(BigInteger value) {
        this.bearingDegrees = value;
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
     * Gets the value of the startPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Sets the value of the startPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setStartPointRef(PointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Sets the value of the endPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setEndPointRef(PointRefStructure value) {
        this.endPointRef = value;
    }

    public HailAndRideArea_VersionStructure withBearingCompass(CompassBearing16Enumeration value) {
        setBearingCompass(value);
        return this;
    }

    public HailAndRideArea_VersionStructure withBearingDegrees(BigInteger value) {
        setBearingDegrees(value);
        return this;
    }

    public HailAndRideArea_VersionStructure withDestinations(DestinationDisplayViews_RelStructure value) {
        setDestinations(value);
        return this;
    }

    public HailAndRideArea_VersionStructure withStartPointRef(PointRefStructure value) {
        setStartPointRef(value);
        return this;
    }

    public HailAndRideArea_VersionStructure withEndPointRef(PointRefStructure value) {
        setEndPointRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withFlexibleStopPlaceRef(FlexibleStopPlaceRefStructure value) {
        setFlexibleStopPlaceRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public HailAndRideArea_VersionStructure withId(String value) {
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
