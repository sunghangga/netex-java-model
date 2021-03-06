//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Accommodation_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accommodation_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}AccommodationGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accommodation_VersionedChildStructure", propOrder = {
    "name",
    "serviceFacilitySetRef",
    "fareClass",
    "classOfUseRef",
    "accommodationFacility",
    "couchetteFacility",
    "maximumNumberOfBerths",
    "berthFacility",
    "showerFacility",
    "toiletFacility",
    "genderLimitation",
    "nuisanceFacilityList",
    "passengerCommsFacilityList"
})
@XmlSeeAlso({
    Accommodation.class
})
public class Accommodation_VersionedChildStructure
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
    @XmlElement(name = "AccommodationFacility", defaultValue = "seating")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "CouchetteFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected CouchetteFacilityEnumeration couchetteFacility;
    @XmlElement(name = "MaximumNumberOfBerths")
    protected BigInteger maximumNumberOfBerths;
    @XmlElement(name = "BerthFacility")
    @XmlSchemaType(name = "NMTOKEN")
    protected BerthFacilityEnumeration berthFacility;
    @XmlElement(name = "ShowerFacility", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected SanitaryFacilityEnumeration showerFacility;
    @XmlElement(name = "ToiletFacility", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected SanitaryFacilityEnumeration toiletFacility;
    @XmlElement(name = "GenderLimitation")
    @XmlSchemaType(name = "normalizedString")
    protected GenderLimitationEnumeration genderLimitation;
    @XmlList
    @XmlElement(name = "NuisanceFacilityList")
    protected List<NuisanceFacilityEnumeration> nuisanceFacilityList;
    @XmlList
    @XmlElement(name = "PassengerCommsFacilityList")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacilityList;

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
     * Gets the value of the accommodationFacility property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Sets the value of the accommodationFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    /**
     * Gets the value of the couchetteFacility property.
     * 
     * @return
     *     possible object is
     *     {@link CouchetteFacilityEnumeration }
     *     
     */
    public CouchetteFacilityEnumeration getCouchetteFacility() {
        return couchetteFacility;
    }

    /**
     * Sets the value of the couchetteFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouchetteFacilityEnumeration }
     *     
     */
    public void setCouchetteFacility(CouchetteFacilityEnumeration value) {
        this.couchetteFacility = value;
    }

    /**
     * Gets the value of the maximumNumberOfBerths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfBerths() {
        return maximumNumberOfBerths;
    }

    /**
     * Sets the value of the maximumNumberOfBerths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfBerths(BigInteger value) {
        this.maximumNumberOfBerths = value;
    }

    /**
     * Gets the value of the berthFacility property.
     * 
     * @return
     *     possible object is
     *     {@link BerthFacilityEnumeration }
     *     
     */
    public BerthFacilityEnumeration getBerthFacility() {
        return berthFacility;
    }

    /**
     * Sets the value of the berthFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerthFacilityEnumeration }
     *     
     */
    public void setBerthFacility(BerthFacilityEnumeration value) {
        this.berthFacility = value;
    }

    /**
     * Gets the value of the showerFacility property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getShowerFacility() {
        return showerFacility;
    }

    /**
     * Sets the value of the showerFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setShowerFacility(SanitaryFacilityEnumeration value) {
        this.showerFacility = value;
    }

    /**
     * Gets the value of the toiletFacility property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getToiletFacility() {
        return toiletFacility;
    }

    /**
     * Sets the value of the toiletFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setToiletFacility(SanitaryFacilityEnumeration value) {
        this.toiletFacility = value;
    }

    /**
     * Gets the value of the genderLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public GenderLimitationEnumeration getGenderLimitation() {
        return genderLimitation;
    }

    /**
     * Sets the value of the genderLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderLimitationEnumeration }
     *     
     */
    public void setGenderLimitation(GenderLimitationEnumeration value) {
        this.genderLimitation = value;
    }

    /**
     * Gets the value of the nuisanceFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacilityList() {
        if (nuisanceFacilityList == null) {
            nuisanceFacilityList = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacilityList;
    }

    /**
     * Gets the value of the passengerCommsFacilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacilityList() {
        if (passengerCommsFacilityList == null) {
            passengerCommsFacilityList = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacilityList;
    }

    public Accommodation_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withServiceFacilitySetRef(ServiceFacilitySetRefStructure value) {
        setServiceFacilitySetRef(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withAccommodationFacility(AccommodationFacilityEnumeration value) {
        setAccommodationFacility(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withCouchetteFacility(CouchetteFacilityEnumeration value) {
        setCouchetteFacility(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withMaximumNumberOfBerths(BigInteger value) {
        setMaximumNumberOfBerths(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withBerthFacility(BerthFacilityEnumeration value) {
        setBerthFacility(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withShowerFacility(SanitaryFacilityEnumeration value) {
        setShowerFacility(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withToiletFacility(SanitaryFacilityEnumeration value) {
        setToiletFacility(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withGenderLimitation(GenderLimitationEnumeration value) {
        setGenderLimitation(value);
        return this;
    }

    public Accommodation_VersionedChildStructure withNuisanceFacilityList(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacilityList().add(value);
            }
        }
        return this;
    }

    public Accommodation_VersionedChildStructure withNuisanceFacilityList(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacilityList().addAll(values);
        }
        return this;
    }

    public Accommodation_VersionedChildStructure withPassengerCommsFacilityList(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacilityList().add(value);
            }
        }
        return this;
    }

    public Accommodation_VersionedChildStructure withPassengerCommsFacilityList(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Accommodation_VersionedChildStructure withId(String value) {
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
