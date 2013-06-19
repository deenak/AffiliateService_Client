
package com.affiliatewindow.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPreStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionPreStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="approved"/>
 *     &lt;enumeration value="declined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionPreStatus")
@XmlEnum
public enum TransactionPreStatus {

    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("approved")
    APPROVED("approved"),
    @XmlEnumValue("declined")
    DECLINED("declined");
    private final String value;

    TransactionPreStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionPreStatus fromValue(String v) {
        for (TransactionPreStatus c: TransactionPreStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
