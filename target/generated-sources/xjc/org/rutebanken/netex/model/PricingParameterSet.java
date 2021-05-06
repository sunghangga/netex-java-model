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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PricingParameterSet_VersionedStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PricingParameterSetGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PricingParameterSetIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PricingParameterSet
    extends PricingParameterSet_VersionedStructure
{


    @Override
    public PricingParameterSet withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PricingParameterSet withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withPriceUnits(PriceUnits_RelStructure value) {
        setPriceUnits(value);
        return this;
    }

    @Override
    public PricingParameterSet withPricingRules(PricingRules_RelStructure value) {
        setPricingRules(value);
        return this;
    }

    @Override
    public PricingParameterSet withAllowCumulativeDiscounts(Boolean value) {
        setAllowCumulativeDiscounts(value);
        return this;
    }

    @Override
    public PricingParameterSet withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withRoundings(Roundings_RelStructure value) {
        setRoundings(value);
        return this;
    }

    @Override
    public PricingParameterSet withDayTypeRef(JAXBElement<? extends DayTypeRefStructure> value) {
        setDayTypeRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withMonthValidityOffsets(MonthValidityOffsets_RelStructure value) {
        setMonthValidityOffsets(value);
        return this;
    }

    @Override
    public PricingParameterSet withPricingServices(PricingServices_RelStructure value) {
        setPricingServices(value);
        return this;
    }

    @Override
    public PricingParameterSet withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PricingParameterSet withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PricingParameterSet withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PricingParameterSet withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PricingParameterSet withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PricingParameterSet withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PricingParameterSet withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PricingParameterSet withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PricingParameterSet withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PricingParameterSet withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PricingParameterSet withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PricingParameterSet withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PricingParameterSet withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PricingParameterSet withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PricingParameterSet withId(String value) {
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