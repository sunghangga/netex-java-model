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
 * <p>Java class for typeOfSecurityListRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeOfSecurityListRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TypeOfSecurityListRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOfSecurityListRefs_RelStructure", propOrder = {
    "typeOfSecurityListRef"
})
public class TypeOfSecurityListRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "TypeOfSecurityListRef", required = true)
    protected List<TypeOfSecurityListRefStructure> typeOfSecurityListRef;

    /**
     * Gets the value of the typeOfSecurityListRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfSecurityListRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfSecurityListRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeOfSecurityListRefStructure }
     * 
     * 
     */
    public List<TypeOfSecurityListRefStructure> getTypeOfSecurityListRef() {
        if (typeOfSecurityListRef == null) {
            typeOfSecurityListRef = new ArrayList<TypeOfSecurityListRefStructure>();
        }
        return this.typeOfSecurityListRef;
    }

    public TypeOfSecurityListRefs_RelStructure withTypeOfSecurityListRef(TypeOfSecurityListRefStructure... values) {
        if (values!= null) {
            for (TypeOfSecurityListRefStructure value: values) {
                getTypeOfSecurityListRef().add(value);
            }
        }
        return this;
    }

    public TypeOfSecurityListRefs_RelStructure withTypeOfSecurityListRef(Collection<TypeOfSecurityListRefStructure> values) {
        if (values!= null) {
            getTypeOfSecurityListRef().addAll(values);
        }
        return this;
    }

    @Override
    public TypeOfSecurityListRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public TypeOfSecurityListRefs_RelStructure withId(String value) {
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
