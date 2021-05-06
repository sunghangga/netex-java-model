//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for DynamicStopAssignment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicStopAssignment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}PassengerStopAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}DynamicStopAssignmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicStopAssignment_VersionStructure", propOrder = {
    "journeyPatternRef",
    "passengerStopAssignmentRef"
})
@XmlSeeAlso({
    DynamicStopAssignment.class
})
public class DynamicStopAssignment_VersionStructure
    extends PassengerStopAssignment_VersionStructure
{

    @XmlElementRef(name = "JourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyPatternRefStructure> journeyPatternRef;
    @XmlElementRef(name = "PassengerStopAssignmentRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PassengerStopAssignmentRefStructure> passengerStopAssignmentRef;

    /**
     * Gets the value of the journeyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyPatternRefStructure> getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Sets the value of the journeyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServicePatternRefStructure }{@code >}
     *     
     */
    public void setJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        this.journeyPatternRef = value;
    }

    /**
     * Gets the value of the passengerStopAssignmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PassengerStopAssignmentRefStructure> getPassengerStopAssignmentRef() {
        return passengerStopAssignmentRef;
    }

    /**
     * Sets the value of the passengerStopAssignmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyStopAssignmentRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PassengerStopAssignmentRefStructure }{@code >}
     *     
     */
    public void setPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        this.passengerStopAssignmentRef = value;
    }

    public DynamicStopAssignment_VersionStructure withJourneyPatternRef(JAXBElement<? extends JourneyPatternRefStructure> value) {
        setJourneyPatternRef(value);
        return this;
    }

    public DynamicStopAssignment_VersionStructure withPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        setPassengerStopAssignmentRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withStopPlace(StopPlace value) {
        setStopPlace(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withQuayRef(QuayRefStructure value) {
        setQuayRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withQuay(Quay value) {
        setQuay(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withBoardingPositionRef(BoardingPositionRefStructure value) {
        setBoardingPositionRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withBoardingPosition(BoardingPosition value) {
        setBoardingPosition(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withTrainElements(PassengerStopAssignment_VersionStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withScheduledStopPoint(ScheduledStopPoint value) {
        setScheduledStopPoint(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public DynamicStopAssignment_VersionStructure withId(String value) {
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