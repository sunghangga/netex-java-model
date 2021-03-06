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
 * <p>Java class for classRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}ClassRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classRefs_RelStructure", propOrder = {
    "classRef"
})
public class ClassRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRef(name = "ClassRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class)
    protected List<JAXBElement<? extends ClassRefStructure>> classRef;

    /**
     * Gets the value of the classRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ClassRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassInFrameRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ClassRefStructure>> getClassRef() {
        if (classRef == null) {
            classRef = new ArrayList<JAXBElement<? extends ClassRefStructure>>();
        }
        return this.classRef;
    }

    public ClassRefs_RelStructure withClassRef(JAXBElement<? extends ClassRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends ClassRefStructure> value: values) {
                getClassRef().add(value);
            }
        }
        return this;
    }

    public ClassRefs_RelStructure withClassRef(Collection<JAXBElement<? extends ClassRefStructure>> values) {
        if (values!= null) {
            getClassRef().addAll(values);
        }
        return this;
    }

    @Override
    public ClassRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public ClassRefs_RelStructure withId(String value) {
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
