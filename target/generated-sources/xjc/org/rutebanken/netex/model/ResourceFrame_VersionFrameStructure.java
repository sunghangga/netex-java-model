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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ResourceFrame_VersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFrame_VersionFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResourceFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFrame_VersionFrameStructure", propOrder = {
    "dataSources",
    "responsibilitySets",
    "typesOfValue",
    "organisations",
    "groupsOfOperators",
    "operationalContexts",
    "controlCentres",
    "equipments",
    "vehicleTypes",
    "vehicleModels",
    "vehicleEquipmentProfiles",
    "vehicles",
    "schematicMaps",
    "groupsOfEntities",
    "zones",
    "blacklists",
    "whitelists"
})
@XmlSeeAlso({
    ResourceFrame.class
})
public class ResourceFrame_VersionFrameStructure
    extends Common_VersionFrameStructure
{

    protected DataSourcesInFrame_RelStructure dataSources;
    protected ResponsibilitySetsInFrame_RelStructure responsibilitySets;
    protected TypesOfValueInFrame_RelStructure typesOfValue;
    protected OrganisationsInFrame_RelStructure organisations;
    protected GroupsOfOperatorsInFrame_RelStructure groupsOfOperators;
    protected OperationalContextsInFrame_RelStructure operationalContexts;
    protected ControlCentresInFrame_RelStructure controlCentres;
    protected EquipmentsInFrame_RelStructure equipments;
    protected VehicleTypesInFrame_RelStructure vehicleTypes;
    protected VehicleModelsInFrame_RelStructure vehicleModels;
    protected VehicleEquipmenProfilesInFrame_RelStructure vehicleEquipmentProfiles;
    protected VehiclesInFrame_RelStructure vehicles;
    protected SchematicMapsInFrame_RelStructure schematicMaps;
    protected GroupOfEntitiesInFrame_RelStructure groupsOfEntities;
    protected ZonesInFrame_RelStructure zones;
    protected BlacklistsInFrame_RelStructure blacklists;
    protected WhitelistsInFrame_RelStructure whitelists;

    /**
     * Gets the value of the dataSources property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesInFrame_RelStructure }
     *     
     */
    public DataSourcesInFrame_RelStructure getDataSources() {
        return dataSources;
    }

    /**
     * Sets the value of the dataSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesInFrame_RelStructure }
     *     
     */
    public void setDataSources(DataSourcesInFrame_RelStructure value) {
        this.dataSources = value;
    }

    /**
     * Gets the value of the responsibilitySets property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetsInFrame_RelStructure }
     *     
     */
    public ResponsibilitySetsInFrame_RelStructure getResponsibilitySets() {
        return responsibilitySets;
    }

    /**
     * Sets the value of the responsibilitySets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetsInFrame_RelStructure }
     *     
     */
    public void setResponsibilitySets(ResponsibilitySetsInFrame_RelStructure value) {
        this.responsibilitySets = value;
    }

    /**
     * Gets the value of the typesOfValue property.
     * 
     * @return
     *     possible object is
     *     {@link TypesOfValueInFrame_RelStructure }
     *     
     */
    public TypesOfValueInFrame_RelStructure getTypesOfValue() {
        return typesOfValue;
    }

    /**
     * Sets the value of the typesOfValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypesOfValueInFrame_RelStructure }
     *     
     */
    public void setTypesOfValue(TypesOfValueInFrame_RelStructure value) {
        this.typesOfValue = value;
    }

    /**
     * Gets the value of the organisations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationsInFrame_RelStructure }
     *     
     */
    public OrganisationsInFrame_RelStructure getOrganisations() {
        return organisations;
    }

    /**
     * Sets the value of the organisations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationsInFrame_RelStructure }
     *     
     */
    public void setOrganisations(OrganisationsInFrame_RelStructure value) {
        this.organisations = value;
    }

    /**
     * Gets the value of the groupsOfOperators property.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfOperatorsInFrame_RelStructure }
     *     
     */
    public GroupsOfOperatorsInFrame_RelStructure getGroupsOfOperators() {
        return groupsOfOperators;
    }

    /**
     * Sets the value of the groupsOfOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfOperatorsInFrame_RelStructure }
     *     
     */
    public void setGroupsOfOperators(GroupsOfOperatorsInFrame_RelStructure value) {
        this.groupsOfOperators = value;
    }

    /**
     * Gets the value of the operationalContexts property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalContextsInFrame_RelStructure }
     *     
     */
    public OperationalContextsInFrame_RelStructure getOperationalContexts() {
        return operationalContexts;
    }

    /**
     * Sets the value of the operationalContexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalContextsInFrame_RelStructure }
     *     
     */
    public void setOperationalContexts(OperationalContextsInFrame_RelStructure value) {
        this.operationalContexts = value;
    }

    /**
     * Gets the value of the controlCentres property.
     * 
     * @return
     *     possible object is
     *     {@link ControlCentresInFrame_RelStructure }
     *     
     */
    public ControlCentresInFrame_RelStructure getControlCentres() {
        return controlCentres;
    }

    /**
     * Sets the value of the controlCentres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlCentresInFrame_RelStructure }
     *     
     */
    public void setControlCentres(ControlCentresInFrame_RelStructure value) {
        this.controlCentres = value;
    }

    /**
     * Gets the value of the equipments property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentsInFrame_RelStructure }
     *     
     */
    public EquipmentsInFrame_RelStructure getEquipments() {
        return equipments;
    }

    /**
     * Sets the value of the equipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentsInFrame_RelStructure }
     *     
     */
    public void setEquipments(EquipmentsInFrame_RelStructure value) {
        this.equipments = value;
    }

    /**
     * Gets the value of the vehicleTypes property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypesInFrame_RelStructure }
     *     
     */
    public VehicleTypesInFrame_RelStructure getVehicleTypes() {
        return vehicleTypes;
    }

    /**
     * Sets the value of the vehicleTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypesInFrame_RelStructure }
     *     
     */
    public void setVehicleTypes(VehicleTypesInFrame_RelStructure value) {
        this.vehicleTypes = value;
    }

    /**
     * Gets the value of the vehicleModels property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelsInFrame_RelStructure }
     *     
     */
    public VehicleModelsInFrame_RelStructure getVehicleModels() {
        return vehicleModels;
    }

    /**
     * Sets the value of the vehicleModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelsInFrame_RelStructure }
     *     
     */
    public void setVehicleModels(VehicleModelsInFrame_RelStructure value) {
        this.vehicleModels = value;
    }

    /**
     * Gets the value of the vehicleEquipmentProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmenProfilesInFrame_RelStructure }
     *     
     */
    public VehicleEquipmenProfilesInFrame_RelStructure getVehicleEquipmentProfiles() {
        return vehicleEquipmentProfiles;
    }

    /**
     * Sets the value of the vehicleEquipmentProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmenProfilesInFrame_RelStructure }
     *     
     */
    public void setVehicleEquipmentProfiles(VehicleEquipmenProfilesInFrame_RelStructure value) {
        this.vehicleEquipmentProfiles = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclesInFrame_RelStructure }
     *     
     */
    public VehiclesInFrame_RelStructure getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclesInFrame_RelStructure }
     *     
     */
    public void setVehicles(VehiclesInFrame_RelStructure value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the schematicMaps property.
     * 
     * @return
     *     possible object is
     *     {@link SchematicMapsInFrame_RelStructure }
     *     
     */
    public SchematicMapsInFrame_RelStructure getSchematicMaps() {
        return schematicMaps;
    }

    /**
     * Sets the value of the schematicMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchematicMapsInFrame_RelStructure }
     *     
     */
    public void setSchematicMaps(SchematicMapsInFrame_RelStructure value) {
        this.schematicMaps = value;
    }

    /**
     * Gets the value of the groupsOfEntities property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfEntitiesInFrame_RelStructure }
     *     
     */
    public GroupOfEntitiesInFrame_RelStructure getGroupsOfEntities() {
        return groupsOfEntities;
    }

    /**
     * Sets the value of the groupsOfEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfEntitiesInFrame_RelStructure }
     *     
     */
    public void setGroupsOfEntities(GroupOfEntitiesInFrame_RelStructure value) {
        this.groupsOfEntities = value;
    }

    /**
     * Gets the value of the zones property.
     * 
     * @return
     *     possible object is
     *     {@link ZonesInFrame_RelStructure }
     *     
     */
    public ZonesInFrame_RelStructure getZones() {
        return zones;
    }

    /**
     * Sets the value of the zones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZonesInFrame_RelStructure }
     *     
     */
    public void setZones(ZonesInFrame_RelStructure value) {
        this.zones = value;
    }

    /**
     * Gets the value of the blacklists property.
     * 
     * @return
     *     possible object is
     *     {@link BlacklistsInFrame_RelStructure }
     *     
     */
    public BlacklistsInFrame_RelStructure getBlacklists() {
        return blacklists;
    }

    /**
     * Sets the value of the blacklists property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlacklistsInFrame_RelStructure }
     *     
     */
    public void setBlacklists(BlacklistsInFrame_RelStructure value) {
        this.blacklists = value;
    }

    /**
     * Gets the value of the whitelists property.
     * 
     * @return
     *     possible object is
     *     {@link WhitelistsInFrame_RelStructure }
     *     
     */
    public WhitelistsInFrame_RelStructure getWhitelists() {
        return whitelists;
    }

    /**
     * Sets the value of the whitelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhitelistsInFrame_RelStructure }
     *     
     */
    public void setWhitelists(WhitelistsInFrame_RelStructure value) {
        this.whitelists = value;
    }

    public ResourceFrame_VersionFrameStructure withDataSources(DataSourcesInFrame_RelStructure value) {
        setDataSources(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withResponsibilitySets(ResponsibilitySetsInFrame_RelStructure value) {
        setResponsibilitySets(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withTypesOfValue(TypesOfValueInFrame_RelStructure value) {
        setTypesOfValue(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withOrganisations(OrganisationsInFrame_RelStructure value) {
        setOrganisations(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withGroupsOfOperators(GroupsOfOperatorsInFrame_RelStructure value) {
        setGroupsOfOperators(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withOperationalContexts(OperationalContextsInFrame_RelStructure value) {
        setOperationalContexts(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withControlCentres(ControlCentresInFrame_RelStructure value) {
        setControlCentres(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withEquipments(EquipmentsInFrame_RelStructure value) {
        setEquipments(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withVehicleTypes(VehicleTypesInFrame_RelStructure value) {
        setVehicleTypes(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withVehicleModels(VehicleModelsInFrame_RelStructure value) {
        setVehicleModels(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withVehicleEquipmentProfiles(VehicleEquipmenProfilesInFrame_RelStructure value) {
        setVehicleEquipmentProfiles(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withVehicles(VehiclesInFrame_RelStructure value) {
        setVehicles(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withSchematicMaps(SchematicMapsInFrame_RelStructure value) {
        setSchematicMaps(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withGroupsOfEntities(GroupOfEntitiesInFrame_RelStructure value) {
        setGroupsOfEntities(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withZones(ZonesInFrame_RelStructure value) {
        setZones(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withBlacklists(BlacklistsInFrame_RelStructure value) {
        setBlacklists(value);
        return this;
    }

    public ResourceFrame_VersionFrameStructure withWhitelists(WhitelistsInFrame_RelStructure value) {
        setWhitelists(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ResourceFrame_VersionFrameStructure withId(String value) {
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
