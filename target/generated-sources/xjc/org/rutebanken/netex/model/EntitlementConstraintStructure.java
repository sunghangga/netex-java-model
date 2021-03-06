//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for EntitlementConstraintStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementConstraintStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}TimeRelativeConstraintGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkRelativeConstraintGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceRelativeConstraintGroup"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}EligibilityRelativeConstraintGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementConstraintStructure", propOrder = {
    "periodConstraint",
    "originConstraint",
    "destinationConstraint",
    "tariffZoneConstraint",
    "routeConstraint",
    "directionConstraint",
    "operatorConstraint",
    "typeOfProductCategoryConstraint",
    "classOfUseConstraint",
    "typeOfTravelDocumentConstraint",
    "journeyConstraint",
    "userConstraint",
    "specificToProfiles"
})
public class EntitlementConstraintStructure {

    @XmlElement(name = "PeriodConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SamePeriodEnumeration periodConstraint;
    @XmlElement(name = "OriginConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameStopEnumeration originConstraint;
    @XmlElement(name = "DestinationConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameStopEnumeration destinationConstraint;
    @XmlElement(name = "TariffZoneConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameZoneEnumeration tariffZoneConstraint;
    @XmlElement(name = "RouteConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameRouteEnumeration routeConstraint;
    @XmlElement(name = "DirectionConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameRouteEnumeration directionConstraint;
    @XmlElement(name = "OperatorConstraint", defaultValue = "participating")
    @XmlSchemaType(name = "normalizedString")
    protected SameOperatorEnumeration operatorConstraint;
    @XmlElement(name = "TypeOfProductCategoryConstraint", defaultValue = "sameOrEquivalent")
    @XmlSchemaType(name = "normalizedString")
    protected SameTypeOfProductCategoryEnumeration typeOfProductCategoryConstraint;
    @XmlElement(name = "ClassOfUseConstraint", defaultValue = "sameOrEquivalent")
    @XmlSchemaType(name = "normalizedString")
    protected SameClassOfUseEnumeration classOfUseConstraint;
    @XmlElement(name = "TypeOfTravelDocumentConstraint")
    @XmlSchemaType(name = "normalizedString")
    protected SameTypeOfTravelDocumentEnumeration typeOfTravelDocumentConstraint;
    @XmlElement(name = "JourneyConstraint", defaultValue = "same")
    @XmlSchemaType(name = "normalizedString")
    protected SameJourneyEnumeration journeyConstraint;
    @XmlElement(name = "UserConstraint", defaultValue = "samePerson")
    @XmlSchemaType(name = "normalizedString")
    protected SameUserEnumeration userConstraint;
    protected UserProfileRefs_RelStructure specificToProfiles;

    /**
     * Gets the value of the periodConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SamePeriodEnumeration }
     *     
     */
    public SamePeriodEnumeration getPeriodConstraint() {
        return periodConstraint;
    }

    /**
     * Sets the value of the periodConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamePeriodEnumeration }
     *     
     */
    public void setPeriodConstraint(SamePeriodEnumeration value) {
        this.periodConstraint = value;
    }

    /**
     * Gets the value of the originConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameStopEnumeration }
     *     
     */
    public SameStopEnumeration getOriginConstraint() {
        return originConstraint;
    }

    /**
     * Sets the value of the originConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameStopEnumeration }
     *     
     */
    public void setOriginConstraint(SameStopEnumeration value) {
        this.originConstraint = value;
    }

    /**
     * Gets the value of the destinationConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameStopEnumeration }
     *     
     */
    public SameStopEnumeration getDestinationConstraint() {
        return destinationConstraint;
    }

    /**
     * Sets the value of the destinationConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameStopEnumeration }
     *     
     */
    public void setDestinationConstraint(SameStopEnumeration value) {
        this.destinationConstraint = value;
    }

    /**
     * Gets the value of the tariffZoneConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameZoneEnumeration }
     *     
     */
    public SameZoneEnumeration getTariffZoneConstraint() {
        return tariffZoneConstraint;
    }

    /**
     * Sets the value of the tariffZoneConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameZoneEnumeration }
     *     
     */
    public void setTariffZoneConstraint(SameZoneEnumeration value) {
        this.tariffZoneConstraint = value;
    }

    /**
     * Gets the value of the routeConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public SameRouteEnumeration getRouteConstraint() {
        return routeConstraint;
    }

    /**
     * Sets the value of the routeConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public void setRouteConstraint(SameRouteEnumeration value) {
        this.routeConstraint = value;
    }

    /**
     * Gets the value of the directionConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public SameRouteEnumeration getDirectionConstraint() {
        return directionConstraint;
    }

    /**
     * Sets the value of the directionConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameRouteEnumeration }
     *     
     */
    public void setDirectionConstraint(SameRouteEnumeration value) {
        this.directionConstraint = value;
    }

    /**
     * Gets the value of the operatorConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameOperatorEnumeration }
     *     
     */
    public SameOperatorEnumeration getOperatorConstraint() {
        return operatorConstraint;
    }

    /**
     * Sets the value of the operatorConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameOperatorEnumeration }
     *     
     */
    public void setOperatorConstraint(SameOperatorEnumeration value) {
        this.operatorConstraint = value;
    }

    /**
     * Gets the value of the typeOfProductCategoryConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameTypeOfProductCategoryEnumeration }
     *     
     */
    public SameTypeOfProductCategoryEnumeration getTypeOfProductCategoryConstraint() {
        return typeOfProductCategoryConstraint;
    }

    /**
     * Sets the value of the typeOfProductCategoryConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameTypeOfProductCategoryEnumeration }
     *     
     */
    public void setTypeOfProductCategoryConstraint(SameTypeOfProductCategoryEnumeration value) {
        this.typeOfProductCategoryConstraint = value;
    }

    /**
     * Gets the value of the classOfUseConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameClassOfUseEnumeration }
     *     
     */
    public SameClassOfUseEnumeration getClassOfUseConstraint() {
        return classOfUseConstraint;
    }

    /**
     * Sets the value of the classOfUseConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameClassOfUseEnumeration }
     *     
     */
    public void setClassOfUseConstraint(SameClassOfUseEnumeration value) {
        this.classOfUseConstraint = value;
    }

    /**
     * Gets the value of the typeOfTravelDocumentConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameTypeOfTravelDocumentEnumeration }
     *     
     */
    public SameTypeOfTravelDocumentEnumeration getTypeOfTravelDocumentConstraint() {
        return typeOfTravelDocumentConstraint;
    }

    /**
     * Sets the value of the typeOfTravelDocumentConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameTypeOfTravelDocumentEnumeration }
     *     
     */
    public void setTypeOfTravelDocumentConstraint(SameTypeOfTravelDocumentEnumeration value) {
        this.typeOfTravelDocumentConstraint = value;
    }

    /**
     * Gets the value of the journeyConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameJourneyEnumeration }
     *     
     */
    public SameJourneyEnumeration getJourneyConstraint() {
        return journeyConstraint;
    }

    /**
     * Sets the value of the journeyConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameJourneyEnumeration }
     *     
     */
    public void setJourneyConstraint(SameJourneyEnumeration value) {
        this.journeyConstraint = value;
    }

    /**
     * Gets the value of the userConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link SameUserEnumeration }
     *     
     */
    public SameUserEnumeration getUserConstraint() {
        return userConstraint;
    }

    /**
     * Sets the value of the userConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SameUserEnumeration }
     *     
     */
    public void setUserConstraint(SameUserEnumeration value) {
        this.userConstraint = value;
    }

    /**
     * Gets the value of the specificToProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileRefs_RelStructure }
     *     
     */
    public UserProfileRefs_RelStructure getSpecificToProfiles() {
        return specificToProfiles;
    }

    /**
     * Sets the value of the specificToProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileRefs_RelStructure }
     *     
     */
    public void setSpecificToProfiles(UserProfileRefs_RelStructure value) {
        this.specificToProfiles = value;
    }

    public EntitlementConstraintStructure withPeriodConstraint(SamePeriodEnumeration value) {
        setPeriodConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withOriginConstraint(SameStopEnumeration value) {
        setOriginConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withDestinationConstraint(SameStopEnumeration value) {
        setDestinationConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withTariffZoneConstraint(SameZoneEnumeration value) {
        setTariffZoneConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withRouteConstraint(SameRouteEnumeration value) {
        setRouteConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withDirectionConstraint(SameRouteEnumeration value) {
        setDirectionConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withOperatorConstraint(SameOperatorEnumeration value) {
        setOperatorConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withTypeOfProductCategoryConstraint(SameTypeOfProductCategoryEnumeration value) {
        setTypeOfProductCategoryConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withClassOfUseConstraint(SameClassOfUseEnumeration value) {
        setClassOfUseConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withTypeOfTravelDocumentConstraint(SameTypeOfTravelDocumentEnumeration value) {
        setTypeOfTravelDocumentConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withJourneyConstraint(SameJourneyEnumeration value) {
        setJourneyConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withUserConstraint(SameUserEnumeration value) {
        setUserConstraint(value);
        return this;
    }

    public EntitlementConstraintStructure withSpecificToProfiles(UserProfileRefs_RelStructure value) {
        setSpecificToProfiles(value);
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
