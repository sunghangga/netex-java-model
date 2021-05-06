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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ServiceJourneyPatternInterchange_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyPatternInterchange_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Interchange_VersionStructure"&gt;
 *       &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyPatternInterchangeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyPatternInterchange_VersionStructure", propOrder = {
    "fromPointRef",
    "fromVisitNumber",
    "toPointRef",
    "toVisitNumber",
    "fromJourneyPatternRef",
    "toJourneyPatternRef"
})
@XmlSeeAlso({
    ServiceJourneyPatternInterchange.class
})
public class ServiceJourneyPatternInterchange_VersionStructure
    extends Interchange_VersionStructure
{

    @XmlElement(name = "FromPointRef", required = true)
    protected ScheduledStopPointRefStructure fromPointRef;
    @XmlElement(name = "FromVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fromVisitNumber;
    @XmlElement(name = "ToPointRef", required = true)
    protected ScheduledStopPointRefStructure toPointRef;
    @XmlElement(name = "ToVisitNumber", defaultValue = "1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger toVisitNumber;
    @XmlElement(name = "FromJourneyPatternRef", required = true)
    protected JourneyPatternRefStructure fromJourneyPatternRef;
    @XmlElement(name = "ToJourneyPatternRef", required = true)
    protected JourneyPatternRefStructure toJourneyPatternRef;

    /**
     * Gets the value of the fromPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getFromPointRef() {
        return fromPointRef;
    }

    /**
     * Sets the value of the fromPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setFromPointRef(ScheduledStopPointRefStructure value) {
        this.fromPointRef = value;
    }

    /**
     * Gets the value of the fromVisitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFromVisitNumber() {
        return fromVisitNumber;
    }

    /**
     * Sets the value of the fromVisitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFromVisitNumber(BigInteger value) {
        this.fromVisitNumber = value;
    }

    /**
     * Gets the value of the toPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public ScheduledStopPointRefStructure getToPointRef() {
        return toPointRef;
    }

    /**
     * Sets the value of the toPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledStopPointRefStructure }
     *     
     */
    public void setToPointRef(ScheduledStopPointRefStructure value) {
        this.toPointRef = value;
    }

    /**
     * Gets the value of the toVisitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToVisitNumber() {
        return toVisitNumber;
    }

    /**
     * Sets the value of the toVisitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToVisitNumber(BigInteger value) {
        this.toVisitNumber = value;
    }

    /**
     * Gets the value of the fromJourneyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getFromJourneyPatternRef() {
        return fromJourneyPatternRef;
    }

    /**
     * Sets the value of the fromJourneyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setFromJourneyPatternRef(JourneyPatternRefStructure value) {
        this.fromJourneyPatternRef = value;
    }

    /**
     * Gets the value of the toJourneyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getToJourneyPatternRef() {
        return toJourneyPatternRef;
    }

    /**
     * Sets the value of the toJourneyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setToJourneyPatternRef(JourneyPatternRefStructure value) {
        this.toJourneyPatternRef = value;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withFromPointRef(ScheduledStopPointRefStructure value) {
        setFromPointRef(value);
        return this;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withFromVisitNumber(BigInteger value) {
        setFromVisitNumber(value);
        return this;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withToPointRef(ScheduledStopPointRefStructure value) {
        setToPointRef(value);
        return this;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withToVisitNumber(BigInteger value) {
        setToVisitNumber(value);
        return this;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withFromJourneyPatternRef(JourneyPatternRefStructure value) {
        setFromJourneyPatternRef(value);
        return this;
    }

    public ServiceJourneyPatternInterchange_VersionStructure withToJourneyPatternRef(JourneyPatternRefStructure value) {
        setToJourneyPatternRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withExternalInterchangeRef(ExternalObjectRefStructure value) {
        setExternalInterchangeRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withConnectionRef(ConnectionRefStructure value) {
        setConnectionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withPriority(BigInteger value) {
        setPriority(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withCrossBorder(Boolean value) {
        setCrossBorder(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withPlanned(Boolean value) {
        setPlanned(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withControlled(Boolean value) {
        setControlled(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withConnectionCertainty(ConnectionCertaintyEnumeration value) {
        setConnectionCertainty(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withControlCentreNotifyThreshold(Duration value) {
        setControlCentreNotifyThreshold(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withTransferModes(AccessModeEnumeration... values) {
        if (values!= null) {
            for (AccessModeEnumeration value: values) {
                getTransferModes().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withTransferModes(Collection<AccessModeEnumeration> values) {
        if (values!= null) {
            getTransferModes().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withNoticeAssignments(Interchange_VersionStructure.NoticeAssignments value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceJourneyPatternInterchange_VersionStructure withId(String value) {
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