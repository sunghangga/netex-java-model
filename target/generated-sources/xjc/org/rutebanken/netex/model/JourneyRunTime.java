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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}JourneyRunTime_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}JourneyTimingGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}JourneyRunTimeGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}JourneyRunTimeIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class JourneyRunTime
    extends JourneyRunTime_VersionedChildStructure
{


    @Override
    public JourneyRunTime withTimingLinkRef(TimingLinkRefStructure value) {
        setTimingLinkRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withRunTime(Duration value) {
        setRunTime(value);
        return this;
    }

    @Override
    public JourneyRunTime withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public JourneyRunTime withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withTimebandRef(TimebandRefStructure value) {
        setTimebandRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withVehicleMode(AllModesEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    @Override
    public JourneyRunTime withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyRunTime withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyRunTime withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyRunTime withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyRunTime withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyRunTime withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyRunTime withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyRunTime withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyRunTime withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyRunTime withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyRunTime withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyRunTime withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyRunTime withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyRunTime withId(String value) {
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
