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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for GeographicalStructureFactor_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicalStructureFactor_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}FareStructureFactor_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeographicalStructureFactorGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalStructureFactor_VersionStructure", propOrder = {
    "tariffRef",
    "geographicalIntervalRef",
    "distanceMatrixElementRef",
    "geographicalUnitRef",
    "numberOfUnits",
    "amountFactor"
})
@XmlSeeAlso({
    GeographicalStructureFactor.class
})
public class GeographicalStructureFactor_VersionStructure
    extends FareStructureFactor_VersionStructure
{

    @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TariffRefStructure> tariffRef;
    @XmlElement(name = "GeographicalIntervalRef")
    protected GeographicalIntervalRefStructure geographicalIntervalRef;
    @XmlElement(name = "DistanceMatrixElementRef")
    protected DistanceMatrixElementRef distanceMatrixElementRef;
    @XmlElement(name = "GeographicalUnitRef")
    protected GeographicalUnitRefStructure geographicalUnitRef;
    @XmlElement(name = "NumberOfUnits")
    protected BigInteger numberOfUnits;
    @XmlElement(name = "AmountFactor")
    protected BigDecimal amountFactor;

    /**
     * Gets the value of the tariffRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TariffRefStructure> getTariffRef() {
        return tariffRef;
    }

    /**
     * Sets the value of the tariffRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     *     
     */
    public void setTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        this.tariffRef = value;
    }

    /**
     * Gets the value of the geographicalIntervalRef property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public GeographicalIntervalRefStructure getGeographicalIntervalRef() {
        return geographicalIntervalRef;
    }

    /**
     * Sets the value of the geographicalIntervalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalIntervalRefStructure }
     *     
     */
    public void setGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        this.geographicalIntervalRef = value;
    }

    /**
     * Gets the value of the distanceMatrixElementRef property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public DistanceMatrixElementRef getDistanceMatrixElementRef() {
        return distanceMatrixElementRef;
    }

    /**
     * Sets the value of the distanceMatrixElementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceMatrixElementRef }
     *     
     */
    public void setDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        this.distanceMatrixElementRef = value;
    }

    /**
     * Gets the value of the geographicalUnitRef property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public GeographicalUnitRefStructure getGeographicalUnitRef() {
        return geographicalUnitRef;
    }

    /**
     * Sets the value of the geographicalUnitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalUnitRefStructure }
     *     
     */
    public void setGeographicalUnitRef(GeographicalUnitRefStructure value) {
        this.geographicalUnitRef = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the amountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountFactor() {
        return amountFactor;
    }

    /**
     * Sets the value of the amountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountFactor(BigDecimal value) {
        this.amountFactor = value;
    }

    public GeographicalStructureFactor_VersionStructure withTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        setTariffRef(value);
        return this;
    }

    public GeographicalStructureFactor_VersionStructure withGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        setGeographicalIntervalRef(value);
        return this;
    }

    public GeographicalStructureFactor_VersionStructure withDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        setDistanceMatrixElementRef(value);
        return this;
    }

    public GeographicalStructureFactor_VersionStructure withGeographicalUnitRef(GeographicalUnitRefStructure value) {
        setGeographicalUnitRef(value);
        return this;
    }

    public GeographicalStructureFactor_VersionStructure withNumberOfUnits(BigInteger value) {
        setNumberOfUnits(value);
        return this;
    }

    public GeographicalStructureFactor_VersionStructure withAmountFactor(BigDecimal value) {
        setAmountFactor(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withTypeOfFareStructureFactorRef(TypeOfFareStructureFactorRefStructure value) {
        setTypeOfFareStructureFactorRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withFactor(Object value) {
        setFactor(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GeographicalStructureFactor_VersionStructure withId(String value) {
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