//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PassengerCarryingRequirement_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehicleRequirementGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PassengerCarryingRequirementGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PassengerCarryingRequirementIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PassengerCarryingRequirementsView
    extends PassengerCarryingRequirement_VersionStructure
{


    @Override
    public PassengerCarryingRequirementsView withPassengerCapacity(PassengerCapacity value) {
        setPassengerCapacity(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withBoardingHeight(BigDecimal value) {
        setBoardingHeight(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withGapToPlatform(BigDecimal value) {
        setGapToPlatform(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PassengerCarryingRequirementsView withId(String value) {
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
