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
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FareZone_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareZone_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}TariffZone_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}FareZoneGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareZone_VersionStructure", propOrder = {
    "parentFareZoneRef",
    "zoneTopology",
    "scopingMethod",
    "transportOrganisationRef",
    "groupOfOperatorsRef",
    "fareSections",
    "contains",
    "neighbours"
})
@XmlSeeAlso({
    FareZone.class
})
public class FareZone_VersionStructure
    extends TariffZone_VersionStructure
{

    @XmlElement(name = "ParentFareZoneRef")
    protected FareZoneRefStructure parentFareZoneRef;
    @XmlElement(name = "ZoneTopology")
    @XmlSchemaType(name = "normalizedString")
    protected ZoneTopologyEnumeration zoneTopology;
    @XmlElement(name = "ScopingMethod", defaultValue = "explicitStops")
    @XmlSchemaType(name = "normalizedString")
    protected ScopingMethodEnumeration scopingMethod;
    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> transportOrganisationRef;
    @XmlElement(name = "GroupOfOperatorsRef")
    protected GroupOfOperatorsRefStructure groupOfOperatorsRef;
    protected FareSections_RelStructure fareSections;
    protected TariffZoneRefs_RelStructure contains;
    protected FareZoneRefs_RelStructure neighbours;

    /**
     * Gets the value of the parentFareZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneRefStructure }
     *     
     */
    public FareZoneRefStructure getParentFareZoneRef() {
        return parentFareZoneRef;
    }

    /**
     * Sets the value of the parentFareZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneRefStructure }
     *     
     */
    public void setParentFareZoneRef(FareZoneRefStructure value) {
        this.parentFareZoneRef = value;
    }

    /**
     * Gets the value of the zoneTopology property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneTopologyEnumeration }
     *     
     */
    public ZoneTopologyEnumeration getZoneTopology() {
        return zoneTopology;
    }

    /**
     * Sets the value of the zoneTopology property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneTopologyEnumeration }
     *     
     */
    public void setZoneTopology(ZoneTopologyEnumeration value) {
        this.zoneTopology = value;
    }

    /**
     * Gets the value of the scopingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ScopingMethodEnumeration }
     *     
     */
    public ScopingMethodEnumeration getScopingMethod() {
        return scopingMethod;
    }

    /**
     * Sets the value of the scopingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopingMethodEnumeration }
     *     
     */
    public void setScopingMethod(ScopingMethodEnumeration value) {
        this.scopingMethod = value;
    }

    /**
     * Gets the value of the transportOrganisationRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Sets the value of the transportOrganisationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Gets the value of the groupOfOperatorsRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public GroupOfOperatorsRefStructure getGroupOfOperatorsRef() {
        return groupOfOperatorsRef;
    }

    /**
     * Sets the value of the groupOfOperatorsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfOperatorsRefStructure }
     *     
     */
    public void setGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        this.groupOfOperatorsRef = value;
    }

    /**
     * Gets the value of the fareSections property.
     * 
     * @return
     *     possible object is
     *     {@link FareSections_RelStructure }
     *     
     */
    public FareSections_RelStructure getFareSections() {
        return fareSections;
    }

    /**
     * Sets the value of the fareSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSections_RelStructure }
     *     
     */
    public void setFareSections(FareSections_RelStructure value) {
        this.fareSections = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public TariffZoneRefs_RelStructure getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public void setContains(TariffZoneRefs_RelStructure value) {
        this.contains = value;
    }

    /**
     * Gets the value of the neighbours property.
     * 
     * @return
     *     possible object is
     *     {@link FareZoneRefs_RelStructure }
     *     
     */
    public FareZoneRefs_RelStructure getNeighbours() {
        return neighbours;
    }

    /**
     * Sets the value of the neighbours property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareZoneRefs_RelStructure }
     *     
     */
    public void setNeighbours(FareZoneRefs_RelStructure value) {
        this.neighbours = value;
    }

    public FareZone_VersionStructure withParentFareZoneRef(FareZoneRefStructure value) {
        setParentFareZoneRef(value);
        return this;
    }

    public FareZone_VersionStructure withZoneTopology(ZoneTopologyEnumeration value) {
        setZoneTopology(value);
        return this;
    }

    public FareZone_VersionStructure withScopingMethod(ScopingMethodEnumeration value) {
        setScopingMethod(value);
        return this;
    }

    public FareZone_VersionStructure withTransportOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setTransportOrganisationRef(value);
        return this;
    }

    public FareZone_VersionStructure withGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        setGroupOfOperatorsRef(value);
        return this;
    }

    public FareZone_VersionStructure withFareSections(FareSections_RelStructure value) {
        setFareSections(value);
        return this;
    }

    public FareZone_VersionStructure withContains(TariffZoneRefs_RelStructure value) {
        setContains(value);
        return this;
    }

    public FareZone_VersionStructure withNeighbours(FareZoneRefs_RelStructure value) {
        setNeighbours(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withPrintedPresentation(PrintPresentationStructure value) {
        setPrintedPresentation(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FareZone_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FareZone_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FareZone_VersionStructure withId(String value) {
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
