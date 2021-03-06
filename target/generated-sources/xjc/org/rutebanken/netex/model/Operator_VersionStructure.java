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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml._3.PolygonType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Operator_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operator_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Organisation_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}OperatorGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operator_VersionStructure", propOrder = {
    "countryRef",
    "address",
    "primaryMode",
    "operatorActivities",
    "customerServiceContactDetails",
    "departments"
})
@XmlSeeAlso({
    Operator.class
})
public class Operator_VersionStructure
    extends Organisation_VersionStructure
{

    @XmlElement(name = "CountryRef")
    protected CountryRef countryRef;
    @XmlElement(name = "Address")
    protected Operator_VersionStructure.Address address;
    @XmlElement(name = "PrimaryMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleModeEnumeration primaryMode;
    @XmlList
    @XmlElement(name = "OperatorActivities", defaultValue = "passenger")
    protected List<OperatorActivitiesEnumeration> operatorActivities;
    @XmlElement(name = "CustomerServiceContactDetails")
    protected ContactStructure customerServiceContactDetails;
    protected Departments_RelStructure departments;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Operator_VersionStructure.Address }
     *     
     */
    public Operator_VersionStructure.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator_VersionStructure.Address }
     *     
     */
    public void setAddress(Operator_VersionStructure.Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the primaryMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public VehicleModeEnumeration getPrimaryMode() {
        return primaryMode;
    }

    /**
     * Sets the value of the primaryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModeEnumeration }
     *     
     */
    public void setPrimaryMode(VehicleModeEnumeration value) {
        this.primaryMode = value;
    }

    /**
     * Gets the value of the operatorActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorActivitiesEnumeration }
     * 
     * 
     */
    public List<OperatorActivitiesEnumeration> getOperatorActivities() {
        if (operatorActivities == null) {
            operatorActivities = new ArrayList<OperatorActivitiesEnumeration>();
        }
        return this.operatorActivities;
    }

    /**
     * Gets the value of the customerServiceContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactStructure }
     *     
     */
    public ContactStructure getCustomerServiceContactDetails() {
        return customerServiceContactDetails;
    }

    /**
     * Sets the value of the customerServiceContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactStructure }
     *     
     */
    public void setCustomerServiceContactDetails(ContactStructure value) {
        this.customerServiceContactDetails = value;
    }

    /**
     * Gets the value of the departments property.
     * 
     * @return
     *     possible object is
     *     {@link Departments_RelStructure }
     *     
     */
    public Departments_RelStructure getDepartments() {
        return departments;
    }

    /**
     * Sets the value of the departments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Departments_RelStructure }
     *     
     */
    public void setDepartments(Departments_RelStructure value) {
        this.departments = value;
    }

    public Operator_VersionStructure withCountryRef(CountryRef value) {
        setCountryRef(value);
        return this;
    }

    public Operator_VersionStructure withAddress(Operator_VersionStructure.Address value) {
        setAddress(value);
        return this;
    }

    public Operator_VersionStructure withPrimaryMode(VehicleModeEnumeration value) {
        setPrimaryMode(value);
        return this;
    }

    public Operator_VersionStructure withOperatorActivities(OperatorActivitiesEnumeration... values) {
        if (values!= null) {
            for (OperatorActivitiesEnumeration value: values) {
                getOperatorActivities().add(value);
            }
        }
        return this;
    }

    public Operator_VersionStructure withOperatorActivities(Collection<OperatorActivitiesEnumeration> values) {
        if (values!= null) {
            getOperatorActivities().addAll(values);
        }
        return this;
    }

    public Operator_VersionStructure withCustomerServiceContactDetails(ContactStructure value) {
        setCustomerServiceContactDetails(value);
        return this;
    }

    public Operator_VersionStructure withDepartments(Departments_RelStructure value) {
        setDepartments(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withCompanyNumber(String value) {
        setCompanyNumber(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withExternalOperatorRef(ExternalObjectRefStructure value) {
        setExternalOperatorRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withLegalName(MultilingualString value) {
        setLegalName(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withTradingName(MultilingualString value) {
        setTradingName(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withAlternativeNames(AlternativeNames_RelStructure value) {
        setAlternativeNames(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withRemarks(MultilingualString value) {
        setRemarks(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withLocale(LocaleStructure value) {
        setLocale(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withPrivateContactDetails(ContactStructure value) {
        setPrivateContactDetails(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withOrganisationType(OrganisationTypeEnumeration... values) {
        if (values!= null) {
            for (OrganisationTypeEnumeration value: values) {
                getOrganisationType().add(value);
            }
        }
        return this;
    }

    @Override
    public Operator_VersionStructure withOrganisationType(Collection<OrganisationTypeEnumeration> values) {
        if (values!= null) {
            getOrganisationType().addAll(values);
        }
        return this;
    }

    @Override
    public Operator_VersionStructure withTypesOfOrganisation(TypeOfOrganisationRefs_RelStructure value) {
        setTypesOfOrganisation(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withStatusOrganisationGroup(Boolean value) {
        setStatusOrganisationGroup(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withValidityPeriod(Organisation_VersionStructure.ValidityPeriod value) {
        setValidityPeriod(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withParts(Organisation_VersionStructure.Parts value) {
        setParts(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withOwnResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setOwnResponsibilitySets(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDelegatedResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setDelegatedResponsibilitySets(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDelegatedFrom(OrganisationRefs_RelStructure value) {
        setDelegatedFrom(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Operator_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Operator_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Operator_VersionStructure withId(String value) {
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
     *     &lt;restriction base="{http://www.netex.org.uk/netex}PostalAddress_VersionStructure"&gt;
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;group ref="{http://www.netex.org.uk/netex}GroupOfEntitiesGroup"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;group ref="{http://www.netex.org.uk/netex}PlaceGroup"/&gt;
     *         &lt;sequence&gt;
     *           &lt;group ref="{http://www.netex.org.uk/netex}AddressGroup"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;group ref="{http://www.netex.org.uk/netex}PostalAddressGroup"/&gt;
     *           &lt;element name="RoadAddressRef" type="{http://www.netex.org.uk/netex}AddressRefStructure" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends PostalAddress_VersionStructure
    {


        @Override
        public Operator_VersionStructure.Address withHouseNumber(String value) {
            setHouseNumber(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withBuildingName(MultilingualString value) {
            setBuildingName(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withAddressLine1(MultilingualString value) {
            setAddressLine1(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withAddressLine2(MultilingualString value) {
            setAddressLine2(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withStreet(MultilingualString value) {
            setStreet(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withTown(MultilingualString value) {
            setTown(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withSuburb(MultilingualString value) {
            setSuburb(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPostCode(String value) {
            setPostCode(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPostCodeExtension(String value) {
            setPostCodeExtension(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPostalRegion(String value) {
            setPostalRegion(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withProvince(MultilingualString value) {
            setProvince(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withRoadAddressRef(AddressRefStructure value) {
            setRoadAddressRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withCountryRef(CountryRef value) {
            setCountryRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withCountryName(MultilingualString value) {
            setCountryName(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPlaceTypes(TypeOfPlaceRefs_RelStructure value) {
            setPlaceTypes(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withTypes(TypeOfZoneRefs_RelStructure value) {
            setTypes(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withCentroid(SimplePoint_VersionStructure value) {
            setCentroid(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPolygon(PolygonType value) {
            setPolygon(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withProjections(Projections_RelStructure value) {
            setProjections(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withParentZoneRef(ZoneRefStructure value) {
            setParentZoneRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withMembers(PointRefs_RelStructure value) {
            setMembers(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withName(MultilingualString value) {
            setName(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withShortName(MultilingualString value) {
            setShortName(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withDescription(MultilingualString value) {
            setDescription(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
            setPurposeOfGroupingRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withPrivateCode(PrivateCodeStructure value) {
            setPrivateCode(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
            setInfoLinks(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withKeyList(KeyListStructure value) {
            setKeyList(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withExtensions(ExtensionsStructure value) {
            setExtensions(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withBrandingRef(BrandingRefStructure value) {
            setBrandingRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withResponsibilitySetRef(String value) {
            setResponsibilitySetRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withValidityConditions(ValidityConditions_RelStructure value) {
            setValidityConditions(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withValidBetween(ValidBetween... values) {
            if (values!= null) {
                for (ValidBetween value: values) {
                    getValidBetween().add(value);
                }
            }
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withValidBetween(Collection<ValidBetween> values) {
            if (values!= null) {
                getValidBetween().addAll(values);
            }
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withAlternativeTexts(AlternativeTexts_RelStructure value) {
            setAlternativeTexts(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withDataSourceRef(String value) {
            setDataSourceRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withCreated(LocalDateTime value) {
            setCreated(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withChanged(LocalDateTime value) {
            setChanged(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withModification(ModificationEnumeration value) {
            setModification(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withVersion(String value) {
            setVersion(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
            setStatus_BasicModificationDetailsGroup(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
            setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withCompatibleWithVersionFrameVersionRef(String value) {
            setCompatibleWithVersionFrameVersionRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withDerivedFromObjectRef(String value) {
            setDerivedFromObjectRef(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withNameOfClass(String value) {
            setNameOfClass(value);
            return this;
        }

        @Override
        public Operator_VersionStructure.Address withId(String value) {
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

}
