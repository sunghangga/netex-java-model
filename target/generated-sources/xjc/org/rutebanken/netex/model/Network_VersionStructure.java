//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for Network_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Network_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}GroupOfLines_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}NetworkGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Network_VersionStructure", propOrder = {
    "transportOrganisationRef",
    "groupsOfOperators",
    "groupsOfLines",
    "tariffZones"
})
@XmlSeeAlso({
    Network.class
})
public class Network_VersionStructure
    extends GroupOfLines_VersionStructure
{

    @XmlElementRef(name = "TransportOrganisationRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OrganisationRefStructure> transportOrganisationRef;
    protected GroupsOfTransportOrganisationsRefs_RelStructure groupsOfOperators;
    protected GroupsOfLinesInFrame_RelStructure groupsOfLines;
    protected TariffZoneRefs_RelStructure tariffZones;

    /**
     * Gets the value of the transportOrganisationRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRefStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OrganisationRefStructure> getTransportOrganisationRef() {
        return transportOrganisationRef;
    }

    /**
     * Sets the value of the transportOrganisationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrganisationRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperatorRefStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AuthorityRefStructure }{@code >}
     *     
     */
    public void setTransportOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        this.transportOrganisationRef = value;
    }

    /**
     * Gets the value of the groupsOfOperators property.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfTransportOrganisationsRefs_RelStructure }
     *     
     */
    public GroupsOfTransportOrganisationsRefs_RelStructure getGroupsOfOperators() {
        return groupsOfOperators;
    }

    /**
     * Sets the value of the groupsOfOperators property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfTransportOrganisationsRefs_RelStructure }
     *     
     */
    public void setGroupsOfOperators(GroupsOfTransportOrganisationsRefs_RelStructure value) {
        this.groupsOfOperators = value;
    }

    /**
     * Gets the value of the groupsOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link GroupsOfLinesInFrame_RelStructure }
     *     
     */
    public GroupsOfLinesInFrame_RelStructure getGroupsOfLines() {
        return groupsOfLines;
    }

    /**
     * Sets the value of the groupsOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupsOfLinesInFrame_RelStructure }
     *     
     */
    public void setGroupsOfLines(GroupsOfLinesInFrame_RelStructure value) {
        this.groupsOfLines = value;
    }

    /**
     * Gets the value of the tariffZones property.
     * 
     * @return
     *     possible object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public TariffZoneRefs_RelStructure getTariffZones() {
        return tariffZones;
    }

    /**
     * Sets the value of the tariffZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffZoneRefs_RelStructure }
     *     
     */
    public void setTariffZones(TariffZoneRefs_RelStructure value) {
        this.tariffZones = value;
    }

    public Network_VersionStructure withTransportOrganisationRef(JAXBElement<? extends OrganisationRefStructure> value) {
        setTransportOrganisationRef(value);
        return this;
    }

    public Network_VersionStructure withGroupsOfOperators(GroupsOfTransportOrganisationsRefs_RelStructure value) {
        setGroupsOfOperators(value);
        return this;
    }

    public Network_VersionStructure withGroupsOfLines(GroupsOfLinesInFrame_RelStructure value) {
        setGroupsOfLines(value);
        return this;
    }

    public Network_VersionStructure withTariffZones(TariffZoneRefs_RelStructure value) {
        setTariffZones(value);
        return this;
    }

    @Override
    public Network_VersionStructure withUseToExclude(Boolean value) {
        setUseToExclude(value);
        return this;
    }

    @Override
    public Network_VersionStructure withMembers(LineRefs_RelStructure value) {
        setMembers(value);
        return this;
    }

    @Override
    public Network_VersionStructure withMainLineRef(LineRefStructure value) {
        setMainLineRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withTransportMode(AllVehicleModesOfTransportEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public Network_VersionStructure withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public Network_VersionStructure withGroupOfLinesType(GroupOfLinesTypeEnumeration value) {
        setGroupOfLinesType(value);
        return this;
    }

    @Override
    public Network_VersionStructure withPaymentMethods(PaymentMethodEnumeration... values) {
        if (values!= null) {
            for (PaymentMethodEnumeration value: values) {
                getPaymentMethods().add(value);
            }
        }
        return this;
    }

    @Override
    public Network_VersionStructure withPaymentMethods(Collection<PaymentMethodEnumeration> values) {
        if (values!= null) {
            getPaymentMethods().addAll(values);
        }
        return this;
    }

    @Override
    public Network_VersionStructure withTypesOfPaymentMethod(TypeOfPaymentMethod_ValueStructure value) {
        setTypesOfPaymentMethod(value);
        return this;
    }

    @Override
    public Network_VersionStructure withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values!= null) {
            for (PurchaseMomentEnumeration value: values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    @Override
    public Network_VersionStructure withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values!= null) {
            getPurchaseMoment().addAll(values);
        }
        return this;
    }

    @Override
    public Network_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public Network_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public Network_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public Network_VersionStructure withPurposeOfGroupingRef(PurposeOfGroupingRefStructure value) {
        setPurposeOfGroupingRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public Network_VersionStructure withInfoLinks(org.rutebanken.netex.model.GroupOfEntities_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public Network_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public Network_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public Network_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public Network_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public Network_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public Network_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public Network_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public Network_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public Network_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public Network_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public Network_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Network_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public Network_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public Network_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public Network_VersionStructure withId(String value) {
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