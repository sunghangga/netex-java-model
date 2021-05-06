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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}InterchangeRule_VersionStructure"&gt;
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
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}InterchangeRuleGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}InterchangeRuleIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class InterchangeRule
    extends InterchangeRule_VersionStructure
{


    @Override
    public InterchangeRule withConnectionZoneRef(ZoneRefStructure value) {
        setConnectionZoneRef(value);
        return this;
    }

    @Override
    public InterchangeRule withControlCentreRef(ControlCentreRefStructure value) {
        setControlCentreRef(value);
        return this;
    }

    @Override
    public InterchangeRule withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    @Override
    public InterchangeRule withTimings(InterchangeRuleTimings_RelStructure value) {
        setTimings(value);
        return this;
    }

    @Override
    public InterchangeRule withFeederFilter(InterchangeRuleParameterStructure value) {
        setFeederFilter(value);
        return this;
    }

    @Override
    public InterchangeRule withDistributorFilter(InterchangeRuleParameterStructure value) {
        setDistributorFilter(value);
        return this;
    }

    @Override
    public InterchangeRule withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public InterchangeRule withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public InterchangeRule withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public InterchangeRule withExternalInterchangeRef(ExternalObjectRefStructure value) {
        setExternalInterchangeRef(value);
        return this;
    }

    @Override
    public InterchangeRule withConnectionRef(ConnectionRefStructure value) {
        setConnectionRef(value);
        return this;
    }

    @Override
    public InterchangeRule withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    @Override
    public InterchangeRule withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public InterchangeRule withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    @Override
    public InterchangeRule withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    @Override
    public InterchangeRule withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public InterchangeRule withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public InterchangeRule withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    @Override
    public InterchangeRule withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    @Override
    public InterchangeRule withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public InterchangeRule withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public InterchangeRule withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public InterchangeRule withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public InterchangeRule withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public InterchangeRule withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public InterchangeRule withControlCentreNotifyThreshold(Duration value) {
        setControlCentreNotifyThreshold(value);
        return this;
    }

    @Override
    public InterchangeRule withTransferModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getTransferModes().add(value);
            }
        }
        return this;
    }

    @Override
    public InterchangeRule withTransferModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getTransferModes().addAll(values);
        }
        return this;
    }

    @Override
    public InterchangeRule withNoticeAssignments(org.rutebanken.netex.model.Interchange_VersionStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public InterchangeRule withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public InterchangeRule withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public InterchangeRule withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public InterchangeRule withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public InterchangeRule withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public InterchangeRule withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public InterchangeRule withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public InterchangeRule withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public InterchangeRule withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public InterchangeRule withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public InterchangeRule withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public InterchangeRule withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public InterchangeRule withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public InterchangeRule withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public InterchangeRule withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public InterchangeRule withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public InterchangeRule withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public InterchangeRule withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public InterchangeRule withId(String value) {
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