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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for GroupOfLines_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLines_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfLinesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLines_VersionStructure", propOrder = {
    "useToExclude",
    "members",
    "mainLineRef",
    "transportMode",
    "transportSubmode",
    "groupOfLinesType",
    "paymentMethods",
    "typesOfPaymentMethod",
    "purchaseMoment"
})
@XmlSeeAlso({
    GroupOfLines.class,
    Network_VersionStructure.class
})
public class GroupOfLines_VersionStructure
    extends GroupOfEntities_VersionStructure
{

    @XmlElement(name = "UseToExclude", defaultValue = "false")
    protected Boolean useToExclude;
    protected LineRefs_RelStructure members;
    @XmlElement(name = "MainLineRef")
    protected LineRefStructure mainLineRef;
    @XmlElement(name = "TransportMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected AllVehicleModesOfTransportEnumeration transportMode;
    @XmlElement(name = "TransportSubmode")
    protected TransportSubmodeStructure transportSubmode;
    @XmlElement(name = "GroupOfLinesType")
    @XmlSchemaType(name = "string")
    protected GroupOfLinesTypeEnumeration groupOfLinesType;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    protected TypeOfPaymentMethod_ValueStructure typesOfPaymentMethod;
    @XmlList
    @XmlElement(name = "PurchaseMoment")
    protected List<PurchaseMomentEnumeration> purchaseMoment;

    /**
     * Gets the value of the useToExclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseToExclude() {
        return useToExclude;
    }

    /**
     * Sets the value of the useToExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseToExclude(Boolean value) {
        this.useToExclude = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefs_RelStructure }
     *     
     */
    public LineRefs_RelStructure getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefs_RelStructure }
     *     
     */
    public void setMembers(LineRefs_RelStructure value) {
        this.members = value;
    }

    /**
     * Gets the value of the mainLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getMainLineRef() {
        return mainLineRef;
    }

    /**
     * Sets the value of the mainLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setMainLineRef(LineRefStructure value) {
        this.mainLineRef = value;
    }

    /**
     * Gets the value of the transportMode property.
     * 
     * @return
     *     possible object is
     *     {@link AllVehicleModesOfTransportEnumeration }
     *     
     */
    public AllVehicleModesOfTransportEnumeration getTransportMode() {
        return transportMode;
    }

    /**
     * Sets the value of the transportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllVehicleModesOfTransportEnumeration }
     *     
     */
    public void setTransportMode(AllVehicleModesOfTransportEnumeration value) {
        this.transportMode = value;
    }

    /**
     * Gets the value of the transportSubmode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public TransportSubmodeStructure getTransportSubmode() {
        return transportSubmode;
    }

    /**
     * Sets the value of the transportSubmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportSubmodeStructure }
     *     
     */
    public void setTransportSubmode(TransportSubmodeStructure value) {
        this.transportSubmode = value;
    }

    /**
     * Gets the value of the groupOfLinesType property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinesTypeEnumeration }
     *     
     */
    public GroupOfLinesTypeEnumeration getGroupOfLinesType() {
        return groupOfLinesType;
    }

    /**
     * Sets the value of the groupOfLinesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinesTypeEnumeration }
     *     
     */
    public void setGroupOfLinesType(GroupOfLinesTypeEnumeration value) {
        this.groupOfLinesType = value;
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

    /**
     * Gets the value of the typesOfPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethod_ValueStructure }
     *     
     */
    public TypeOfPaymentMethod_ValueStructure getTypesOfPaymentMethod() {
        return typesOfPaymentMethod;
    }

    /**
     * Sets the value of the typesOfPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethod_ValueStructure }
     *     
     */
    public void setTypesOfPaymentMethod(TypeOfPaymentMethod_ValueStructure value) {
        this.typesOfPaymentMethod = value;
    }

    /**
     * Gets the value of the purchaseMoment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseMoment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMoment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseMomentEnumeration }
     * 
     * 
     */
    public List<PurchaseMomentEnumeration> getPurchaseMoment() {
        if (purchaseMoment == null) {
            purchaseMoment = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.purchaseMoment;
    }

    public GroupOfLines_VersionStructure withUseToExclude(Boolean value) {
        setUseToExclude(value);
        return this;
    }

    public GroupOfLines_VersionStructure withMembers(LineRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    public GroupOfLines_VersionStructure withMainLineRef(LineRefStructure value) {
        setMainLineRef(value);
        return this;
    }

    public GroupOfLines_VersionStructure withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    public GroupOfLines_VersionStructure withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    public GroupOfLines_VersionStructure withGroupOfLinesType(GroupOfLinesTypeEnumeration value) {
        setGroupOfLinesType(value);
        return this;
    }

    public GroupOfLines_VersionStructure withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    public GroupOfLines_VersionStructure withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    public GroupOfLines_VersionStructure withTypesOfPaymentMethod(TypeOfPaymentMethod_ValueStructure value) {
        setTypesOfPaymentMethod(value);
        return this;
    }

    public GroupOfLines_VersionStructure withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    public GroupOfLines_VersionStructure withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getPurchaseMoment().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withInfoLinks(GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GroupOfLines_VersionStructure withId(String value) {
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