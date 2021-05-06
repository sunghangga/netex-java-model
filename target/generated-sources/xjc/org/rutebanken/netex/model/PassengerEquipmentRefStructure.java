//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PassengerEquipmentRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerEquipmentRefStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://www.netex.org.uk/netex&gt;InstalledEquipmentRefStructure"&gt;
 *       &lt;attribute name="ref" use="required" type="{http://www.netex.org.uk/netex}PassengerEquipmentIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerEquipmentRefStructure")
@XmlSeeAlso({
    SanitaryEquipmentRefStructure.class,
    PassengerSafetyEquipmentRefStructure.class,
    HelpPointEquipmentRefStructure.class,
    RubbishDisposalEquipmentRefStructure.class,
    VehicleEquipmentRefStructure.class
})
public abstract class PassengerEquipmentRefStructure
    extends InstalledEquipmentRefStructure
{


    @Override
    public PassengerEquipmentRefStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withNameOfRefClass(String value) {
        setNameOfRefClass(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withRef(String value) {
        setRef(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withVersionRef(String value) {
        setVersionRef(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PassengerEquipmentRefStructure withVersion(String value) {
        setVersion(value);
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
