//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TimeIntervalPrice_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FarePriceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TimeIntervalPriceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TimeIntervalPriceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TimeIntervalPrice
    extends TimeIntervalPrice_VersionedChildStructure
{


    @Override
    public TimeIntervalPrice withTimeIntervalRef(TimeIntervalRefStructure value) {
        setTimeIntervalRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        setPricingRule_(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withRanking(BigInteger value) {
        setRanking(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeIntervalPrice withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TimeIntervalPrice withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TimeIntervalPrice withId(String value) {
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