//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}PassengerStopAssignment_DerivedViewStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DerivedViewGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}PassengerStopAssignmentRef" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.netex.org.uk/netex}StopPlaceRef" minOccurs="0"/&gt;
 *           &lt;element name="QuayRef" type="{http://www.netex.org.uk/netex}QuayRefStructure" minOccurs="0"/&gt;
 *           &lt;element name="QuayName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *           &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}PassengerStopAssignmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class QuayAssignmentView
    extends PassengerStopAssignment_DerivedViewStructure
{


    @Override
    public QuayAssignmentView withPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        setPassengerStopAssignmentRef(value);
        return this;
    }

    @Override
    public QuayAssignmentView withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    @Override
    public QuayAssignmentView withQuayRef(QuayRefStructure value) {
        setQuayRef(value);
        return this;
    }

    @Override
    public QuayAssignmentView withQuayName(MultilingualString value) {
        setQuayName(value);
        return this;
    }

    @Override
    public QuayAssignmentView withLabel(String value) {
        setLabel(value);
        return this;
    }

    @Override
    public QuayAssignmentView withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public QuayAssignmentView withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public QuayAssignmentView withId(String value) {
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
