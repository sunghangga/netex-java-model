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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CrewBase_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrewBase_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}CrewBaseGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrewBase_VersionStructure", propOrder = {
    "reliefPointRef",
    "garages"
})
@XmlSeeAlso({
    CrewBase.class
})
public class CrewBase_VersionStructure
    extends GroupOfEntities_VersionStructure
{

    @XmlElementRef(name = "ReliefPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected JAXBElement<? extends ReliefPointRefStructure> reliefPointRef;
    protected GarageRefs_RelStructure garages;

    /**
     * Gets the value of the reliefPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ReliefPointRefStructure> getReliefPointRef() {
        return reliefPointRef;
    }

    /**
     * Sets the value of the reliefPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ReliefPointRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link GaragePointRefStructure }{@code >}
     *     
     */
    public void setReliefPointRef(JAXBElement<? extends ReliefPointRefStructure> value) {
        this.reliefPointRef = value;
    }

    /**
     * Gets the value of the garages property.
     * 
     * @return
     *     possible object is
     *     {@link GarageRefs_RelStructure }
     *     
     */
    public GarageRefs_RelStructure getGarages() {
        return garages;
    }

    /**
     * Sets the value of the garages property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarageRefs_RelStructure }
     *     
     */
    public void setGarages(GarageRefs_RelStructure value) {
        this.garages = value;
    }

    public CrewBase_VersionStructure withReliefPointRef(JAXBElement<? extends ReliefPointRefStructure> value) {
        setReliefPointRef(value);
        return this;
    }

    public CrewBase_VersionStructure withGarages(GarageRefs_RelStructure value) {
        setGarages(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withInfoLinks(GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CrewBase_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CrewBase_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CrewBase_VersionStructure withId(String value) {
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
