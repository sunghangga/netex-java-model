//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for FareTableSpecificsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareTableSpecificsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificNetworkGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificRoutingGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificServiceGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}CellSpecificDistributionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareTableSpecificsStructure", propOrder = {
    "operatorRef",
    "groupOfLinesRef",
    "lineRef",
    "siteRef",
    "tariffZoneRef",
    "fareSectionRef",
    "directionType",
    "routingType",
    "fareClass",
    "classOfUseRef",
    "facilitySetRef",
    "typeOfProductCategoryRef",
    "typeOfServiceRef",
    "serviceJourneyRef",
    "trainNumberRef",
    "groupOfServicesRef",
    "typeOfFareProductRef",
    "distributionChannelRef",
    "groupOfDistributionChannelsRef",
    "paymentMethod",
    "typeOfPaymentMethodRef",
    "typeOfTravelDocumentRef"
})
@XmlSeeAlso({
    org.rutebanken.netex.model.FareTable_VersionStructure.Specifics.class
})
public class FareTableSpecificsStructure {

    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends GroupOfLinesRefStructure> groupOfLinesRef;
    @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LineRefStructure> lineRef;
    @XmlElementRef(name = "SiteRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SiteRefStructure> siteRef;
    @XmlElement(name = "TariffZoneRef")
    protected TariffZoneRef tariffZoneRef;
    @XmlElement(name = "FareSectionRef")
    protected FareSectionRefStructure fareSectionRef;
    @XmlElement(name = "DirectionType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RelativeDirectionEnumeration directionType;
    @XmlElement(name = "RoutingType", defaultValue = "both")
    @XmlSchemaType(name = "normalizedString")
    protected RoutingTypeEnumeration routingType;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FacilitySetRefStructure> facilitySetRef;
    @XmlElement(name = "TypeOfProductCategoryRef")
    protected TypeOfProductCategoryRefStructure typeOfProductCategoryRef;
    @XmlElement(name = "TypeOfServiceRef")
    protected TypeOfServiceRefStructure typeOfServiceRef;
    @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ServiceJourneyRefStructure> serviceJourneyRef;
    @XmlElement(name = "TrainNumberRef")
    protected TrainNumberRefStructure trainNumberRef;
    @XmlElement(name = "GroupOfServicesRef")
    protected GroupOfServicesRefStructure groupOfServicesRef;
    @XmlElement(name = "TypeOfFareProductRef")
    protected TypeOfFareProductRefStructure typeOfFareProductRef;
    @XmlElement(name = "DistributionChannelRef")
    protected DistributionChannelRefStructureElement distributionChannelRef;
    @XmlElement(name = "GroupOfDistributionChannelsRef")
    protected GroupOfDistributionChannelsRefStructure groupOfDistributionChannelsRef;
    @XmlElement(name = "PaymentMethod")
    @XmlSchemaType(name = "normalizedString")
    protected PaymentMethodEnumeration paymentMethod;
    @XmlElement(name = "TypeOfPaymentMethodRef")
    protected TypeOfPaymentMethodRef typeOfPaymentMethodRef;
    @XmlElement(name = "TypeOfTravelDocumentRef")
    protected TypeOfTravelDocumentRefStructure typeOfTravelDocumentRef;

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the groupOfLinesRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends GroupOfLinesRefStructure> getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Sets the value of the groupOfLinesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     *     
     */
    public void setGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        this.groupOfLinesRef = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends LineRefStructure> getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     *     
     */
    public void setLineRef(JAXBElement<? extends LineRefStructure> value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the siteRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends SiteRefStructure> getSiteRef() {
        return siteRef;
    }

    /**
     * Sets the value of the siteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     *     
     */
    public void setSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        this.siteRef = value;
    }

    /**
     * Gets the value of the tariffZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRef }
     *     
     */
    public TariffZoneRef getTariffZoneRef() {
        return tariffZoneRef;
    }

    /**
     * Sets the value of the tariffZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRef }
     *     
     */
    public void setTariffZoneRef(TariffZoneRef value) {
        this.tariffZoneRef = value;
    }

    /**
     * Gets the value of the fareSectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public FareSectionRefStructure getFareSectionRef() {
        return fareSectionRef;
    }

    /**
     * Sets the value of the fareSectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSectionRefStructure }
     *     
     */
    public void setFareSectionRef(FareSectionRefStructure value) {
        this.fareSectionRef = value;
    }

    /**
     * Gets the value of the directionType property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDirectionEnumeration }
     *     
     */
    public RelativeDirectionEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Sets the value of the directionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDirectionEnumeration }
     *     
     */
    public void setDirectionType(RelativeDirectionEnumeration value) {
        this.directionType = value;
    }

    /**
     * Gets the value of the routingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public RoutingTypeEnumeration getRoutingType() {
        return routingType;
    }

    /**
     * Sets the value of the routingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingTypeEnumeration }
     *     
     */
    public void setRoutingType(RoutingTypeEnumeration value) {
        this.routingType = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Gets the value of the facilitySetRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FacilitySetRefStructure> getFacilitySetRef() {
        return facilitySetRef;
    }

    /**
     * Sets the value of the facilitySetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     *     
     */
    public void setFacilitySetRef(JAXBElement<? extends FacilitySetRefStructure> value) {
        this.facilitySetRef = value;
    }

    /**
     * Gets the value of the typeOfProductCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public TypeOfProductCategoryRefStructure getTypeOfProductCategoryRef() {
        return typeOfProductCategoryRef;
    }

    /**
     * Sets the value of the typeOfProductCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfProductCategoryRefStructure }
     *     
     */
    public void setTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        this.typeOfProductCategoryRef = value;
    }

    /**
     * Gets the value of the typeOfServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public TypeOfServiceRefStructure getTypeOfServiceRef() {
        return typeOfServiceRef;
    }

    /**
     * Sets the value of the typeOfServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfServiceRefStructure }
     *     
     */
    public void setTypeOfServiceRef(TypeOfServiceRefStructure value) {
        this.typeOfServiceRef = value;
    }

    /**
     * Gets the value of the serviceJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends ServiceJourneyRefStructure> getServiceJourneyRef() {
        return serviceJourneyRef;
    }

    /**
     * Sets the value of the serviceJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     
     */
    public void setServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        this.serviceJourneyRef = value;
    }

    /**
     * Gets the value of the trainNumberRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public TrainNumberRefStructure getTrainNumberRef() {
        return trainNumberRef;
    }

    /**
     * Sets the value of the trainNumberRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainNumberRefStructure }
     *     
     */
    public void setTrainNumberRef(TrainNumberRefStructure value) {
        this.trainNumberRef = value;
    }

    /**
     * Gets the value of the groupOfServicesRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public GroupOfServicesRefStructure getGroupOfServicesRef() {
        return groupOfServicesRef;
    }

    /**
     * Sets the value of the groupOfServicesRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesRefStructure }
     *     
     */
    public void setGroupOfServicesRef(GroupOfServicesRefStructure value) {
        this.groupOfServicesRef = value;
    }

    /**
     * Gets the value of the typeOfFareProductRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public TypeOfFareProductRefStructure getTypeOfFareProductRef() {
        return typeOfFareProductRef;
    }

    /**
     * Sets the value of the typeOfFareProductRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFareProductRefStructure }
     *     
     */
    public void setTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        this.typeOfFareProductRef = value;
    }

    /**
     * Gets the value of the distributionChannelRef property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelRefStructureElement }
     *     
     */
    public DistributionChannelRefStructureElement getDistributionChannelRef() {
        return distributionChannelRef;
    }

    /**
     * Sets the value of the distributionChannelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelRefStructureElement }
     *     
     */
    public void setDistributionChannelRef(DistributionChannelRefStructureElement value) {
        this.distributionChannelRef = value;
    }

    /**
     * Gets the value of the groupOfDistributionChannelsRef property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfDistributionChannelsRefStructure }
     *     
     */
    public GroupOfDistributionChannelsRefStructure getGroupOfDistributionChannelsRef() {
        return groupOfDistributionChannelsRef;
    }

    /**
     * Sets the value of the groupOfDistributionChannelsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfDistributionChannelsRefStructure }
     *     
     */
    public void setGroupOfDistributionChannelsRef(GroupOfDistributionChannelsRefStructure value) {
        this.groupOfDistributionChannelsRef = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public PaymentMethodEnumeration getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodEnumeration }
     *     
     */
    public void setPaymentMethod(PaymentMethodEnumeration value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the typeOfPaymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public TypeOfPaymentMethodRef getTypeOfPaymentMethodRef() {
        return typeOfPaymentMethodRef;
    }

    /**
     * Sets the value of the typeOfPaymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPaymentMethodRef }
     *     
     */
    public void setTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        this.typeOfPaymentMethodRef = value;
    }

    /**
     * Gets the value of the typeOfTravelDocumentRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public TypeOfTravelDocumentRefStructure getTypeOfTravelDocumentRef() {
        return typeOfTravelDocumentRef;
    }

    /**
     * Sets the value of the typeOfTravelDocumentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfTravelDocumentRefStructure }
     *     
     */
    public void setTypeOfTravelDocumentRef(TypeOfTravelDocumentRefStructure value) {
        this.typeOfTravelDocumentRef = value;
    }

    public FareTableSpecificsStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public FareTableSpecificsStructure withGroupOfLinesRef(JAXBElement<? extends GroupOfLinesRefStructure> value) {
        setGroupOfLinesRef(value);
        return this;
    }

    public FareTableSpecificsStructure withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    public FareTableSpecificsStructure withSiteRef(JAXBElement<? extends SiteRefStructure> value) {
        setSiteRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTariffZoneRef(TariffZoneRef value) {
        setTariffZoneRef(value);
        return this;
    }

    public FareTableSpecificsStructure withFareSectionRef(FareSectionRefStructure value) {
        setFareSectionRef(value);
        return this;
    }

    public FareTableSpecificsStructure withDirectionType(RelativeDirectionEnumeration value) {
        setDirectionType(value);
        return this;
    }

    public FareTableSpecificsStructure withRoutingType(RoutingTypeEnumeration value) {
        setRoutingType(value);
        return this;
    }

    public FareTableSpecificsStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public FareTableSpecificsStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public FareTableSpecificsStructure withFacilitySetRef(JAXBElement<? extends FacilitySetRefStructure> value) {
        setFacilitySetRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    public FareTableSpecificsStructure withServiceJourneyRef(JAXBElement<? extends ServiceJourneyRefStructure> value) {
        setServiceJourneyRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    public FareTableSpecificsStructure withGroupOfServicesRef(GroupOfServicesRefStructure value) {
        setGroupOfServicesRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTypeOfFareProductRef(TypeOfFareProductRefStructure value) {
        setTypeOfFareProductRef(value);
        return this;
    }

    public FareTableSpecificsStructure withDistributionChannelRef(DistributionChannelRefStructureElement value) {
        setDistributionChannelRef(value);
        return this;
    }

    public FareTableSpecificsStructure withGroupOfDistributionChannelsRef(GroupOfDistributionChannelsRefStructure value) {
        setGroupOfDistributionChannelsRef(value);
        return this;
    }

    public FareTableSpecificsStructure withPaymentMethod(PaymentMethodEnumeration value) {
        setPaymentMethod(value);
        return this;
    }

    public FareTableSpecificsStructure withTypeOfPaymentMethodRef(TypeOfPaymentMethodRef value) {
        setTypeOfPaymentMethodRef(value);
        return this;
    }

    public FareTableSpecificsStructure withTypeOfTravelDocumentRef(TypeOfTravelDocumentRefStructure value) {
        setTypeOfTravelDocumentRef(value);
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