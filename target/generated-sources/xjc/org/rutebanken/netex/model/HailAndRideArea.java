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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}HailAndRideArea_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfEntitiesGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfPointsGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ZoneGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PlaceGroup"/&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FlexibleQuayGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}HailAndRideAreaGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}HailAndRideAreaIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class HailAndRideArea
    extends HailAndRideArea_VersionStructure
{


    @Override
    public HailAndRideArea withBearingCompass(CompassBearing16Enumeration value) {
        setBearingCompass(value);
        return this;
    }

    @Override
    public HailAndRideArea withBearingDegrees(BigInteger value) {
        setBearingDegrees(value);
        return this;
    }

    @Override
    public HailAndRideArea withDestinations(DestinationDisplayViews_RelStructure value) {
        setDestinations(value);
        return this;
    }

    @Override
    public HailAndRideArea withStartPointRef(PointRefStructure value) {
        setStartPointRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withEndPointRef(PointRefStructure value) {
        setEndPointRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withNameSuffix(MultilingualString value) {
        setNameSuffix(value);
        return this;
    }

    @Override
    public HailAndRideArea withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public HailAndRideArea withFlexibleStopPlaceRef(FlexibleStopPlaceRefStructure value) {
        setFlexibleStopPlaceRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public HailAndRideArea withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public HailAndRideArea withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public HailAndRideArea withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public HailAndRideArea withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public HailAndRideArea withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public HailAndRideArea withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public HailAndRideArea withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public HailAndRideArea withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public HailAndRideArea withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public HailAndRideArea withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public HailAndRideArea withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public HailAndRideArea withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public HailAndRideArea withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public HailAndRideArea withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public HailAndRideArea withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public HailAndRideArea withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public HailAndRideArea withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public HailAndRideArea withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public HailAndRideArea withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public HailAndRideArea withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public HailAndRideArea withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public HailAndRideArea withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public HailAndRideArea withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public HailAndRideArea withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public HailAndRideArea withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HailAndRideArea withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HailAndRideArea withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public HailAndRideArea withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public HailAndRideArea withId(String value) {
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
