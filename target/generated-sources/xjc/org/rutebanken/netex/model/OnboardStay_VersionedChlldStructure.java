//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.migesok.jaxb.adapter.javatime.DurationXmlAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for OnboardStay_VersionedChlldStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnboardStay_VersionedChlldStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}OnboardStayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnboardStay_VersionedChlldStructure", propOrder = {
    "name",
    "serviceFacilitySetRef",
    "fareClass",
    "classOfUseRef",
    "boardingPermission",
    "period"
})
@XmlSeeAlso({
    OnboardStay.class
})
public class OnboardStay_VersionedChlldStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "ServiceFacilitySetRef")
    protected ServiceFacilitySetRefStructure serviceFacilitySetRef;
    @XmlElement(name = "FareClass", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "ClassOfUseRef")
    protected ClassOfUseRef classOfUseRef;
    @XmlElement(name = "BoardingPermission")
    @XmlSchemaType(name = "NMTOKEN")
    protected BoardingPermissionEnumeration boardingPermission;
    @XmlElement(name = "Period", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration period;

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
     * Gets the value of the serviceFacilitySetRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFacilitySetRefStructure }
     *     
     */
    public ServiceFacilitySetRefStructure getServiceFacilitySetRef() {
        return serviceFacilitySetRef;
    }

    /**
     * Sets the value of the serviceFacilitySetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFacilitySetRefStructure }
     *     
     */
    public void setServiceFacilitySetRef(ServiceFacilitySetRefStructure value) {
        this.serviceFacilitySetRef = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the classOfUseRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassOfUseRef }
     *     
     */
    public ClassOfUseRef getClassOfUseRef() {
        return classOfUseRef;
    }

    /**
     * Sets the value of the classOfUseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassOfUseRef }
     *     
     */
    public void setClassOfUseRef(ClassOfUseRef value) {
        this.classOfUseRef = value;
    }

    /**
     * Gets the value of the boardingPermission property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPermissionEnumeration }
     *     
     */
    public BoardingPermissionEnumeration getBoardingPermission() {
        return boardingPermission;
    }

    /**
     * Sets the value of the boardingPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPermissionEnumeration }
     *     
     */
    public void setBoardingPermission(BoardingPermissionEnumeration value) {
        this.boardingPermission = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(Duration value) {
        this.period = value;
    }

    public OnboardStay_VersionedChlldStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public OnboardStay_VersionedChlldStructure withServiceFacilitySetRef(ServiceFacilitySetRefStructure value) {
        setServiceFacilitySetRef(value);
        return this;
    }

    public OnboardStay_VersionedChlldStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public OnboardStay_VersionedChlldStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public OnboardStay_VersionedChlldStructure withBoardingPermission(BoardingPermissionEnumeration value) {
        setBoardingPermission(value);
        return this;
    }

    public OnboardStay_VersionedChlldStructure withPeriod(Duration value) {
        setPeriod(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public OnboardStay_VersionedChlldStructure withId(String value) {
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