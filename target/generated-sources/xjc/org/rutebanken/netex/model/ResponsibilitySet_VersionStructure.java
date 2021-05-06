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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ResponsibilitySet_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsibilitySet_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}DataManagedObjectStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}ResponsibilitySetGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibilitySet_VersionStructure", propOrder = {
    "name",
    "privateCode",
    "roles"
})
@XmlSeeAlso({
    ResponsibilitySet.class
})
public class ResponsibilitySet_VersionStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "PrivateCode")
    protected PrivateCodeStructure privateCode;
    protected ResponsibilityRoleAssignments_RelStructure roles;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
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
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityRoleAssignments_RelStructure }
     *     
     */
    public ResponsibilityRoleAssignments_RelStructure getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityRoleAssignments_RelStructure }
     *     
     */
    public void setRoles(ResponsibilityRoleAssignments_RelStructure value) {
        this.roles = value;
    }

    public ResponsibilitySet_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public ResponsibilitySet_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    public ResponsibilitySet_VersionStructure withRoles(ResponsibilityRoleAssignments_RelStructure value) {
        setRoles(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ResponsibilitySet_VersionStructure withId(String value) {
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
