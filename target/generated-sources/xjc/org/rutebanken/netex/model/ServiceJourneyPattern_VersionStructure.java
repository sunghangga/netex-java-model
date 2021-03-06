//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ServiceJourneyPattern_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyPattern_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}JourneyPattern_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ServiceJourneyPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyPattern_VersionStructure", propOrder = {
    "serviceJourneyPatternType"
})
@XmlSeeAlso({
    ServiceJourneyPattern.class
})
public class ServiceJourneyPattern_VersionStructure
    extends JourneyPattern_VersionStructure
{

    @XmlElement(name = "ServiceJourneyPatternType")
    @XmlSchemaType(name = "NMTOKEN")
    protected ServiceJourneyPatternTypeEnumeration serviceJourneyPatternType;

    /**
     * Gets the value of the serviceJourneyPatternType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceJourneyPatternTypeEnumeration }
     *     
     */
    public ServiceJourneyPatternTypeEnumeration getServiceJourneyPatternType() {
        return serviceJourneyPatternType;
    }

    /**
     * Sets the value of the serviceJourneyPatternType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceJourneyPatternTypeEnumeration }
     *     
     */
    public void setServiceJourneyPatternType(ServiceJourneyPatternTypeEnumeration value) {
        this.serviceJourneyPatternType = value;
    }

    public ServiceJourneyPattern_VersionStructure withServiceJourneyPatternType(ServiceJourneyPatternTypeEnumeration value) {
        setServiceJourneyPatternType(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withRouteView(RouteView value) {
        setRouteView(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDirectionView(DirectionView value) {
        setDirectionView(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withTypeOfJourneyPatternRef(TypeOfJourneyPatternRefStructure value) {
        setTypeOfJourneyPatternRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withTimingPatternRef(TimingPatternRefStructure value) {
        setTimingPatternRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withRunTimes(JourneyPatternRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withWaitTimes(JourneyPatternWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withHeadways(JourneyPatternHeadways_RelStructure value) {
        setHeadways(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withLayovers(JourneyPatternLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withPointsInSequence(PointsInJourneyPattern_RelStructure value) {
        setPointsInSequence(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withLinksInSequence(LinksInJourneyPattern_RelStructure value) {
        setLinksInSequence(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public ServiceJourneyPattern_VersionStructure withId(String value) {
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
