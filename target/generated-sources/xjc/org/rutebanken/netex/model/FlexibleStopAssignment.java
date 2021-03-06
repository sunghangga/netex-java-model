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
import javax.xml.bind.JAXBElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FlexibleStopAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}AssignmentGroup"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}StopAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FlexibleStopAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}FlexibleStopAssignmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FlexibleStopAssignment
    extends FlexibleStopAssignment_VersionStructure
{


    @Override
    public FlexibleStopAssignment withFlexibleStopPlaceRef(FlexibleStopPlaceRefStructure value) {
        setFlexibleStopPlaceRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withFlexibleQuayRef(JAXBElement<? extends FlexibleQuayRefStructure> value) {
        setFlexibleQuayRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withScheduledStopPoint(ScheduledStopPoint value) {
        setScheduledStopPoint(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleStopAssignment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleStopAssignment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FlexibleStopAssignment withId(String value) {
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
