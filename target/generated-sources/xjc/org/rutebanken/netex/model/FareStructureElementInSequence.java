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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FareStructureElementInSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FareElementInSequenceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FareStructureElementInSequenceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}FareStructureElementInSequenceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FareStructureElementInSequence
    extends FareStructureElementInSequence_VersionedChildStructure
{


    @Override
    public FareStructureElementInSequence withFareStructureElementRef(FareStructureElementRefStructure value) {
        setFareStructureElementRef(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withValidableElementRef(ValidableElementRefStructure value) {
        setValidableElementRef(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withValidityParameterAssignments(GenericParameterAssignments_RelStructure value) {
        setValidityParameterAssignments(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withGenericParameterAssignment(GenericParameterAssignment value) {
        setGenericParameterAssignment(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withGenericParameterAssignmentInContext(GenericParameterAssignmentInContext value) {
        setGenericParameterAssignmentInContext(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withIsFirstInSequence(Boolean value) {
        setIsFirstInSequence(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withIsLastInSequence(Boolean value) {
        setIsLastInSequence(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withAccessNumberIsLimited(Boolean value) {
        setAccessNumberIsLimited(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withMinimumAccess(BigInteger value) {
        setMinimumAccess(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withMaximumAccess(BigInteger value) {
        setMaximumAccess(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withAccessNumber(BigInteger value) {
        setAccessNumber(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FareStructureElementInSequence withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FareStructureElementInSequence withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FareStructureElementInSequence withId(String value) {
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