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
 * <p>Java class for CommercialProfileEligibility_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialProfileEligibility_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerEligibility_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CommercialProfileEligibilityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialProfileEligibility_VersionedChildStructure", propOrder = {
    "commercialProfileRef"
})
@XmlSeeAlso({
    CommercialProfileEligibility.class
})
public class CommercialProfileEligibility_VersionedChildStructure
    extends CustomerEligibility_VersionedChildStructure
{

    @XmlElement(name = "CommercialProfileRef")
    protected CommercialProfileRefStructure commercialProfileRef;

    /**
     * Gets the value of the commercialProfileRef property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialProfileRefStructure }
     *     
     */
    public CommercialProfileRefStructure getCommercialProfileRef() {
        return commercialProfileRef;
    }

    /**
     * Sets the value of the commercialProfileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialProfileRefStructure }
     *     
     */
    public void setCommercialProfileRef(CommercialProfileRefStructure value) {
        this.commercialProfileRef = value;
    }

    public CommercialProfileEligibility_VersionedChildStructure withCommercialProfileRef(CommercialProfileRefStructure value) {
        setCommercialProfileRef(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withCustomerRef(CustomerRefStructure value) {
        setCustomerRef(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CommercialProfileEligibility_VersionedChildStructure withId(String value) {
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
