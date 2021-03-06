//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}JourneyPart_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}JourneyPartIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class JourneyPart
    extends JourneyPart_VersionStructure
{


    @Override
    public JourneyPart withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public JourneyPart withParentJourneyRef(VehicleJourneyRefStructure value) {
        setParentJourneyRef(value);
        return this;
    }

    @Override
    public JourneyPart withMainPartRef(JourneyPartCoupleRefStructure value) {
        setMainPartRef(value);
        return this;
    }

    @Override
    public JourneyPart withJourneyPartCoupleRef(JourneyPartCoupleRefStructure value) {
        setJourneyPartCoupleRef(value);
        return this;
    }

    @Override
    public JourneyPart withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    @Override
    public JourneyPart withBlockPartRef(JAXBElement<? extends BlockPartRefStructure> value) {
        setBlockPartRef(value);
        return this;
    }

    @Override
    public JourneyPart withFromStopPointRef(ScheduledStopPointRefStructure value) {
        setFromStopPointRef(value);
        return this;
    }

    @Override
    public JourneyPart withToStopPointRef(ScheduledStopPointRefStructure value) {
        setToStopPointRef(value);
        return this;
    }

    @Override
    public JourneyPart withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public JourneyPart withStartTimeDayOffset(BigInteger value) {
        setStartTimeDayOffset(value);
        return this;
    }

    @Override
    public JourneyPart withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    @Override
    public JourneyPart withEndTimeDayOffset(BigInteger value) {
        setEndTimeDayOffset(value);
        return this;
    }

    @Override
    public JourneyPart withVehicleOrientation(Boolean value) {
        setVehicleOrientation(value);
        return this;
    }

    @Override
    public JourneyPart withPurposeOfJourneyPartitionRef(PurposeOfJourneyPartitionRefStructure value) {
        setPurposeOfJourneyPartitionRef(value);
        return this;
    }

    @Override
    public JourneyPart withFacilities(ServiceFacilitySets_RelStructure value) {
        setFacilities(value);
        return this;
    }

    @Override
    public JourneyPart withJourneyPartPositions(JourneyPartPositions_RelStructure value) {
        setJourneyPartPositions(value);
        return this;
    }

    @Override
    public JourneyPart withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public JourneyPart withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public JourneyPart withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyPart withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public JourneyPart withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public JourneyPart withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyPart withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyPart withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyPart withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyPart withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyPart withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyPart withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyPart withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyPart withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyPart withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPart withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPart withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyPart withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyPart withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyPart withId(String value) {
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
