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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ActivationPoint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationPoint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Point_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ActivationPointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationPoint_VersionStructure", propOrder = {
    "activationPointNumber",
    "shortName",
    "privateCode",
    "typeOfActivationRef"
})
@XmlSeeAlso({
    ActivationPoint.class,
    BeaconPoint_VersionStructure.class
})
public class ActivationPoint_VersionStructure
    extends Point_VersionStructure
{

    @XmlElement(name = "ActivationPointNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String activationPointNumber;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    @XmlElement(name = "TypeOfActivationRef")
    protected TypeOfActivationRefStructure typeOfActivationRef;

    /**
     * Gets the value of the activationPointNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationPointNumber() {
        return activationPointNumber;
    }

    /**
     * Sets the value of the activationPointNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationPointNumber(String value) {
        this.activationPointNumber = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public PrivateCodeStructure getPrivateCode() {
        return privateCode;
    }

    /**
     * Sets the value of the privateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateCodeStructure }
     *     
     */
    public void setPrivateCode(PrivateCodeStructure value) {
        this.privateCode = value;
    }

    /**
     * Gets the value of the typeOfActivationRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public TypeOfActivationRefStructure getTypeOfActivationRef() {
        return typeOfActivationRef;
    }

    /**
     * Sets the value of the typeOfActivationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfActivationRefStructure }
     *     
     */
    public void setTypeOfActivationRef(TypeOfActivationRefStructure value) {
        this.typeOfActivationRef = value;
    }

    public ActivationPoint_VersionStructure withActivationPointNumber(String value) {
        setActivationPointNumber(value);
        return this;
    }

    public ActivationPoint_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public ActivationPoint_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public ActivationPoint_VersionStructure withTypeOfActivationRef(TypeOfActivationRefStructure value) {
        setTypeOfActivationRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withPointNumber(String value) {
        setPointNumber(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withTypes(TypeOfPointRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withGroupMemberships(GroupMembershipRefs_RelStructure value) {
        setGroupMemberships(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ActivationPoint_VersionStructure withId(String value) {
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
