//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for CheckConstraintDelay_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckConstraintDelay_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Assignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CheckConstraintDelayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckConstraintDelay_VersionStructure", propOrder = {
    "checkConstraintRef",
    "classOfUseRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
@XmlSeeAlso({
    CheckConstraintDelay.class
})
public class CheckConstraintDelay_VersionStructure
    extends Assignment_VersionStructure
{

    @XmlElement(name = "CheckConstraintRef")
    protected CheckConstraintRefStructure checkConstraintRef;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElement(name = "MinimumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumLikelyDelay;

    /**
     * Gets the value of the checkConstraintRef property.
     * 
     * @return
     *     possible object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public CheckConstraintRefStructure getCheckConstraintRef() {
        return checkConstraintRef;
    }

    /**
     * Sets the value of the checkConstraintRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckConstraintRefStructure }
     *     
     */
    public void setCheckConstraintRef(CheckConstraintRefStructure value) {
        this.checkConstraintRef = value;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Gets the value of the minimumLikelyDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Sets the value of the minimumLikelyDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    /**
     * Gets the value of the averageDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Sets the value of the averageDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    /**
     * Gets the value of the maximumLikelyDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Sets the value of the maximumLikelyDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

    public CheckConstraintDelay_VersionStructure withCheckConstraintRef(CheckConstraintRefStructure value) {
        setCheckConstraintRef(value);
        return this;
    }

    public CheckConstraintDelay_VersionStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public CheckConstraintDelay_VersionStructure withMinimumLikelyDelay(Duration value) {
        setMinimumLikelyDelay(value);
        return this;
    }

    public CheckConstraintDelay_VersionStructure withAverageDelay(Duration value) {
        setAverageDelay(value);
        return this;
    }

    public CheckConstraintDelay_VersionStructure withMaximumLikelyDelay(Duration value) {
        setMaximumLikelyDelay(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CheckConstraintDelay_VersionStructure withId(String value) {
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