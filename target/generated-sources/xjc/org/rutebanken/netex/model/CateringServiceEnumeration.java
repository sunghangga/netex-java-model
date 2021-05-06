//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.27 at 06:54:48 PM WITA 
//


package org.rutebanken.netex.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CateringServiceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CateringServiceEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bar"/&gt;
 *     &lt;enumeration value="beverageVendingMachine"/&gt;
 *     &lt;enumeration value="buffet"/&gt;
 *     &lt;enumeration value="coffeeShop"/&gt;
 *     &lt;enumeration value="firstClassRestaurant"/&gt;
 *     &lt;enumeration value="foodVendingMachine"/&gt;
 *     &lt;enumeration value="hotFoodService"/&gt;
 *     &lt;enumeration value="restaurant"/&gt;
 *     &lt;enumeration value="snacks"/&gt;
 *     &lt;enumeration value="trolleyService"/&gt;
 *     &lt;enumeration value="noBeveragesAvailable"/&gt;
 *     &lt;enumeration value="noFoodServiceAvailable"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CateringServiceEnumeration")
@XmlEnum
public enum CateringServiceEnumeration {

    @XmlEnumValue("bar")
    BAR("bar"),
    @XmlEnumValue("beverageVendingMachine")
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine"),
    @XmlEnumValue("buffet")
    BUFFET("buffet"),
    @XmlEnumValue("coffeeShop")
    COFFEE_SHOP("coffeeShop"),
    @XmlEnumValue("firstClassRestaurant")
    FIRST_CLASS_RESTAURANT("firstClassRestaurant"),
    @XmlEnumValue("foodVendingMachine")
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    @XmlEnumValue("hotFoodService")
    HOT_FOOD_SERVICE("hotFoodService"),
    @XmlEnumValue("restaurant")
    RESTAURANT("restaurant"),
    @XmlEnumValue("snacks")
    SNACKS("snacks"),
    @XmlEnumValue("trolleyService")
    TROLLEY_SERVICE("trolleyService"),
    @XmlEnumValue("noBeveragesAvailable")
    NO_BEVERAGES_AVAILABLE("noBeveragesAvailable"),
    @XmlEnumValue("noFoodServiceAvailable")
    NO_FOOD_SERVICE_AVAILABLE("noFoodServiceAvailable"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    CateringServiceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CateringServiceEnumeration fromValue(String v) {
        for (CateringServiceEnumeration c: CateringServiceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}