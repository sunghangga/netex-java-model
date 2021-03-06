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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PriceGroup_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfEntitiesGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PricePropertyGroup"/&gt;
 *           &lt;element name="members" type="{http://www.netex.org.uk/netex}farePrices_RelStructure" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}FarePriceRef" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PriceGroupIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PriceGroup
    extends PriceGroup_VersionStructure
{


    @Override
    public PriceGroup withStartDate(LocalDateTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public PriceGroup withEndDate(LocalDateTime value) {
        setEndDate(value);
        return this;
    }

    @Override
    public PriceGroup withRoundingRef(RoundingRefStructure value) {
        setRoundingRef(value);
        return this;
    }

    @Override
    public PriceGroup withMembers(FarePrices_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public PriceGroup withFarePriceRef(JAXBElement<? extends FarePriceRefStructure> value) {
        setFarePriceRef(value);
        return this;
    }

    @Override
    public PriceGroup withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PriceGroup withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public PriceGroup withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PriceGroup withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public PriceGroup withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PriceGroup withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PriceGroup withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PriceGroup withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PriceGroup withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PriceGroup withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PriceGroup withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PriceGroup withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PriceGroup withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PriceGroup withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PriceGroup withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PriceGroup withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PriceGroup withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PriceGroup withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PriceGroup withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PriceGroup withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PriceGroup withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PriceGroup withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PriceGroup withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PriceGroup withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PriceGroup withId(String value) {
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
