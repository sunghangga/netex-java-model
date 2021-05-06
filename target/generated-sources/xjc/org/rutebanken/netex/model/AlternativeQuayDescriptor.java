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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}AlternativeQuayDescriptor_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="NamedObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/&gt;
 *           &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}language" minOccurs="0"/&gt;
 *           &lt;element name="TypeOfName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/&gt;
 *           &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString"/&gt;
 *           &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="Abbreviation" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}RelativeLocationGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AlternativeQuayDescriptor")
public class AlternativeQuayDescriptor
    extends AlternativeQuayDescriptor_VersionedChildStructure
{


    @Override
    public AlternativeQuayDescriptor withCrossRoad(MultilingualString value) {
        setCrossRoad(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withLandmark(MultilingualString value) {
        setLandmark(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withNamedObjectRef(VersionOfObjectRefStructure value) {
        setNamedObjectRef(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withLang(String value) {
        setLang(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withNameType(NameTypeEnumeration value) {
        setNameType(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withTypeOfName(String value) {
        setTypeOfName(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withAbbreviation(MultilingualString value) {
        setAbbreviation(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withQualifierName(MultilingualString value) {
        setQualifierName(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public AlternativeQuayDescriptor withId(String value) {
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
