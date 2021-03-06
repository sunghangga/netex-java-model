//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
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
 * <p>Java class for PointProjection_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointProjection_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectedPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ProjectToPointRef" type="{http://www.netex.org.uk/netex}PointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="ProjectToLinkRef" type="{http://www.netex.org.uk/netex}LinkRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.netex.org.uk/netex}LengthType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointProjection_VersionStructure", propOrder = {
    "projectedPointRef",
    "projectToPointRef",
    "projectToLinkRef",
    "distance"
})
@XmlSeeAlso({
    PointProjection.class
})
public class PointProjection_VersionStructure
    extends Projection_VersionStructure
{

    @XmlElement(name = "ProjectedPointRef")
    protected PointRefStructure projectedPointRef;
    @XmlElement(name = "ProjectToPointRef")
    protected PointRefStructure projectToPointRef;
    @XmlElement(name = "ProjectToLinkRef")
    protected LinkRefStructure projectToLinkRef;
    @XmlElement(name = "Distance")
    protected BigDecimal distance;

    /**
     * Gets the value of the projectedPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link PointRefStructure }
     *     
     */
    public PointRefStructure getProjectedPointRef() {
        return projectedPointRef;
    }

    /**
     * Sets the value of the projectedPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointRefStructure }
     *     
     */
    public void setProjectedPointRef(PointRefStructure value) {
        this.projectedPointRef = value;
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
     * Gets the value of the projectToLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkRefStructure }
     *     
     */
    public LinkRefStructure getProjectToLinkRef() {
        return projectToLinkRef;
    }

    /**
     * Sets the value of the projectToLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkRefStructure }
     *     
     */
    public void setProjectToLinkRef(LinkRefStructure value) {
        this.projectToLinkRef = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    public PointProjection_VersionStructure withProjectedPointRef(PointRefStructure value) {
        setProjectedPointRef(value);
        return this;
    }

    public PointProjection_VersionStructure withProjectToPointRef(PointRefStructure value) {
        setProjectToPointRef(value);
        return this;
    }

    public PointProjection_VersionStructure withProjectToLinkRef(LinkRefStructure value) {
        setProjectToLinkRef(value);
        return this;
    }

    public PointProjection_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public PointProjection_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public PointProjection_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PointProjection_VersionStructure withId(String value) {
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
