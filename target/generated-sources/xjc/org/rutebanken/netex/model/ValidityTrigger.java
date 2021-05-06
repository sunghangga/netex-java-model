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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ValidityTrigger_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="ConditionedObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/&gt;
 *           &lt;element name="WithConditionRef" type="{http://www.netex.org.uk/netex}ValidityConditionRefStructure" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ValidityTriggerGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ValidityTriggerIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ValidityTrigger
    extends ValidityTrigger_VersionStructure
{


    @Override
    public ValidityTrigger withTriggerObjectRef(VersionOfObjectRefStructure value) {
        setTriggerObjectRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ValidityTrigger withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ValidityTrigger withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ValidityTrigger withConditionedObjectRef(VersionOfObjectRefStructure value) {
        setConditionedObjectRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withWithConditionRef(ValidityConditionRefStructure value) {
        setWithConditionRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ValidityTrigger withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ValidityTrigger withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ValidityTrigger withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ValidityTrigger withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ValidityTrigger withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ValidityTrigger withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ValidityTrigger withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ValidityTrigger withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ValidityTrigger withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ValidityTrigger withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidityTrigger withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidityTrigger withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ValidityTrigger withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ValidityTrigger withId(String value) {
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
