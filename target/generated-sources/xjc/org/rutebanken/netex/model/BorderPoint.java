//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}BorderPoint_ValueStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PointGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TimingPointGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element ref="{http://www.netex.org.uk/netex}GroupOfOperatorsRef"/&gt;
 *             &lt;element ref="{http://www.netex.org.uk/netex}GroupOfOperators"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}BorderPointIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class BorderPoint
    extends BorderPoint_ValueStructure
{


    @Override
    public BorderPoint withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public BorderPoint withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public BorderPoint withGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        setGroupOfOperatorsRef(value);
        return this;
    }

    @Override
    public BorderPoint withGroupOfOperators(GroupOfOperators value) {
        setGroupOfOperators(value);
        return this;
    }

    @Override
    public BorderPoint withTimingPointStatus(TimingPointStatusEnumeration value) {
        setTimingPointStatus(value);
        return this;
    }

    @Override
    public BorderPoint withAllowedForWaitTime(Duration value) {
        setAllowedForWaitTime(value);
        return this;
    }

    @Override
    public BorderPoint withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public BorderPoint withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public BorderPoint withPointNumber(String value) {
        setPointNumber(value);
        return this;
    }

    @Override
    public BorderPoint withTypes(TypeOfPointRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public BorderPoint withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public BorderPoint withGroupMemberships(GroupMembershipRefs_RelStructure value) {
        setGroupMemberships(value);
        return this;
    }

    @Override
    public BorderPoint withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public BorderPoint withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public BorderPoint withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public BorderPoint withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public BorderPoint withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public BorderPoint withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public BorderPoint withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public BorderPoint withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public BorderPoint withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public BorderPoint withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public BorderPoint withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public BorderPoint withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public BorderPoint withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public BorderPoint withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public BorderPoint withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public BorderPoint withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public BorderPoint withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public BorderPoint withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public BorderPoint withId(String value) {
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
