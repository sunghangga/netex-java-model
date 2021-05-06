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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for GroupOfServices_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfServices_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfEntities_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}GroupOfServicesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfServices_VersionStructure", propOrder = {
    "dayTypes",
    "directionType",
    "directionRef",
    "directionView",
    "origin",
    "destination",
    "destinationDisplays",
    "members",
    "noticeAssignments"
})
@XmlSeeAlso({
    GroupOfServices.class
})
public class GroupOfServices_VersionStructure
    extends GroupOfEntities_VersionStructure
{

    protected GroupOfServices_VersionStructure.DayTypes dayTypes;
    @XmlElement(name = "DirectionType", defaultValue = "outbound")
    @XmlSchemaType(name = "normalizedString")
    protected DirectionTypeEnumeration directionType;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DirectionView")
    protected DirectionView directionView;
    @XmlElement(name = "Origin")
    protected GroupOfServicesEndPoint_DerivedViewStructure origin;
    @XmlElement(name = "Destination")
    protected GroupOfServicesEndPoint_DerivedViewStructure destination;
    protected DestinationDisplayRefs_RelStructure destinationDisplays;
    protected GroupOfServicesMembers_RelStructure members;
    protected NoticeAssignments_RelStructure noticeAssignments;

    /**
     * Gets the value of the dayTypes property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServices_VersionStructure.DayTypes }
     *     
     */
    public GroupOfServices_VersionStructure.DayTypes getDayTypes() {
        return dayTypes;
    }

    /**
     * Sets the value of the dayTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServices_VersionStructure.DayTypes }
     *     
     */
    public void setDayTypes(GroupOfServices_VersionStructure.DayTypes value) {
        this.dayTypes = value;
    }

    /**
     * Gets the value of the directionType property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public DirectionTypeEnumeration getDirectionType() {
        return directionType;
    }

    /**
     * Sets the value of the directionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionTypeEnumeration }
     *     
     */
    public void setDirectionType(DirectionTypeEnumeration value) {
        this.directionType = value;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the directionView property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionView }
     *     
     */
    public DirectionView getDirectionView() {
        return directionView;
    }

    /**
     * Sets the value of the directionView property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionView }
     *     
     */
    public void setDirectionView(DirectionView value) {
        this.directionView = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesEndPoint_DerivedViewStructure }
     *     
     */
    public GroupOfServicesEndPoint_DerivedViewStructure getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesEndPoint_DerivedViewStructure }
     *     
     */
    public void setOrigin(GroupOfServicesEndPoint_DerivedViewStructure value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesEndPoint_DerivedViewStructure }
     *     
     */
    public GroupOfServicesEndPoint_DerivedViewStructure getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesEndPoint_DerivedViewStructure }
     *     
     */
    public void setDestination(GroupOfServicesEndPoint_DerivedViewStructure value) {
        this.destination = value;
    }

    /**
     * Gets the value of the destinationDisplays property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationDisplayRefs_RelStructure }
     *     
     */
    public DestinationDisplayRefs_RelStructure getDestinationDisplays() {
        return destinationDisplays;
    }

    /**
     * Sets the value of the destinationDisplays property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationDisplayRefs_RelStructure }
     *     
     */
    public void setDestinationDisplays(DestinationDisplayRefs_RelStructure value) {
        this.destinationDisplays = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfServicesMembers_RelStructure }
     *     
     */
    public GroupOfServicesMembers_RelStructure getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfServicesMembers_RelStructure }
     *     
     */
    public void setMembers(GroupOfServicesMembers_RelStructure value) {
        this.members = value;
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

    public GroupOfServices_VersionStructure withDayTypes(GroupOfServices_VersionStructure.DayTypes value) {
        setDayTypes(value);
        return this;
    }

    public GroupOfServices_VersionStructure withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    public GroupOfServices_VersionStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public GroupOfServices_VersionStructure withDirectionView(DirectionView value) {
        setDirectionView(value);
        return this;
    }

    public GroupOfServices_VersionStructure withOrigin(GroupOfServicesEndPoint_DerivedViewStructure value) {
        setOrigin(value);
        return this;
    }

    public GroupOfServices_VersionStructure withDestination(GroupOfServicesEndPoint_DerivedViewStructure value) {
        setDestination(value);
        return this;
    }

    public GroupOfServices_VersionStructure withDestinationDisplays(DestinationDisplayRefs_RelStructure value) {
        setDestinationDisplays(value);
        return this;
    }

    public GroupOfServices_VersionStructure withMembers(GroupOfServicesMembers_RelStructure value) {
        setMembers(value);
        return this;
    }

    public GroupOfServices_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withInfoLinks(GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GroupOfServices_VersionStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DayTypeRef" type="{http://www.netex.org.uk/netex}DayTypeRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dayTypeRef"
    })
    public static class DayTypes {

        @XmlElement(name = "DayTypeRef", required = true)
        protected List<DayTypeRefStructure> dayTypeRef;

        /**
         * Gets the value of the dayTypeRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dayTypeRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDayTypeRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayTypeRefStructure }
         * 
         * 
         */
        public List<DayTypeRefStructure> getDayTypeRef() {
            if (dayTypeRef == null) {
                dayTypeRef = new ArrayList<DayTypeRefStructure>();
            }
            return this.dayTypeRef;
        }

        public GroupOfServices_VersionStructure.DayTypes withDayTypeRef(DayTypeRefStructure... values) {
            if (values!= null) {
                for (DayTypeRefStructure value: values) {
                    getDayTypeRef().add(value);
                }
            }
            return this;
        }

        public GroupOfServices_VersionStructure.DayTypes withDayTypeRef(Collection<DayTypeRefStructure> values) {
            if (values!= null) {
                getDayTypeRef().addAll(values);
            }
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

}