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
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}AccessibilityLimitation_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}MobilityLimitationGroup"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SensoryLimitationGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}LimitationIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AccessibilityLimitation")
public class AccessibilityLimitation
    extends AccessibilityLimitation_VersionedChildStructure
{


    @Override
    public AccessibilityLimitation withWheelchairAccess(LimitationStatusEnumeration value) {
        setWheelchairAccess(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withStepFreeAccess(LimitationStatusEnumeration value) {
        setStepFreeAccess(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withEscalatorFreeAccess(LimitationStatusEnumeration value) {
        setEscalatorFreeAccess(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withLiftFreeAccess(LimitationStatusEnumeration value) {
        setLiftFreeAccess(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withAudibleSignalsAvailable(LimitationStatusEnumeration value) {
        setAudibleSignalsAvailable(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withVisualSignsAvailable(LimitationStatusEnumeration value) {
        setVisualSignsAvailable(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public AccessibilityLimitation withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public AccessibilityLimitation withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public AccessibilityLimitation withId(String value) {
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