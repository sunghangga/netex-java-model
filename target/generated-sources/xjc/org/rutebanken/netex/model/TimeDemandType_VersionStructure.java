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
 * <p>Java class for TimeDemandType_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDemandType_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeDemandTypeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDemandType_VersionStructure", propOrder = {
    "name",
    "description",
    "privateCode",
    "typeOfTimeDemandTypeRef",
    "presentation",
    "runTimes",
    "waitTimes",
    "layovers",
    "headways",
    "vehiclePreferences"
})
@XmlSeeAlso({
    TimeDemandType.class
})
public class TimeDemandType_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfTimeDemandTypeRef")
    protected TypeOfTimeDemandTypeRefStructure typeOfTimeDemandTypeRef;
    @XmlElement(name = "Presentation")
    protected PresentationStructure presentation;
    protected JourneyRunTimes_RelStructure runTimes;
    protected JourneyWaitTimes_RelStructure waitTimes;
    protected JourneyLayovers_RelStructure layovers;
    protected JourneyHeadways_RelStructure headways;
    protected VehicleTypePreferences_RelStructure vehiclePreferences;

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
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the typeOfTimeDemandTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTimeDemandTypeRefStructure }
     *     
     */
    public TypeOfTimeDemandTypeRefStructure getTypeOfTimeDemandTypeRef() {
        return typeOfTimeDemandTypeRef;
    }

    /**
     * Sets the value of the typeOfTimeDemandTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTimeDemandTypeRefStructure }
     *     
     */
    public void setTypeOfTimeDemandTypeRef(TypeOfTimeDemandTypeRefStructure value) {
        this.typeOfTimeDemandTypeRef = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationStructure }
     *     
     */
    public PresentationStructure getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationStructure }
     *     
     */
    public void setPresentation(PresentationStructure value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the runTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRunTimes_RelStructure }
     *     
     */
    public JourneyRunTimes_RelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Sets the value of the runTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRunTimes_RelStructure }
     *     
     */
    public void setRunTimes(JourneyRunTimes_RelStructure value) {
        this.runTimes = value;
    }

    /**
     * Gets the value of the waitTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyWaitTimes_RelStructure }
     *     
     */
    public JourneyWaitTimes_RelStructure getWaitTimes() {
        return waitTimes;
    }

    /**
     * Sets the value of the waitTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyWaitTimes_RelStructure }
     *     
     */
    public void setWaitTimes(JourneyWaitTimes_RelStructure value) {
        this.waitTimes = value;
    }

    /**
     * Gets the value of the layovers property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyLayovers_RelStructure }
     *     
     */
    public JourneyLayovers_RelStructure getLayovers() {
        return layovers;
    }

    /**
     * Sets the value of the layovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyLayovers_RelStructure }
     *     
     */
    public void setLayovers(JourneyLayovers_RelStructure value) {
        this.layovers = value;
    }

    /**
     * Gets the value of the headways property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyHeadways_RelStructure }
     *     
     */
    public JourneyHeadways_RelStructure getHeadways() {
        return headways;
    }

    /**
     * Sets the value of the headways property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyHeadways_RelStructure }
     *     
     */
    public void setHeadways(JourneyHeadways_RelStructure value) {
        this.headways = value;
    }

    /**
     * Gets the value of the vehiclePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypePreferences_RelStructure }
     *     
     */
    public VehicleTypePreferences_RelStructure getVehiclePreferences() {
        return vehiclePreferences;
    }

    /**
     * Sets the value of the vehiclePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypePreferences_RelStructure }
     *     
     */
    public void setVehiclePreferences(VehicleTypePreferences_RelStructure value) {
        this.vehiclePreferences = value;
    }

    public TimeDemandType_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public TimeDemandType_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public TimeDemandType_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public TimeDemandType_VersionStructure withTypeOfTimeDemandTypeRef(TypeOfTimeDemandTypeRefStructure value) {
        setTypeOfTimeDemandTypeRef(value);
        return this;
    }

    public TimeDemandType_VersionStructure withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    public TimeDemandType_VersionStructure withRunTimes(JourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    public TimeDemandType_VersionStructure withWaitTimes(JourneyWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    public TimeDemandType_VersionStructure withLayovers(JourneyLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    public TimeDemandType_VersionStructure withHeadways(JourneyHeadways_RelStructure value) {
        setHeadways(value);
        return this;
    }

    public TimeDemandType_VersionStructure withVehiclePreferences(VehicleTypePreferences_RelStructure value) {
        setVehiclePreferences(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TimeDemandType_VersionStructure withId(String value) {
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
