//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
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
 * <p>Java class for SalesOfferPackageEntitlementGiven_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOfferPackageEntitlementGiven_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}UsageParameter_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SalesOfferPackageEntitlementGivenGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOfferPackageEntitlementGiven_VersionStructure", propOrder = {
    "salesOfferPackageRef",
    "minimumQualificationPeriod",
    "entitlementConstraint",
    "entitlementType"
})
@XmlSeeAlso({
    SalesOfferPackageEntitlementGiven.class
})
public class SalesOfferPackageEntitlementGiven_VersionStructure
    extends UsageParameter_VersionStructure
{

    @XmlElement(name = "SalesOfferPackageRef")
    protected SalesOfferPackageRefStructure salesOfferPackageRef;
    @XmlElement(name = "MinimumQualificationPeriod", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumQualificationPeriod;
    @XmlElement(name = "EntitlementConstraint")
    protected EntitlementConstraintStructure entitlementConstraint;
    @XmlElement(name = "EntitlementType")
    @XmlSchemaType(name = "normalizedString")
    protected EntitlementTypeEnumeration entitlementType;

    /**
     * Gets the value of the salesOfferPackageRef property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public SalesOfferPackageRefStructure getSalesOfferPackageRef() {
        return salesOfferPackageRef;
    }

    /**
     * Sets the value of the salesOfferPackageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOfferPackageRefStructure }
     *     
     */
    public void setSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        this.salesOfferPackageRef = value;
    }

    /**
     * Gets the value of the minimumQualificationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumQualificationPeriod() {
        return minimumQualificationPeriod;
    }

    /**
     * Sets the value of the minimumQualificationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumQualificationPeriod(Duration value) {
        this.minimumQualificationPeriod = value;
    }

    /**
     * Gets the value of the entitlementConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementConstraintStructure }
     *     
     */
    public EntitlementConstraintStructure getEntitlementConstraint() {
        return entitlementConstraint;
    }

    /**
     * Sets the value of the entitlementConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementConstraintStructure }
     *     
     */
    public void setEntitlementConstraint(EntitlementConstraintStructure value) {
        this.entitlementConstraint = value;
    }

    /**
     * Gets the value of the entitlementType property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementTypeEnumeration }
     *     
     */
    public EntitlementTypeEnumeration getEntitlementType() {
        return entitlementType;
    }

    /**
     * Sets the value of the entitlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementTypeEnumeration }
     *     
     */
    public void setEntitlementType(EntitlementTypeEnumeration value) {
        this.entitlementType = value;
    }

    public SalesOfferPackageEntitlementGiven_VersionStructure withSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        setSalesOfferPackageRef(value);
        return this;
    }

    public SalesOfferPackageEntitlementGiven_VersionStructure withMinimumQualificationPeriod(Duration value) {
        setMinimumQualificationPeriod(value);
        return this;
    }

    public SalesOfferPackageEntitlementGiven_VersionStructure withEntitlementConstraint(EntitlementConstraintStructure value) {
        setEntitlementConstraint(value);
        return this;
    }

    public SalesOfferPackageEntitlementGiven_VersionStructure withEntitlementType(EntitlementTypeEnumeration value) {
        setEntitlementType(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withTypeOfUsageParameterRef(TypeOfUsageParameterRefStructure value) {
        setTypeOfUsageParameterRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withPrices(UsageParameterPrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SalesOfferPackageEntitlementGiven_VersionStructure withId(String value) {
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
