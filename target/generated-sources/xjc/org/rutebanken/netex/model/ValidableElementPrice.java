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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ValidableElementPrice_VersionedChildStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}ValidableElementPriceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ValidableElementPriceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ValidableElementPrice
    extends ValidableElementPrice_VersionedChildStructure
{


    @Override
    public ValidableElementPrice withValidableElementRef(ValidableElementRefStructure value) {
        setValidableElementRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ValidableElementPrice withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ValidableElementPrice withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ValidableElementPrice withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public ValidableElementPrice withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public ValidableElementPrice withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public ValidableElementPrice withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public ValidableElementPrice withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    @Override
    public ValidableElementPrice withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    @Override
    public ValidableElementPrice withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public ValidableElementPrice withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        setPricingRule_(value);
        return this;
    }

    @Override
    public ValidableElementPrice withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    @Override
    public ValidableElementPrice withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withRanking(BigInteger value) {
        setRanking(value);
        return this;
    }

    @Override
    public ValidableElementPrice withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ValidableElementPrice withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ValidableElementPrice withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ValidableElementPrice withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ValidableElementPrice withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ValidableElementPrice withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ValidableElementPrice withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ValidableElementPrice withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ValidableElementPrice withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ValidableElementPrice withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidableElementPrice withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidableElementPrice withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ValidableElementPrice withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ValidableElementPrice withId(String value) {
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
