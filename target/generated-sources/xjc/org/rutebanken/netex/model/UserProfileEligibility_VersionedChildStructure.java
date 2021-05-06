//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for UserProfileEligibility_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfileEligibility_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerEligibility_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}UserProfileEligibilityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileEligibility_VersionedChildStructure", propOrder = {
    "userProfileRef"
})
@XmlSeeAlso({
    UserProfileEligibility.class
})
public class UserProfileEligibility_VersionedChildStructure
    extends CustomerEligibility_VersionedChildStructure
{

    @XmlElementRef(name = "UserProfileRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends UserProfileRefStructure> userProfileRef;

    /**
     * Gets the value of the userProfileRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends UserProfileRefStructure> getUserProfileRef() {
        return userProfileRef;
    }

    /**
     * Sets the value of the userProfileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     *     
     */
    public void setUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        this.userProfileRef = value;
    }

    public UserProfileEligibility_VersionedChildStructure withUserProfileRef(JAXBElement<? extends UserProfileRefStructure> value) {
        setUserProfileRef(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withCustomerRef(CustomerRefStructure value) {
        setCustomerRef(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public UserProfileEligibility_VersionedChildStructure withId(String value) {
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
