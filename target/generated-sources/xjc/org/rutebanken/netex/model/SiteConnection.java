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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}SiteConnection_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TransferGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SiteConnectionGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}SiteConnectionIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class SiteConnection
    extends SiteConnection_VersionStructure
{


    @Override
    public SiteConnection withFrom(SiteConnectionEndStructure value) {
        setFrom(value);
        return this;
    }

    @Override
    public SiteConnection withTo(SiteConnectionEndStructure value) {
        setTo(value);
        return this;
    }

    @Override
    public SiteConnection withNavigationPaths(NavigationPaths_RelStructure value) {
        setNavigationPaths(value);
        return this;
    }

    @Override
    public SiteConnection withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SiteConnection withTypeOfTransferRef(TypeOfTransferRefStructure value) {
        setTypeOfTransferRef(value);
        return this;
    }

    @Override
    public SiteConnection withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SiteConnection withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public SiteConnection withTransferDuration(TransferDurationStructure value) {
        setTransferDuration(value);
        return this;
    }

    @Override
    public SiteConnection withWalkTransferDuration(TransferDurationStructure value) {
        setWalkTransferDuration(value);
        return this;
    }

    @Override
    public SiteConnection withBothWays(Boolean value) {
        setBothWays(value);
        return this;
    }

    @Override
    public SiteConnection withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SiteConnection withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SiteConnection withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SiteConnection withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SiteConnection withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SiteConnection withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteConnection withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SiteConnection withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SiteConnection withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SiteConnection withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SiteConnection withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SiteConnection withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SiteConnection withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SiteConnection withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteConnection withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteConnection withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SiteConnection withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SiteConnection withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SiteConnection withId(String value) {
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