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
 * <p>Java class for dataSources_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataSources_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.netex.org.uk/netex}containmentAggregationStructure"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataSourceRef"/&gt;
 *         &lt;element ref="{http://www.netex.org.uk/netex}DataSource"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataSources_RelStructure", propOrder = {
    "dataSourceRefOrDataSource"
})
public class DataSources_RelStructure
    extends ContainmentAggregationStructure
{

    @XmlElements({
        @XmlElement(name = "DataSourceRef", type = DataSourceRefStructure.class),
        @XmlElement(name = "DataSource", type = DataSource.class)
    })
    protected List<Object> dataSourceRefOrDataSource;

    /**
     * Gets the value of the dataSourceRefOrDataSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSourceRefOrDataSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSourceRefOrDataSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataSourceRefStructure }
     * {@link DataSource }
     * 
     * 
     */
    public List<Object> getDataSourceRefOrDataSource() {
        if (dataSourceRefOrDataSource == null) {
            dataSourceRefOrDataSource = new ArrayList<Object>();
        }
        return this.dataSourceRefOrDataSource;
    }

    public DataSources_RelStructure withDataSourceRefOrDataSource(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getDataSourceRefOrDataSource().add(value);
            }
        }
        return this;
    }

    public DataSources_RelStructure withDataSourceRefOrDataSource(Collection<Object> values) {
        if (values!= null) {
            getDataSourceRefOrDataSource().addAll(values);
        }
        return this;
    }

    @Override
    public DataSources_RelStructure withModificationSet(ModificationSetEnumeration value) {
        setModificationSet(value);
        return this;
    }

    @Override
    public DataSources_RelStructure withId(String value) {
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