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
 * <p>Java class for trainsInCompoundTrain_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trainsInCompoundTrain_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrainInCompoundTrain" type="{http://www.netex.org.uk/netex}TrainInCompoundTrain_VersionedChildStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trainsInCompoundTrain_RelStructure", propOrder = {
    "trainInCompoundTrain"
})
public class TrainsInCompoundTrain_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "TrainInCompoundTrain", required = true)
    protected List<TrainInCompoundTrain_VersionedChildStructure> trainInCompoundTrain;

    /**
     * Gets the value of the trainInCompoundTrain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainInCompoundTrain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainInCompoundTrain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainInCompoundTrain_VersionedChildStructure }
     * 
     * 
     */
    public List<TrainInCompoundTrain_VersionedChildStructure> getTrainInCompoundTrain() {
        if (trainInCompoundTrain == null) {
            trainInCompoundTrain = new ArrayList<TrainInCompoundTrain_VersionedChildStructure>();
        }
        return this.trainInCompoundTrain;
    }

    public TrainsInCompoundTrain_RelStructure withTrainInCompoundTrain(TrainInCompoundTrain_VersionedChildStructure... values) {
        if (values!= null) {
            for (TrainInCompoundTrain_VersionedChildStructure value: values) {
                getTrainInCompoundTrain().add(value);
            }
        }
        return this;
    }

    public TrainsInCompoundTrain_RelStructure withTrainInCompoundTrain(Collection<TrainInCompoundTrain_VersionedChildStructure> values) {
        if (values!= null) {
            getTrainInCompoundTrain().addAll(values);
        }
        return this;
    }

    @Override
    public TrainsInCompoundTrain_RelStructure withId(String value) {
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