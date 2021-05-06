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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ModeRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModeRefStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex&gt;SubmodeRefStructure"&gt;
 *       &lt;attribute name="mode" use="required" type="{http://www.netex.org.uk/netex}AllVehicleModesOfTransportEnumeration" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeRefStructure")
public class ModeRefStructure
    extends SubmodeRefStructure
{

    @XmlAttribute(name = "mode", required = true)
    protected AllVehicleModesOfTransportEnumeration mode;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link AllVehicleModesOfTransportEnumeration }
     *     
     */
    public AllVehicleModesOfTransportEnumeration getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllVehicleModesOfTransportEnumeration }
     *     
     */
    public void setMode(AllVehicleModesOfTransportEnumeration value) {
        this.mode = value;
    }

    public ModeRefStructure withMode(AllVehicleModesOfTransportEnumeration value) {
        setMode(value);
        return this;
    }

    @Override
    public ModeRefStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public ModeRefStructure withNameOfRefClass(String value) {
        setNameOfRefClass(value);
        return this;
    }

    @Override
    public ModeRefStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ModeRefStructure withRef(String value) {
        setRef(value);
        return this;
    }

    @Override
    public ModeRefStructure withVersionRef(String value) {
        setVersionRef(value);
        return this;
    }

    @Override
    public ModeRefStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ModeRefStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ModeRefStructure withVersion(String value) {
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
