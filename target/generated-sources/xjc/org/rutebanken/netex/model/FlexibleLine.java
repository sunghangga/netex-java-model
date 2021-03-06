//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FlexibleLine_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LineGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FlexibleLineGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}FlexibleLineIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FlexibleLine
    extends FlexibleLine_VersionStructure
{


    @Override
    public FlexibleLine withFlexibleLineType(FlexibleLineTypeEnumeration value) {
        setFlexibleLineType(value);
        return this;
    }

    @Override
    public FlexibleLine withBookingContact(ContactStructure value) {
        setBookingContact(value);
        return this;
    }

    @Override
    public FlexibleLine withBookingMethods(BookingMethodEnumeration... values) {
        if (values!= null) {
            for (BookingMethodEnumeration value: values) {
                getBookingMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLine withBookingMethods(Collection<BookingMethodEnumeration> values) {
        if (values!= null) {
            getBookingMethods().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLine withBookingAccess(BookingAccessEnumeration value) {
        setBookingAccess(value);
        return this;
    }

    @Override
    public FlexibleLine withBookWhen(PurchaseWhenEnumeration value) {
        setBookWhen(value);
        return this;
    }

    @Override
    public FlexibleLine withBuyWhen(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getBuyWhen().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLine withBuyWhen(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getBuyWhen().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLine withLatestBookingTime(LocalTime value) {
        setLatestBookingTime(value);
        return this;
    }

    @Override
    public FlexibleLine withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    @Override
    public FlexibleLine withBookingUrl(String value) {
        setBookingUrl(value);
        return this;
    }

    @Override
    public FlexibleLine withBookingNote(MultilingualString value) {
        setBookingNote(value);
        return this;
    }

    @Override
    public FlexibleLine withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FlexibleLine withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public FlexibleLine withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public FlexibleLine withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public FlexibleLine withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public FlexibleLine withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public FlexibleLine withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public FlexibleLine withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public FlexibleLine withExternalLineRef(ExternalObjectRefStructure value) {
        setExternalLineRef(value);
        return this;
    }

    @Override
    public FlexibleLine withAuthorityRef(AuthorityRefStructure value) {
        setAuthorityRef(value);
        return this;
    }

    @Override
    public FlexibleLine withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public FlexibleLine withAdditionalOperators(TransportOrganisationRefs_RelStructure value) {
        setAdditionalOperators(value);
        return this;
    }

    @Override
    public FlexibleLine withOtherModes(ModeRefs_RelStructure value) {
        setOtherModes(value);
        return this;
    }

    @Override
    public FlexibleLine withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public FlexibleLine withLineType(LineTypeEnumeration value) {
        setLineType(value);
        return this;
    }

    @Override
    public FlexibleLine withTypeOfLineRef(TypeOfLineRefStructure value) {
        setTypeOfLineRef(value);
        return this;
    }

    @Override
    public FlexibleLine withExternalProductCategoryRef(ExternalObjectRefStructure value) {
        setExternalProductCategoryRef(value);
        return this;
    }

    @Override
    public FlexibleLine withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public FlexibleLine withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public FlexibleLine withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public FlexibleLine withRoutes(RouteRefs_RelStructure value) {
        setRoutes(value);
        return this;
    }

    @Override
    public FlexibleLine withRepresentedByGroupRef(GroupOfLinesRefStructure value) {
        setRepresentedByGroupRef(value);
        return this;
    }

    @Override
    public FlexibleLine withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    @Override
    public FlexibleLine withAlternativePresentation(PresentationStructure value) {
        setAlternativePresentation(value);
        return this;
    }

    @Override
    public FlexibleLine withPrintedPresentation(PrintPresentationStructure value) {
        setPrintedPresentation(value);
        return this;
    }

    @Override
    public FlexibleLine withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLine withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLine withTypesOfPaymentMethod(TypeOfPaymentMethod_ValueStructure value) {
        setTypesOfPaymentMethod(value);
        return this;
    }

    @Override
    public FlexibleLine withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLine withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getPurchaseMoment().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLine withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public FlexibleLine withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public FlexibleLine withAllowedDirections(AllowedLineDirections_RelStructure value) {
        setAllowedDirections(value);
        return this;
    }

    @Override
    public FlexibleLine withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public FlexibleLine withDocumentLinks(InfoLinks_RelStructure value) {
        setDocumentLinks(value);
        return this;
    }

    @Override
    public FlexibleLine withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FlexibleLine withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FlexibleLine withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FlexibleLine withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FlexibleLine withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FlexibleLine withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLine withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLine withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FlexibleLine withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FlexibleLine withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FlexibleLine withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FlexibleLine withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FlexibleLine withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlexibleLine withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleLine withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleLine withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FlexibleLine withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FlexibleLine withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FlexibleLine withId(String value) {
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
