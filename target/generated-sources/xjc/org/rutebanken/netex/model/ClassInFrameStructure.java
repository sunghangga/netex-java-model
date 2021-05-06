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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for ClassInFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassInFrameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}ClassInFrameGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nameOfClass" type="{http://www.netex.org.uk/netex}NameOfClass" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassInFrameStructure", propOrder = {
    "classRefType",
    "typeOfFrameRef",
    "mandatory",
    "attributes",
    "relationships"
})
public class ClassInFrameStructure {

    @XmlElement(name = "ClassRefType", defaultValue = "members")
    @XmlSchemaType(name = "normalizedString")
    protected ClassRefTypeEnumeration classRefType;
    @XmlElement(name = "TypeOfFrameRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String typeOfFrameRef;
    @XmlElement(name = "Mandatory", defaultValue = "optional")
    @XmlSchemaType(name = "normalizedString")
    protected MandatoryEnumeration mandatory;
    protected ClassInFrameStructure.Attributes attributes;
    protected ClassInFrameStructure.Relationships relationships;
    @XmlAttribute(name = "nameOfClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nameOfClass;

    /**
     * Gets the value of the classRefType property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public ClassRefTypeEnumeration getClassRefType() {
        return classRefType;
    }

    /**
     * Sets the value of the classRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRefTypeEnumeration }
     *     
     */
    public void setClassRefType(ClassRefTypeEnumeration value) {
        this.classRefType = value;
    }

    /**
     * Gets the value of the typeOfFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfFrameRef() {
        return typeOfFrameRef;
    }

    /**
     * Sets the value of the typeOfFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfFrameRef(String value) {
        this.typeOfFrameRef = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public MandatoryEnumeration getMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoryEnumeration }
     *     
     */
    public void setMandatory(MandatoryEnumeration value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ClassInFrameStructure.Attributes }
     *     
     */
    public ClassInFrameStructure.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassInFrameStructure.Attributes }
     *     
     */
    public void setAttributes(ClassInFrameStructure.Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the relationships property.
     * 
     * @return
     *     possible object is
     *     {@link ClassInFrameStructure.Relationships }
     *     
     */
    public ClassInFrameStructure.Relationships getRelationships() {
        return relationships;
    }

    /**
     * Sets the value of the relationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassInFrameStructure.Relationships }
     *     
     */
    public void setRelationships(ClassInFrameStructure.Relationships value) {
        this.relationships = value;
    }

    /**
     * Gets the value of the nameOfClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * Sets the value of the nameOfClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }

    public ClassInFrameStructure withClassRefType(ClassRefTypeEnumeration value) {
        setClassRefType(value);
        return this;
    }

    public ClassInFrameStructure withTypeOfFrameRef(String value) {
        setTypeOfFrameRef(value);
        return this;
    }

    public ClassInFrameStructure withMandatory(MandatoryEnumeration value) {
        setMandatory(value);
        return this;
    }

    public ClassInFrameStructure withAttributes(ClassInFrameStructure.Attributes value) {
        setAttributes(value);
        return this;
    }

    public ClassInFrameStructure withRelationships(ClassInFrameStructure.Relationships value) {
        setRelationships(value);
        return this;
    }

    public ClassInFrameStructure withNameOfClass(String value) {
        setNameOfClass(value);
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.netex.org.uk/netex}ClassAttributeInFrame" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classAttributeInFrame"
    })
    public static class Attributes {

        @XmlElement(name = "ClassAttributeInFrame", required = true)
        protected List<ClassAttributeInFrame> classAttributeInFrame;

        /**
         * Gets the value of the classAttributeInFrame property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classAttributeInFrame property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassAttributeInFrame().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassAttributeInFrame }
         * 
         * 
         */
        public List<ClassAttributeInFrame> getClassAttributeInFrame() {
            if (classAttributeInFrame == null) {
                classAttributeInFrame = new ArrayList<ClassAttributeInFrame>();
            }
            return this.classAttributeInFrame;
        }

        public ClassInFrameStructure.Attributes withClassAttributeInFrame(ClassAttributeInFrame... values) {
            if (values!= null) {
                for (ClassAttributeInFrame value: values) {
                    getClassAttributeInFrame().add(value);
                }
            }
            return this;
        }

        public ClassInFrameStructure.Attributes withClassAttributeInFrame(Collection<ClassAttributeInFrame> values) {
            if (values!= null) {
                getClassAttributeInFrame().addAll(values);
            }
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.netex.org.uk/netex}ClassRelationshipInFrame" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classRelationshipInFrame"
    })
    public static class Relationships {

        @XmlElement(name = "ClassRelationshipInFrame", required = true)
        protected List<ClassRelationshipInFrameStructure> classRelationshipInFrame;

        /**
         * Gets the value of the classRelationshipInFrame property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classRelationshipInFrame property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassRelationshipInFrame().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassRelationshipInFrameStructure }
         * 
         * 
         */
        public List<ClassRelationshipInFrameStructure> getClassRelationshipInFrame() {
            if (classRelationshipInFrame == null) {
                classRelationshipInFrame = new ArrayList<ClassRelationshipInFrameStructure>();
            }
            return this.classRelationshipInFrame;
        }

        public ClassInFrameStructure.Relationships withClassRelationshipInFrame(ClassRelationshipInFrameStructure... values) {
            if (values!= null) {
                for (ClassRelationshipInFrameStructure value: values) {
                    getClassRelationshipInFrame().add(value);
                }
            }
            return this;
        }

        public ClassInFrameStructure.Relationships withClassRelationshipInFrame(Collection<ClassRelationshipInFrameStructure> values) {
            if (values!= null) {
                getClassRelationshipInFrame().addAll(values);
            }
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

}