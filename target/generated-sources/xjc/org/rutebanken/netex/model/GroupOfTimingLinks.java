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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}GroupOfTimingLinks_RelStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfTimingLinksGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}GroupOfTimingLinksIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class GroupOfTimingLinks
    extends GroupOfTimingLinks_RelStructure
{


    @Override
    public GroupOfTimingLinks withMembers(TimingLinkRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupOfTimingLinks withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfTimingLinks withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GroupOfTimingLinks withId(String value) {
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
