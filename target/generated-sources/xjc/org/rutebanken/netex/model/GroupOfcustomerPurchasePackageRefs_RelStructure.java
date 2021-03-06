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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for groupOfcustomerPurchasePackageRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupOfcustomerPurchasePackageRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfCustomerPurchasePackagesRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupOfcustomerPurchasePackageRefs_RelStructure", propOrder = {
    "groupOfCustomerPurchasePackagesRef"
})
public class GroupOfcustomerPurchasePackageRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "GroupOfCustomerPurchasePackagesRef", required = true)
    protected List<GroupOfCustomerPurchasePackagesRefStructure> groupOfCustomerPurchasePackagesRef;

    /**
     * Gets the value of the groupOfCustomerPurchasePackagesRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfCustomerPurchasePackagesRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfCustomerPurchasePackagesRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfCustomerPurchasePackagesRefStructure }
     * 
     * 
     */
    public List<GroupOfCustomerPurchasePackagesRefStructure> getGroupOfCustomerPurchasePackagesRef() {
        if (groupOfCustomerPurchasePackagesRef == null) {
            groupOfCustomerPurchasePackagesRef = new ArrayList<GroupOfCustomerPurchasePackagesRefStructure>();
        }
        return this.groupOfCustomerPurchasePackagesRef;
    }

    public GroupOfcustomerPurchasePackageRefs_RelStructure withGroupOfCustomerPurchasePackagesRef(GroupOfCustomerPurchasePackagesRefStructure... values) {
        if (values!= null) {
            for (GroupOfCustomerPurchasePackagesRefStructure value: values) {
                getGroupOfCustomerPurchasePackagesRef().add(value);
            }
        }
        return this;
    }

    public GroupOfcustomerPurchasePackageRefs_RelStructure withGroupOfCustomerPurchasePackagesRef(Collection<GroupOfCustomerPurchasePackagesRefStructure> values) {
        if (values!= null) {
            getGroupOfCustomerPurchasePackagesRef().addAll(values);
        }
        return this;
    }

    @Override
    public GroupOfcustomerPurchasePackageRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public GroupOfcustomerPurchasePackageRefs_RelStructure withId(String value) {
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
