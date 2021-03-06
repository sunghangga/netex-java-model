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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TicketingService_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingService_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LocalService_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketingServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingService_VersionStructure", propOrder = {
    "vehicleModes",
    "ticketingServiceList",
    "ticketTypeList",
    "ticketCounterService",
    "onlinePurchaseForCollection",
    "onlinePurchaseForETicket",
    "onlinePurchaseForSelfPrintTicket",
    "mobileDeviceTickets",
    "paymentMethods"
})
@XmlSeeAlso({
    TicketingService.class
})
public class TicketingService_VersionStructure
    extends LocalService_VersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<VehicleModeEnumeration> vehicleModes;
    @XmlList
    @XmlElement(name = "TicketingServiceList")
    protected List<TicketingServiceFacilityEnumeration> ticketingServiceList;
    @XmlElementRef(name = "TicketTypeList", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<TicketTypeEnumeration>>> ticketTypeList;
    @XmlElement(name = "TicketCounterService")
    protected Boolean ticketCounterService;
    @XmlElement(name = "OnlinePurchaseForCollection")
    protected Boolean onlinePurchaseForCollection;
    @XmlElement(name = "OnlinePurchaseForETicket")
    protected Boolean onlinePurchaseForETicket;
    @XmlElement(name = "OnlinePurchaseForSelfPrintTicket")
    protected Boolean onlinePurchaseForSelfPrintTicket;
    @XmlElement(name = "MobileDeviceTickets")
    protected Boolean mobileDeviceTickets;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;

    /**
     * Gets the value of the vehicleModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModeEnumeration }
     * 
     * 
     */
    public List<VehicleModeEnumeration> getVehicleModes() {
        if (vehicleModes == null) {
            vehicleModes = new ArrayList<VehicleModeEnumeration>();
        }
        return this.vehicleModes;
    }

    /**
     * Gets the value of the ticketingServiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingServiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingServiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingServiceFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingServiceFacilityEnumeration> getTicketingServiceList() {
        if (ticketingServiceList == null) {
            ticketingServiceList = new ArrayList<TicketingServiceFacilityEnumeration>();
        }
        return this.ticketingServiceList;
    }

    /**
     * Gets the value of the ticketTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link TicketTypeEnumeration }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<TicketTypeEnumeration>>> getTicketTypeList() {
        if (ticketTypeList == null) {
            ticketTypeList = new ArrayList<JAXBElement<List<TicketTypeEnumeration>>>();
        }
        return this.ticketTypeList;
    }

    /**
     * Gets the value of the ticketCounterService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketCounterService() {
        return ticketCounterService;
    }

    /**
     * Sets the value of the ticketCounterService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketCounterService(Boolean value) {
        this.ticketCounterService = value;
    }

    /**
     * Gets the value of the onlinePurchaseForCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForCollection() {
        return onlinePurchaseForCollection;
    }

    /**
     * Sets the value of the onlinePurchaseForCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForCollection(Boolean value) {
        this.onlinePurchaseForCollection = value;
    }

    /**
     * Gets the value of the onlinePurchaseForETicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForETicket() {
        return onlinePurchaseForETicket;
    }

    /**
     * Sets the value of the onlinePurchaseForETicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForETicket(Boolean value) {
        this.onlinePurchaseForETicket = value;
    }

    /**
     * Gets the value of the onlinePurchaseForSelfPrintTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePurchaseForSelfPrintTicket() {
        return onlinePurchaseForSelfPrintTicket;
    }

    /**
     * Sets the value of the onlinePurchaseForSelfPrintTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePurchaseForSelfPrintTicket(Boolean value) {
        this.onlinePurchaseForSelfPrintTicket = value;
    }

    /**
     * Gets the value of the mobileDeviceTickets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileDeviceTickets() {
        return mobileDeviceTickets;
    }

    /**
     * Sets the value of the mobileDeviceTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileDeviceTickets(Boolean value) {
        this.mobileDeviceTickets = value;
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

    public TicketingService_VersionStructure withVehicleModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getVehicleModes().add(value);
            }
        }
        return this;
    }

    public TicketingService_VersionStructure withVehicleModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getVehicleModes().addAll(values);
        }
        return this;
    }

    public TicketingService_VersionStructure withTicketingServiceList(TicketingServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingServiceFacilityEnumeration value: values) {
                getTicketingServiceList().add(value);
            }
        }
        return this;
    }

    public TicketingService_VersionStructure withTicketingServiceList(Collection<TicketingServiceFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingServiceList().addAll(values);
        }
        return this;
    }

    public TicketingService_VersionStructure withTicketTypeList(JAXBElement<List<TicketTypeEnumeration>> ... values) {
        if (values!= null) {
            for (JAXBElement<List<TicketTypeEnumeration>> value: values) {
                getTicketTypeList().add(value);
            }
        }
        return this;
    }

    public TicketingService_VersionStructure withTicketTypeList(Collection<JAXBElement<List<TicketTypeEnumeration>>> values) {
        if (values!= null) {
            getTicketTypeList().addAll(values);
        }
        return this;
    }

    public TicketingService_VersionStructure withTicketCounterService(Boolean value) {
        setTicketCounterService(value);
        return this;
    }

    public TicketingService_VersionStructure withOnlinePurchaseForCollection(Boolean value) {
        setOnlinePurchaseForCollection(value);
        return this;
    }

    public TicketingService_VersionStructure withOnlinePurchaseForETicket(Boolean value) {
        setOnlinePurchaseForETicket(value);
        return this;
    }

    public TicketingService_VersionStructure withOnlinePurchaseForSelfPrintTicket(Boolean value) {
        setOnlinePurchaseForSelfPrintTicket(value);
        return this;
    }

    public TicketingService_VersionStructure withMobileDeviceTickets(Boolean value) {
        setMobileDeviceTickets(value);
        return this;
    }

    public TicketingService_VersionStructure withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    public TicketingService_VersionStructure withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public TicketingService_VersionStructure withTypesOfServiceFeature(TypeOfServiceFeatureRefs_RelStructure value) {
        setTypesOfServiceFeature(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TicketingService_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TicketingService_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TicketingService_VersionStructure withId(String value) {
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
