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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for SiteConnection_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteConnection_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}Transfer_VersionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}SiteConnectionGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteConnection_VersionStructure", propOrder = {
    "from",
    "to",
    "navigationPaths"
})
@XmlSeeAlso({
    SiteConnection.class
})
public class SiteConnection_VersionStructure
    extends Transfer_VersionStructure
{

    @XmlElement(name = "From")
    protected SiteConnectionEndStructure from;
    @XmlElement(name = "To")
    protected SiteConnectionEndStructure to;
    protected NavigationPaths_RelStructure navigationPaths;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public SiteConnectionEndStructure getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public void setFrom(SiteConnectionEndStructure value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public SiteConnectionEndStructure getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConnectionEndStructure }
     *     
     */
    public void setTo(SiteConnectionEndStructure value) {
        this.to = value;
    }

    /**
     * Gets the value of the navigationPaths property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationPaths_RelStructure }
     *     
     */
    public NavigationPaths_RelStructure getNavigationPaths() {
        return navigationPaths;
    }

    /**
     * Sets the value of the navigationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationPaths_RelStructure }
     *     
     */
    public void setNavigationPaths(NavigationPaths_RelStructure value) {
        this.navigationPaths = value;
    }

    public SiteConnection_VersionStructure withFrom(SiteConnectionEndStructure value) {
        setFrom(value);
        return this;
    }

    public SiteConnection_VersionStructure withTo(SiteConnectionEndStructure value) {
        setTo(value);
        return this;
    }

    public SiteConnection_VersionStructure withNavigationPaths(NavigationPaths_RelStructure value) {
        setNavigationPaths(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withTypeOfTransferRef(TypeOfTransferRefStructure value) {
        setTypeOfTransferRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withDistance(BigDecimal value) {
        setDistance(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withTransferDuration(TransferDurationStructure value) {
        setTransferDuration(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withWalkTransferDuration(TransferDurationStructure value) {
        setWalkTransferDuration(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withBothWays(Boolean value) {
        setBothWays(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withKeyList(KeyListStructure value) {
        setKeyList(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withResponsibilitySetRef(String value) {
        setResponsibilitySetRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withValidityConditions(ValidityConditions_RelStructure value) {
        setValidityConditions(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withValidBetween(ValidBetween... values) {
        if (values!= null) {
            for (ValidBetween value: values) {
                getValidBetween().add(value);
            }
        }
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withValidBetween(Collection<ValidBetween> values) {
        if (values!= null) {
            getValidBetween().addAll(values);
        }
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withAlternativeTexts(AlternativeTexts_RelStructure value) {
        setAlternativeTexts(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withDataSourceRef(String value) {
        setDataSourceRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withVersion(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withStatus_BasicModificationDetailsGroup(StatusEnumeration value) {
        setStatus_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withDerivedFromVersionRef_BasicModificationDetailsGroup(String value) {
        setDerivedFromVersionRef_BasicModificationDetailsGroup(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withCompatibleWithVersionFrameVersionRef(String value) {
        setCompatibleWithVersionFrameVersionRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withDerivedFromObjectRef(String value) {
        setDerivedFromObjectRef(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public SiteConnection_VersionStructure withId(String value) {
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
