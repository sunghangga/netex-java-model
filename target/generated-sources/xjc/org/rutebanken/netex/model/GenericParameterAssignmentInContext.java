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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}GenericParameterAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}AssignmentGroup"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}AccessRightParameterAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ValidityParameterAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GenericParameterAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}GenericParameterAssignmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class GenericParameterAssignmentInContext
    extends GenericParameterAssignment_VersionStructure
{


    @Override
    public GenericParameterAssignmentInContext withIncludesGroupingType(BooleanOperatorEnumeration value) {
        setIncludesGroupingType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withIncludes(GenericParameterAssignments_RelStructure value) {
        setIncludes(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withTimeIntervalRef(TimeIntervalRefStructure value) {
        setTimeIntervalRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withTimeStructureFactorRef(JAXBElement<? extends TimeStructureFactorRefStructure> value) {
        setTimeStructureFactorRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withGeographicalIntervalRef(GeographicalIntervalRefStructure value) {
        setGeographicalIntervalRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withGeographicalStructureFactorRef(GeographicalStructureFactorRefStructure value) {
        setGeographicalStructureFactorRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        setQualityStructureFactorRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withIsAllowed(Boolean value) {
        setIsAllowed(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withTypeOfAccessRightAssignmentRef(TypeOfAccessRightAssignmentRefStructure value) {
        setTypeOfAccessRightAssignmentRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withChargingBasis(ChargingBasisEnumeration value) {
        setChargingBasis(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidableElementRef(ValidableElementRefStructure value) {
        setValidableElementRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withControllableElementRef(ControllableElementRefStructure value) {
        setControllableElementRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withFareProductRef(JAXBElement<? extends FareProductRefStructure> value) {
        setFareProductRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        setTariffRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withFareStructureElementRef(FareStructureElementRefStructure value) {
        setFareStructureElementRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withFareElementInSequenceRef(JAXBElement<? extends FareElementInSequenceRefStructure> value) {
        setFareElementInSequenceRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDistanceMatrixElementRef(DistanceMatrixElementRef value) {
        setDistanceMatrixElementRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDistanceMatrixElementInverseRef(DistanceMatrixElementInverseRef value) {
        setDistanceMatrixElementInverseRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDistanceMatrixElementView(DistanceMatrixElement_DerivedViewStructure value) {
        setDistanceMatrixElementView(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withSalesOfferPackageRef(SalesOfferPackageRefStructure value) {
        setSalesOfferPackageRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withGroupOfDistanceMatrixElementsRef(GroupOfDistanceMatrixElementsRefStructureElement value) {
        setGroupOfDistanceMatrixElementsRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withGroupOfSalesOfferPackagesRef(GroupOfSalesOfferPackagesRefStructure value) {
        setGroupOfSalesOfferPackagesRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withLimitationGroupingType(BooleanOperatorEnumeration value) {
        setLimitationGroupingType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withLimitationSetSelectionType(SetOperatorEnumeration value) {
        setLimitationSetSelectionType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withLimitations(UsageParameters_RelStructure value) {
        setLimitations(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidityParameterAssignmentType(RelativeOperatorEnumeration value) {
        setValidityParameterAssignmentType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidityParameterGroupingType(BooleanOperatorEnumeration value) {
        setValidityParameterGroupingType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidityParameterSetSelectionType(SetOperatorEnumeration value) {
        setValidityParameterSetSelectionType(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withTemporalValidityParameters(TemporalValidityParameters_RelStructure value) {
        setTemporalValidityParameters(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidityParameters(ValidityParameters_RelStructure value) {
        setValidityParameters(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GenericParameterAssignmentInContext withId(String value) {
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
