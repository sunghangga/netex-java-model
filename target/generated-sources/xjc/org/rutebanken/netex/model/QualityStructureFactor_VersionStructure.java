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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for QualityStructureFactor_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityStructureFactor_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareStructureFactor_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}QualityStructureFactorGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityStructureFactor_VersionStructure", propOrder = {
    "value",
    "prices"
})
@XmlSeeAlso({
    QualityStructureFactor.class,
    FareDemandFactor_VersionStructure.class,
    FareQuotaFactor_VersionStructure.class
})
public class QualityStructureFactor_VersionStructure
    extends FareStructureFactor_VersionStructure
{

    @XmlElement(name = "Value")
    protected Object value;
    protected QualityStructureFactorPrices_RelStructure prices;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link QualityStructureFactorPrices_RelStructure }
     *     
     */
    public QualityStructureFactorPrices_RelStructure getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStructureFactorPrices_RelStructure }
     *     
     */
    public void setPrices(QualityStructureFactorPrices_RelStructure value) {
        this.prices = value;
    }

    public QualityStructureFactor_VersionStructure withValue(Object value) {
        setValue(value);
        return this;
    }

    public QualityStructureFactor_VersionStructure withPrices(QualityStructureFactorPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withTypeOfFareStructureFactorRef(TypeOfFareStructureFactorRefStructure value) {
        setTypeOfFareStructureFactorRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withFactor(Object value) {
        setFactor(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public QualityStructureFactor_VersionStructure withId(String value) {
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