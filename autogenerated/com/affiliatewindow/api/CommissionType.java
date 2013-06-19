
package com.affiliatewindow.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percentage"/>
 *     &lt;enumeration value="amount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommissionType")
@XmlEnum
public enum CommissionType {

    @XmlEnumValue("percentage")
    PERCENTAGE("percentage"),
    @XmlEnumValue("amount")
    AMOUNT("amount");
    private final String value;

    CommissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommissionType fromValue(String v) {
        for (CommissionType c: CommissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
