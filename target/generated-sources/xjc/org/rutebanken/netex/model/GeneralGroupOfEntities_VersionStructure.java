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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for GeneralGroupOfEntities_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralGroupOfEntities_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeneralGroupOfEntitiesGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nameOfMemberClass" type="{http://www.netex.org.uk/netex}NameOfClass" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralGroupOfEntities_VersionStructure", propOrder = {
    "members"
})
@XmlSeeAlso({
    GeneralGroupOfEntities.class
})
public class GeneralGroupOfEntities_VersionStructure
    extends GroupOfEntities_VersionStructure
{

    protected ObjectRefs_RelStructure members;
    @XmlAttribute(name = "nameOfMemberClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfMemberClass;

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefs_RelStructure }
     *     
     */
    public ObjectRefs_RelStructure getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefs_RelStructure }
     *     
     */
    public void setMembers(ObjectRefs_RelStructure value) {
        this.members = value;
    }

    /**
     * Gets the value of the nameOfMemberClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfMemberClass() {
        return nameOfMemberClass;
    }

    /**
     * Sets the value of the nameOfMemberClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfMemberClass(String value) {
        this.nameOfMemberClass = value;
    }

    public GeneralGroupOfEntities_VersionStructure withMembers(ObjectRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    public GeneralGroupOfEntities_VersionStructure withNameOfMemberClass(String value) {
        setNameOfMemberClass(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withInfoLinks(GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GeneralGroupOfEntities_VersionStructure withId(String value) {
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
