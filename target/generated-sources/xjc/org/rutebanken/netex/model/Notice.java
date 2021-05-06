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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Notice_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}NoticeGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}NoticeIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Notice
    extends Notice_VersionStructure
{


    @Override
    public Notice withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Notice withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Notice withText(MultilingualString value) {
        setText(value);
        return this;
    }

    @Override
    public Notice withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public Notice withShortCode(String value) {
        setShortCode(value);
        return this;
    }

    @Override
    public Notice withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Notice withTypeOfNoticeRef(TypeOfNoticeRefStructure value) {
        setTypeOfNoticeRef(value);
        return this;
    }

    @Override
    public Notice withCanBeAdvertised(Boolean value) {
        setCanBeAdvertised(value);
        return this;
    }

    @Override
    public Notice withDriverDisplayText(MultilingualString value) {
        setDriverDisplayText(value);
        return this;
    }

    @Override
    public Notice withVariants(DeliveryVariants_RelStructure value) {
        setVariants(value);
        return this;
    }

    @Override
    public Notice withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Notice withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Notice withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Notice withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Notice withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Notice withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Notice withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Notice withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Notice withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Notice withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Notice withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Notice withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Notice withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Notice withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Notice withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Notice withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Notice withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Notice withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Notice withId(String value) {
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
