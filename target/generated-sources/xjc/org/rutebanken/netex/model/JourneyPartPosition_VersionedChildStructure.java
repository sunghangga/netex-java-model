//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for JourneyPartPosition_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyPartPosition_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}JourneyPartPositionGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPartPosition_VersionedChildStructure", propOrder = {
    "parentJourneyPartRef",
    "scheduledStopPointRef",
    "positionInTrain"
})
@XmlSeeAlso({
    JourneyPartPosition.class
})
public class JourneyPartPosition_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "ParentJourneyPartRef")
    protected JourneyPartRefStructure parentJourneyPartRef;
    @XmlElementRef(name = "ScheduledStopPointRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ScheduledStopPointRefStructure>> scheduledStopPointRef;
    @XmlElement(name = "PositionInTrain", required = true)
    protected BigInteger positionInTrain;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the parentJourneyPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public JourneyPartRefStructure getParentJourneyPartRef() {
        return parentJourneyPartRef;
    }

    /**
     * Sets the value of the parentJourneyPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPartRefStructure }
     *     
     */
    public void setParentJourneyPartRef(JourneyPartRefStructure value) {
        this.parentJourneyPartRef = value;
    }

    /**
     * Gets the value of the scheduledStopPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledStopPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledStopPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FareScheduledStopPointRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledStopPointRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ScheduledStopPointRefStructure>> getScheduledStopPointRef() {
        if (scheduledStopPointRef == null) {
            scheduledStopPointRef = new ArrayList<JAXBElement<? extends ScheduledStopPointRefStructure>>();
        }
        return this.scheduledStopPointRef;
    }

    /**
     * Gets the value of the positionInTrain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionInTrain() {
        return positionInTrain;
    }

    /**
     * Sets the value of the positionInTrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionInTrain(BigInteger value) {
        this.positionInTrain = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public JourneyPartPosition_VersionedChildStructure withParentJourneyPartRef(JourneyPartRefStructure value) {
        setParentJourneyPartRef(value);
        return this;
    }

    public JourneyPartPosition_VersionedChildStructure withScheduledStopPointRef(JAXBElement<? extends ScheduledStopPointRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends ScheduledStopPointRefStructure> value: values) {
                getScheduledStopPointRef().add(value);
            }
        }
        return this;
    }

    public JourneyPartPosition_VersionedChildStructure withScheduledStopPointRef(Collection<JAXBElement<? extends ScheduledStopPointRefStructure>> values) {
        if (values!= null) {
            getScheduledStopPointRef().addAll(values);
        }
        return this;
    }

    public JourneyPartPosition_VersionedChildStructure withPositionInTrain(BigInteger value) {
        setPositionInTrain(value);
        return this;
    }

    public JourneyPartPosition_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyPartPosition_VersionedChildStructure withId(String value) {
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
