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
 * <p>Java class for RoadAddress_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadAddress_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Address_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoadAddressGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadAddress_VersionStructure", propOrder = {
    "gisFeatureRef",
    "roadNumber",
    "roadName",
    "bearingCompass",
    "bearingDegrees",
    "oddNumberRange",
    "evenNumberRange"
})
@XmlSeeAlso({
    RoadAddress.class
})
public class RoadAddress_VersionStructure
    extends Address_VersionStructure
{

    @XmlElement(name = "GisFeatureRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gisFeatureRef;
    @XmlElement(name = "RoadNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String roadNumber;
    @XmlElement(name = "RoadName")
    protected MultilingualString roadName;
    @XmlElement(name = "BearingCompass")
    @XmlSchemaType(name = "string")
    protected CompassBearing16Enumeration bearingCompass;
    @XmlElement(name = "BearingDegrees")
    protected BigInteger bearingDegrees;
    @XmlElement(name = "OddNumberRange")
    protected RoadNumberRangeStructure oddNumberRange;
    @XmlElement(name = "EvenNumberRange")
    protected RoadNumberRangeStructure evenNumberRange;

    /**
     * Gets the value of the gisFeatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGisFeatureRef() {
        return gisFeatureRef;
    }

    /**
     * Sets the value of the gisFeatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGisFeatureRef(String value) {
        this.gisFeatureRef = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

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
     * Gets the value of the oddNumberRange property.
     * 
     * @return
     *     possible object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public RoadNumberRangeStructure getOddNumberRange() {
        return oddNumberRange;
    }

    /**
     * Sets the value of the oddNumberRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public void setOddNumberRange(RoadNumberRangeStructure value) {
        this.oddNumberRange = value;
    }

    /**
     * Gets the value of the evenNumberRange property.
     * 
     * @return
     *     possible object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public RoadNumberRangeStructure getEvenNumberRange() {
        return evenNumberRange;
    }

    /**
     * Sets the value of the evenNumberRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadNumberRangeStructure }
     *     
     */
    public void setEvenNumberRange(RoadNumberRangeStructure value) {
        this.evenNumberRange = value;
    }

    public RoadAddress_VersionStructure withGisFeatureRef(String value) {
        setGisFeatureRef(value);
        return this;
    }

    public RoadAddress_VersionStructure withRoadNumber(String value) {
        setRoadNumber(value);
        return this;
    }

    public RoadAddress_VersionStructure withRoadName(MultilingualString value) {
        setRoadName(value);
        return this;
    }

    public RoadAddress_VersionStructure withBearingCompass(CompassBearing16Enumeration value) {
        setBearingCompass(value);
        return this;
    }

    public RoadAddress_VersionStructure withBearingDegrees(BigInteger value) {
        setBearingDegrees(value);
        return this;
    }

    public RoadAddress_VersionStructure withOddNumberRange(RoadNumberRangeStructure value) {
        setOddNumberRange(value);
        return this;
    }

    public RoadAddress_VersionStructure withEvenNumberRange(RoadNumberRangeStructure value) {
        setEvenNumberRange(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withCountryName(MultilingualString value) {
        setCountryName(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RoadAddress_VersionStructure withId(String value) {
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