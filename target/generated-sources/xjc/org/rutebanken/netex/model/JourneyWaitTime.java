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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}JourneyWaitTime_VersionedChildStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}JourneyWaitTimeGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}JourneyWaitTimeIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class JourneyWaitTime
    extends JourneyWaitTime_VersionedChildStructure
{


    @Override
    public JourneyWaitTime withTimingPointRef(JAXBElement<? extends TimingPointRefStructure> value) {
        setTimingPointRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withWaitTime(Duration value) {
        setWaitTime(value);
        return this;
    }

    @Override
    public JourneyWaitTime withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public JourneyWaitTime withTimeDemandTypeRef(TimeDemandTypeRefStructure value) {
        setTimeDemandTypeRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withTimebandRef(TimebandRefStructure value) {
        setTimebandRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withVehicleMode(AllModesEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    @Override
    public JourneyWaitTime withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyWaitTime withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyWaitTime withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyWaitTime withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyWaitTime withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyWaitTime withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyWaitTime withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyWaitTime withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyWaitTime withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyWaitTime withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyWaitTime withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyWaitTime withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyWaitTime withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyWaitTime withId(String value) {
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
