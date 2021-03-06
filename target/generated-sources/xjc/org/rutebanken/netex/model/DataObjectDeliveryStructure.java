//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.Duration;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AbstractServiceDeliveryStructure;
import uk.org.siri.siri.MessageQualifierStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.SubscriptionFilterRefStructure;
import uk.org.siri.siri.SubscriptionQualifierStructure;


/**
 * <p>Java class for DataObjectDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataObjectDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataObjectRequest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PayloadGroup"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectDeliveryStructure", propOrder = {
    "dataObjectRequest",
    "dataObjects",
    "extensions"
})
public class DataObjectDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "DataObjectRequest")
    protected DataObjectRequestStructure dataObjectRequest;
    protected org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects dataObjects;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the dataObjectRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public DataObjectRequestStructure getDataObjectRequest() {
        return dataObjectRequest;
    }

    /**
     * Sets the value of the dataObjectRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataObjectRequestStructure }
     *     
     */
    public void setDataObjectRequest(DataObjectRequestStructure value) {
        this.dataObjectRequest = value;
    }

    /**
     * Gets the value of the dataObjects property.
     * 
     * @return
     *     possible object is
     *     {@link org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects }
     *     
     */
    public org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects getDataObjects() {
        return dataObjects;
    }

    /**
     * Sets the value of the dataObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects }
     *     
     */
    public void setDataObjects(org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects value) {
        this.dataObjects = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public DataObjectDeliveryStructure withDataObjectRequest(DataObjectRequestStructure value) {
        setDataObjectRequest(value);
        return this;
    }

    public DataObjectDeliveryStructure withDataObjects(org.rutebanken.netex.model.PublicationDeliveryStructure.DataObjects value) {
        setDataObjects(value);
        return this;
    }

    public DataObjectDeliveryStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withSubscriberRef(ParticipantRefStructure value) {
        setSubscriberRef(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        setSubscriptionFilterRef(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withSubscriptionRef(SubscriptionQualifierStructure value) {
        setSubscriptionRef(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withValidUntil(LocalDateTime value) {
        setValidUntil(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withDefaultLanguage(String value) {
        setDefaultLanguage(value);
        return this;
    }

    @Override
    public DataObjectDeliveryStructure withResponseTimestamp(LocalDateTime value) {
        setResponseTimestamp(value);
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
