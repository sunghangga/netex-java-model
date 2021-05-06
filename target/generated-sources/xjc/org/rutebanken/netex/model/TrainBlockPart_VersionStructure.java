//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java class for TrainBlockPart_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainBlockPart_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}BlockPart_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TrainBlockPartGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBlockPart_VersionStructure", propOrder = {
    "startTime",
    "startTimeDayOffset",
    "endTime",
    "endTimeDayOffset",
    "typeOfCoupling"
})
@XmlSeeAlso({
    TrainBlockPart.class
})
public class TrainBlockPart_VersionStructure
    extends BlockPart_VersionStructure
{

    @XmlElement(name = "StartTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTime;
    @XmlElement(name = "StartTimeDayOffset")
    protected BigInteger startTimeDayOffset;
    @XmlElement(name = "EndTime", type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTime;
    @XmlElement(name = "EndTimeDayOffset")
    protected BigInteger endTimeDayOffset;
    @XmlElement(name = "TypeOfCoupling")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String typeOfCoupling;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(LocalTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the startTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartTimeDayOffset() {
        return startTimeDayOffset;
    }

    /**
     * Sets the value of the startTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartTimeDayOffset(BigInteger value) {
        this.startTimeDayOffset = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(LocalTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the endTimeDayOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndTimeDayOffset() {
        return endTimeDayOffset;
    }

    /**
     * Sets the value of the endTimeDayOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndTimeDayOffset(BigInteger value) {
        this.endTimeDayOffset = value;
    }

    /**
     * Gets the value of the typeOfCoupling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCoupling() {
        return typeOfCoupling;
    }

    /**
     * Sets the value of the typeOfCoupling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCoupling(String value) {
        this.typeOfCoupling = value;
    }

    public TrainBlockPart_VersionStructure withStartTime(LocalTime value) {
        setStartTime(value);
        return this;
    }

    public TrainBlockPart_VersionStructure withStartTimeDayOffset(BigInteger value) {
        setStartTimeDayOffset(value);
        return this;
    }

    public TrainBlockPart_VersionStructure withEndTime(LocalTime value) {
        setEndTime(value);
        return this;
    }

    public TrainBlockPart_VersionStructure withEndTimeDayOffset(BigInteger value) {
        setEndTimeDayOffset(value);
        return this;
    }

    public TrainBlockPart_VersionStructure withTypeOfCoupling(String value) {
        setTypeOfCoupling(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        setBlockRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withVehicleTypeRef(JAXBElement<? extends VehicleTypeRefStructure> value) {
        setVehicleTypeRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withCompoundBlockRef(CompoundBlockRefStructure value) {
        setCompoundBlockRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withJourneyPartCoupleRef(JourneyPartCoupleRefStructure value) {
        setJourneyPartCoupleRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withJourneyParts(JourneyPartRefs_RelStructure value) {
        setJourneyParts(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TrainBlockPart_VersionStructure withId(String value) {
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
