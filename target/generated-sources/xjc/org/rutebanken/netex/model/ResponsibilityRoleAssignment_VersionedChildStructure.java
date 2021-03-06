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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ResponsibilityRoleAssignment_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsibilityRoleAssignment_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ResponsibilitySetRef" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResponsibilityRolesGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ResponsiblePartiesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibilityRoleAssignment_VersionedChildStructure", propOrder = {
    "responsibilitySetRef",
    "description",
    "dataRoleType",
    "stakeholderRoleType",
    "typeOfResponsibilityRoleRef",
    "responsibilityRoleRef",
    "responsibleOrganisationRef",
    "responsiblePartRef",
    "responsibleAreaRef"
})
public class ResponsibilityRoleAssignment_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "ResponsibilitySetRef")
    protected ResponsibilitySetRefStructure responsibilitySetRef;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlList
    @XmlElement(name = "DataRoleType")
    protected List<DataRoleTypeEnumeration> dataRoleType;
    @XmlList
    @XmlElement(name = "StakeholderRoleType")
    protected List<StakeholderRoleTypeEnumeration> stakeholderRoleType;
    @XmlElement(name = "TypeOfResponsibilityRoleRef")
    protected TypeOfResponsibilityRoleRefStructure typeOfResponsibilityRoleRef;
    @XmlElement(name = "ResponsibilityRoleRef")
    protected ResponsibilityRoleRefStructure responsibilityRoleRef;
    @XmlElement(name = "ResponsibleOrganisationRef")
    protected OrganisationRefStructure responsibleOrganisationRef;
    @XmlElement(name = "ResponsiblePartRef")
    protected OrganisationPartRefStructure responsiblePartRef;
    @XmlElement(name = "ResponsibleAreaRef")
    protected VersionOfObjectRefStructure responsibleAreaRef;

    /**
     * Gets the value of the responsibilitySetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public ResponsibilitySetRefStructure getResponsibilitySetRef() {
        return responsibilitySetRef;
    }

    /**
     * Sets the value of the responsibilitySetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilitySetRefStructure }
     *     
     */
    public void setResponsibilitySetRef(ResponsibilitySetRefStructure value) {
        this.responsibilitySetRef = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the dataRoleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRoleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRoleTypeEnumeration }
     * 
     * 
     */
    public List<DataRoleTypeEnumeration> getDataRoleType() {
        if (dataRoleType == null) {
            dataRoleType = new ArrayList<DataRoleTypeEnumeration>();
        }
        return this.dataRoleType;
    }

    /**
     * Gets the value of the stakeholderRoleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stakeholderRoleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStakeholderRoleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StakeholderRoleTypeEnumeration }
     * 
     * 
     */
    public List<StakeholderRoleTypeEnumeration> getStakeholderRoleType() {
        if (stakeholderRoleType == null) {
            stakeholderRoleType = new ArrayList<StakeholderRoleTypeEnumeration>();
        }
        return this.stakeholderRoleType;
    }

    /**
     * Gets the value of the typeOfResponsibilityRoleRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public TypeOfResponsibilityRoleRefStructure getTypeOfResponsibilityRoleRef() {
        return typeOfResponsibilityRoleRef;
    }

    /**
     * Sets the value of the typeOfResponsibilityRoleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfResponsibilityRoleRefStructure }
     *     
     */
    public void setTypeOfResponsibilityRoleRef(TypeOfResponsibilityRoleRefStructure value) {
        this.typeOfResponsibilityRoleRef = value;
    }

    /**
     * Gets the value of the responsibilityRoleRef property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityRoleRefStructure }
     *     
     */
    public ResponsibilityRoleRefStructure getResponsibilityRoleRef() {
        return responsibilityRoleRef;
    }

    /**
     * Sets the value of the responsibilityRoleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityRoleRefStructure }
     *     
     */
    public void setResponsibilityRoleRef(ResponsibilityRoleRefStructure value) {
        this.responsibilityRoleRef = value;
    }

    /**
     * Gets the value of the responsibleOrganisationRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getResponsibleOrganisationRef() {
        return responsibleOrganisationRef;
    }

    /**
     * Sets the value of the responsibleOrganisationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setResponsibleOrganisationRef(OrganisationRefStructure value) {
        this.responsibleOrganisationRef = value;
    }

    /**
     * Gets the value of the responsiblePartRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartRefStructure }
     *     
     */
    public OrganisationPartRefStructure getResponsiblePartRef() {
        return responsiblePartRef;
    }

    /**
     * Sets the value of the responsiblePartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartRefStructure }
     *     
     */
    public void setResponsiblePartRef(OrganisationPartRefStructure value) {
        this.responsiblePartRef = value;
    }

    /**
     * Gets the value of the responsibleAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getResponsibleAreaRef() {
        return responsibleAreaRef;
    }

    /**
     * Sets the value of the responsibleAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setResponsibleAreaRef(VersionOfObjectRefStructure value) {
        this.responsibleAreaRef = value;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withResponsibilitySetRef(ResponsibilitySetRefStructure value) {
        setResponsibilitySetRef(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withDataRoleType(DataRoleTypeEnumeration... values) {
        if (values!= null) {
            for (DataRoleTypeEnumeration value: values) {
                getDataRoleType().add(value);
            }
        }
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withDataRoleType(Collection<DataRoleTypeEnumeration> values) {
        if (values!= null) {
            getDataRoleType().addAll(values);
        }
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withStakeholderRoleType(StakeholderRoleTypeEnumeration... values) {
        if (values!= null) {
            for (StakeholderRoleTypeEnumeration value: values) {
                getStakeholderRoleType().add(value);
            }
        }
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withStakeholderRoleType(Collection<StakeholderRoleTypeEnumeration> values) {
        if (values!= null) {
            getStakeholderRoleType().addAll(values);
        }
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withTypeOfResponsibilityRoleRef(TypeOfResponsibilityRoleRefStructure value) {
        setTypeOfResponsibilityRoleRef(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withResponsibilityRoleRef(ResponsibilityRoleRefStructure value) {
        setResponsibilityRoleRef(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withResponsibleOrganisationRef(OrganisationRefStructure value) {
        setResponsibleOrganisationRef(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withResponsiblePartRef(OrganisationPartRefStructure value) {
        setResponsiblePartRef(value);
        return this;
    }

    public ResponsibilityRoleAssignment_VersionedChildStructure withResponsibleAreaRef(VersionOfObjectRefStructure value) {
        setResponsibleAreaRef(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ResponsibilityRoleAssignment_VersionedChildStructure withId(String value) {
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
