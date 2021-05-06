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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PassengerStopAssignment_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerStopAssignment_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}StopAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassengerStopAssignmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerStopAssignment_VersionStructure", propOrder = {
    "stopPlaceRef",
    "stopPlace",
    "quayRef",
    "quay",
    "boardingPositionRef",
    "boardingPosition",
    "trainElements"
})
@XmlSeeAlso({
    PassengerStopAssignment.class,
    DynamicStopAssignment_VersionStructure.class,
    VehicleJourneyStopAssignment_VersionStructure.class
})
public class PassengerStopAssignment_VersionStructure
    extends StopAssignment_VersionStructure
{

    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlace")
    protected StopPlace stopPlace;
    @XmlElement(name = "QuayRef")
    protected QuayRefStructure quayRef;
    @XmlElement(name = "Quay")
    protected Quay quay;
    @XmlElement(name = "BoardingPositionRef")
    protected BoardingPositionRefStructure boardingPositionRef;
    @XmlElement(name = "BoardingPosition")
    protected BoardingPosition boardingPosition;
    protected PassengerStopAssignment_VersionStructure.TrainElements trainElements;

    /**
     * Gets the value of the stopPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Sets the value of the stopPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Gets the value of the stopPlace property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlace }
     *     
     */
    public StopPlace getStopPlace() {
        return stopPlace;
    }

    /**
     * Sets the value of the stopPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlace }
     *     
     */
    public void setStopPlace(StopPlace value) {
        this.stopPlace = value;
    }

    /**
     * Gets the value of the quayRef property.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getQuayRef() {
        return quayRef;
    }

    /**
     * Sets the value of the quayRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setQuayRef(QuayRefStructure value) {
        this.quayRef = value;
    }

    /**
     * Gets the value of the quay property.
     * 
     * @return
     *     possible object is
     *     {@link Quay }
     *     
     */
    public Quay getQuay() {
        return quay;
    }

    /**
     * Sets the value of the quay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quay }
     *     
     */
    public void setQuay(Quay value) {
        this.quay = value;
    }

    /**
     * Gets the value of the boardingPositionRef property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getBoardingPositionRef() {
        return boardingPositionRef;
    }

    /**
     * Sets the value of the boardingPositionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setBoardingPositionRef(BoardingPositionRefStructure value) {
        this.boardingPositionRef = value;
    }

    /**
     * Gets the value of the boardingPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPosition }
     *     
     */
    public BoardingPosition getBoardingPosition() {
        return boardingPosition;
    }

    /**
     * Sets the value of the boardingPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPosition }
     *     
     */
    public void setBoardingPosition(BoardingPosition value) {
        this.boardingPosition = value;
    }

    /**
     * Gets the value of the trainElements property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerStopAssignment_VersionStructure.TrainElements }
     *     
     */
    public PassengerStopAssignment_VersionStructure.TrainElements getTrainElements() {
        return trainElements;
    }

    /**
     * Sets the value of the trainElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerStopAssignment_VersionStructure.TrainElements }
     *     
     */
    public void setTrainElements(PassengerStopAssignment_VersionStructure.TrainElements value) {
        this.trainElements = value;
    }

    public PassengerStopAssignment_VersionStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withStopPlace(StopPlace value) {
        setStopPlace(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withQuayRef(QuayRefStructure value) {
        setQuayRef(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withQuay(Quay value) {
        setQuay(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withBoardingPositionRef(BoardingPositionRefStructure value) {
        setBoardingPositionRef(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withBoardingPosition(BoardingPosition value) {
        setBoardingPosition(value);
        return this;
    }

    public PassengerStopAssignment_VersionStructure withTrainElements(PassengerStopAssignment_VersionStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withScheduledStopPoint(ScheduledStopPoint value) {
        setScheduledStopPoint(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PassengerStopAssignment_VersionStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.netex.org.uk/netex}trainStopAssignments_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TrainElements
        extends TrainStopAssignments_RelStructure
    {


        @Override
        public PassengerStopAssignment_VersionStructure.TrainElements withTrainStopAssignmentRefOrTrainStopAssignment(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getTrainStopAssignmentRefOrTrainStopAssignment().add(value);
                }
            }
            return this;
        }

        @Override
        public PassengerStopAssignment_VersionStructure.TrainElements withTrainStopAssignmentRefOrTrainStopAssignment(Collection<Object> values) {
            if (values!= null) {
                getTrainStopAssignmentRefOrTrainStopAssignment().addAll(values);
            }
            return this;
        }

        @Override
        public PassengerStopAssignment_VersionStructure.TrainElements withModificationSet(ModificationSetEnumeration value) {
            setModificationSet(value);
            return this;
        }

        @Override
        public PassengerStopAssignment_VersionStructure.TrainElements withId(String value) {
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

}