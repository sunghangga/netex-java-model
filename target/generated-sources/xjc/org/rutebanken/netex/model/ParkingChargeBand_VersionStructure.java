//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ParkingChargeBand_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingChargeBand_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}TimeStructureFactor_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ParkingChargeBandGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingChargeBand_VersionStructure", propOrder = {
    "parkingPropertiesRef",
    "parkingVehicleType",
    "vehicleTypeRef",
    "maximumStay",
    "prices"
})
@XmlSeeAlso({
    ParkingChargeBand.class
})
public class ParkingChargeBand_VersionStructure
    extends TimeStructureFactor_VersionStructure
{

    @XmlElement(name = "ParkingPropertiesRef")
    protected ParkingPropertiesRefStructure parkingPropertiesRef;
    @XmlElement(name = "ParkingVehicleType")
    @XmlSchemaType(name = "string")
    protected ParkingVehicleEnumeration parkingVehicleType;
    @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends VehicleTypeRefStructure> vehicleTypeRef;
    @XmlElement(name = "MaximumStay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumStay;
    protected FarePrices_RelStructure prices;

    /**
     * Gets the value of the parkingPropertiesRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public ParkingPropertiesRefStructure getParkingPropertiesRef() {
        return parkingPropertiesRef;
    }

    /**
     * Sets the value of the parkingPropertiesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingPropertiesRefStructure }
     *     
     */
    public void setParkingPropertiesRef(ParkingPropertiesRefStructure value) {
        this.parkingPropertiesRef = value;
    }

    /**
     * Gets the value of the parkingVehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public ParkingVehicleEnumeration getParkingVehicleType() {
        return parkingVehicleType;
    }

    /**
     * Sets the value of the parkingVehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingVehicleEnumeration }
     *     
     */
    public void setParkingVehicleType(ParkingVehicleEnumeration value) {
        this.parkingVehicleType = value;
    }

    /**
     * Gets the value of the vehicleTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public JAXBElement<? extends VehicleTypeRefStructure> getVehicleTypeRef() {
        return vehicleTypeRef;
    }

    /**
     * Sets the value of the vehicleTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     *     
     */
    public void setVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        this.vehicleTypeRef = value;
    }

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link FarePrices_RelStructure }
     *     
     */
    public FarePrices_RelStructure getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePrices_RelStructure }
     *     
     */
    public void setPrices(FarePrices_RelStructure value) {
        this.prices = value;
    }

    public ParkingChargeBand_VersionStructure withParkingPropertiesRef(ParkingPropertiesRefStructure value) {
        setParkingPropertiesRef(value);
        return this;
    }

    public ParkingChargeBand_VersionStructure withParkingVehicleType(ParkingVehicleEnumeration value) {
        setParkingVehicleType(value);
        return this;
    }

    public ParkingChargeBand_VersionStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    public ParkingChargeBand_VersionStructure withMaximumStay(Duration value) {
        setMaximumStay(value);
        return this;
    }

    public ParkingChargeBand_VersionStructure withPrices(FarePrices_RelStructure value) {
        setPrices(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withTariffRef(JAXBElement<? extends TariffRefStructure> value) {
        setTariffRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withTimeIntervalRef(TimeIntervalRefStructure value) {
        setTimeIntervalRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withTimeUnitRef(TimeUnitRefStructure value) {
        setTimeUnitRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withQualityStructureFactorRef(JAXBElement<? extends QualityStructureFactorRefStructure> value) {
        setQualityStructureFactorRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withTypeOfFareStructureFactorRef(TypeOfFareStructureFactorRefStructure value) {
        setTypeOfFareStructureFactorRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withFactor(Object value) {
        setFactor(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withInfoLinks(org.rutebanken.netex.model.PriceableObject_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withPricingServiceRef(PricingServiceRefStructure value) {
        setPricingServiceRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withPricingRuleRef(JAXBElement<? extends PricingRuleRefStructure> value) {
        setPricingRuleRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withPriceGroups(PriceGroups_RelStructure value) {
        setPriceGroups(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withFareTables(FareTables_RelStructure value) {
        setFareTables(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ParkingChargeBand_VersionStructure withId(String value) {
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
