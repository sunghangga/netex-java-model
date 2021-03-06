//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TravelSpecification_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LogEntryGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FareContractEntryGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TravelSpecificationGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TravelSpecificationIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TravelSpecification
    extends TravelSpecification_VersionStructure
{


    @Override
    public TravelSpecification withSalesTransactionRef(SalesTransactionRefStructure value) {
        setSalesTransactionRef(value);
        return this;
    }

    @Override
    public TravelSpecification withPassengerInformationRequestRef(JAXBElement<? extends PassengerInformationRequestRefStructure> value) {
        setPassengerInformationRequestRef(value);
        return this;
    }

    @Override
    public TravelSpecification withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public TravelSpecification withCellRef_(JAXBElement<? extends VersionOfObjectRefStructure> value) {
        setCellRef_(value);
        return this;
    }

    @Override
    public TravelSpecification withAmount(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public TravelSpecification withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public TravelSpecification withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public TravelSpecification withUnits(BigDecimal value) {
        setUnits(value);
        return this;
    }

    @Override
    public TravelSpecification withRuleStepResults(PriceRuleStepResults_RelStructure value) {
        setRuleStepResults(value);
        return this;
    }

    @Override
    public TravelSpecification withPaymentMethod(PaymentMethodEnumeration value) {
        setPaymentMethod(value);
        return this;
    }

    @Override
    public TravelSpecification withTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        setTypeOfPaymentMethodRef(value);
        return this;
    }

    @Override
    public TravelSpecification withStartOfValidity(LocalDateTime value) {
        setStartOfValidity(value);
        return this;
    }

    @Override
    public TravelSpecification withEndOfValidity(LocalDateTime value) {
        setEndOfValidity(value);
        return this;
    }

    @Override
    public TravelSpecification withTravelSpecificationSummaryView(TravelSpecificationSummaryViewStructure value) {
        setTravelSpecificationSummaryView(value);
        return this;
    }

    @Override
    public TravelSpecification withSpecificParameterAssignments(SpecificParameterAssignments_RelStructure value) {
        setSpecificParameterAssignments(value);
        return this;
    }

    @Override
    public TravelSpecification withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public TravelSpecification withIsValid(Boolean value) {
        setIsValid(value);
        return this;
    }

    @Override
    public TravelSpecification withTypeOfFareContractEntryRef(TypeOfFareContractEntryRefStructure value) {
        setTypeOfFareContractEntryRef(value);
        return this;
    }

    @Override
    public TravelSpecification withFareContractRef(FareContractRefStructure value) {
        setFareContractRef(value);
        return this;
    }

    @Override
    public TravelSpecification withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TravelSpecification withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TravelSpecification withDate(LocalDateTime value) {
        setDate(value);
        return this;
    }

    @Override
    public TravelSpecification withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TravelSpecification withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TravelSpecification withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TravelSpecification withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TravelSpecification withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TravelSpecification withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TravelSpecification withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TravelSpecification withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TravelSpecification withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TravelSpecification withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TravelSpecification withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TravelSpecification withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TravelSpecification withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TravelSpecification withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelSpecification withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TravelSpecification withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TravelSpecification withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TravelSpecification withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TravelSpecification withId(String value) {
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
