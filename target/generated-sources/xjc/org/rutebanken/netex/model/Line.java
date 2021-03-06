//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Line_VersionStructure"&gt;
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}LineIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Line
    extends Line_VersionStructure
{


    @Override
    public Line withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Line withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Line withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Line withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public Line withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public Line withUrl(String value) {
        setUrl(value);
        return this;
    }

    @Override
    public Line withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public Line withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Line withExternalLineRef(ExternalObjectRefStructure value) {
        setExternalLineRef(value);
        return this;
    }

    @Override
    public Line withAuthorityRef(AuthorityRefStructure value) {
        setAuthorityRef(value);
        return this;
    }

    @Override
    public Line withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public Line withAdditionalOperators(TransportOrganisationRefs_RelStructure value) {
        setAdditionalOperators(value);
        return this;
    }

    @Override
    public Line withOtherModes(ModeRefs_RelStructure value) {
        setOtherModes(value);
        return this;
    }

    @Override
    public Line withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public Line withLineType(LineTypeEnumeration value) {
        setLineType(value);
        return this;
    }

    @Override
    public Line withTypeOfLineRef(TypeOfLineRefStructure value) {
        setTypeOfLineRef(value);
        return this;
    }

    @Override
    public Line withExternalProductCategoryRef(ExternalObjectRefStructure value) {
        setExternalProductCategoryRef(value);
        return this;
    }

    @Override
    public Line withTypeOfProductCategoryRef(TypeOfProductCategoryRefStructure value) {
        setTypeOfProductCategoryRef(value);
        return this;
    }

    @Override
    public Line withTypeOfServiceRef(TypeOfServiceRefStructure value) {
        setTypeOfServiceRef(value);
        return this;
    }

    @Override
    public Line withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    @Override
    public Line withRoutes(RouteRefs_RelStructure value) {
        setRoutes(value);
        return this;
    }

    @Override
    public Line withRepresentedByGroupRef(GroupOfLinesRefStructure value) {
        setRepresentedByGroupRef(value);
        return this;
    }

    @Override
    public Line withPresentation(PresentationStructure value) {
        setPresentation(value);
        return this;
    }

    @Override
    public Line withAlternativePresentation(PresentationStructure value) {
        setAlternativePresentation(value);
        return this;
    }

    @Override
    public Line withPrintedPresentation(PrintPresentationStructure value) {
        setPrintedPresentation(value);
        return this;
    }

    @Override
    public Line withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public Line withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public Line withTypesOfPaymentMethod(TypeOfPaymentMethod_ValueStructure value) {
        setTypesOfPaymentMethod(value);
        return this;
    }

    @Override
    public Line withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    @Override
    public Line withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getPurchaseMoment().addAll(values);
        }
        return this;
    }

    @Override
    public Line withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public Line withAccessibilityAssessment(AccessibilityAssessment value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public Line withAllowedDirections(AllowedLineDirections_RelStructure value) {
        setAllowedDirections(value);
        return this;
    }

    @Override
    public Line withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Line withDocumentLinks(InfoLinks_RelStructure value) {
        setDocumentLinks(value);
        return this;
    }

    @Override
    public Line withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Line withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Line withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Line withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Line withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Line withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Line withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Line withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Line withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Line withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Line withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Line withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Line withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Line withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Line withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Line withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Line withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Line withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Line withId(String value) {
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
