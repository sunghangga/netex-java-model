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
 * <p>Java class for typesOfValueInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typesOfValueInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValueSet"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfValue"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typesOfValueInFrame_RelStructure", propOrder = {
    "valueSetOrTypeOfValue"
})
public class TypesOfValueInFrame_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ValueSet", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TypeOfValue", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends DataManagedObjectStructure>> valueSetOrTypeOfValue;

    /**
     * Gets the value of the valueSetOrTypeOfValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueSetOrTypeOfValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueSetOrTypeOfValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TypeOfTravelDocument }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEntity_VersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueSet }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureFactor }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPlace }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfMachineReadability }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfActivation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfUsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTariff }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPassengerInformationEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfResponsibilityRole }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareProduct }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOperation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCodespaceAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link OpenTransportMode }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContract }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareStructureElement }{@code >}
     * {@link JAXBElement }{@code <}{@link PointOfInterestClassification }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPricingRule }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCustomerAccount }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProductCategory }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfGrouping }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfProjection }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisationPart }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareTable }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerAccountStatus }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLink }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFacility }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLinkSequence }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfZone }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfLine }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfCongestion }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfEquipment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPoint }{@code >}
     * {@link JAXBElement }{@code <}{@link Direction }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfAccessRightAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataSource }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfPaymentMethod }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValue_VersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSalesOfferPackage }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfOrganisation }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfJourneyPattern }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceUnit }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTransfer }{@code >}
     * {@link JAXBElement }{@code <}{@link Submode }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfServiceFeature }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfRetailDevice }{@code >}
     * {@link JAXBElement }{@code <}{@link Branding }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfValidity }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfNotice }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingMoment }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFlexibleService }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfTimeDemandType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimingAlgorithmType }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfEquipmentProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfConcession }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfDeliveryVariant }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFareContractEntry }{@code >}
     * {@link JAXBElement }{@code <}{@link PurposeOfJourneyPartition }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfSecurityList }{@code >}
     * {@link JAXBElement }{@code <}{@link TypeOfFrame }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getValueSetOrTypeOfValue() {
        if (valueSetOrTypeOfValue == null) {
            valueSetOrTypeOfValue = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.valueSetOrTypeOfValue;
    }

    public TypesOfValueInFrame_RelStructure withValueSetOrTypeOfValue(JAXBElement<? extends DataManagedObjectStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends DataManagedObjectStructure> value: values) {
                getValueSetOrTypeOfValue().add(value);
            }
        }
        return this;
    }

    public TypesOfValueInFrame_RelStructure withValueSetOrTypeOfValue(Collection<JAXBElement<? extends DataManagedObjectStructure>> values) {
        if (values!= null) {
            getValueSetOrTypeOfValue().addAll(values);
        }
        return this;
    }

    @Override
    public TypesOfValueInFrame_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public TypesOfValueInFrame_RelStructure withId(String value) {
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