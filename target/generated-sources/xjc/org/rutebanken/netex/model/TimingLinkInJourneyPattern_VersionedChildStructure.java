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
 * <p>Java class for TimingLinkInJourneyPattern_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimingLinkInJourneyPattern_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}LinkInLinkSequence_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimingLinkInJourneyPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimingLinkInJourneyPattern_VersionedChildStructure", propOrder = {
    "timingLinkRef",
    "runTimes"
})
@XmlSeeAlso({
    TimingLinkInJourneyPattern.class
})
public class TimingLinkInJourneyPattern_VersionedChildStructure
    extends LinkInLinkSequence_VersionedChildStructure
{

    @XmlElement(name = "TimingLinkRef", required = true)
    protected TimingLinkRefStructure timingLinkRef;
    protected JourneyRunTimes_RelStructure runTimes;

    /**
     * Gets the value of the timingLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public TimingLinkRefStructure getTimingLinkRef() {
        return timingLinkRef;
    }

    /**
     * Sets the value of the timingLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingLinkRefStructure }
     *     
     */
    public void setTimingLinkRef(TimingLinkRefStructure value) {
        this.timingLinkRef = value;
    }

    /**
     * Gets the value of the runTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRunTimes_RelStructure }
     *     
     */
    public JourneyRunTimes_RelStructure getRunTimes() {
        return runTimes;
    }

    /**
     * Sets the value of the runTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRunTimes_RelStructure }
     *     
     */
    public void setRunTimes(JourneyRunTimes_RelStructure value) {
        this.runTimes = value;
    }

    public TimingLinkInJourneyPattern_VersionedChildStructure withTimingLinkRef(TimingLinkRefStructure value) {
        setTimingLinkRef(value);
        return this;
    }

    public TimingLinkInJourneyPattern_VersionedChildStructure withRunTimes(JourneyRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withLinkSequenceRef(JAXBElement<? extends LinkSequenceRefStructure> value) {
        setLinkSequenceRef(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TimingLinkInJourneyPattern_VersionedChildStructure withId(String value) {
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
