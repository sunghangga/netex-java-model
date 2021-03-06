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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Tariff_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TariffGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TariffIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Tariff
    extends Tariff_VersionStructure
{


    @Override
    public Tariff withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Tariff withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Tariff withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Tariff withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Tariff withDocumentLinks(InfoLinks_RelStructure value) {
        setDocumentLinks(value);
        return this;
    }

    @Override
    public Tariff withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Tariff withOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setOrganisationRef(value);
        return this;
    }

    @Override
    public Tariff withGroupOfOperatorsRef(GroupOfOperatorsRefStructure value) {
        setGroupOfOperatorsRef(value);
        return this;
    }

    @Override
    public Tariff withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public Tariff withGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        setGroupOfLinesRef(value);
        return this;
    }

    @Override
    public Tariff withTypeOfTariffRef(TypeOfTariffRefStructure value) {
        setTypeOfTariffRef(value);
        return this;
    }

    @Override
    public Tariff withTariffBasis(TariffBasisEnumeration value) {
        setTariffBasis(value);
        return this;
    }

    @Override
    public Tariff withReturnFareTwiceSingle(Boolean value) {
        setReturnFareTwiceSingle(value);
        return this;
    }

    @Override
    public Tariff withGeographicalUnitRef(GeographicalUnitRefStructure value) {
        setGeographicalUnitRef(value);
        return this;
    }

    @Override
    public Tariff withGeographicalIntervals(GeographicalIntervals_RelStructure value) {
        setGeographicalIntervals(value);
        return this;
    }

    @Override
    public Tariff withGeographicalStructureFactors(GeographicalStructureFactors_RelStructure value) {
        setGeographicalStructureFactors(value);
        return this;
    }

    @Override
    public Tariff withTimeUnitRef(TimeUnitRefStructure value) {
        setTimeUnitRef(value);
        return this;
    }

    @Override
    public Tariff withTimeIntervals(TimeIntervals_RelStructure value) {
        setTimeIntervals(value);
        return this;
    }

    @Override
    public Tariff withTimeStructureFactors(TimeStructureFactors_RelStructure value) {
        setTimeStructureFactors(value);
        return this;
    }

    @Override
    public Tariff withQualityStructureFactors(QualityStructureFactors_RelStructure value) {
        setQualityStructureFactors(value);
        return this;
    }

    @Override
    public Tariff withFareStructureElements(FareStructureElements_RelStructure value) {
        setFareStructureElements(value);
        return this;
    }

    @Override
    public Tariff withDistanceMatrixElements(DistanceMatrixElements_RelStructure value) {
        setDistanceMatrixElements(value);
        return this;
    }

    @Override
    public Tariff withGroupsOfDistanceMatrixElements(GroupsOfDistanceMatrixElements_RelStructure value) {
        setGroupsOfDistanceMatrixElements(value);
        return this;
    }

    @Override
    public Tariff withPriceUnitRef(PriceUnitRefStructure value) {
        setPriceUnitRef(value);
        return this;
    }

    @Override
    public Tariff withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public Tariff withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public Tariff withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Tariff withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Tariff withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Tariff withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Tariff withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Tariff withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Tariff withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Tariff withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Tariff withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Tariff withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Tariff withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Tariff withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Tariff withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Tariff withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Tariff withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Tariff withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Tariff withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Tariff withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Tariff withId(String value) {
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
