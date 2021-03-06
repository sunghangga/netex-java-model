//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PassingTime_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassingTime_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PassingTimeGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassingTime_VersionedChildStructure", propOrder = {
    "journeyRef",
    "alightAndReboard",
    "pointInJourneyPatternRef"
})
@XmlSeeAlso({
    TimetabledPassingTime_VersionedChildStructure.class,
    DatedPassingTime_VersionedChildStructure.class
})
public abstract class PassingTime_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElementRef(name = "JourneyRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends JourneyRefStructure> journeyRef;
    @XmlElement(name = "AlightAndReboard")
    protected Boolean alightAndReboard;
    @XmlElementRef(name = "PointInJourneyPatternRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PointInJourneyPatternRefStructure> pointInJourneyPatternRef;

    /**
     * Gets the value of the journeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends JourneyRefStructure> getJourneyRef() {
        return journeyRef;
    }

    /**
     * Sets the value of the journeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link VehicleJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemplateServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceJourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DeadRunRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpecialServiceRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link JourneyRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatedSpecialServiceRefStructure }{@code >}
     *     
     */
    public void setJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        this.journeyRef = value;
    }

    /**
     * Gets the value of the alightAndReboard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlightAndReboard() {
        return alightAndReboard;
    }

    /**
     * Sets the value of the alightAndReboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlightAndReboard(Boolean value) {
        this.alightAndReboard = value;
    }

    /**
     * Gets the value of the pointInJourneyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends PointInJourneyPatternRefStructure> getPointInJourneyPatternRef() {
        return pointInJourneyPatternRef;
    }

    /**
     * Sets the value of the pointInJourneyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FarePointInPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link PointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link TimingPointInJourneyPatternRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopPointInJourneyPatternRefStructure }{@code >}
     *     
     */
    public void setPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        this.pointInJourneyPatternRef = value;
    }

    public PassingTime_VersionedChildStructure withJourneyRef(JAXBElement<? extends JourneyRefStructure> value) {
        setJourneyRef(value);
        return this;
    }

    public PassingTime_VersionedChildStructure withAlightAndReboard(Boolean value) {
        setAlightAndReboard(value);
        return this;
    }

    public PassingTime_VersionedChildStructure withPointInJourneyPatternRef(JAXBElement<? extends PointInJourneyPatternRefStructure> value) {
        setPointInJourneyPatternRef(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PassingTime_VersionedChildStructure withId(String value) {
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
