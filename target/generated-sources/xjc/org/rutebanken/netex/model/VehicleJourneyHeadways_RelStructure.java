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
 * <p>Java class for vehicleJourneyHeadways_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleJourneyHeadways_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}strictContainmentAggregationStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}VehicleJourneyHeadway" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleJourneyHeadways_RelStructure", propOrder = {
    "vehicleJourneyHeadway"
})
public class VehicleJourneyHeadways_RelStructure
    extends StrictContainmentAggregationStructure
{

    @XmlElement(name = "VehicleJourneyHeadway", required = true)
    protected List<VehicleJourneyHeadway> vehicleJourneyHeadway;

    /**
     * Gets the value of the vehicleJourneyHeadway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyHeadway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyHeadway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourneyHeadway }
     * 
     * 
     */
    public List<VehicleJourneyHeadway> getVehicleJourneyHeadway() {
        if (vehicleJourneyHeadway == null) {
            vehicleJourneyHeadway = new ArrayList<VehicleJourneyHeadway>();
        }
        return this.vehicleJourneyHeadway;
    }

    public VehicleJourneyHeadways_RelStructure withVehicleJourneyHeadway(VehicleJourneyHeadway... values) {
        if (values!= null) {
            for (VehicleJourneyHeadway value: values) {
                getVehicleJourneyHeadway().add(value);
            }
        }
        return this;
    }

    public VehicleJourneyHeadways_RelStructure withVehicleJourneyHeadway(Collection<VehicleJourneyHeadway> values) {
        if (values!= null) {
            getVehicleJourneyHeadway().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleJourneyHeadways_RelStructure withId(String value) {
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
