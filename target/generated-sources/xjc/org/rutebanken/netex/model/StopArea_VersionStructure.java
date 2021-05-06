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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for StopArea_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopArea_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Zone_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}StopAreaGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopArea_VersionStructure", propOrder = {
    "publicCode",
    "parentStopAreaRef",
    "topographicPlaceRef",
    "topographicPlaceView"
})
@XmlSeeAlso({
    StopArea.class
})
public class StopArea_VersionStructure
    extends Zone_VersionStructure
{

    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "ParentStopAreaRef")
    protected StopAreaRefStructure parentStopAreaRef;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "TopographicPlaceView")
    protected TopographicPlaceView topographicPlaceView;

    /**
     * Gets the value of the publicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicCode() {
        return publicCode;
    }

    /**
     * Sets the value of the publicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicCode(String value) {
        this.publicCode = value;
    }

    /**
     * Gets the value of the parentStopAreaRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public StopAreaRefStructure getParentStopAreaRef() {
        return parentStopAreaRef;
    }

    /**
     * Sets the value of the parentStopAreaRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAreaRefStructure }
     *     
     */
    public void setParentStopAreaRef(StopAreaRefStructure value) {
        this.parentStopAreaRef = value;
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

    /**
     * Gets the value of the topographicPlaceView property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceView }
     *     
     */
    public TopographicPlaceView getTopographicPlaceView() {
        return topographicPlaceView;
    }

    /**
     * Sets the value of the topographicPlaceView property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceView }
     *     
     */
    public void setTopographicPlaceView(TopographicPlaceView value) {
        this.topographicPlaceView = value;
    }

    public StopArea_VersionStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public StopArea_VersionStructure withParentStopAreaRef(StopAreaRefStructure value) {
        setParentStopAreaRef(value);
        return this;
    }

    public StopArea_VersionStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public StopArea_VersionStructure withTopographicPlaceView(TopographicPlaceView value) {
        setTopographicPlaceView(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withTypes(TypeOfZoneRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withCentroid(SimplePoint_VersionStructure value) {
        setCentroid(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withPolygon(PolygonType value) {
        setPolygon(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withParentZoneRef(ZoneRefStructure value) {
        setParentZoneRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withMembers(PointRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public StopArea_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public StopArea_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public StopArea_VersionStructure withId(String value) {
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