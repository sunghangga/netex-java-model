//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TrolleyStandEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrolleyStandEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}SiteEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TrolleyStandGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrolleyStandEquipment_VersionStructure", propOrder = {
    "freeToUse",
    "charge",
    "currency",
    "paymentMethods"
})
@XmlSeeAlso({
    TrolleyStandEquipment.class
})
public class TrolleyStandEquipment_VersionStructure
    extends SiteEquipment_VersionStructure
{

    @XmlElement(name = "FreeToUse")
    protected Boolean freeToUse;
    @XmlElement(name = "Charge")
    protected BigDecimal charge;
    @XmlElement(name = "Currency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currency;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;

    /**
     * Gets the value of the freeToUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreeToUse() {
        return freeToUse;
    }

    /**
     * Sets the value of the freeToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreeToUse(Boolean value) {
        this.freeToUse = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodEnumeration }
     * 
     * 
     */
    public List<PaymentMethodEnumeration> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethodEnumeration>();
        }
        return this.paymentMethods;
    }

    public TrolleyStandEquipment_VersionStructure withFreeToUse(Boolean value) {
        setFreeToUse(value);
        return this;
    }

    public TrolleyStandEquipment_VersionStructure withCharge(BigDecimal value) {
        setCharge(value);
        return this;
    }

    public TrolleyStandEquipment_VersionStructure withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    public TrolleyStandEquipment_VersionStructure withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    public TrolleyStandEquipment_VersionStructure withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TrolleyStandEquipment_VersionStructure withId(String value) {
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
