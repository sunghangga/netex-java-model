//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for TicketingEquipment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingEquipment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}InstalledEquipment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TicketingEquipmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingEquipment_VersionStructure", propOrder = {
    "vehicleModes",
    "ticketMachines",
    "numberOfMachines",
    "heightOfMachineInterface",
    "ticketingFacilityList",
    "ticketingServiceFacilityList",
    "ticketOffice",
    "ticketCounter",
    "numberOfTills",
    "queueManagement",
    "paymentMethods",
    "ticketTypesAvailable",
    "scopeOfTicketsAvailable",
    "lowCounterAccess",
    "heightOfLowCounter",
    "inductionLoops",
    "tactileInterfaceAvailable",
    "audioInterfaceAvailable",
    "disabledPriority",
    "wheelchairSuitable"
})
@XmlSeeAlso({
    TicketingEquipment.class
})
public class TicketingEquipment_VersionStructure
    extends InstalledEquipment_VersionStructure
{

    @XmlList
    @XmlElement(name = "VehicleModes")
    protected List<VehicleModeEnumeration> vehicleModes;
    @XmlElement(name = "TicketMachines")
    protected Boolean ticketMachines;
    @XmlElement(name = "NumberOfMachines")
    protected BigInteger numberOfMachines;
    @XmlElement(name = "HeightOfMachineInterface")
    protected BigDecimal heightOfMachineInterface;
    @XmlList
    @XmlElement(name = "TicketingFacilityList")
    protected List<TicketingFacilityEnumeration> ticketingFacilityList;
    @XmlList
    @XmlElement(name = "TicketingServiceFacilityList")
    protected List<TicketingServiceFacilityEnumeration> ticketingServiceFacilityList;
    @XmlElement(name = "TicketOffice")
    protected Boolean ticketOffice;
    @XmlElement(name = "TicketCounter")
    protected Boolean ticketCounter;
    @XmlElement(name = "NumberOfTills")
    protected BigInteger numberOfTills;
    @XmlElement(name = "QueueManagement")
    @XmlSchemaType(name = "normalizedString")
    protected QueueManagementEnumeration queueManagement;
    @XmlList
    @XmlElement(name = "PaymentMethods")
    protected List<PaymentMethodEnumeration> paymentMethods;
    @XmlList
    @XmlElement(name = "TicketTypesAvailable")
    protected List<TicketTypeEnumeration> ticketTypesAvailable;
    @XmlList
    @XmlElement(name = "ScopeOfTicketsAvailable")
    protected List<TicketingFacilityEnumeration> scopeOfTicketsAvailable;
    @XmlElement(name = "LowCounterAccess")
    protected Boolean lowCounterAccess;
    @XmlElement(name = "HeightOfLowCounter")
    protected BigDecimal heightOfLowCounter;
    @XmlElement(name = "InductionLoops")
    protected Boolean inductionLoops;
    @XmlElement(name = "TactileInterfaceAvailable")
    protected Boolean tactileInterfaceAvailable;
    @XmlElement(name = "AudioInterfaceAvailable")
    protected Boolean audioInterfaceAvailable;
    @XmlElement(name = "DisabledPriority")
    protected Boolean disabledPriority;
    @XmlElement(name = "WheelchairSuitable")
    protected Boolean wheelchairSuitable;

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
     * Gets the value of the ticketMachines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketMachines() {
        return ticketMachines;
    }

    /**
     * Sets the value of the ticketMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketMachines(Boolean value) {
        this.ticketMachines = value;
    }

    /**
     * Gets the value of the numberOfMachines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMachines() {
        return numberOfMachines;
    }

    /**
     * Sets the value of the numberOfMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMachines(BigInteger value) {
        this.numberOfMachines = value;
    }

    /**
     * Gets the value of the heightOfMachineInterface property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfMachineInterface() {
        return heightOfMachineInterface;
    }

    /**
     * Sets the value of the heightOfMachineInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfMachineInterface(BigDecimal value) {
        this.heightOfMachineInterface = value;
    }

    /**
     * Gets the value of the ticketingFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacilityList() {
        if (ticketingFacilityList == null) {
            ticketingFacilityList = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacilityList;
    }

    /**
     * Gets the value of the ticketingServiceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingServiceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingServiceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingServiceFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingServiceFacilityEnumeration> getTicketingServiceFacilityList() {
        if (ticketingServiceFacilityList == null) {
            ticketingServiceFacilityList = new ArrayList<TicketingServiceFacilityEnumeration>();
        }
        return this.ticketingServiceFacilityList;
    }

    /**
     * Gets the value of the ticketOffice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketOffice() {
        return ticketOffice;
    }

    /**
     * Sets the value of the ticketOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketOffice(Boolean value) {
        this.ticketOffice = value;
    }

    /**
     * Gets the value of the ticketCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketCounter() {
        return ticketCounter;
    }

    /**
     * Sets the value of the ticketCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketCounter(Boolean value) {
        this.ticketCounter = value;
    }

    /**
     * Gets the value of the numberOfTills property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTills() {
        return numberOfTills;
    }

    /**
     * Sets the value of the numberOfTills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTills(BigInteger value) {
        this.numberOfTills = value;
    }

    /**
     * Gets the value of the queueManagement property.
     * 
     * @return
     *     possible object is
     *     {@link QueueManagementEnumeration }
     *     
     */
    public QueueManagementEnumeration getQueueManagement() {
        return queueManagement;
    }

    /**
     * Sets the value of the queueManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueManagementEnumeration }
     *     
     */
    public void setQueueManagement(QueueManagementEnumeration value) {
        this.queueManagement = value;
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
     * Gets the value of the ticketTypesAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketTypesAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketTypesAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketTypeEnumeration }
     * 
     * 
     */
    public List<TicketTypeEnumeration> getTicketTypesAvailable() {
        if (ticketTypesAvailable == null) {
            ticketTypesAvailable = new ArrayList<TicketTypeEnumeration>();
        }
        return this.ticketTypesAvailable;
    }

    /**
     * Gets the value of the scopeOfTicketsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopeOfTicketsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopeOfTicketsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getScopeOfTicketsAvailable() {
        if (scopeOfTicketsAvailable == null) {
            scopeOfTicketsAvailable = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.scopeOfTicketsAvailable;
    }

    /**
     * Gets the value of the lowCounterAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowCounterAccess() {
        return lowCounterAccess;
    }

    /**
     * Sets the value of the lowCounterAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowCounterAccess(Boolean value) {
        this.lowCounterAccess = value;
    }

    /**
     * Gets the value of the heightOfLowCounter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeightOfLowCounter() {
        return heightOfLowCounter;
    }

    /**
     * Sets the value of the heightOfLowCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeightOfLowCounter(BigDecimal value) {
        this.heightOfLowCounter = value;
    }

    /**
     * Gets the value of the inductionLoops property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInductionLoops() {
        return inductionLoops;
    }

    /**
     * Sets the value of the inductionLoops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInductionLoops(Boolean value) {
        this.inductionLoops = value;
    }

    /**
     * Gets the value of the tactileInterfaceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTactileInterfaceAvailable() {
        return tactileInterfaceAvailable;
    }

    /**
     * Sets the value of the tactileInterfaceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTactileInterfaceAvailable(Boolean value) {
        this.tactileInterfaceAvailable = value;
    }

    /**
     * Gets the value of the audioInterfaceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudioInterfaceAvailable() {
        return audioInterfaceAvailable;
    }

    /**
     * Sets the value of the audioInterfaceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudioInterfaceAvailable(Boolean value) {
        this.audioInterfaceAvailable = value;
    }

    /**
     * Gets the value of the disabledPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledPriority() {
        return disabledPriority;
    }

    /**
     * Sets the value of the disabledPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledPriority(Boolean value) {
        this.disabledPriority = value;
    }

    /**
     * Gets the value of the wheelchairSuitable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairSuitable() {
        return wheelchairSuitable;
    }

    /**
     * Sets the value of the wheelchairSuitable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairSuitable(Boolean value) {
        this.wheelchairSuitable = value;
    }

    public TicketingEquipment_VersionStructure withVehicleModes(VehicleModeEnumeration... values) {
        if (values!= null) {
            for (VehicleModeEnumeration value: values) {
                getVehicleModes().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withVehicleModes(Collection<VehicleModeEnumeration> values) {
        if (values!= null) {
            getVehicleModes().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketMachines(Boolean value) {
        setTicketMachines(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withNumberOfMachines(BigInteger value) {
        setNumberOfMachines(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withHeightOfMachineInterface(BigDecimal value) {
        setHeightOfMachineInterface(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketingFacilityList(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacilityList().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketingFacilityList(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacilityList().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketingServiceFacilityList(TicketingServiceFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingServiceFacilityEnumeration value: values) {
                getTicketingServiceFacilityList().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketingServiceFacilityList(Collection<TicketingServiceFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingServiceFacilityList().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketOffice(Boolean value) {
        setTicketOffice(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketCounter(Boolean value) {
        setTicketCounter(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withNumberOfTills(BigInteger value) {
        setNumberOfTills(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withQueueManagement(QueueManagementEnumeration value) {
        setQueueManagement(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketTypesAvailable(TicketTypeEnumeration... values) {
        if (values!= null) {
            for (TicketTypeEnumeration value: values) {
                getTicketTypesAvailable().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withTicketTypesAvailable(Collection<TicketTypeEnumeration> values) {
        if (values!= null) {
            getTicketTypesAvailable().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withScopeOfTicketsAvailable(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getScopeOfTicketsAvailable().add(value);
            }
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withScopeOfTicketsAvailable(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getScopeOfTicketsAvailable().addAll(values);
        }
        return this;
    }

    public TicketingEquipment_VersionStructure withLowCounterAccess(Boolean value) {
        setLowCounterAccess(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withHeightOfLowCounter(BigDecimal value) {
        setHeightOfLowCounter(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withInductionLoops(Boolean value) {
        setInductionLoops(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withTactileInterfaceAvailable(Boolean value) {
        setTactileInterfaceAvailable(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withAudioInterfaceAvailable(Boolean value) {
        setAudioInterfaceAvailable(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withDisabledPriority(Boolean value) {
        setDisabledPriority(value);
        return this;
    }

    public TicketingEquipment_VersionStructure withWheelchairSuitable(Boolean value) {
        setWheelchairSuitable(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TicketingEquipment_VersionStructure withId(String value) {
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
