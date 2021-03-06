//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for JourneyHeadway_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyHeadway_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyTiming_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}HeadwayIntervalGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyHeadway_VersionedChildStructure", propOrder = {
    "scheduledHeadwayInterval",
    "minimumHeadwayInterval",
    "maximumHeadwayInterval"
})
@XmlSeeAlso({
    JourneyHeadway.class,
    JourneyPatternHeadway_VersionedChildStructure.class,
    VehicleJourneyHeadway_VersionedChildStructure.class
})
public class JourneyHeadway_VersionedChildStructure
    extends JourneyTiming_VersionedChildStructure
{

    @XmlElement(name = "ScheduledHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration scheduledHeadwayInterval;
    @XmlElement(name = "MinimumHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumHeadwayInterval;
    @XmlElement(name = "MaximumHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumHeadwayInterval;

    /**
     * Gets the value of the scheduledHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getScheduledHeadwayInterval() {
        return scheduledHeadwayInterval;
    }

    /**
     * Sets the value of the scheduledHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledHeadwayInterval(Duration value) {
        this.scheduledHeadwayInterval = value;
    }

    /**
     * Gets the value of the minimumHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumHeadwayInterval() {
        return minimumHeadwayInterval;
    }

    /**
     * Sets the value of the minimumHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumHeadwayInterval(Duration value) {
        this.minimumHeadwayInterval = value;
    }

    /**
     * Gets the value of the maximumHeadwayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumHeadwayInterval() {
        return maximumHeadwayInterval;
    }

    /**
     * Sets the value of the maximumHeadwayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumHeadwayInterval(Duration value) {
        this.maximumHeadwayInterval = value;
    }

    public JourneyHeadway_VersionedChildStructure withScheduledHeadwayInterval(Duration value) {
        setScheduledHeadwayInterval(value);
        return this;
    }

    public JourneyHeadway_VersionedChildStructure withMinimumHeadwayInterval(Duration value) {
        setMinimumHeadwayInterval(value);
        return this;
    }

    public JourneyHeadway_VersionedChildStructure withMaximumHeadwayInterval(Duration value) {
        setMaximumHeadwayInterval(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withTimebandRef(TimebandRefStructure value) {
        setTimebandRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withVehicleMode(AllModesEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyHeadway_VersionedChildStructure withId(String value) {
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
