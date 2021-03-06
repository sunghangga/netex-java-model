//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for validityConditions_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validityConditions_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityConditionRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidBetween"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ValidityCondition_"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validityConditions_RelStructure", propOrder = {
    "validityConditionRefOrValidBetweenOrValidityCondition_"
})
public class ValidityConditions_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "ValidityCondition_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidityConditionRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValidBetween", namespace = "http://www.netex.org.uk/netex", type = ValidBetween.class, required = false)
    })
    protected List<Object> validityConditionRefOrValidBetweenOrValidityCondition_;

    /**
     * Gets the value of the validityConditionRefOrValidBetweenOrValidityCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityConditionRefOrValidBetweenOrValidityCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityConditionRefOrValidBetweenOrValidityCondition_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameterRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AvailabilityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityConditionRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityRuleParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityTrigger }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityTriggerRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidDuring }{@code >}
     * {@link ValidBetween }
     * {@link JAXBElement }{@code <}{@link SimpleAvailabilityCondition }{@code >}
     * 
     * 
     */
    public List<Object> getValidityConditionRefOrValidBetweenOrValidityCondition_() {
        if (validityConditionRefOrValidBetweenOrValidityCondition_ == null) {
            validityConditionRefOrValidBetweenOrValidityCondition_ = new ArrayList<Object>();
        }
        return this.validityConditionRefOrValidBetweenOrValidityCondition_;
    }

    public ValidityConditions_RelStructure withValidityConditionRefOrValidBetweenOrValidityCondition_(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getValidityConditionRefOrValidBetweenOrValidityCondition_().add(value);
            }
        }
        return this;
    }

    public ValidityConditions_RelStructure withValidityConditionRefOrValidBetweenOrValidityCondition_(Collection<Object> values) {
        if (values!= null) {
            getValidityConditionRefOrValidBetweenOrValidityCondition_().addAll(values);
        }
        return this;
    }

    @Override
    public ValidityConditions_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public ValidityConditions_RelStructure withId(String value) {
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
