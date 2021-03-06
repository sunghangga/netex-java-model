//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}GroupOfTimebands_VersionedChildStructure"&gt;
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
 *           &lt;element name="timebands" type="{http://www.netex.org.uk/netex}timebandRefs_RelStructure" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}GroupOfTimebandsIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class GroupOfTimebands
    extends GroupOfTimebands_VersionedChildStructure
{


    @Override
    public GroupOfTimebands withTimebands(TimebandRefs_RelStructure value) {
        setTimebands(value);
        return this;
    }

    @Override
    public GroupOfTimebands withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GroupOfTimebands withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public GroupOfTimebands withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GroupOfTimebands withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GroupOfTimebands withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GroupOfTimebands withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GroupOfTimebands withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GroupOfTimebands withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GroupOfTimebands withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupOfTimebands withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfTimebands withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GroupOfTimebands withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GroupOfTimebands withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GroupOfTimebands withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GroupOfTimebands withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GroupOfTimebands withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfTimebands withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfTimebands withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GroupOfTimebands withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GroupOfTimebands withId(String value) {
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
