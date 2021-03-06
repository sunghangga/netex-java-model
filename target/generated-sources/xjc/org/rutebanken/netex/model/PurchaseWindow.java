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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PurchaseWindow_VersionStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}PurchaseWindowGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PurchaseWindowIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PurchaseWindow
    extends PurchaseWindow_VersionStructure
{


    @Override
    public PurchaseWindow withPurchaseAction(PurchaseActionEnumeration value) {
        setPurchaseAction(value);
        return this;
    }

    @Override
    public PurchaseWindow withPurchaseWhen(PurchaseWhenEnumeration value) {
        setPurchaseWhen(value);
        return this;
    }

    @Override
    public PurchaseWindow withLatestTime(LocalTime value) {
        setLatestTime(value);
        return this;
    }

    @Override
    public PurchaseWindow withMinimumPeriodBeforeDeparture(Duration value) {
        setMinimumPeriodBeforeDeparture(value);
        return this;
    }

    @Override
    public PurchaseWindow withMinimumPeriodIntervalRef(TimeIntervalRefStructure value) {
        setMinimumPeriodIntervalRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withMaximumPeriodBeforeDeparture(Duration value) {
        setMaximumPeriodBeforeDeparture(value);
        return this;
    }

    @Override
    public PurchaseWindow withMaximumPeriodIntervalRef(TimeIntervalRefStructure value) {
        setMaximumPeriodIntervalRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    @Override
    public PurchaseWindow withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getPurchaseMoment().addAll(values);
        }
        return this;
    }

    @Override
    public PurchaseWindow withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public PurchaseWindow withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PurchaseWindow withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PurchaseWindow withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public PurchaseWindow withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PurchaseWindow withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public PurchaseWindow withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public PurchaseWindow withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public PurchaseWindow withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public PurchaseWindow withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PurchaseWindow withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PurchaseWindow withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PurchaseWindow withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PurchaseWindow withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PurchaseWindow withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PurchaseWindow withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PurchaseWindow withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PurchaseWindow withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PurchaseWindow withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PurchaseWindow withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PurchaseWindow withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PurchaseWindow withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PurchaseWindow withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PurchaseWindow withId(String value) {
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
