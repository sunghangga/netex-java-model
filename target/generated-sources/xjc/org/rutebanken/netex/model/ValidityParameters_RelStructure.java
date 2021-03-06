//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for validityParameters_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validityParameters_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ScopingValidityParametersGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityParameters_RelStructure", propOrder = {
    "vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef"
})
public class ValidityParameters_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "TypeOfFareStructureElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfDistributionChannelsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RoutingType", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PassengerSeatRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransportSubmode", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareClass", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DistributionChannelRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PlaceUse", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChargingMomentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfFareProductRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleModes", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FulfilmentMethodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SeriesConstraintRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfMachineReadabilityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfServicesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfProductCategoryRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfConcessionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FacilitySetRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VehicleTypeRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Directions", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TariffZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceJourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfFareStructureFactorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllAuthoritiesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TopographicPlaceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareSectionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AllOperatorsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfLinesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AuthorityRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainNumberRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainComponentLabelAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfUsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ClassOfUseRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfServiceRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfSalesOfferPackageRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FareZoneRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfPaymentMethodRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfTariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfPricingRuleRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PointOfInterestClassificationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfOperatorsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfTravelDocumentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AddressRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfLineRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "OperatorRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SiteElementRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef;

    /**
     * Gets the value of the vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RoadAddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistributionChannelsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingTypeEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPositionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PassengerSeatRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportSubmodeStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LimitingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareClassEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link DistributionChannelRefStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link PlaceUseEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMomentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProductRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundTrainRef }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link VehicleModeEnumeration }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link FulfilmentMethodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SeriesConstraintRef }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfServicesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProductCategoryRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfConcessionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessSpaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleTypeRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RelativeDirectionEnumeration }{@code >}
     * {@link JAXBElement }{@code <}{@link TariffZoneRef }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteComponentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link QuayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceVehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainElementRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingPassengerEntranceRef }{@code >}
     * {@link JAXBElement }{@code <}{@link BoardingPositionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TopographicPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestVehicleEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareSectionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PostalAddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AllTransportOrganisationsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfLinesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PricingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainNumberRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceSiteRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingBayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainComponentLabelAssignmentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfUsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFacilitySetRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassOfUseRef }{@code >}
     * {@link JAXBElement }{@code <}{@link EntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackageRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingEntranceForVehiclesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FareZoneRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPaymentMethodRef }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceEntranceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FlexibleLineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassificationRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfOperatorsRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocumentRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link VehicleStoppingPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLineRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscountingRuleRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link StopPlaceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SiteElementRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef() {
        if (vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef == null) {
            vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef = new ArrayList<JAXBElement<?>>();
        }
        return this.vehicleModesAndTransportSubmodeAndGroupOfOperatorsRef;
    }

    public ValidityParameters_RelStructure withVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef().add(value);
            }
        }
        return this;
    }

    public ValidityParameters_RelStructure withVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getVehicleModesAndTransportSubmodeAndGroupOfOperatorsRef().addAll(values);
        }
        return this;
    }

    @Override
    public ValidityParameters_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public ValidityParameters_RelStructure withId(String value) {
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
