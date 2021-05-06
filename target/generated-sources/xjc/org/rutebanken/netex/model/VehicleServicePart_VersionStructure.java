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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VehicleServicePart_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleServicePart_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleServicePartGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleServicePart_VersionStructure", propOrder = {
    "name",
    "description",
    "vehicleServiceRef",
    "startPointRef",
    "endPointRef"
})
@XmlSeeAlso({
    VehicleServicePart.class
})
public class VehicleServicePart_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "VehicleServiceRef")
    protected VehicleServiceRefStructure vehicleServiceRef;
    @XmlElement(name = "StartPointRef")
    protected GaragePointRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected GaragePointRefStructure endPointRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Gets the value of the vehicleServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleServiceRefStructure }
     *     
     */
    public VehicleServiceRefStructure getVehicleServiceRef() {
        return vehicleServiceRef;
    }

    /**
     * Sets the value of the vehicleServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleServiceRefStructure }
     *     
     */
    public void setVehicleServiceRef(VehicleServiceRefStructure value) {
        this.vehicleServiceRef = value;
    }

    /**
     * Gets the value of the startPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public GaragePointRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Sets the value of the startPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public void setStartPointRef(GaragePointRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public GaragePointRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Sets the value of the endPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GaragePointRefStructure }
     *     
     */
    public void setEndPointRef(GaragePointRefStructure value) {
        this.endPointRef = value;
    }

    public VehicleServicePart_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public VehicleServicePart_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public VehicleServicePart_VersionStructure withVehicleServiceRef(VehicleServiceRefStructure value) {
        setVehicleServiceRef(value);
        return this;
    }

    public VehicleServicePart_VersionStructure withStartPointRef(GaragePointRefStructure value) {
        setStartPointRef(value);
        return this;
    }

    public VehicleServicePart_VersionStructure withEndPointRef(GaragePointRefStructure value) {
        setEndPointRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleServicePart_VersionStructure withId(String value) {
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