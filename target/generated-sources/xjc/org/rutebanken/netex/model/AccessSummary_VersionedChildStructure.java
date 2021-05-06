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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for AccessSummary_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessSummary_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccessSummaryGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSummary_VersionedChildStructure", propOrder = {
    "accessFeatureType",
    "count",
    "transition"
})
@XmlSeeAlso({
    AccessSummary.class
})
public class AccessSummary_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "AccessFeatureType", required = true)
    @XmlSchemaType(name = "string")
    protected AccessFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Count", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "NMTOKEN")
    protected TransitionEnumeration transition;

    /**
     * Gets the value of the accessFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public AccessFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Sets the value of the accessFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    public AccessSummary_VersionedChildStructure withAccessFeatureType(AccessFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public AccessSummary_VersionedChildStructure withCount(BigInteger value) {
        setCount(value);
        return this;
    }

    public AccessSummary_VersionedChildStructure withTransition(TransitionEnumeration value) {
        setTransition(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public AccessSummary_VersionedChildStructure withId(String value) {
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