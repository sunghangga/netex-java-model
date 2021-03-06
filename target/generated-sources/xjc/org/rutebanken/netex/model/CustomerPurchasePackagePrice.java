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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}CustomerPurchasePackagePrice_VersionedChildStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}CustomerPurchasePackagePriceGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CustomerPurchasePackagePriceIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CustomerPurchasePackagePrice
    extends CustomerPurchasePackagePrice_VersionedChildStructure
{


    @Override
    public CustomerPurchasePackagePrice withCustomerPurchasePackageRef(CustomerPurchasePackageRefStructure value) {
        setCustomerPurchasePackageRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withCustomerPurchasePackageElementRef(CustomerPurchasePackageElementRefStructure value) {
        setCustomerPurchasePackageElementRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withPricingRule_(JAXBElement<? extends DataManagedObjectStructure> value) {
        setPricingRule_(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withCanBeCumulative(Boolean value) {
        setCanBeCumulative(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withRanking(BigInteger value) {
        setRanking(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CustomerPurchasePackagePrice withId(String value) {
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
