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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}HeadingSignStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EntityInVersionGroup" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}DataManagedObjectGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}EquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}SignEquipmentGroup"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="PlaceName" type="{http://www.netex.org.uk/netex}MultilingualString"/&gt;
 *           &lt;group ref="{http://www.netex.org.uk/netex}HeadingSignGroup"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.netex.org.uk/netex}HeadingSignIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class HeadingSign
    extends HeadingSignStructure
{


    @Override
    public HeadingSign withPlaceName(MultilingualString value) {
        setPlaceName(value);
        return this;
    }

    @Override
    public HeadingSign withLineRef(JAXBElement<? extends LineRefStructure> value) {
        setLineRef(value);
        return this;
    }

    @Override
    public HeadingSign withLineName(MultilingualString value) {
        setLineName(value);
        return this;
    }

    @Override
    public HeadingSign withTransportMode(VehicleModeEnumeration value) {
        setTransportMode(value);
        return this;
    }

    @Override
    public HeadingSign withTransportSubmode(TransportSubmodeStructure value) {
        setTransportSubmode(value);
        return this;
    }

    @Override
    public HeadingSign withLineMap(String value) {
        setLineMap(value);
        return this;
    }

    @Override
    public HeadingSign withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    @Override
    public HeadingSign withDirectionName(MultilingualString value) {
        setDirectionName(value);
        return this;
    }

    @Override
    public HeadingSign withDestinationDisplayRef(DestinationDisplayRefStructure value) {
        setDestinationDisplayRef(value);
        return this;
    }

    @Override
    public HeadingSign withLinePublicCode(String value) {
        setLinePublicCode(value);
        return this;
    }

    @Override
    public HeadingSign withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public HeadingSign withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public HeadingSign withHeightFromFloor(BigDecimal value) {
        setHeightFromFloor(value);
        return this;
    }

    @Override
    public HeadingSign withPlacement(MultilingualString value) {
        setPlacement(value);
        return this;
    }

    @Override
    public HeadingSign withBrandGraphic(String value) {
        setBrandGraphic(value);
        return this;
    }

    @Override
    public HeadingSign withSignGraphic(String value) {
        setSignGraphic(value);
        return this;
    }

    @Override
    public HeadingSign withMachineReadable(Boolean value) {
        setMachineReadable(value);
        return this;
    }

    @Override
    public HeadingSign withAsBraille(Boolean value) {
        setAsBraille(value);
        return this;
    }

    @Override
    public HeadingSign withAudioTriggerMethod(AudioTriggerMethodEnumeration value) {
        setAudioTriggerMethod(value);
        return this;
    }

    @Override
    public HeadingSign withPrintedPresentation(PrintPresentationStructure value) {
        setPrintedPresentation(value);
        return this;
    }

    @Override
    public HeadingSign withContrast(BigDecimal value) {
        setContrast(value);
        return this;
    }

    @Override
    public HeadingSign withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public HeadingSign withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public HeadingSign withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public HeadingSign withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public HeadingSign withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public HeadingSign withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public HeadingSign withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public HeadingSign withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public HeadingSign withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public HeadingSign withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public HeadingSign withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public HeadingSign withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public HeadingSign withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public HeadingSign withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public HeadingSign withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public HeadingSign withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public HeadingSign withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public HeadingSign withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public HeadingSign withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public HeadingSign withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public HeadingSign withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public HeadingSign withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public HeadingSign withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HeadingSign withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public HeadingSign withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public HeadingSign withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public HeadingSign withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public HeadingSign withId(String value) {
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
