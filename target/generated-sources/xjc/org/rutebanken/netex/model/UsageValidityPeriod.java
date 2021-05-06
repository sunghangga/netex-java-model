//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}UsageValidityPeriod_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PriceableObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}UsageParameterGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}UsageValidityPeriodGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}UsageValidityPeriodIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class UsageValidityPeriod
    extends UsageValidityPeriod_VersionStructure
{


    @Override
    public UsageValidityPeriod withValidityPeriodType(UsageValidityTypeEnumeration value) {
        setValidityPeriodType(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withUsageTrigger(UsageTriggerEnumeration value) {
        setUsageTrigger(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withUsageEnd(UsageEndEnumeration value) {
        setUsageEnd(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withStandardDuration(Duration value) {
        setStandardDuration(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withActivationMeans(ActivationMeansEnumeration value) {
        setActivationMeans(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withUsageStartConstraintType(UsageStartConstraintTypeEnumeration value) {
        setUsageStartConstraintType(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withStartOnlyOn(UsageValidityPeriod_VersionStructure.StartOnlyOn value) {
        setStartOnlyOn(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withFixedStartWindow(FixedStartWindowStructure value) {
        setFixedStartWindow(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withBlackoutUse(BlackoutStartEnumeration value) {
        setBlackoutUse(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public UsageValidityPeriod withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public UsageValidityPeriod withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public UsageValidityPeriod withId(String value) {
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
