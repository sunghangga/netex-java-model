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
 * <p>Java class for usageParameters_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usageParameters_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameterRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}UsageParameter_"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usageParameters_RelStructure", propOrder = {
    "usageParameterRefOrUsageParameter_"
})
public class UsageParameters_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "UsageParameter_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UsageParameterRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> usageParameterRefOrUsageParameter_;

    /**
     * Gets the value of the usageParameterRefOrUsageParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageParameterRefOrUsageParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageParameterRefOrUsageParameter_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CompanionProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link Cancelling }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicket }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReservingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowanceRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindow }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimit }{@code >}
     * {@link JAXBElement }{@code <}{@link Exchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTrip }{@code >}
     * {@link JAXBElement }{@code <}{@link PurchaseWindowRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Reselling }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Reserving }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link StepLimitRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link LuggageAllowance }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUse }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferabilityRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ResellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscribingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundTripRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Refunding }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTicketRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link RefundingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link FrequencyOfUseRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriod }{@code >}
     * {@link JAXBElement }{@code <}{@link InterchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Transferability }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link PenaltyPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStay }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link MinimumStayRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequiredRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Interchanging }{@code >}
     * {@link JAXBElement }{@code <}{@link ChargingPolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CancellingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SuspendingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplacingRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link EntitlementGiven }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageValidityPeriodRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementRequired }{@code >}
     * {@link JAXBElement }{@code <}{@link SalesOfferPackageEntitlementGivenRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Suspending }{@code >}
     * {@link JAXBElement }{@code <}{@link Subscribing }{@code >}
     * {@link JAXBElement }{@code <}{@link Routing }{@code >}
     * {@link JAXBElement }{@code <}{@link UsageParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link UserProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CompanionProfileRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CommercialProfile }{@code >}
     * {@link JAXBElement }{@code <}{@link EligibilityChangePolicyRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Replacing }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUsageParameterRefOrUsageParameter_() {
        if (usageParameterRefOrUsageParameter_ == null) {
            usageParameterRefOrUsageParameter_ = new ArrayList<JAXBElement<?>>();
        }
        return this.usageParameterRefOrUsageParameter_;
    }

    public UsageParameters_RelStructure withUsageParameterRefOrUsageParameter_(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getUsageParameterRefOrUsageParameter_().add(value);
            }
        }
        return this;
    }

    public UsageParameters_RelStructure withUsageParameterRefOrUsageParameter_(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getUsageParameterRefOrUsageParameter_().addAll(values);
        }
        return this;
    }

    @Override
    public UsageParameters_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public UsageParameters_RelStructure withId(String value) {
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
