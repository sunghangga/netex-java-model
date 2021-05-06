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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}VehiclePositionAlignment_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VehiclePositionAlignmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}VehiclePositionAlignmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class VehiclePositionAlignment
    extends VehiclePositionAlignment_VersionStructure
{


    @Override
    public VehiclePositionAlignment withVehicleStoppingPositionRef(VehicleStoppingPositionRefStructure value) {
        setVehicleStoppingPositionRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withBoardingPositionRef(BoardingPositionRefStructure value) {
        setBoardingPositionRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withStopPlaceEntranceRef(StopPlaceEntranceRefStructure value) {
        setStopPlaceEntranceRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehiclePositionAlignment withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehiclePositionAlignment withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehiclePositionAlignment withId(String value) {
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
