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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TypeOfProductCategoryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeOfProductCategoryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}TypeOfEntity_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TypeOfProductCategoryGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeOfProductCategoryStructure", propOrder = {
    "externalProductCategoryRef"
})
@XmlSeeAlso({
    TypeOfProductCategory.class
})
public class TypeOfProductCategoryStructure
    extends TypeOfEntity_VersionStructure
{

    @XmlElement(name = "ExternalProductCategoryRef")
    protected ExternalObjectRefStructure externalProductCategoryRef;

    /**
     * Gets the value of the externalProductCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public ExternalObjectRefStructure getExternalProductCategoryRef() {
        return externalProductCategoryRef;
    }

    /**
     * Sets the value of the externalProductCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectRefStructure }
     *     
     */
    public void setExternalProductCategoryRef(ExternalObjectRefStructure value) {
        this.externalProductCategoryRef = value;
    }

    public TypeOfProductCategoryStructure withExternalProductCategoryRef(ExternalObjectRefStructure value) {
        setExternalProductCategoryRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withNameOfClassifiedEntityClass(String value) {
        setNameOfClassifiedEntityClass(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TypeOfProductCategoryStructure withId(String value) {
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
