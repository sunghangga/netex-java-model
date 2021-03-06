//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

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
 * <p>Java class for ValidityParameterAssignment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidityParameterAssignment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}AccessRightParameterAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ValidityParameterAssignmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityParameterAssignment_VersionStructure", propOrder = {
    "timeIntervalRef",
    "timeStructureFactorRef",
    "geographicalIntervalRef",
    "geographicalStructureFactorRef",
    "qualityStructureFactorRef"
})
@XmlSeeAlso({
    ValidityParameterAssignment.class,
    GenericParameterAssignment_VersionStructure.class,
    SpecificParameterAssignment_VersionStructure.class,
    CustomerPurchaseParameterAssignment_VersionStructure.class
})
public class ValidityParameterAssignment_VersionStructure
    extends AccessRightParameterAssignment_VersionStructure
{

    @XmlElement(name = "TimeIntervalRef")
    protected TimeIntervalRefStructure timeIntervalRef;
    @XmlElementRef(name = "TimeStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends TimeStructureFactorRefStructure> timeStructureFactorRef;
    @XmlElement(name = "GeographicalIntervalRef")
    protected GeographicalIntervalRefStructure geographicalIntervalRef;
    @XmlElement(name = "GeographicalStructureFactorRef")
    protected GeographicalStructureFactorRefStructure geographicalStructureFactorRef;
    @XmlElementRef(name = "QualityStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends QualityStructureFactorRefStructure> qualityStructureFactorRef;

    /**
     * Gets the value of the timeIntervalRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public TimeIntervalRefStructure getTimeIntervalRef() {
        return timeIntervalRef;
    }

    /**
     * Sets the value of the timeIntervalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalRefStructure }
     *     
     */
    public void setTimeIntervalRef(TimeIntervalRefStructure value) {
        this.timeIntervalRef = value;
    }

    /**
     * Gets the value of the timeStructureFactorRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends TimeStructureFactorRefStructure> getTimeStructureFactorRef() {
        return timeStructureFactorRef;
    }

    /**
     * Sets the value of the timeStructureFactorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingChargeBandRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimeStructureFactorRefStructure }{@code >}
     *     
     */
    public void setTimeStructureFactorRef(JAXBElement<? extends TimeStructureFactorRefStructure> value) {
        this.timeStructureFactorRef = value;
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
     * Gets the value of the geographicalStructureFactorRef property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalStructureFactorRefStructure }
     *     
     */
    public GeographicalStructureFactorRefStructure getGeographicalStructureFactorRef() {
        return geographicalStructureFactorRef;
    }

    /**
     * Sets the value of the geographicalStructureFactorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalStructureFactorRefStructure }
     *     
     */
    public void setGeographicalStructureFactorRef(GeographicalStructureFactorRefStructure value) {
        this.geographicalStructureFactorRef = value;
    }

    /**
     * Gets the value of the qualityStructureFactorRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends QualityStructureFactorRefStructure> getQualityStructureFactorRef() {
        return qualityStructureFactorRef;
    }

    /**
     * Sets the value of the qualityStructureFactorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FareQuotaFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareDemandFactorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link QualityStructureFactorRefStructure }{@code >}
     *     
     */
    public void setQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        this.qualityStructureFactorRef = value;
    }

    public ValidityParameterAssignment_VersionStructure withTimeIntervalRef(TimeIntervalRefStructure value) {
        setTimeIntervalRef(value);
        return this;
    }

    public ValidityParameterAssignment_VersionStructure withTimeStructureFactorRef(JAXBElement<? extends TimeStructureFactorRefStructure> value) {
        setTimeStructureFactorRef(value);
        return this;
    }

    public ValidityParameterAssignment_VersionStructure withGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        setGeographicalIntervalRef(value);
        return this;
    }

    public ValidityParameterAssignment_VersionStructure withGeographicalStructureFactorRef(GeographicalStructureFactorRefStructure value) {
        setGeographicalStructureFactorRef(value);
        return this;
    }

    public ValidityParameterAssignment_VersionStructure withQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        setQualityStructureFactorRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withTypeOfAccessRightAssignmentRef(TypeOfAccessRightAssignmentRefStructure value) {
        setTypeOfAccessRightAssignmentRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withChargingBasis(ChargingBasisEnumeration value) {
        setChargingBasis(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidableElementRef(ValidableElementRefStructure value) {
        setValidableElementRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withControllableElementRef(ControllableElementRefStructure value) {
        setControllableElementRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withFareProductRef(JAXBElement<? extends FareProductRefStructure> value) {
        setFareProductRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        setTariffRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withFareStructureElementRef(FareStructureElementRefStructure value) {
        setFareStructureElementRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withFareElementInSequenceRef(JAXBElement<? extends FareElementInSequenceRefStructure> value) {
        setFareElementInSequenceRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        setDistanceMatrixElementRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDistanceMatrixElementInverseRef(DistanceMatrixElementInverseRef value) {
        setDistanceMatrixElementInverseRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDistanceMatrixElementView(DistanceMatrixElement_DerivedViewStructure value) {
        setDistanceMatrixElementView(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        setSalesOfferPackageRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withGroupOfDistanceMatrixElementsRef(GroupOfDistanceMatrixElementsRefStructureElement value) {
        setGroupOfDistanceMatrixElementsRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withGroupOfSalesOfferPackagesRef(GroupOfSalesOfferPackagesRefStructure value) {
        setGroupOfSalesOfferPackagesRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withLimitationGroupingType(BooleanOperatorEnumeration value) {
        setLimitationGroupingType(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withLimitationSetSelectionType(SetOperatorEnumeration value) {
        setLimitationSetSelectionType(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withLimitations(UsageParameters_RelStructure value) {
        setLimitations(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidityParameterAssignmentType(RelativeOperatorEnumeration value) {
        setValidityParameterAssignmentType(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidityParameterGroupingType(BooleanOperatorEnumeration value) {
        setValidityParameterGroupingType(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidityParameterSetSelectionType(SetOperatorEnumeration value) {
        setValidityParameterSetSelectionType(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withTemporalValidityParameters(TemporalValidityParameters_RelStructure value) {
        setTemporalValidityParameters(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidityParameters(ValidityParameters_RelStructure value) {
        setValidityParameters(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ValidityParameterAssignment_VersionStructure withId(String value) {
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
