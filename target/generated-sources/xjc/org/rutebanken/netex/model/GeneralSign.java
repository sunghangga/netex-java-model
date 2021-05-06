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
 *     &lt;restriction base="{http://www.netex.org.uk/netex}GeneralSignStructure"&gt;
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
 *           &lt;group ref="{http://www.netex.org.uk/netex}GeneralSignGroup"/&gt;
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
public class GeneralSign
    extends GeneralSignStructure
{


    @Override
    public GeneralSign withContent(MultilingualString value) {
        setContent(value);
        return this;
    }

    @Override
    public GeneralSign withSignContentType(SignContentEnumeration value) {
        setSignContentType(value);
        return this;
    }

    @Override
    public GeneralSign withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    @Override
    public GeneralSign withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    @Override
    public GeneralSign withHeightFromFloor(BigDecimal value) {
        setHeightFromFloor(value);
        return this;
    }

    @Override
    public GeneralSign withPlacement(MultilingualString value) {
        setPlacement(value);
        return this;
    }

    @Override
    public GeneralSign withBrandGraphic(String value) {
        setBrandGraphic(value);
        return this;
    }

    @Override
    public GeneralSign withSignGraphic(String value) {
        setSignGraphic(value);
        return this;
    }

    @Override
    public GeneralSign withMachineReadable(Boolean value) {
        setMachineReadable(value);
        return this;
    }

    @Override
    public GeneralSign withAsBraille(Boolean value) {
        setAsBraille(value);
        return this;
    }

    @Override
    public GeneralSign withAudioTriggerMethod(AudioTriggerMethodEnumeration value) {
        setAudioTriggerMethod(value);
        return this;
    }

    @Override
    public GeneralSign withPrintedPresentation(PrintPresentationStructure value) {
        setPrintedPresentation(value);
        return this;
    }

    @Override
    public GeneralSign withContrast(BigDecimal value) {
        setContrast(value);
        return this;
    }

    @Override
    public GeneralSign withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public GeneralSign withPrivateCode(PrivateCodeStructure value) {
        setPrivateCode(value);
        return this;
    }

    @Override
    public GeneralSign withPublicCode(PrivateCodeStructure value) {
        setPublicCode(value);
        return this;
    }

    @Override
    public GeneralSign withImage(String value) {
        setImage(value);
        return this;
    }

    @Override
    public GeneralSign withTypeOfEquipmentRef(TypeOfEquipmentRefStructure value) {
        setTypeOfEquipmentRef(value);
        return this;
    }

    @Override
    public GeneralSign withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public GeneralSign withNote(MultilingualString value) {
        setNote(value);
        return this;
    }

    @Override
    public GeneralSign withInfoLinks(InfoLinks_RelStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public GeneralSign withOutOfService(Boolean value) {
        setOutOfService(value);
        return this;
    }

    @Override
    public GeneralSign withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public GeneralSign withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public GeneralSign withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public GeneralSign withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public GeneralSign withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public GeneralSign withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public GeneralSign withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public GeneralSign withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public GeneralSign withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public GeneralSign withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public GeneralSign withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public GeneralSign withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public GeneralSign withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public GeneralSign withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeneralSign withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public GeneralSign withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public GeneralSign withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public GeneralSign withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public GeneralSign withId(String value) {
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