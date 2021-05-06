//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}CourseOfJourneys_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}CourseOfJourneysGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}CourseOfJourneysIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class CourseOfJourneys
    extends CourseOfJourneys_VersionStructure
{


    @Override
    public CourseOfJourneys withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public CourseOfJourneys withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public CourseOfJourneys withCourseOfJourneysNumber(BigInteger value) {
        setCourseOfJourneysNumber(value);
        return this;
    }

    @Override
    public CourseOfJourneys withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public CourseOfJourneys withPreparationDuration(Duration value) {
        setPreparationDuration(value);
        return this;
    }

    @Override
    public CourseOfJourneys withStartTimeInBlock(LocalTime value) {
        setStartTimeInBlock(value);
        return this;
    }

    @Override
    public CourseOfJourneys withStartTimeDayOffset(BigInteger value) {
        setStartTimeDayOffset(value);
        return this;
    }

    @Override
    public CourseOfJourneys withFinishingDuration(Duration value) {
        setFinishingDuration(value);
        return this;
    }

    @Override
    public CourseOfJourneys withBlockRef(JAXBElement<? extends BlockRefStructure> value) {
        setBlockRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withJourneys(JourneyRefs_RelStructure value) {
        setJourneys(value);
        return this;
    }

    @Override
    public CourseOfJourneys withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public CourseOfJourneys withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CourseOfJourneys withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public CourseOfJourneys withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public CourseOfJourneys withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public CourseOfJourneys withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public CourseOfJourneys withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public CourseOfJourneys withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public CourseOfJourneys withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public CourseOfJourneys withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public CourseOfJourneys withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CourseOfJourneys withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public CourseOfJourneys withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public CourseOfJourneys withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public CourseOfJourneys withId(String value) {
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
