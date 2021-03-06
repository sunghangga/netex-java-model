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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}Accommodation_VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}VersionedChildGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}AccommodationGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}AccommodationIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Accommodation
    extends Accommodation_VersionedChildStructure
{


    @Override
    public Accommodation withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Accommodation withServiceFacilitySetRef(ServiceFacilitySetRefStructure value) {
        setServiceFacilitySetRef(value);
        return this;
    }

    @Override
    public Accommodation withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    @Override
    public Accommodation withClassOfUseRef(ClassOfUseRef value) {
        setClassOfUseRef(value);
        return this;
    }

    @Override
    public Accommodation withAccommodationFacility(AccommodationFacilityEnumeration value) {
        setAccommodationFacility(value);
        return this;
    }

    @Override
    public Accommodation withCouchetteFacility(CouchetteFacilityEnumeration value) {
        setCouchetteFacility(value);
        return this;
    }

    @Override
    public Accommodation withMaximumNumberOfBerths(BigInteger value) {
        setMaximumNumberOfBerths(value);
        return this;
    }

    @Override
    public Accommodation withBerthFacility(BerthFacilityEnumeration value) {
        setBerthFacility(value);
        return this;
    }

    @Override
    public Accommodation withShowerFacility(SanitaryFacilityEnumeration value) {
        setShowerFacility(value);
        return this;
    }

    @Override
    public Accommodation withToiletFacility(SanitaryFacilityEnumeration value) {
        setToiletFacility(value);
        return this;
    }

    @Override
    public Accommodation withGenderLimitation(GenderLimitationEnumeration value) {
        setGenderLimitation(value);
        return this;
    }

    @Override
    public Accommodation withNuisanceFacilityList(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public Accommodation withNuisanceFacilityList(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public Accommodation withPassengerCommsFacilityList(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacilityList().add(value);
            }
        }
        return this;
    }

    @Override
    public Accommodation withPassengerCommsFacilityList(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacilityList().addAll(values);
        }
        return this;
    }

    @Override
    public Accommodation withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Accommodation withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Accommodation withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Accommodation withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Accommodation withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Accommodation withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Accommodation withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Accommodation withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Accommodation withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Accommodation withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Accommodation withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Accommodation withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Accommodation withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Accommodation withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Accommodation withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Accommodation withId(String value) {
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
