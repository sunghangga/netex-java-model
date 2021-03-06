//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for containmentAggregationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="containmentAggregationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}relationshipStructure"&gt;
 *       &lt;attribute name="modificationSet" type="{http://www.netex.org.uk/netex}ModificationSetEnumeration" default="all" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containmentAggregationStructure")
@XmlSeeAlso({
    ValidityConditions_RelStructure.class,
    ActivationAssignments_RelStructure.class,
    VehicleEquipments_RelStructure.class,
    CustomerPurchaseParameterAssignments_RelStructure.class,
    VersionsInFrame_RelStructure.class,
    EntitiesInVersion_RelStructure.class,
    Versions_RelStructure.class,
    ValidityTriggers_RelStructure.class,
    ValidityRuleParameters_RelStructure.class,
    TypesOfValueInFrame_RelStructure.class,
    DataSourcesInFrame_RelStructure.class,
    DataSources_RelStructure.class,
    CodespacesInFrame_RelStructure.class,
    ResponsibilitySetsInFrame_RelStructure.class,
    ResponsibilitySets_RelStructure.class,
    ResponsibilityRoles_RelStructure.class,
    GroupOfEntitiesInFrame_RelStructure.class,
    DayTypesInFrame_RelStructure.class,
    TimebandsInFrame_RelStructure.class,
    GroupOfTimebandsInFrame_RelStructure.class,
    Timebands_RelStructure.class,
    GroupOfTimebands_RelStructure.class,
    OperatingDaysInFrame_RelStructure.class,
    OperatingPeriodsInFrame_RelStructure.class,
    DayTypeAssignmentsInFrame_RelStructure.class,
    OperatingDays_RelStructure.class,
    OperatingPeriods_RelStructure.class,
    AvailabilityConditions_RelStructure.class,
    ContainedAvailabilityConditions_RelStructure.class,
    Frames_RelStructure.class,
    Projections_RelStructure.class,
    GroupOfLinksInFrame_RelStructure.class,
    PointsOnLinkInFrame_RelStructure.class,
    ZonesInFrame_RelStructure.class,
    TariffZonesInFrame_RelStructure.class,
    OrganisationsInFrame_RelStructure.class,
    DepartmentsInFrame_RelStructure.class,
    Departments_RelStructure.class,
    OrganisationalUnits_RelStructure.class,
    AdministrativeZones_RelStructure.class,
    TransfersInFrame_RelStructure.class,
    GeneralSectionsInFrame_RelStructure.class,
    SpatialFeaturesInFrame_RelStructure.class,
    ComplexFeatureMembers_RelStructure.class,
    TransportModes_RelStructure.class,
    AccessesInFrame_RelStructure.class,
    Accesses_RelStructure.class,
    AddressesInFrame_RelStructure.class,
    CountriesInFrame_RelStructure.class,
    EquipmentsInFrame_RelStructure.class,
    Equipments_RelStructure.class,
    PassengerEquipments_RelStructure.class,
    PlaceEquipments_RelStructure.class,
    EquipmentPlaces_RelStructure.class,
    TypesOfServiceInFrame_RelStructure.class,
    SiteFacilitySetsInFrame_RelStructure.class,
    ServiceFacilitySetsInFrame_RelStructure.class,
    ServiceFacilitySets_RelStructure.class,
    SiteFacilitySets_RelStructure.class,
    TypesOfFacility_RelStructure.class,
    Accommodations_RelStructure.class,
    OnboardStays_RelStructure.class,
    NoticesInFrame_RelStructure.class,
    Notices_RelStructure.class,
    NoticeAssignmentsInFrame_RelStructure.class,
    NoticeAssignmentViews_RelStructure.class,
    SchematicMapsInFrame_RelStructure.class,
    SecurityLists_RelStructure.class,
    SecurityListings_RelStructure.class,
    TypesOfSecurityList_RelStructure.class,
    Blacklists_RelStructure.class,
    Whitelists_RelStructure.class,
    TopographicPlacesInFrame_RelStructure.class,
    TopographicPlaces_RelStructure.class,
    GroupsOfPlacesInFrame_RelStructure.class,
    PassengerCarryingRequirements_RelStructure.class,
    VehicleManoeuvringRequirements_RelStructure.class,
    FacilityRequirements_RelStructure.class,
    VehicleTypesInFrame_RelStructure.class,
    VehicleModelsInFrame_RelStructure.class,
    VehiclesInFrame_RelStructure.class,
    VehicleEquipmenProfilesInFrame_RelStructure.class,
    TrainComponents_RelStructure.class,
    GroupsOfOperatorsInFrame_RelStructure.class,
    TransportOperatorsInFrame_RelStructure.class,
    OperationalContextsInFrame_RelStructure.class,
    ControlCentresInFrame_RelStructure.class,
    ControlCentres_RelStructure.class,
    EntityInVersionInFrame_RelStructure.class,
    VersionFrameMembers_RelStructure.class,
    GeneralFrameMembers_RelStructure.class,
    TrafficControlPointsInFrame_RelStructure.class,
    ActivationLinksInFrame_RelStructure.class,
    ActivationPointsInFrame_RelStructure.class,
    ActivatedEquipmentsInFrame_RelStructure.class,
    InfrastructureJunctionsInFrame_RelStructure.class,
    InfrastructureElementsInFrame_RelStructure.class,
    NetworkRestrictionsInFrame_RelStructure.class,
    TimingPointsInFrame_RelStructure.class,
    TimingLinksInFrame_RelStructure.class,
    TimingPatternsInFrame_RelStructure.class,
    GroupOfTimingLinksInFrame_RelStructure.class,
    TimingPoints_RelStructure.class,
    CrewBasesInFrame_RelStructure.class,
    GaragesInFrame_RelStructure.class,
    ReliefPointsInFrame_RelStructure.class,
    GroupsOfLinesInFrame_RelStructure.class,
    NetworksInFrame_RelStructure.class,
    PurposesOfGroupingInFrame_RelStructure.class,
    DestinationDisplaysInFrame_RelStructure.class,
    LinesInFrame_RelStructure.class,
    AllowedLineDirections_RelStructure.class,
    LinesInDirectionRefs_RelStructure.class,
    DestinationDisplayViews_RelStructure.class,
    DirectionsInFrame_RelStructure.class,
    RoutesInFrame_RelStructure.class,
    RoutePointsInFrame_RelStructure.class,
    RouteLinksInFrame_RelStructure.class,
    Routes_RelStructure.class,
    FlexibleLinkProperties_RelStructure.class,
    FlexiblePointProperties_RelStructure.class,
    LineNetworksInFrame_RelStructure.class,
    LineSections_RelStructure.class,
    PointOnLineSections_RelStructure.class,
    CommonSectionsInFrame_RelStructure.class,
    JourneyPatternsInFrame_RelStructure.class,
    CheckConstraintInFrame_RelStructure.class,
    CheckConstraintDelaysInFrame_RelStructure.class,
    CheckConstraintThroughputsInFrame_RelStructure.class,
    CheckConstraints_RelStructure.class,
    LocalServices_RelStructure.class,
    ExplicitEquipments_RelStructure.class,
    ExplicitPlaceEquipments_RelStructure.class,
    ExplicitLocalServices_RelStructure.class,
    SiteEntrances_RelStructure.class,
    VehicleEntrances_RelStructure.class,
    Levels_RelStructure.class,
    AccessZones_RelStructure.class,
    SitePathLinks_RelStructure.class,
    PathJunctions_RelStructure.class,
    NavigationPathsInFrame_RelStructure.class,
    PathLinksInFrame_RelStructure.class,
    PathJunctionsInFrame_RelStructure.class,
    NavigationPaths_RelStructure.class,
    ScheduledStopPointsInFrame_RelStructure.class,
    ServiceLinksInFrame_RelStructure.class,
    StopAreasInFrame_RelStructure.class,
    ServicePatternsInFrame_RelStructure.class,
    FarePointsInPattern_RelStructure.class,
    FareSections_RelStructure.class,
    LogicalDisplaysInFrame_RelStructure.class,
    PassengerInformationEquipmentsInFrame_RelStructure.class,
    DisplayAssignmentsInFrame_RelStructure.class,
    DisplayAssignments_RelStructure.class,
    StopPlacesInFrame_RelStructure.class,
    GroupsOfStopPlacesInFrame_RelStructure.class,
    StopPlaces_RelStructure.class,
    Quays_RelStructure.class,
    AccessSpaces_RelStructure.class,
    BoardingPositions_RelStructure.class,
    StopPlaceVehicleEntrances_RelStructure.class,
    VehicleStoppingPlaces_RelStructure.class,
    VehicleStoppingPositions_RelStructure.class,
    VehicleQuayAlignments_RelStructure.class,
    VehiclePositionAlignments_RelStructure.class,
    StopAssignmentsInFrame_RelStructure.class,
    ServiceExclusionsInFrame_RelStructure.class,
    TransferRestrictionsInFrame_RelStructure.class,
    RoutingConstraintZonesInFrame_RelStructure.class,
    TimeDemandTypesInFrame_RelStructure.class,
    TimeDemandTypeAssignmentsInFrame_RelStructure.class,
    FlexibleStopPlacesInFrame_RelStructure.class,
    FlexibleStopPlaces_RelStructure.class,
    FlexibleQuays_RelStructure.class,
    FlexibleAreas_RelStructure.class,
    HailAndRideAreas_RelStructure.class,
    ParkingsInFrame_RelStructure.class,
    ParkingEntrancesForVehicles_RelStructure.class,
    ParkingCapacities_RelStructure.class,
    ParkingAreas_RelStructure.class,
    ParkingBays_RelStructure.class,
    PointsOfInterestInFrame_RelStructure.class,
    PointOfInterestClassificationHierarchiesInFrame_RelStructure.class,
    PointOfInterestSpaces_RelStructure.class,
    PointOfInterestEntrances_RelStructure.class,
    AssistanceBookingServices_RelStructure.class,
    PointOfInterestClassificationsInFrame_RelStructure.class,
    FrequencyGroupsInFrame_RelStructure.class,
    FrequencyGroups_RelStructure.class,
    JourneyMeetingsInFrame_RelStructure.class,
    JourneyInterchangesInFrame_RelStructure.class,
    DefaultInterchangseInFrame_RelStructure.class,
    InterchangeRulesInFrame_RelStructure.class,
    InterchangeRules_RelStructure.class,
    NoticeAssignments_RelStructure.class,
    InterchangeRuleFilters_RelStructure.class,
    InterchangeRuleTimings_RelStructure.class,
    JourneyPartsInFrame_RelStructure.class,
    CoupledJourneysInFrame_RelStructure.class,
    JourneyPartCouplesInFrame_RelStructure.class,
    JourneyParts_RelStructure.class,
    JourneyPartPositions_RelStructure.class,
    CoupledJourneys_RelStructure.class,
    JourneyPartCouples_RelStructure.class,
    JourneyAccountingsInFrame_RelStructure.class,
    JourneyAccountings_RelStructure.class,
    TrainNumbersInFrame_RelStructure.class,
    VehicleJourneyStopAssignmentsInFrame_RelStructure.class,
    TrainComponentLabelAssignments_RelStructure.class,
    VehicleTypeStopAssignments_RelStructure.class,
    VehicleJourneyStopAssignments_RelStructure.class,
    TrainStopAssignments_RelStructure.class,
    GroupsOfServicesInFrame_RelStructure.class,
    SpecialServices_RelStructure.class,
    FlexibleServicePropertiesInFrame_RelStructure.class,
    PassengerJourneysInFrame_RelStructure.class,
    JourneysInFrame_RelStructure.class,
    DutiesInFrame_RelStructure.class,
    DriverTripsInFrame_RelStructure.class,
    DutyParts_RelStructure.class,
    DriverTripTimes_RelStructure.class,
    BlocksInFrame_RelStructure.class,
    CoursesOfJourneysInFrame_RelStructure.class,
    VehicleServicesInFrame_RelStructure.class,
    ReliefOpportunitiesInFrame_RelStructure.class,
    BlockParts_RelStructure.class,
    VehicleServiceParts_RelStructure.class,
    CoursesOfJourneys_RelStructure.class,
    ReliefOpportunities_RelStructure.class,
    DutyPartsInFrame_RelStructure.class,
    PriceUnits_RelStructure.class,
    SeriesConstraints_RelStructure.class,
    FareStructureFactors_RelStructure.class,
    GeographicalUnits_RelStructure.class,
    GeographicalIntervals_RelStructure.class,
    GroupsOfDistanceMatrixElements_RelStructure.class,
    DistanceMatrixElements_RelStructure.class,
    TypeOfUsageParameters_RelStructure.class,
    AccessRightParameterAssignments_RelStructure.class,
    ValidityParameterAssignments_RelStructure.class,
    GenericParameterAssignments_RelStructure.class,
    TypeOfAccessRightAssignments_RelStructure.class,
    TimeUnits_RelStructure.class,
    TimeIntervals_RelStructure.class,
    FareStructureElements_RelStructure.class,
    TypeOfFareProducts_RelStructure.class,
    TypeOfConcessions_RelStructure.class,
    DayTypes_RelStructure.class,
    FulfilmentMethods_RelStructure.class,
    SalesOfferPackageElements_RelStructure.class,
    SalesOfferPackageSubstitutions_RelStructure.class,
    DistributionAssignments_RelStructure.class,
    TypesOfSalesOfferPackage_RelStructure.class,
    TypesOfTravelDocuments_RelStructure.class,
    TypesOfMachineReadabilities_RelStructure.class,
    ParkingChargeBands_RelStructure.class,
    ParkingTariffsInFrame_RelStructure.class,
    CustomerEligibilities_RelStructure.class,
    Customers_RelStructure.class,
    FareContracts_RelStructure.class,
    FareContractEntries_RelStructure.class,
    TypesOfFareContract_RelStructure.class,
    TypesOfFareContractEntry_RelStructure.class,
    CustomerAccounts_RelStructure.class,
    TypesOfCustomerAccount_RelStructure.class,
    TypesOfAccountStatus_RelStructure.class,
    RetailConsortiums_RelStructure.class,
    OrganisationParts_RelStructure.class,
    RetailDevices_RelStructure.class,
    TypesOfRetailDevice_RelStructure.class,
    TravelSpecifications_RelStructure.class,
    OfferedTravelSpecifications_RelStructure.class,
    SpecificParameterAssignments_RelStructure.class,
    CustomerPurchasePackageElements_RelStructure.class,
    SalesTransactions_RelStructure.class
})
public class ContainmentAggregationStructure
    extends RelationshipStructure
{

    @XmlAttribute(name = "modificationSet")
    protected ModificationSetEnumeration modificationSet;

    /**
     * Gets the value of the modificationSet property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public ModificationSetEnumeration getModificationSet() {
        if (modificationSet == null) {
            return ModificationSetEnumeration.ALL;
        } else {
            return modificationSet;
        }
    }

    /**
     * Sets the value of the modificationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationSetEnumeration }
     *     
     */
    public void setModificationSet(ModificationSetEnumeration value) {
        this.modificationSet = value;
    }

    public ContainmentAggregationStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public ContainmentAggregationStructure withId(String value) {
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
