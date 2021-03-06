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
import net.opengis.gml._3.LineStringType;
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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}TimingLink_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}LinkGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}TimingLinkGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}TimingLinkIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TimingLink
    extends TimingLink_VersionStructure
{


    @Override
    public TimingLink withFromPointRef(TimingPointRefStructure value) {
        setFromPointRef(value);
        return this;
    }

    @Override
    public TimingLink withToPointRef(TimingPointRefStructure value) {
        setToPointRef(value);
        return this;
    }

    @Override
    public TimingLink withVehicleMode(AllModesEnumeration value) {
        setVehicleMode(value);
        return this;
    }

    @Override
    public TimingLink withOperationalContextRef(OperationalContextRefStructure value) {
        setOperationalContextRef(value);
        return this;
    }

    @Override
    public TimingLink withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public TimingLink withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public TimingLink withTypes(LinkTypeRefs_RelStructure value) {
        setTypes(value);
        return this;
    }

    @Override
    public TimingLink withLineString(LineStringType value) {
        setLineString(value);
        return this;
    }

    @Override
    public TimingLink withProjections(Projections_RelStructure value) {
        setProjections(value);
        return this;
    }

    @Override
    public TimingLink withPassingThrough(PointsOnLink_RelStructure value) {
        setPassingThrough(value);
        return this;
    }

    @Override
    public TimingLink withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public TimingLink withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TimingLink withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public TimingLink withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public TimingLink withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TimingLink withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TimingLink withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TimingLink withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TimingLink withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TimingLink withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TimingLink withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TimingLink withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TimingLink withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TimingLink withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimingLink withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TimingLink withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TimingLink withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TimingLink withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TimingLink withId(String value) {
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
