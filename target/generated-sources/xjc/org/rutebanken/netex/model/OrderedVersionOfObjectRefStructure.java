//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for OrderedVersionOfObjectRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderedVersionOfObjectRefStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex&gt;VersionOfObjectRefStructure"&gt;
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderedVersionOfObjectRefStructure")
@XmlSeeAlso({
    TrainComponentRefStructure.class,
    LinkInSequenceRefStructure.class,
    PointInSequenceRefStructure.class,
    FareElementInSequenceRefStructure.class,
    AssignmentRefStructure.class
})
public class OrderedVersionOfObjectRefStructure
    extends VersionOfObjectRefStructure
{

    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public OrderedVersionOfObjectRefStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withNameOfRefClass(String value) {
        setNameOfRefClass(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withRef(String value) {
        setRef(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withVersionRef(String value) {
        setVersionRef(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public OrderedVersionOfObjectRefStructure withVersion(String value) {
        setVersion(value);
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
