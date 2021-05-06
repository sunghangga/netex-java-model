//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.netex.org.uk/netex&gt;DistanceMatrixElementRefStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DistanceMatrixElementRef
    extends DistanceMatrixElementRefStructure
{


    @Override
    public DistanceMatrixElementRef withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withNameOfRefClass(String value) {
        setNameOfRefClass(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withRef(String value) {
        setRef(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withVersionRef(String value) {
        setVersionRef(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public DistanceMatrixElementRef withVersion(String value) {
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
