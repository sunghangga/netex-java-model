//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

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
 * <p>Java class for RoutePoint_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePoint_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Point_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}RoutePointGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePoint_VersionStructure", propOrder = {
    "viaFlag",
    "borderCrossing"
})
@XmlSeeAlso({
    RoutePoint.class
})
public class RoutePoint_VersionStructure
    extends Point_VersionStructure
{

    @XmlElement(name = "ViaFlag", defaultValue = "false")
    protected Boolean viaFlag;
    @XmlElement(name = "BorderCrossing", defaultValue = "false")
    protected Boolean borderCrossing;

    /**
     * Gets the value of the viaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViaFlag() {
        return viaFlag;
    }

    /**
     * Sets the value of the viaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViaFlag(Boolean value) {
        this.viaFlag = value;
    }

    /**
     * Gets the value of the borderCrossing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBorderCrossing() {
        return borderCrossing;
    }

    /**
     * Sets the value of the borderCrossing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBorderCrossing(Boolean value) {
        this.borderCrossing = value;
    }

    public RoutePoint_VersionStructure withViaFlag(Boolean value) {
        setViaFlag(value);
        return this;
    }

    public RoutePoint_VersionStructure withBorderCrossing(Boolean value) {
        setBorderCrossing(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withPointNumber(String value) {
        setPointNumber(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withTypes(TypeOfPointRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withGroupMemberships(GroupMembershipRefs_RelStructure value) {
        setGroupMemberships(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public RoutePoint_VersionStructure withId(String value) {
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