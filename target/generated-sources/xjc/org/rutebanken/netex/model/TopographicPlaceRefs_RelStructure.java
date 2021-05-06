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
 * <p>Java class for topographicPlaceRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="topographicPlaceRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TopographicPlaceRef" type="{http://www.netex.org.uk/netex}TopographicPlaceRefStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "topographicPlaceRefs_RelStructure", propOrder = {
    "topographicPlaceRef"
})
public class TopographicPlaceRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElement(name = "TopographicPlaceRef", required = true)
    protected List<TopographicPlaceRefStructure> topographicPlaceRef;

    /**
     * Gets the value of the topographicPlaceRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topographicPlaceRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopographicPlaceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopographicPlaceRefStructure }
     * 
     * 
     */
    public List<TopographicPlaceRefStructure> getTopographicPlaceRef() {
        if (topographicPlaceRef == null) {
            topographicPlaceRef = new ArrayList<TopographicPlaceRefStructure>();
        }
        return this.topographicPlaceRef;
    }

    public TopographicPlaceRefs_RelStructure withTopographicPlaceRef(TopographicPlaceRefStructure... values) {
        if (values!= null) {
            for (TopographicPlaceRefStructure value: values) {
                getTopographicPlaceRef().add(value);
            }
        }
        return this;
    }

    public TopographicPlaceRefs_RelStructure withTopographicPlaceRef(Collection<TopographicPlaceRefStructure> values) {
        if (values!= null) {
            getTopographicPlaceRef().addAll(values);
        }
        return this;
    }

    @Override
    public TopographicPlaceRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public TopographicPlaceRefs_RelStructure withId(String value) {
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