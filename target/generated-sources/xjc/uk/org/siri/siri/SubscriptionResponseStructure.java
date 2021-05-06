//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package uk.org.siri.siri;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateTimeISO8601XmlAdapter;


/**
 * <p>Java class for SubscriptionResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionResponsePayloadGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionResponseStructure", propOrder = {
    "responseStatus",
    "subscriptionManagerAddress",
    "serviceStartedTime",
    "extensions"
})
public class SubscriptionResponseStructure
    extends ResponseEndpointStructure
{

    @XmlElement(name = "ResponseStatus", required = true)
    protected List<StatusResponseStructure> responseStatus;
    @XmlElement(name = "SubscriptionManagerAddress")
    @XmlSchemaType(name = "anyURI")
    protected String subscriptionManagerAddress;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime serviceStartedTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the responseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusResponseStructure }
     * 
     * 
     */
    public List<StatusResponseStructure> getResponseStatus() {
        if (responseStatus == null) {
            responseStatus = new ArrayList<StatusResponseStructure>();
        }
        return this.responseStatus;
    }

    /**
     * Gets the value of the subscriptionManagerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionManagerAddress() {
        return subscriptionManagerAddress;
    }

    /**
     * Sets the value of the subscriptionManagerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionManagerAddress(String value) {
        this.subscriptionManagerAddress = value;
    }

    /**
     * Gets the value of the serviceStartedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Sets the value of the serviceStartedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStartedTime(LocalDateTime value) {
        this.serviceStartedTime = value;
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

    public SubscriptionResponseStructure withResponseStatus(StatusResponseStructure... values) {
        if (values!= null) {
            for (StatusResponseStructure value: values) {
                getResponseStatus().add(value);
            }
        }
        return this;
    }

    public SubscriptionResponseStructure withResponseStatus(Collection<StatusResponseStructure> values) {
        if (values!= null) {
            getResponseStatus().addAll(values);
        }
        return this;
    }

    public SubscriptionResponseStructure withSubscriptionManagerAddress(String value) {
        setSubscriptionManagerAddress(value);
        return this;
    }

    public SubscriptionResponseStructure withServiceStartedTime(LocalDateTime value) {
        setServiceStartedTime(value);
        return this;
    }

    public SubscriptionResponseStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withResponderRef(ParticipantRefStructure value) {
        setResponderRef(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withRequestMessageRef(MessageQualifierStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public SubscriptionResponseStructure withResponseTimestamp(LocalDateTime value) {
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