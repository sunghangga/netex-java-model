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
 * <p>Java class for usedInRefs_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usedInRefs_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}oneToManyRelationshipStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}TariffRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfDistanceMatrixElementsRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}GroupOfSalesOfferPackagesRef" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usedInRefs_RelStructure", propOrder = {
    "tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef"
})
public class UsedInRefs_RelStructure
    extends OneToManyRelationshipStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "TariffRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfSalesOfferPackagesRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GroupOfDistanceMatrixElementsRef", namespace = "http://www.netex.org.uk/netex", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends VersionOfObjectRefStructure>> tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef;

    /**
     * Gets the value of the tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfSalesOfferPackagesRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ParkingTariffRefStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupOfDistanceMatrixElementsRefStructureElement }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VersionOfObjectRefStructure>> getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef() {
        if (tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef == null) {
            tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef = new ArrayList<JAXBElement<? extends VersionOfObjectRefStructure>>();
        }
        return this.tariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef;
    }

    public UsedInRefs_RelStructure withTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef(JAXBElement<? extends VersionOfObjectRefStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends VersionOfObjectRefStructure> value: values) {
                getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef().add(value);
            }
        }
        return this;
    }

    public UsedInRefs_RelStructure withTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef(Collection<JAXBElement<? extends VersionOfObjectRefStructure>> values) {
        if (values!= null) {
            getTariffRefOrGroupOfDistanceMatrixElementsRefOrGroupOfSalesOfferPackagesRef().addAll(values);
        }
        return this;
    }

    @Override
    public UsedInRefs_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public UsedInRefs_RelStructure withId(String value) {
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
