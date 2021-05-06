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
 *     &lt;extension base="{http://www.netex.org.uk/netex}Interchange_VersionStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Interchange
    extends Interchange_VersionStructure
{


    @Override
    public Interchange withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Interchange withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Interchange withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Interchange withExternalInterchangeRef(ExternalObjectRefStructure value) {
        setExternalInterchangeRef(value);
        return this;
    }

    @Override
    public Interchange withConnectionRef(ConnectionRefStructure value) {
        setConnectionRef(value);
        return this;
    }

    @Override
    public Interchange withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    @Override
    public Interchange withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public Interchange withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    @Override
    public Interchange withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    @Override
    public Interchange withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public Interchange withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public Interchange withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    @Override
    public Interchange withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    @Override
    public Interchange withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public Interchange withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public Interchange withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public Interchange withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public Interchange withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public Interchange withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public Interchange withControlCentreNotifyThreshold(Duration value) {
        setControlCentreNotifyThreshold(value);
        return this;
    }

    @Override
    public Interchange withTransferModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getTransferModes().add(value);
            }
        }
        return this;
    }

    @Override
    public Interchange withTransferModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getTransferModes().addAll(values);
        }
        return this;
    }

    @Override
    public Interchange withNoticeAssignments(Interchange_VersionStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public Interchange withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Interchange withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Interchange withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Interchange withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Interchange withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Interchange withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Interchange withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Interchange withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Interchange withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Interchange withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Interchange withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Interchange withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Interchange withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Interchange withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Interchange withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Interchange withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Interchange withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Interchange withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Interchange withId(String value) {
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