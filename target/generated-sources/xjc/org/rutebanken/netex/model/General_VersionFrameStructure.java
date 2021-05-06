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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for General_VersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="General_VersionFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Common_VersionFrameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}GeneralFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "General_VersionFrameStructure", propOrder = {
    "members"
})
@XmlSeeAlso({
    GeneralFrame.class
})
public class General_VersionFrameStructure
    extends Common_VersionFrameStructure
{

    protected General_VersionFrameStructure.Members members;

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link General_VersionFrameStructure.Members }
     *     
     */
    public General_VersionFrameStructure.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link General_VersionFrameStructure.Members }
     *     
     */
    public void setMembers(General_VersionFrameStructure.Members value) {
        this.members = value;
    }

    public General_VersionFrameStructure withMembers(General_VersionFrameStructure.Members value) {
        setMembers(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withTypeOfFrameRef(TypeOfFrameRefStructure value) {
        setTypeOfFrameRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withBaselineVersionFrameRef(VersionRefStructure value) {
        setBaselineVersionFrameRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withCodespaces(Codespaces_RelStructure value) {
        setCodespaces(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withFrameDefaults(VersionFrameDefaultsStructure value) {
        setFrameDefaults(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withVersions(Versions_RelStructure value) {
        setVersions(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withPrerequisites(VersionFrameRefs_RelStructure value) {
        setPrerequisites(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withTraces(Traces_RelStructure value) {
        setTraces(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withContentValidityConditions(ValidityConditions_RelStructure value) {
        setContentValidityConditions(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withLayers(LayerRefs_RelStructure value) {
        setLayers(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public General_VersionFrameStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public General_VersionFrameStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public General_VersionFrameStructure withId(String value) {
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
     *     &lt;extension base="{http://www.netex.org.uk/netex}generalFrameMembers_RelStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Members
        extends GeneralFrameMembers_RelStructure
    {


        @Override
        public General_VersionFrameStructure.Members withGeneralFrameMemberOrDataManagedObjectOrEntity_Entity(JAXBElement<? extends EntityStructure> ... values) {
            if (values!= null) {
                for (JAXBElement<? extends EntityStructure> value: values) {
                    getGeneralFrameMemberOrDataManagedObjectOrEntity_Entity().add(value);
                }
            }
            return this;
        }

        @Override
        public General_VersionFrameStructure.Members withGeneralFrameMemberOrDataManagedObjectOrEntity_Entity(Collection<JAXBElement<? extends EntityStructure>> values) {
            if (values!= null) {
                getGeneralFrameMemberOrDataManagedObjectOrEntity_Entity().addAll(values);
            }
            return this;
        }

        @Override
        public General_VersionFrameStructure.Members withModificationSet(ModificationSetEnumeration value) {
            setModificationSet(value);
            return this;
        }

        @Override
        public General_VersionFrameStructure.Members withId(String value) {
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

}
