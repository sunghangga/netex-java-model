//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Java class for EntityInVersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityInVersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}EntityStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}BasicModificationDetailsGroup"/&gt;
 *       &lt;attribute name="dataSourceRef" type="{http://www.netex.org.uk/netex}DataSourceIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInVersionStructure", propOrder = {
    "validityConditions",
    "validBetween",
    "alternativeTexts"
})
@XmlSeeAlso({
    SimplePoint_VersionStructure.class,
    VersionedChildStructure.class,
    DataManagedObjectStructure.class
})
public class EntityInVersionStructure
    extends EntityStructure
{

    protected AvailabilityConditions_RelStructure validityConditions;
    @XmlElement(name = "ValidBetween")
    protected List<ValidBetween> validBetween;
    protected AlternativeTexts_RelStructure alternativeTexts;
    @XmlAttribute(name = "dataSourceRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dataSourceRef;
    @XmlAttribute(name = "created")
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime created;
    @XmlAttribute(name = "changed")
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime changed;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String version;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status_BasicModificationDetailsGroup;
    @XmlAttribute(name = "derivedFromVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String derivedFromVersionRef_BasicModificationDetailsGroup;
    @XmlAttribute(name = "compatibleWithVersionFrameVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String compatibleWithVersionFrameVersionRef;
    @XmlAttribute(name = "derivedFromObjectRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String derivedFromObjectRef;

    /**
     * Gets the value of the validityConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditions_RelStructure }
     *     
     */
    public AvailabilityConditions_RelStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Sets the value of the validityConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditions_RelStructure }
     *     
     */
    public void setValidityConditions(AvailabilityConditions_RelStructure value) {
        this.validityConditions = value;
    }

    /**
     * Gets the value of the validBetween property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validBetween property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidBetween().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidBetween }
     * 
     * 
     */
    public List<ValidBetween> getValidBetween() {
        if (validBetween == null) {
            validBetween = new ArrayList<ValidBetween>();
        }
        return this.validBetween;
    }

    /**
     * Gets the value of the alternativeTexts property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeTexts_RelStructure }
     *     
     */
    public AlternativeTexts_RelStructure getAlternativeTexts() {
        return alternativeTexts;
    }

    /**
     * Sets the value of the alternativeTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeTexts_RelStructure }
     *     
     */
    public void setAlternativeTexts(AlternativeTexts_RelStructure value) {
        this.alternativeTexts = value;
    }

    /**
     * Gets the value of the dataSourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * Sets the value of the dataSourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceRef(String value) {
        this.dataSourceRef = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(LocalDateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanged(LocalDateTime value) {
        this.changed = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.NEW;
        } else {
            return modification;
        }
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the status_BasicModificationDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus_BasicModificationDetailsGroup() {
        if (status_BasicModificationDetailsGroup == null) {
            return StatusEnumeration.ACTIVE;
        } else {
            return status_BasicModificationDetailsGroup;
        }
    }

    /**
     * Sets the value of the status_BasicModificationDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        this.status_BasicModificationDetailsGroup = value;
    }

    /**
     * Gets the value of the derivedFromVersionRef_BasicModificationDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromVersionRef_BasicModificationDetailsGroup() {
        return derivedFromVersionRef_BasicModificationDetailsGroup;
    }

    /**
     * Sets the value of the derivedFromVersionRef_BasicModificationDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        this.derivedFromVersionRef_BasicModificationDetailsGroup = value;
    }

    /**
     * Gets the value of the compatibleWithVersionFrameVersionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleWithVersionFrameVersionRef() {
        return compatibleWithVersionFrameVersionRef;
    }

    /**
     * Sets the value of the compatibleWithVersionFrameVersionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleWithVersionFrameVersionRef(String value) {
        this.compatibleWithVersionFrameVersionRef = value;
    }

    /**
     * Gets the value of the derivedFromObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromObjectRef() {
        return derivedFromObjectRef;
    }

    /**
     * Sets the value of the derivedFromObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromObjectRef(String value) {
        this.derivedFromObjectRef = value;
    }

    public EntityInVersionStructure withValidityConditions(AvailabilityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    public EntityInVersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    public EntityInVersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    public EntityInVersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    public EntityInVersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    public EntityInVersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    public EntityInVersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    public EntityInVersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    public EntityInVersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    public EntityInVersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    public EntityInVersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    public EntityInVersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    public EntityInVersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public EntityInVersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public EntityInVersionStructure withId(String value) {
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
