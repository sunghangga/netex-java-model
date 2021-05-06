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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for GroupMember_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupMember_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}AbstractGroupMember_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="MemberObjectRef" type="{http://www.netex.org.uk/netex}VersionOfObjectRefStructure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupMember_VersionedChildStructure", propOrder = {
    "groupRef",
    "memberObjectRef"
})
@XmlSeeAlso({
    TimeDemandProfileMember_VersionStructure.class
})
public class GroupMember_VersionedChildStructure
    extends AbstractGroupMember_VersionedChildStructure
{

    @XmlElement(name = "GroupRef")
    protected VersionOfObjectRefStructure groupRef;
    @XmlElement(name = "MemberObjectRef", required = true)
    protected VersionOfObjectRefStructure memberObjectRef;

    /**
     * Gets the value of the groupRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getGroupRef() {
        return groupRef;
    }

    /**
     * Sets the value of the groupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setGroupRef(VersionOfObjectRefStructure value) {
        this.groupRef = value;
    }

    /**
     * Gets the value of the memberObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getMemberObjectRef() {
        return memberObjectRef;
    }

    /**
     * Sets the value of the memberObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setMemberObjectRef(VersionOfObjectRefStructure value) {
        this.memberObjectRef = value;
    }

    public GroupMember_VersionedChildStructure withGroupRef(VersionOfObjectRefStructure value) {
        setGroupRef(value);
        return this;
    }

    public GroupMember_VersionedChildStructure withMemberObjectRef(VersionOfObjectRefStructure value) {
        setMemberObjectRef(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GroupMember_VersionedChildStructure withId(String value) {
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
