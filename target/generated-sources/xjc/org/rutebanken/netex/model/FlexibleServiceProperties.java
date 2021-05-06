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
import javax.xml.bind.JAXBElement;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}FlexibleServiceProperties_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}FlexibleServicePropertiesGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}FlexibleServicePropertiesIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FlexibleServiceProperties
    extends FlexibleServiceProperties_VersionStructure
{


    @Override
    public FlexibleServiceProperties withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withTypeOfFlexibleServiceRef(TypeOfFlexibleServiceRefStructure value) {
        setTypeOfFlexibleServiceRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withFlexibleServiceType(FlexibleServiceEnumeration value) {
        setFlexibleServiceType(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withCancellationPossible(Boolean value) {
        setCancellationPossible(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withChangeOfTimePossible(Boolean value) {
        setChangeOfTimePossible(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingContact(ContactStructure value) {
        setBookingContact(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingMethods(BookingMethodEnumeration... values) {
        if (values!= null) {
            for (BookingMethodEnumeration value: values) {
                getBookingMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingMethods(Collection<BookingMethodEnumeration> values) {
        if (values!= null) {
            getBookingMethods().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingAccess(BookingAccessEnumeration value) {
        setBookingAccess(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookWhen(PurchaseWhenEnumeration value) {
        setBookWhen(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBuyWhen(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getBuyWhen().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withBuyWhen(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getBuyWhen().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withLatestBookingTime(LocalTime value) {
        setLatestBookingTime(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingUrl(String value) {
        setBookingUrl(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBookingNote(MultilingualString value) {
        setBookingNote(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleServiceProperties withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FlexibleServiceProperties withId(String value) {
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