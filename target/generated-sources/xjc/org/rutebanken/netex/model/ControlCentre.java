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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}ControlCentre_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}OrganisationPartGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}ControlCentreGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}ControlCentreIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ControlCentre
    extends ControlCentre_VersionStructure
{


    @Override
    public ControlCentre withNumber(BigInteger value) {
        setNumber(value);
        return this;
    }

    @Override
    public ControlCentre withControlCentreCode(MultilingualString value) {
        setControlCentreCode(value);
        return this;
    }

    @Override
    public ControlCentre withDepartmentRef(DepartmentRefStructure value) {
        setDepartmentRef(value);
        return this;
    }

    @Override
    public ControlCentre withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ControlCentre withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ControlCentre withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ControlCentre withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public ControlCentre withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ControlCentre withContactDetails(ContactStructure value) {
        setContactDetails(value);
        return this;
    }

    @Override
    public ControlCentre withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public ControlCentre withOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setOrganisationRef(value);
        return this;
    }

    @Override
    public ControlCentre withTypeOfOrganisationPartRef(TypeOfOrganisationPartRef value) {
        setTypeOfOrganisationPartRef(value);
        return this;
    }

    @Override
    public ControlCentre withAdministrativeZones(AdministrativeZones_RelStructure value) {
        setAdministrativeZones(value);
        return this;
    }

    @Override
    public ControlCentre withOwnResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setOwnResponsibilitySets(value);
        return this;
    }

    @Override
    public ControlCentre withDelegatedResponsibilitySets(ResponsibilitySets_RelStructure value) {
        setDelegatedResponsibilitySets(value);
        return this;
    }

    @Override
    public ControlCentre withDelegatedFrom(OrganisationRefs_RelStructure value) {
        setDelegatedFrom(value);
        return this;
    }

    @Override
    public ControlCentre withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ControlCentre withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ControlCentre withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ControlCentre withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ControlCentre withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ControlCentre withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ControlCentre withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ControlCentre withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ControlCentre withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ControlCentre withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ControlCentre withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ControlCentre withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ControlCentre withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ControlCentre withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ControlCentre withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ControlCentre withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ControlCentre withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ControlCentre withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ControlCentre withId(String value) {
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