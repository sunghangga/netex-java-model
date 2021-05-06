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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for MeetingRestriction_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingRestriction_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}InfrastructureLinkRestriction_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}MeetingRestrictionGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRestriction_VersionStructure", propOrder = {
    "forVehicleTypeRef",
    "againstVehicleTypeRef"
})
@XmlSeeAlso({
    MeetingRestriction.class
})
public class MeetingRestriction_VersionStructure
    extends InfrastructureLinkRestriction_VersionStructure
{

    @XmlElement(name = "ForVehicleTypeRef")
    protected VehicleTypeRefStructure forVehicleTypeRef;
    @XmlElement(name = "AgainstVehicleTypeRef")
    protected VehicleTypeRefStructure againstVehicleTypeRef;

    /**
     * Gets the value of the forVehicleTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public VehicleTypeRefStructure getForVehicleTypeRef() {
        return forVehicleTypeRef;
    }

    /**
     * Sets the value of the forVehicleTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public void setForVehicleTypeRef(VehicleTypeRefStructure value) {
        this.forVehicleTypeRef = value;
    }

    /**
     * Gets the value of the againstVehicleTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public VehicleTypeRefStructure getAgainstVehicleTypeRef() {
        return againstVehicleTypeRef;
    }

    /**
     * Sets the value of the againstVehicleTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeRefStructure }
     *     
     */
    public void setAgainstVehicleTypeRef(VehicleTypeRefStructure value) {
        this.againstVehicleTypeRef = value;
    }

    public MeetingRestriction_VersionStructure withForVehicleTypeRef(VehicleTypeRefStructure value) {
        setForVehicleTypeRef(value);
        return this;
    }

    public MeetingRestriction_VersionStructure withAgainstVehicleTypeRef(VehicleTypeRefStructure value) {
        setAgainstVehicleTypeRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withFromLinkRef(LinkRefStructure value) {
        setFromLinkRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withToLinkRef(LinkRefStructure value) {
        setToLinkRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withRestricted(boolean value) {
        setRestricted(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public MeetingRestriction_VersionStructure withId(String value) {
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
