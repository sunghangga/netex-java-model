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
 * <p>Java class for blockParts_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blockParts_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}BlockPartRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}BlockPart"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TrainBlockPart"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockParts_RelStructure", propOrder = {
    "blockPartRefOrBlockPartOrTrainBlockPart"
})
public class BlockParts_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "BlockPart", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrainBlockPart", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BlockPartRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> blockPartRefOrBlockPartOrTrainBlockPart;

    /**
     * Gets the value of the blockPartRefOrBlockPartOrTrainBlockPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockPartRefOrBlockPartOrTrainBlockPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockPartRefOrBlockPartOrTrainBlockPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TrainBlockPartRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link TrainBlockPart }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockPart }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockPartRefStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBlockPartRefOrBlockPartOrTrainBlockPart() {
        if (blockPartRefOrBlockPartOrTrainBlockPart == null) {
            blockPartRefOrBlockPartOrTrainBlockPart = new ArrayList<JAXBElement<?>>();
        }
        return this.blockPartRefOrBlockPartOrTrainBlockPart;
    }

    public BlockParts_RelStructure withBlockPartRefOrBlockPartOrTrainBlockPart(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getBlockPartRefOrBlockPartOrTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public BlockParts_RelStructure withBlockPartRefOrBlockPartOrTrainBlockPart(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getBlockPartRefOrBlockPartOrTrainBlockPart().addAll(values);
        }
        return this;
    }

    @Override
    public BlockParts_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public BlockParts_RelStructure withId(String value) {
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
