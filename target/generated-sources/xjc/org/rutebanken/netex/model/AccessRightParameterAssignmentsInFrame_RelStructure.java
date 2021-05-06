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
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for accessRightParameterAssignmentsInFrame_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accessRightParameterAssignmentsInFrame_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}frameContainmentStructure"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}AccessRightParameterAssignment_" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessRightParameterAssignmentsInFrame_RelStructure", propOrder = {
    "accessRightParameterAssignment_"
})
public class AccessRightParameterAssignmentsInFrame_RelStructure
    extends FrameContainmentStructure
{

    @XmlElementRef(name = "AccessRightParameterAssignment_", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends DataManagedObjectStructure>> accessRightParameterAssignment_;

    /**
     * Gets the value of the accessRightParameterAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRightParameterAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessRightParameterAssignment_().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignmentInContext }{@code >}
     * {@link JAXBElement }{@code <}{@link AccessRightParameterAssignment_VersionStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomerPurchaseParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link DataManagedObjectStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificParameterAssignment }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericParameterAssignment }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DataManagedObjectStructure>> getAccessRightParameterAssignment_() {
        if (accessRightParameterAssignment_ == null) {
            accessRightParameterAssignment_ = new ArrayList<JAXBElement<? extends DataManagedObjectStructure>>();
        }
        return this.accessRightParameterAssignment_;
    }

    public AccessRightParameterAssignmentsInFrame_RelStructure withAccessRightParameterAssignment_(JAXBElement<? extends DataManagedObjectStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends DataManagedObjectStructure> value: values) {
                getAccessRightParameterAssignment_().add(value);
            }
        }
        return this;
    }

    public AccessRightParameterAssignmentsInFrame_RelStructure withAccessRightParameterAssignment_(Collection<JAXBElement<? extends DataManagedObjectStructure>> values) {
        if (values!= null) {
            getAccessRightParameterAssignment_().addAll(values);
        }
        return this;
    }

    @Override
    public AccessRightParameterAssignmentsInFrame_RelStructure withId(String value) {
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
