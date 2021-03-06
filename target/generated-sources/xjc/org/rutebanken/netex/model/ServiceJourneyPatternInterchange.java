//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ServiceJourneyPatternInterchange_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}InterchangeGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyPatternInterchangeGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ServiceJourneyPatternInterchangeIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ServiceJourneyPatternInterchange
    extends ServiceJourneyPatternInterchange_VersionStructure
{


    @Override
    public ServiceJourneyPatternInterchange withFromPointRef(ScheduledStopPointRefStructure value) {
        setFromPointRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withFromVisitNumber(BigInteger value) {
        setFromVisitNumber(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withToPointRef(ScheduledStopPointRefStructure value) {
        setToPointRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withToVisitNumber(BigInteger value) {
        setToVisitNumber(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withFromJourneyPatternRef(JourneyPatternRefStructure value) {
        setFromJourneyPatternRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withToJourneyPatternRef(JourneyPatternRefStructure value) {
        setToJourneyPatternRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withExternalInterchangeRef(ExternalObjectRefStructure value) {
        setExternalInterchangeRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withConnectionRef(ConnectionRefStructure value) {
        setConnectionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withControlCentreNotifyThreshold(Duration value) {
        setControlCentreNotifyThreshold(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withTransferModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getTransferModes().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withTransferModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getTransferModes().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withNoticeAssignments(org.rutebanken.netex.model.Interchange_VersionStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange withId(String value) {
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
