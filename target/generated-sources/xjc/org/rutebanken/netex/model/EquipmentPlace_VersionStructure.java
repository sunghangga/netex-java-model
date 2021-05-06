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
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for EquipmentPlace_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentPlace_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Place_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}EquipmentPlaceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentPlace_VersionStructure", propOrder = {
    "equipmentPositions",
    "placeEquipments"
})
@XmlSeeAlso({
    EquipmentPlace.class
})
public class EquipmentPlace_VersionStructure
    extends Place_VersionStructure
{

    protected EquipmentPositions_RelStructure equipmentPositions;
    protected Equipments_RelStructure placeEquipments;

    /**
     * Gets the value of the equipmentPositions property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentPositions_RelStructure }
     *     
     */
    public EquipmentPositions_RelStructure getEquipmentPositions() {
        return equipmentPositions;
    }

    /**
     * Sets the value of the equipmentPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentPositions_RelStructure }
     *     
     */
    public void setEquipmentPositions(EquipmentPositions_RelStructure value) {
        this.equipmentPositions = value;
    }

    /**
     * Gets the value of the placeEquipments property.
     * 
     * @return
     *     possible object is
     *     {@link Equipments_RelStructure }
     *     
     */
    public Equipments_RelStructure getPlaceEquipments() {
        return placeEquipments;
    }

    /**
     * Sets the value of the placeEquipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipments_RelStructure }
     *     
     */
    public void setPlaceEquipments(Equipments_RelStructure value) {
        this.placeEquipments = value;
    }

    public EquipmentPlace_VersionStructure withEquipmentPositions(EquipmentPositions_RelStructure value) {
        setEquipmentPositions(value);
        return this;
    }

    public EquipmentPlace_VersionStructure withPlaceEquipments(Equipments_RelStructure value) {
        setPlaceEquipments(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
        setPlaceTypes(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public EquipmentPlace_VersionStructure withId(String value) {
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
