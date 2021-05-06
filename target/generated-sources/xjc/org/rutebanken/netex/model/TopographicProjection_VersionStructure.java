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
 * <p>Java class for TopographicProjection_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopographicProjection_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Projection_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TopographicProjectionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicProjection_VersionStructure", propOrder = {
    "projectedObjectRef",
    "countryRef",
    "topographicPlaceRef"
})
@XmlSeeAlso({
    TopographicProjection.class
})
public class TopographicProjection_VersionStructure
    extends Projection_VersionStructure
{

    @XmlElement(name = "ProjectedObjectRef")
    protected VersionOfObjectRefStructure projectedObjectRef;
    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;

    /**
     * Gets the value of the projectedObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public VersionOfObjectRefStructure getProjectedObjectRef() {
        return projectedObjectRef;
    }

    /**
     * Sets the value of the projectedObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionOfObjectRefStructure }
     *     
     */
    public void setProjectedObjectRef(VersionOfObjectRefStructure value) {
        this.projectedObjectRef = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRef }
     *     
     */
    public CountryRef getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRef }
     *     
     */
    public void setCountryRef(CountryRef value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the topographicPlaceRef property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Sets the value of the topographicPlaceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    public TopographicProjection_VersionStructure withProjectedObjectRef(VersionOfObjectRefStructure value) {
        setProjectedObjectRef(value);
        return this;
    }

    public TopographicProjection_VersionStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    public TopographicProjection_VersionStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withTypeOfProjectionRef(TypeOfProjectionRefStructure value) {
        setTypeOfProjectionRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withSpatialFeatureRef(JAXBElement<? extends GroupOfPointsRefStructure> value) {
        setSpatialFeatureRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TopographicProjection_VersionStructure withId(String value) {
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
