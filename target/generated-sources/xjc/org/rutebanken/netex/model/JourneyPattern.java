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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}JourneyPattern_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LinkSequenceGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}JourneyPatternGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}JourneyPatternIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class JourneyPattern
    extends JourneyPattern_VersionStructure
{


    @Override
    public JourneyPattern withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    @Override
    public JourneyPattern withRouteView(RouteView value) {
        setRouteView(value);
        return this;
    }

    @Override
    public JourneyPattern withDirectionType(DirectionTypeEnumeration value) {
        setDirectionType(value);
        return this;
    }

    @Override
    public JourneyPattern withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    @Override
    public JourneyPattern withDirectionView(DirectionView value) {
        setDirectionView(value);
        return this;
    }

    @Override
    public JourneyPattern withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    @Override
    public JourneyPattern withDestinationDisplayView(DestinationDisplayView value) {
        setDestinationDisplayView(value);
        return this;
    }

    @Override
    public JourneyPattern withTypeOfJourneyPatternRef(TypeOfJourneyPatternRefStructure value) {
        setTypeOfJourneyPatternRef(value);
        return this;
    }

    @Override
    public JourneyPattern withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public JourneyPattern withTimingPatternRef(TimingPatternRefStructure value) {
        setTimingPatternRef(value);
        return this;
    }

    @Override
    public JourneyPattern withNoticeAssignments(NoticeAssignments_RelStructure value) {
        setNoticeAssignments(value);
        return this;
    }

    @Override
    public JourneyPattern withRunTimes(JourneyPatternRunTimes_RelStructure value) {
        setRunTimes(value);
        return this;
    }

    @Override
    public JourneyPattern withWaitTimes(JourneyPatternWaitTimes_RelStructure value) {
        setWaitTimes(value);
        return this;
    }

    @Override
    public JourneyPattern withHeadways(JourneyPatternHeadways_RelStructure value) {
        setHeadways(value);
        return this;
    }

    @Override
    public JourneyPattern withLayovers(JourneyPatternLayovers_RelStructure value) {
        setLayovers(value);
        return this;
    }

    @Override
    public JourneyPattern withPointsInSequence(PointsInJourneyPattern_RelStructure value) {
        setPointsInSequence(value);
        return this;
    }

    @Override
    public JourneyPattern withLinksInSequence(LinksInJourneyPattern_RelStructure value) {
        setLinksInSequence(value);
        return this;
    }

    @Override
    public JourneyPattern withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public JourneyPattern withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    @Override
    public JourneyPattern withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public JourneyPattern withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public JourneyPattern withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public JourneyPattern withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public JourneyPattern withInfoLinks(org.rutebanken.netex.model.LinkSequence_VersionStructure.InfoLinks value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public JourneyPattern withSectionsInSequence(SectionsInSequence_RelStructure value) {
        setSectionsInSequence(value);
        return this;
    }

    @Override
    public JourneyPattern withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public JourneyPattern withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public JourneyPattern withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public JourneyPattern withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public JourneyPattern withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public JourneyPattern withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public JourneyPattern withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public JourneyPattern withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public JourneyPattern withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public JourneyPattern withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public JourneyPattern withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public JourneyPattern withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public JourneyPattern withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public JourneyPattern withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPattern withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public JourneyPattern withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public JourneyPattern withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public JourneyPattern withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public JourneyPattern withId(String value) {
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