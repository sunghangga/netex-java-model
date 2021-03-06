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
 * <p>Java class for PathLinkRefByValueStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PathLinkRefByValueStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.netex.org.uk/netex}LinkRefByValueStructure"&gt;
 *       &lt;attribute name="fromPointRef" use="required" type="{http://www.netex.org.uk/netex}PointIdType" /&gt;
 *       &lt;attribute name="toPointRef" use="required" type="{http://www.netex.org.uk/netex}PointIdType" /&gt;
 *       &lt;attribute name="nameOfPointRefClass" type="{http://www.netex.org.uk/netex}NameOfClass" fixed="PathPoint" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkRefByValueStructure")
public class PathLinkRefByValueStructure
    extends LinkRefByValueStructure
{


    @Override
    public PathLinkRefByValueStructure withNameOfClass(String value) {
        setNameOfClass(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withFromPointRef(String value) {
        setFromPointRef(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withToPointRef(String value) {
        setToPointRef(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withNameOfPointRefClass(String value) {
        setNameOfPointRefClass(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withTypeOfLinkRef(String value) {
        setTypeOfLinkRef(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withCreated(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withChanged(LocalDateTime value) {
        setChanged(value);
        return this;
    }

    @Override
    public PathLinkRefByValueStructure withVersion(String value) {
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
