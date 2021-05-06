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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CompoundBlockStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompoundBlockStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CompoundBlockGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundBlockStructure", propOrder = {
    "name",
    "description",
    "vehicleTypeRef",
    "startPointRef",
    "endPointRef",
    "parts"
})
@XmlSeeAlso({
    CompoundBlock.class
})
public class CompoundBlockStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElement(name = "StartPointRef")
    protected TimingPointInJourneyPatternRefStructure startPointRef;
    @XmlElement(name = "EndPointRef")
    protected TimingPointInJourneyPatternRefStructure endPointRef;
    protected BlockParts_RelStructure parts;

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
     * Gets the value of the vehicleTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Sets the value of the vehicleTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Gets the value of the startPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointInJourneyPatternRefStructure }
     *     
     */
    public TimingPointInJourneyPatternRefStructure getStartPointRef() {
        return startPointRef;
    }

    /**
     * Sets the value of the startPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointInJourneyPatternRefStructure }
     *     
     */
    public void setStartPointRef(TimingPointInJourneyPatternRefStructure value) {
        this.startPointRef = value;
    }

    /**
     * Gets the value of the endPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingPointInJourneyPatternRefStructure }
     *     
     */
    public TimingPointInJourneyPatternRefStructure getEndPointRef() {
        return endPointRef;
    }

    /**
     * Sets the value of the endPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingPointInJourneyPatternRefStructure }
     *     
     */
    public void setEndPointRef(TimingPointInJourneyPatternRefStructure value) {
        this.endPointRef = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link BlockParts_RelStructure }
     *     
     */
    public BlockParts_RelStructure getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockParts_RelStructure }
     *     
     */
    public void setParts(BlockParts_RelStructure value) {
        this.parts = value;
    }

    public CompoundBlockStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public CompoundBlockStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public CompoundBlockStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    public CompoundBlockStructure withStartPointRef(TimingPointInJourneyPatternRefStructure value) {
        setStartPointRef(value);
        return this;
    }

    public CompoundBlockStructure withEndPointRef(TimingPointInJourneyPatternRefStructure value) {
        setEndPointRef(value);
        return this;
    }

    public CompoundBlockStructure withParts(BlockParts_RelStructure value) {
        setParts(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CompoundBlockStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CompoundBlockStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CompoundBlockStructure withId(String value) {
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
