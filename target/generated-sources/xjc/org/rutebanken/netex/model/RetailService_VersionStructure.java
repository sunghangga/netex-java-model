//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for RetailService_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailService_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}RetailServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailService_VersionStructure", propOrder = {
    "serviceList"
})
@XmlSeeAlso({
    RetailService.class
})
public class RetailService_VersionStructure
    extends LocalService_VersionStructure
{

    @XmlList
    @XmlElement(name = "ServiceList", required = true)
    protected List<RetailServiceEnumeration> serviceList;

    /**
     * Gets the value of the serviceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailServiceEnumeration }
     * 
     * 
     */
    public List<RetailServiceEnumeration> getServiceList() {
        if (serviceList == null) {
            serviceList = new ArrayList<RetailServiceEnumeration>();
        }
        return this.serviceList;
    }

    public RetailService_VersionStructure withServiceList(RetailServiceEnumeration... values) {
        if (values!= null) {
            for (RetailServiceEnumeration value: values) {
                getServiceList().add(value);
            }
        }
        return this;
    }

    public RetailService_VersionStructure withServiceList(Collection<RetailServiceEnumeration> values) {
        if (values!= null) {
            getServiceList().addAll(values);
        }
        return this;
    }

    @Override
    public RetailService_VersionStructure withTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        setTypesOfServiceFeature(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RetailService_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RetailService_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RetailService_VersionStructure withId(String value) {
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
