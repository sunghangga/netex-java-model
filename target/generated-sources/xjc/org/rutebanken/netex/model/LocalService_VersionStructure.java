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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for LocalService_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalService_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Equipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}LocalServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalService_VersionStructure", propOrder = {
    "typesOfServiceFeature"
})
@XmlSeeAlso({
    TicketingService_VersionStructure.class,
    AssistanceService_VersionStructure.class,
    LuggageService_VersionStructure.class,
    CustomerService_VersionStructure.class,
    CommunicationService_VersionStructure.class,
    HireService_VersionStructure.class,
    MoneyService_VersionStructure.class,
    RetailService_VersionStructure.class,
    CateringService_VersionStructure.class,
    AssistanceBookingService_VersionStructure.class
})
public abstract class LocalService_VersionStructure
    extends Equipment_VersionStructure
{

    protected TypeOfServiceFeatureRefs_RelStructure typesOfServiceFeature;

    /**
     * Gets the value of the typesOfServiceFeature property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceFeatureRefs_RelStructure }
     *     
     */
    public TypeOfServiceFeatureRefs_RelStructure getTypesOfServiceFeature() {
        return typesOfServiceFeature;
    }

    /**
     * Sets the value of the typesOfServiceFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceFeatureRefs_RelStructure }
     *     
     */
    public void setTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        this.typesOfServiceFeature = value;
    }

    public LocalService_VersionStructure withTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        setTypesOfServiceFeature(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public LocalService_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public LocalService_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public LocalService_VersionStructure withId(String value) {
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