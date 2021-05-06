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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}VehicleJourneyStopAssignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.netex.org.uk/netex}AssignmentGroup"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}StopAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}PassengerStopAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehicleJourneyStopAssignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}VehicleJourneyStopAssignmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class VehicleJourneyStopAssignment
    extends VehicleJourneyStopAssignment_VersionStructure
{


    @Override
    public VehicleJourneyStopAssignment withVehicleJourneyRef(JAXBElement<? extends VehicleJourneyRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends VehicleJourneyRefStructure> value: values) {
                getVehicleJourneyRef().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withVehicleJourneyRef(Collection<JAXBElement<? extends VehicleJourneyRefStructure>> values) {
        if (values!= null) {
            getVehicleJourneyRef().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withPassengerStopAssignmentRef(JAXBElement<? extends PassengerStopAssignmentRefStructure> value) {
        setPassengerStopAssignmentRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withStopPlace(StopPlace value) {
        setStopPlace(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withQuayRef(QuayRefStructure value) {
        setQuayRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withQuay(Quay value) {
        setQuay(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withBoardingPositionRef(BoardingPositionRefStructure value) {
        setBoardingPositionRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withBoardingPosition(BoardingPosition value) {
        setBoardingPosition(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withTrainElements(org.rutebanken.netex.model.PassengerStopAssignment_VersionStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withBoardingUse(Boolean value) {
        setBoardingUse(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withAlightingUse(Boolean value) {
        setAlightingUse(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> value) {
        setScheduledStopPointRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withScheduledStopPoint(ScheduledStopPoint value) {
        setScheduledStopPoint(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleJourneyStopAssignment withId(String value) {
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