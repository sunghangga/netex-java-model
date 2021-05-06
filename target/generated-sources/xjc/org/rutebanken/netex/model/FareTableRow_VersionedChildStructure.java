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
 * <p>Java class for FareTableRow_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareTableRow_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}FareTableRowGroup"/&gt;
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
@XmlType(name = "FareTableRow_VersionedChildStructure", propOrder = {
    "name",
    "label",
    "fareTableRef",
    "noticeAssignments",
    "representing",
    "rows"
})
@XmlSeeAlso({
    FareTableRow.class
})
public class FareTableRow_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Label")
    protected MultilingualString label;
    @XmlElementRef(name = "FareTableRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FareTableRefStructure> fareTableRef;
    protected NoticeAssignments_RelStructure noticeAssignments;
    protected ObjectRefs_RelStructure representing;
    protected FareTableRows_RelStructure rows;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabel(MultilingualString value) {
        this.label = value;
    }

    /**
     * Gets the value of the fareTableRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends FareTableRefStructure> getFareTableRef() {
        return fareTableRef;
    }

    /**
     * Sets the value of the fareTableRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardFareTableRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareTableRefStructure }{@code >}
     *     
     */
    public void setFareTableRef(JAXBElement<? extends FareTableRefStructure> value) {
        this.fareTableRef = value;
    }

    /**
     * Gets the value of the noticeAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeAssignments_RelStructure }
     *     
     */
    public NoticeAssignments_RelStructure getNoticeAssignments() {
        return noticeAssignments;
    }

    /**
     * Sets the value of the noticeAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeAssignments_RelStructure }
     *     
     */
    public void setNoticeAssignments(NoticeAssignments_RelStructure value) {
        this.noticeAssignments = value;
    }

    /**
     * Gets the value of the representing property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefs_RelStructure }
     *     
     */
    public ObjectRefs_RelStructure getRepresenting() {
        return representing;
    }

    /**
     * Sets the value of the representing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefs_RelStructure }
     *     
     */
    public void setRepresenting(ObjectRefs_RelStructure value) {
        this.representing = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link FareTableRows_RelStructure }
     *     
     */
    public FareTableRows_RelStructure getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTableRows_RelStructure }
     *     
     */
    public void setRows(FareTableRows_RelStructure value) {
        this.rows = value;
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

    public FareTableRow_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withLabel(MultilingualString value) {
        setLabel(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withFareTableRef(JAXBElement<? extends FareTableRefStructure> value) {
        setFareTableRef(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withRepresenting(ObjectRefs_RelStructure value) {
        setRepresenting(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withRows(FareTableRows_RelStructure value) {
        setRows(value);
        return this;
    }

    public FareTableRow_VersionedChildStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public FareTableRow_VersionedChildStructure withId(String value) {
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