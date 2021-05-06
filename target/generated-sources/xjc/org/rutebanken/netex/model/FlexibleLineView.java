//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
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
 *     &lt;extension base="{http://www.netex.org.uk/netex}FlexibleLine_DerivedViewStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class FlexibleLineView
    extends FlexibleLine_DerivedViewStructure
{


    @Override
    public FlexibleLineView withFlexibleLineType(FlexibleLineTypeEnumeration value) {
        setFlexibleLineType(value);
        return this;
    }

    @Override
    public FlexibleLineView withBookingContact(ContactStructure value) {
        setBookingContact(value);
        return this;
    }

    @Override
    public FlexibleLineView withBookingMethods(BookingMethodEnumeration... values) {
        if (values!= null) {
            for (BookingMethodEnumeration value: values) {
                getBookingMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLineView withBookingMethods(Collection<BookingMethodEnumeration> values) {
        if (values!= null) {
            getBookingMethods().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLineView withBookingAccess(BookingAccessEnumeration value) {
        setBookingAccess(value);
        return this;
    }

    @Override
    public FlexibleLineView withBookWhen(PurchaseWhenEnumeration value) {
        setBookWhen(value);
        return this;
    }

    @Override
    public FlexibleLineView withBuyWhen(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getBuyWhen().add(value);
            }
        }
        return this;
    }

    @Override
    public FlexibleLineView withBuyWhen(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getBuyWhen().addAll(values);
        }
        return this;
    }

    @Override
    public FlexibleLineView withLatestBookingTime(LocalTime value) {
        setLatestBookingTime(value);
        return this;
    }

    @Override
    public FlexibleLineView withMinimumBookingPeriod(Duration value) {
        setMinimumBookingPeriod(value);
        return this;
    }

    @Override
    public FlexibleLineView withBookingUrl(String value) {
        setBookingUrl(value);
        return this;
    }

    @Override
    public FlexibleLineView withBookingNote(MultilingualString value) {
        setBookingNote(value);
        return this;
    }

    @Override
    public FlexibleLineView withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public FlexibleLineView withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public FlexibleLineView withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public FlexibleLineView withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public FlexibleLineView withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public FlexibleLineView withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public FlexibleLineView withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public FlexibleLineView withTypeOfLineRef(TypeOfLineRefStructure value) {
        setTypeOfLineRef(value);
        return this;
    }

    @Override
    public FlexibleLineView withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public FlexibleLineView withId(String value) {
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
