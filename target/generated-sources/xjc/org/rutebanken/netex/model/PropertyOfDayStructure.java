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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java class for PropertyOfDayStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyOfDayStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.netex.org.uk/netex}MultilingualString" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.netex.org.uk/netex}PropertyOfDayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyOfDayStructure", propOrder = {
    "name",
    "description",
    "daysOfWeek",
    "weeksOfMonth",
    "monthOfYear",
    "dayOfMonth",
    "dayOfYear",
    "countryRef",
    "holidayTypes",
    "seasons",
    "tides",
    "dayEvent",
    "crowding"
})
@XmlSeeAlso({
    PropertyOfDay.class
})
public class PropertyOfDayStructure {

    @XmlElement(name = "Name")
    protected MultilingualString name;
    @XmlElement(name = "Description")
    protected MultilingualString description;
    @XmlList
    @XmlElement(name = "DaysOfWeek")
    protected List<DayOfWeekEnumeration> daysOfWeek;
    @XmlList
    @XmlElement(name = "WeeksOfMonth", defaultValue = "EveryWeek")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> weeksOfMonth;
    @XmlElement(name = "MonthOfYear")
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar monthOfYear;
    @XmlElement(name = "DayOfMonth")
    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar dayOfMonth;
    @XmlElement(name = "DayOfYear")
    @XmlSchemaType(name = "gMonthDay")
    protected XMLGregorianCalendar dayOfYear;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlList
    @XmlElement(name = "HolidayTypes", defaultValue = "AnyDay")
    protected List<HolidayTypeEnumeration> holidayTypes;
    @XmlList
    @XmlElement(name = "Seasons", defaultValue = "Perennially")
    protected List<SeasonEnumeration> seasons;
    @XmlList
    @XmlElement(name = "Tides", defaultValue = "AllTides")
    protected List<TideEnumeration> tides;
    @XmlElement(name = "DayEvent")
    @XmlSchemaType(name = "string")
    protected DayEventEnumeration dayEvent;
    @XmlElement(name = "Crowding")
    @XmlSchemaType(name = "string")
    protected CrowdingEnumeration crowding;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekEnumeration }
     * 
     * 
     */
    public List<DayOfWeekEnumeration> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DayOfWeekEnumeration>();
        }
        return this.daysOfWeek;
    }

    /**
     * Gets the value of the weeksOfMonth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weeksOfMonth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeeksOfMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeeksOfMonth() {
        if (weeksOfMonth == null) {
            weeksOfMonth = new ArrayList<String>();
        }
        return this.weeksOfMonth;
    }

    /**
     * Gets the value of the monthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthOfYear() {
        return monthOfYear;
    }

    /**
     * Sets the value of the monthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthOfYear(XMLGregorianCalendar value) {
        this.monthOfYear = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfMonth(XMLGregorianCalendar value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the dayOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDayOfYear() {
        return dayOfYear;
    }

    /**
     * Sets the value of the dayOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDayOfYear(XMLGregorianCalendar value) {
        this.dayOfYear = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the holidayTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumeration }
     * 
     * 
     */
    public List<HolidayTypeEnumeration> getHolidayTypes() {
        if (holidayTypes == null) {
            holidayTypes = new ArrayList<HolidayTypeEnumeration>();
        }
        return this.holidayTypes;
    }

    /**
     * Gets the value of the seasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeasonEnumeration }
     * 
     * 
     */
    public List<SeasonEnumeration> getSeasons() {
        if (seasons == null) {
            seasons = new ArrayList<SeasonEnumeration>();
        }
        return this.seasons;
    }

    /**
     * Gets the value of the tides property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tides property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTides().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TideEnumeration }
     * 
     * 
     */
    public List<TideEnumeration> getTides() {
        if (tides == null) {
            tides = new ArrayList<TideEnumeration>();
        }
        return this.tides;
    }

    /**
     * Gets the value of the dayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DayEventEnumeration }
     *     
     */
    public DayEventEnumeration getDayEvent() {
        return dayEvent;
    }

    /**
     * Sets the value of the dayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayEventEnumeration }
     *     
     */
    public void setDayEvent(DayEventEnumeration value) {
        this.dayEvent = value;
    }

    /**
     * Gets the value of the crowding property.
     * 
     * @return
     *     possible object is
     *     {@link CrowdingEnumeration }
     *     
     */
    public CrowdingEnumeration getCrowding() {
        return crowding;
    }

    /**
     * Sets the value of the crowding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrowdingEnumeration }
     *     
     */
    public void setCrowding(CrowdingEnumeration value) {
        this.crowding = value;
    }

    public PropertyOfDayStructure withName(MultilingualString value) {
        setName(value);
        return this;
    }

    public PropertyOfDayStructure withDescription(MultilingualString value) {
        setDescription(value);
        return this;
    }

    public PropertyOfDayStructure withDaysOfWeek(DayOfWeekEnumeration... values) {
        if (values!= null) {
            for (DayOfWeekEnumeration value: values) {
                getDaysOfWeek().add(value);
            }
        }
        return this;
    }

    public PropertyOfDayStructure withDaysOfWeek(Collection<DayOfWeekEnumeration> values) {
        if (values!= null) {
            getDaysOfWeek().addAll(values);
        }
        return this;
    }

    public PropertyOfDayStructure withWeeksOfMonth(String... values) {
        if (values!= null) {
            for (String value: values) {
                getWeeksOfMonth().add(value);
            }
        }
        return this;
    }

    public PropertyOfDayStructure withWeeksOfMonth(Collection<String> values) {
        if (values!= null) {
            getWeeksOfMonth().addAll(values);
        }
        return this;
    }

    public PropertyOfDayStructure withMonthOfYear(XMLGregorianCalendar value) {
        setMonthOfYear(value);
        return this;
    }

    public PropertyOfDayStructure withDayOfMonth(XMLGregorianCalendar value) {
        setDayOfMonth(value);
        return this;
    }

    public PropertyOfDayStructure withDayOfYear(XMLGregorianCalendar value) {
        setDayOfYear(value);
        return this;
    }

    public PropertyOfDayStructure withCountryRef(CountryRefStructure value) {
        setCountryRef(value);
        return this;
    }

    public PropertyOfDayStructure withHolidayTypes(HolidayTypeEnumeration... values) {
        if (values!= null) {
            for (HolidayTypeEnumeration value: values) {
                getHolidayTypes().add(value);
            }
        }
        return this;
    }

    public PropertyOfDayStructure withHolidayTypes(Collection<HolidayTypeEnumeration> values) {
        if (values!= null) {
            getHolidayTypes().addAll(values);
        }
        return this;
    }

    public PropertyOfDayStructure withSeasons(SeasonEnumeration... values) {
        if (values!= null) {
            for (SeasonEnumeration value: values) {
                getSeasons().add(value);
            }
        }
        return this;
    }

    public PropertyOfDayStructure withSeasons(Collection<SeasonEnumeration> values) {
        if (values!= null) {
            getSeasons().addAll(values);
        }
        return this;
    }

    public PropertyOfDayStructure withTides(TideEnumeration... values) {
        if (values!= null) {
            for (TideEnumeration value: values) {
                getTides().add(value);
            }
        }
        return this;
    }

    public PropertyOfDayStructure withTides(Collection<TideEnumeration> values) {
        if (values!= null) {
            getTides().addAll(values);
        }
        return this;
    }

    public PropertyOfDayStructure withDayEvent(DayEventEnumeration value) {
        setDayEvent(value);
        return this;
    }

    public PropertyOfDayStructure withCrowding(CrowdingEnumeration value) {
        setCrowding(value);
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
