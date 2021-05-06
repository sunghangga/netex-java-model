//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package uk.org.siri.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ServiceDeliveryErrorConditionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryErrorConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryErrorConditionStructure", propOrder = {
    "unapprovedKeyAccessError",
    "unknownParticipantError",
    "unknownEndpointError",
    "endpointDeniedAccessError",
    "endpointNotAvailableAccessError",
    "serviceNotAvailableError",
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "invalidDataReferencesError",
    "beyondDataHorizon",
    "noInfoForTopicError",
    "parametersIgnoredError",
    "unknownExtensionsError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ServiceDeliveryErrorConditionStructure {

    @XmlElement(name = "UnapprovedKeyAccessError")
    protected UnapprovedKeyAccessStructure unapprovedKeyAccessError;
    @XmlElement(name = "UnknownParticipantError")
    protected UnknownParticipantErrorStructure unknownParticipantError;
    @XmlElement(name = "UnknownEndpointError")
    protected UnknownEndpointErrorStructure unknownEndpointError;
    @XmlElement(name = "EndpointDeniedAccessError")
    protected EndpointDeniedAccessStructure endpointDeniedAccessError;
    @XmlElement(name = "EndpointNotAvailableAccessError")
    protected EndpointNotAvailableAccessStructure endpointNotAvailableAccessError;
    @XmlElement(name = "ServiceNotAvailableError")
    protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "InvalidDataReferencesError")
    protected InvalidDataReferencesErrorStructure invalidDataReferencesError;
    @XmlElement(name = "BeyondDataHorizon")
    protected BeyondDataHorizonErrorStructure beyondDataHorizon;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "ParametersIgnoredError")
    protected ParametersIgnoredErrorStructure parametersIgnoredError;
    @XmlElement(name = "UnknownExtensionsError")
    protected UnknownExtensionsErrorStructure unknownExtensionsError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;

    /**
     * Gets the value of the unapprovedKeyAccessError property.
     * 
     * @return
     *     possible object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public UnapprovedKeyAccessStructure getUnapprovedKeyAccessError() {
        return unapprovedKeyAccessError;
    }

    /**
     * Sets the value of the unapprovedKeyAccessError property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public void setUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        this.unapprovedKeyAccessError = value;
    }

    /**
     * Gets the value of the unknownParticipantError property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public UnknownParticipantErrorStructure getUnknownParticipantError() {
        return unknownParticipantError;
    }

    /**
     * Sets the value of the unknownParticipantError property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public void setUnknownParticipantError(UnknownParticipantErrorStructure value) {
        this.unknownParticipantError = value;
    }

    /**
     * Gets the value of the unknownEndpointError property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public UnknownEndpointErrorStructure getUnknownEndpointError() {
        return unknownEndpointError;
    }

    /**
     * Sets the value of the unknownEndpointError property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public void setUnknownEndpointError(UnknownEndpointErrorStructure value) {
        this.unknownEndpointError = value;
    }

    /**
     * Gets the value of the endpointDeniedAccessError property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public EndpointDeniedAccessStructure getEndpointDeniedAccessError() {
        return endpointDeniedAccessError;
    }

    /**
     * Sets the value of the endpointDeniedAccessError property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public void setEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        this.endpointDeniedAccessError = value;
    }

    /**
     * Gets the value of the endpointNotAvailableAccessError property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public EndpointNotAvailableAccessStructure getEndpointNotAvailableAccessError() {
        return endpointNotAvailableAccessError;
    }

    /**
     * Sets the value of the endpointNotAvailableAccessError property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public void setEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        this.endpointNotAvailableAccessError = value;
    }

    /**
     * Gets the value of the serviceNotAvailableError property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
        return serviceNotAvailableError;
    }

    /**
     * Sets the value of the serviceNotAvailableError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        this.serviceNotAvailableError = value;
    }

    /**
     * Gets the value of the capabilityNotSupportedError property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Sets the value of the capabilityNotSupportedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Gets the value of the accessNotAllowedError property.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Sets the value of the accessNotAllowedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Gets the value of the invalidDataReferencesError property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Sets the value of the invalidDataReferencesError property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    /**
     * Gets the value of the beyondDataHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Sets the value of the beyondDataHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    /**
     * Gets the value of the noInfoForTopicError property.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Sets the value of the noInfoForTopicError property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Gets the value of the parametersIgnoredError property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Sets the value of the parametersIgnoredError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    /**
     * Gets the value of the unknownExtensionsError property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Sets the value of the unknownExtensionsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    /**
     * Gets the value of the allowedResourceUsageExceededError property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Sets the value of the allowedResourceUsageExceededError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Gets the value of the otherError property.
     * 
     * @return
     *     possible object is
     *     {@link OtherErrorStructure }
     *     
     */
    public OtherErrorStructure getOtherError() {
        return otherError;
    }

    /**
     * Sets the value of the otherError property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherErrorStructure }
     *     
     */
    public void setOtherError(OtherErrorStructure value) {
        this.otherError = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
    }

    public ServiceDeliveryErrorConditionStructure withUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        setUnapprovedKeyAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownParticipantError(UnknownParticipantErrorStructure value) {
        setUnknownParticipantError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownEndpointError(UnknownEndpointErrorStructure value) {
        setUnknownEndpointError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        setEndpointDeniedAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        setEndpointNotAvailableAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        setServiceNotAvailableError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        setCapabilityNotSupportedError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        setAccessNotAllowedError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        setInvalidDataReferencesError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        setBeyondDataHorizon(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        setNoInfoForTopicError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        setParametersIgnoredError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        setUnknownExtensionsError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        setAllowedResourceUsageExceededError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withOtherError(OtherErrorStructure value) {
        setOtherError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withDescription(ErrorDescriptionStructure value) {
        setDescription(value);
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
