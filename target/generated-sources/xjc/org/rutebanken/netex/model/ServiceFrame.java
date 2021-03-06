//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Service_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionFrameGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ServiceFrameGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ServiceFrameIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ServiceFrame
    extends Service_VersionFrameStructure
{


    @Override
    public ServiceFrame withNetwork(Network value) {
        setNetwork(value);
        return this;
    }

    @Override
    public ServiceFrame withAdditionalNetworks(NetworksInFrame_RelStructure value) {
        setAdditionalNetworks(value);
        return this;
    }

    @Override
    public ServiceFrame withDirections(DirectionsInFrame_RelStructure value) {
        setDirections(value);
        return this;
    }

    @Override
    public ServiceFrame withRoutePoints(RoutePointsInFrame_RelStructure value) {
        setRoutePoints(value);
        return this;
    }

    @Override
    public ServiceFrame withRouteLinks(RouteLinksInFrame_RelStructure value) {
        setRouteLinks(value);
        return this;
    }

    @Override
    public ServiceFrame withRoutes(RoutesInFrame_RelStructure value) {
        setRoutes(value);
        return this;
    }

    @Override
    public ServiceFrame withFlexiblePointProperties(FlexiblePointProperties_RelStructure value) {
        setFlexiblePointProperties(value);
        return this;
    }

    @Override
    public ServiceFrame withFlexibleLinkProperties(FlexibleLinkProperties_RelStructure value) {
        setFlexibleLinkProperties(value);
        return this;
    }

    @Override
    public ServiceFrame withCommonSections(CommonSectionsInFrame_RelStructure value) {
        setCommonSections(value);
        return this;
    }

    @Override
    public ServiceFrame withGeneralSections(GeneralSectionsInFrame_RelStructure value) {
        setGeneralSections(value);
        return this;
    }

    @Override
    public ServiceFrame withGroupsOfLinks(GroupOfLinks_RelStructure value) {
        setGroupsOfLinks(value);
        return this;
    }

    @Override
    public ServiceFrame withGroupsOfPoints(GroupOfPoints_RelStructure value) {
        setGroupsOfPoints(value);
        return this;
    }

    @Override
    public ServiceFrame withLines(LinesInFrame_RelStructure value) {
        setLines(value);
        return this;
    }

    @Override
    public ServiceFrame withGroupsOfLines(GroupsOfLinesInFrame_RelStructure value) {
        setGroupsOfLines(value);
        return this;
    }

    @Override
    public ServiceFrame withDestinationDisplays(DestinationDisplaysInFrame_RelStructure value) {
        setDestinationDisplays(value);
        return this;
    }

    @Override
    public ServiceFrame withLineNetworks(LineNetworksInFrame_RelStructure value) {
        setLineNetworks(value);
        return this;
    }

    @Override
    public ServiceFrame withScheduledStopPoints(ScheduledStopPointsInFrame_RelStructure value) {
        setScheduledStopPoints(value);
        return this;
    }

    @Override
    public ServiceFrame withServiceLinks(ServiceLinksInFrame_RelStructure value) {
        setServiceLinks(value);
        return this;
    }

    @Override
    public ServiceFrame withServicePatterns(ServicePatternsInFrame_RelStructure value) {
        setServicePatterns(value);
        return this;
    }

    @Override
    public ServiceFrame withStopAreas(StopAreasInFrame_RelStructure value) {
        setStopAreas(value);
        return this;
    }

    @Override
    public ServiceFrame withConnections(TransfersInFrame_RelStructure value) {
        setConnections(value);
        return this;
    }

    @Override
    public ServiceFrame withTariffZones(TariffZonesInFrame_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public ServiceFrame withStopAssignments(StopAssignmentsInFrame_RelStructure value) {
        setStopAssignments(value);
        return this;
    }

    @Override
    public ServiceFrame withTimingPoints(TimingPointsInFrame_RelStructure value) {
        setTimingPoints(value);
        return this;
    }

    @Override
    public ServiceFrame withTimingLinks(TimingLinksInFrame_RelStructure value) {
        setTimingLinks(value);
        return this;
    }

    @Override
    public ServiceFrame withTimingPatterns(TimingPatternsInFrame_RelStructure value) {
        setTimingPatterns(value);
        return this;
    }

    @Override
    public ServiceFrame withJourneyPatterns(JourneyPatternsInFrame_RelStructure value) {
        setJourneyPatterns(value);
        return this;
    }

    @Override
    public ServiceFrame withTransferRestrictions(TransferRestrictionsInFrame_RelStructure value) {
        setTransferRestrictions(value);
        return this;
    }

    @Override
    public ServiceFrame withRoutingConstraintZones(RoutingConstraintZonesInFrame_RelStructure value) {
        setRoutingConstraintZones(value);
        return this;
    }

    @Override
    public ServiceFrame withServiceExclusions(ServiceExclusionsInFrame_RelStructure value) {
        setServiceExclusions(value);
        return this;
    }

    @Override
    public ServiceFrame withTimeDemandTypes(TimeDemandTypesInFrame_RelStructure value) {
        setTimeDemandTypes(value);
        return this;
    }

    @Override
    public ServiceFrame withTimeDemandTypeAssignments(TimeDemandTypeAssignmentsInFrame_RelStructure value) {
        setTimeDemandTypeAssignments(value);
        return this;
    }

    @Override
    public ServiceFrame withTimingLinkGroups(GroupOfLinksInFrame_RelStructure value) {
        setTimingLinkGroups(value);
        return this;
    }

    @Override
    public ServiceFrame withNotices(NoticesInFrame_RelStructure value) {
        setNotices(value);
        return this;
    }

    @Override
    public ServiceFrame withNoticeAssignments(NoticeAssignmentsInFrame_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ServiceFrame withLogicalDisplays(LogicalDisplaysInFrame_RelStructure value) {
        setLogicalDisplays(value);
        return this;
    }

    @Override
    public ServiceFrame withDisplayAssignments(DisplayAssignmentsInFrame_RelStructure value) {
        setDisplayAssignments(value);
        return this;
    }

    @Override
    public ServiceFrame withPassengerInformationEquipments(PassengerInformationEquipmentsInFrame_RelStructure value) {
        setPassengerInformationEquipments(value);
        return this;
    }

    @Override
    public ServiceFrame withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ServiceFrame withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ServiceFrame withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public ServiceFrame withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public ServiceFrame withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public ServiceFrame withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public ServiceFrame withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public ServiceFrame withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public ServiceFrame withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public ServiceFrame withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public ServiceFrame withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public ServiceFrame withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceFrame withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceFrame withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceFrame withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceFrame withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceFrame withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceFrame withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceFrame withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceFrame withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceFrame withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceFrame withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceFrame withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceFrame withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceFrame withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceFrame withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceFrame withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceFrame withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceFrame withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceFrame withId(String value) {
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
