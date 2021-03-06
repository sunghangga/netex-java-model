//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for VehicleManoeuvringRequirement_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleManoeuvringRequirement_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VehicleRequirement_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}VehicleManoeuvringRequirementGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleManoeuvringRequirement_VersionStructure", propOrder = {
    "reversible",
    "minimumTurningCircle",
    "minimumOvertakingWidth",
    "minimumLength"
})
@XmlSeeAlso({
    VehicleManoeuvringRequirement.class
})
public class VehicleManoeuvringRequirement_VersionStructure
    extends VehicleRequirement_VersionStructure
{

    @XmlElement(name = "Reversible", defaultValue = "true")
    protected Boolean reversible;
    @XmlElement(name = "MinimumTurningCircle")
    protected BigDecimal minimumTurningCircle;
    @XmlElement(name = "MinimumOvertakingWidth")
    protected BigDecimal minimumOvertakingWidth;
    @XmlElement(name = "MinimumLength")
    protected BigDecimal minimumLength;

    /**
     * Gets the value of the reversible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversible() {
        return reversible;
    }

    /**
     * Sets the value of the reversible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversible(Boolean value) {
        this.reversible = value;
    }

    /**
     * Gets the value of the minimumTurningCircle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumTurningCircle() {
        return minimumTurningCircle;
    }

    /**
     * Sets the value of the minimumTurningCircle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumTurningCircle(BigDecimal value) {
        this.minimumTurningCircle = value;
    }

    /**
     * Gets the value of the minimumOvertakingWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumOvertakingWidth() {
        return minimumOvertakingWidth;
    }

    /**
     * Sets the value of the minimumOvertakingWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumOvertakingWidth(BigDecimal value) {
        this.minimumOvertakingWidth = value;
    }

    /**
     * Gets the value of the minimumLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumLength() {
        return minimumLength;
    }

    /**
     * Sets the value of the minimumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumLength(BigDecimal value) {
        this.minimumLength = value;
    }

    public VehicleManoeuvringRequirement_VersionStructure withReversible(Boolean value) {
        setReversible(value);
        return this;
    }

    public VehicleManoeuvringRequirement_VersionStructure withMinimumTurningCircle(BigDecimal value) {
        setMinimumTurningCircle(value);
        return this;
    }

    public VehicleManoeuvringRequirement_VersionStructure withMinimumOvertakingWidth(BigDecimal value) {
        setMinimumOvertakingWidth(value);
        return this;
    }

    public VehicleManoeuvringRequirement_VersionStructure withMinimumLength(BigDecimal value) {
        setMinimumLength(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public VehicleManoeuvringRequirement_VersionStructure withId(String value) {
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
