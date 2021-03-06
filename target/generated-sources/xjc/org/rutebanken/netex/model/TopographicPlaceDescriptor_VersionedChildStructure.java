//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for TopographicPlaceDescriptor_VersionedChildStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopographicPlaceDescriptor_VersionedChildStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}VersionedChildStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString"/&gt;
 *         &lt;element name="ShortName" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="Qualify" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString"/&gt;
 *                   &lt;element ref="{http://www.netex.org.uk/netex}TopographicPlaceRef" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopographicPlaceDescriptor_VersionedChildStructure", propOrder = {
    "name",
    "shortName",
    "qualify"
})
public class TopographicPlaceDescriptor_VersionedChildStructure
    extends VersionedChildStructure
{

    @XmlElement(name = "Name", required = true)
    protected MultilingualString name;
    @XmlElement(name = "ShortName")
    protected MultilingualString shortName;
    @XmlElement(name = "Qualify")
    protected TopographicPlaceDescriptor_VersionedChildStructure.Qualify qualify;

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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setShortName(MultilingualString value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the qualify property.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceDescriptor_VersionedChildStructure.Qualify }
     *     
     */
    public TopographicPlaceDescriptor_VersionedChildStructure.Qualify getQualify() {
        return qualify;
    }

    /**
     * Sets the value of the qualify property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceDescriptor_VersionedChildStructure.Qualify }
     *     
     */
    public void setQualify(TopographicPlaceDescriptor_VersionedChildStructure.Qualify value) {
        this.qualify = value;
    }

    public TopographicPlaceDescriptor_VersionedChildStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public TopographicPlaceDescriptor_VersionedChildStructure withShortName(MultilingualString value) {
        setShortName(value);
        return this;
    }

    public TopographicPlaceDescriptor_VersionedChildStructure withQualify(TopographicPlaceDescriptor_VersionedChildStructure.Qualify value) {
        setQualify(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public TopographicPlaceDescriptor_VersionedChildStructure withId(String value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="QualifierName" type="{http://www.netex.org.uk/netex}MultilingualString"/&gt;
     *         &lt;element ref="{http://www.netex.org.uk/netex}TopographicPlaceRef" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "qualifierName",
        "topographicPlaceRef"
    })
    public static class Qualify {

        @XmlElement(name = "QualifierName", required = true)
        protected MultilingualString qualifierName;
        @XmlElement(name = "TopographicPlaceRef")
        protected TopographicPlaceRefStructure topographicPlaceRef;

        /**
         * Gets the value of the qualifierName property.
         * 
         * @return
         *     possible object is
         *     {@link MultilingualString }
         *     
         */
        public MultilingualString getQualifierName() {
            return qualifierName;
        }

        /**
         * Sets the value of the qualifierName property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultilingualString }
         *     
         */
        public void setQualifierName(MultilingualString value) {
            this.qualifierName = value;
        }

        /**
         * Gets the value of the topographicPlaceRef property.
         * 
         * @return
         *     possible object is
         *     {@link TopographicPlaceRefStructure }
         *     
         */
        public TopographicPlaceRefStructure getTopographicPlaceRef() {
            return topographicPlaceRef;
        }

        /**
         * Sets the value of the topographicPlaceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TopographicPlaceRefStructure }
         *     
         */
        public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
            this.topographicPlaceRef = value;
        }

        public TopographicPlaceDescriptor_VersionedChildStructure.Qualify withQualifierName(MultilingualString value) {
            setQualifierName(value);
            return this;
        }

        public TopographicPlaceDescriptor_VersionedChildStructure.Qualify withTopographicPlaceRef(TopographicPlaceRefStructure value) {
            setTopographicPlaceRef(value);
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

}
