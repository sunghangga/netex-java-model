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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for vehicleEquipments_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleEquipments_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}AccessVehicleEquipment"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}WheelchairVehicleEquipment"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleEquipments_RelStructure", propOrder = {
    "accessVehicleEquipmentOrWheelchairVehicleEquipment"
})
public class VehicleEquipments_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "AccessVehicleEquipment", type = AccessVehicleEquipment.class),
        @XmlElement(name = "WheelchairVehicleEquipment", type = WheelchairVehicleEquipment.class)
    })
    protected List<ActualVehicleEquipment_VersionStructure> accessVehicleEquipmentOrWheelchairVehicleEquipment;

    /**
     * Gets the value of the accessVehicleEquipmentOrWheelchairVehicleEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessVehicleEquipmentOrWheelchairVehicleEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessVehicleEquipmentOrWheelchairVehicleEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessVehicleEquipment }
     * {@link WheelchairVehicleEquipment }
     * 
     * 
     */
    public List<ActualVehicleEquipment_VersionStructure> getAccessVehicleEquipmentOrWheelchairVehicleEquipment() {
        if (accessVehicleEquipmentOrWheelchairVehicleEquipment == null) {
            accessVehicleEquipmentOrWheelchairVehicleEquipment = new ArrayList<ActualVehicleEquipment_VersionStructure>();
        }
        return this.accessVehicleEquipmentOrWheelchairVehicleEquipment;
    }

    public VehicleEquipments_RelStructure withAccessVehicleEquipmentOrWheelchairVehicleEquipment(ActualVehicleEquipment_VersionStructure... values) {
        if (values!= null) {
            for (ActualVehicleEquipment_VersionStructure value: values) {
                getAccessVehicleEquipmentOrWheelchairVehicleEquipment().add(value);
            }
        }
        return this;
    }

    public VehicleEquipments_RelStructure withAccessVehicleEquipmentOrWheelchairVehicleEquipment(Collection<ActualVehicleEquipment_VersionStructure> values) {
        if (values!= null) {
            getAccessVehicleEquipmentOrWheelchairVehicleEquipment().addAll(values);
        }
        return this;
    }

    @Override
    public VehicleEquipments_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public VehicleEquipments_RelStructure withId(String value) {
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
