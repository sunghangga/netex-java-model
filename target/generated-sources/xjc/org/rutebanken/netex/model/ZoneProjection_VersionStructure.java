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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ZoneProjection_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneProjection_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectedZoneRef" type="{http://www.netex.org.uk/netex}ZoneRefStructure"/&gt;
 *         &lt;element name="ProjectToZoneRef" type="{http://www.netex.org.uk/netex}ZoneRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ProjectToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="points" type="{http://www.netex.org.uk/netex}pointRefs_RelStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneProjection_VersionStructure", propOrder = {
    "projectedZoneRef",
    "projectToZoneRef",
    "projectToPointRef",
    "points"
})
@XmlSeeAlso({
    ZoneProjection.class
})
public class ZoneProjection_VersionStructure
    extends Projection_VersionStructure
{

    @XmlElement(name = "ProjectedZoneRef", required = true)
    protected ZoneRefStructure projectedZoneRef;
    @XmlElement(name = "ProjectToZoneRef")
    protected ZoneRefStructure projectToZoneRef;
    @XmlElement(name = "ProjectToPointRef")
    protected PointRefStructure projectToPointRef;
    protected PointRefs_RelStructure points;

    /**
     * Gets the value of the projectedZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getProjectedZoneRef() {
        return projectedZoneRef;
    }

    /**
     * Sets the value of the projectedZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setProjectedZoneRef(ZoneRefStructure value) {
        this.projectedZoneRef = value;
    }

    /**
     * Gets the value of the projectToZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getProjectToZoneRef() {
        return projectToZoneRef;
    }

    /**
     * Sets the value of the projectToZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setProjectToZoneRef(ZoneRefStructure value) {
        this.projectToZoneRef = value;
    }

    /**
     * Gets the value of the projectToPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getProjectToPointRef() {
        return projectToPointRef;
    }

    /**
     * Sets the value of the projectToPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setProjectToPointRef(PointRefStructure value) {
        this.projectToPointRef = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefs_RelStructure }
     *     
     */
    public PointRefs_RelStructure getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefs_RelStructure }
     *     
     */
    public void setPoints(PointRefs_RelStructure value) {
        this.points = value;
    }

    public ZoneProjection_VersionStructure withProjectedZoneRef(ZoneRefStructure value) {
        setProjectedZoneRef(value);
        return this;
    }

    public ZoneProjection_VersionStructure withProjectToZoneRef(ZoneRefStructure value) {
        setProjectToZoneRef(value);
        return this;
    }

    public ZoneProjection_VersionStructure withProjectToPointRef(PointRefStructure value) {
        setProjectToPointRef(value);
        return this;
    }

    public ZoneProjection_VersionStructure withPoints(PointRefs_RelStructure value) {
        setPoints(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ZoneProjection_VersionStructure withId(String value) {
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