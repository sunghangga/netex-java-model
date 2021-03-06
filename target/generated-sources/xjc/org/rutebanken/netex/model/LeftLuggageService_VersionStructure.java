//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 * <p>Java class for LeftLuggageService_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeftLuggageService_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}CustomerService_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}LeftLuggageServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeftLuggageService_VersionStructure", propOrder = {
    "counterService",
    "selfServiceLockers",
    "feePerBag",
    "lockerFee",
    "maximumBagWidth",
    "maximumBagHeight",
    "maximumBagDepth",
    "maximumBagWeight",
    "maximumDuration"
})
@XmlSeeAlso({
    LeftLuggageService.class
})
public class LeftLuggageService_VersionStructure
    extends CustomerService_VersionStructure
{

    @XmlElement(name = "CounterService")
    protected Boolean counterService;
    @XmlElement(name = "SelfServiceLockers")
    protected Boolean selfServiceLockers;
    @XmlElement(name = "FeePerBag")
    protected Boolean feePerBag;
    @XmlElement(name = "LockerFee")
    protected Boolean lockerFee;
    @XmlElement(name = "MaximumBagWidth")
    protected BigDecimal maximumBagWidth;
    @XmlElement(name = "MaximumBagHeight")
    protected BigDecimal maximumBagHeight;
    @XmlElement(name = "MaximumBagDepth")
    protected BigDecimal maximumBagDepth;
    @XmlElement(name = "MaximumBagWeight")
    protected BigDecimal maximumBagWeight;
    @XmlElement(name = "MaximumDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumDuration;

    /**
     * Gets the value of the counterService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCounterService() {
        return counterService;
    }

    /**
     * Sets the value of the counterService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCounterService(Boolean value) {
        this.counterService = value;
    }

    /**
     * Gets the value of the selfServiceLockers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfServiceLockers() {
        return selfServiceLockers;
    }

    /**
     * Sets the value of the selfServiceLockers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfServiceLockers(Boolean value) {
        this.selfServiceLockers = value;
    }

    /**
     * Gets the value of the feePerBag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeePerBag() {
        return feePerBag;
    }

    /**
     * Sets the value of the feePerBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeePerBag(Boolean value) {
        this.feePerBag = value;
    }

    /**
     * Gets the value of the lockerFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockerFee() {
        return lockerFee;
    }

    /**
     * Sets the value of the lockerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockerFee(Boolean value) {
        this.lockerFee = value;
    }

    /**
     * Gets the value of the maximumBagWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWidth() {
        return maximumBagWidth;
    }

    /**
     * Sets the value of the maximumBagWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWidth(BigDecimal value) {
        this.maximumBagWidth = value;
    }

    /**
     * Gets the value of the maximumBagHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagHeight() {
        return maximumBagHeight;
    }

    /**
     * Sets the value of the maximumBagHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagHeight(BigDecimal value) {
        this.maximumBagHeight = value;
    }

    /**
     * Gets the value of the maximumBagDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagDepth() {
        return maximumBagDepth;
    }

    /**
     * Sets the value of the maximumBagDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagDepth(BigDecimal value) {
        this.maximumBagDepth = value;
    }

    /**
     * Gets the value of the maximumBagWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBagWeight() {
        return maximumBagWeight;
    }

    /**
     * Sets the value of the maximumBagWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBagWeight(BigDecimal value) {
        this.maximumBagWeight = value;
    }

    /**
     * Gets the value of the maximumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumDuration() {
        return maximumDuration;
    }

    /**
     * Sets the value of the maximumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumDuration(Duration value) {
        this.maximumDuration = value;
    }

    public LeftLuggageService_VersionStructure withCounterService(Boolean value) {
        setCounterService(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withSelfServiceLockers(Boolean value) {
        setSelfServiceLockers(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withFeePerBag(Boolean value) {
        setFeePerBag(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withLockerFee(Boolean value) {
        setLockerFee(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withMaximumBagWidth(BigDecimal value) {
        setMaximumBagWidth(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withMaximumBagHeight(BigDecimal value) {
        setMaximumBagHeight(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withMaximumBagDepth(BigDecimal value) {
        setMaximumBagDepth(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withMaximumBagWeight(BigDecimal value) {
        setMaximumBagWeight(value);
        return this;
    }

    public LeftLuggageService_VersionStructure withMaximumDuration(Duration value) {
        setMaximumDuration(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        setTypesOfServiceFeature(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LeftLuggageService_VersionStructure withId(String value) {
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
