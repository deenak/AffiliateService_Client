
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aTransactionIds" type="{http://api.affiliatewindow.com/}aTransactionId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aTransactionIds"
})
@XmlRootElement(name = "getTransaction")
public class GetTransaction
    implements Serializable
{

    @XmlElement(required = true)
    protected ATransactionId aTransactionIds;

    /**
     * Gets the value of the aTransactionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ATransactionId }
     *     
     */
    public ATransactionId getATransactionIds() {
        return aTransactionIds;
    }

    /**
     * Sets the value of the aTransactionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATransactionId }
     *     
     */
    public void setATransactionIds(ATransactionId value) {
        this.aTransactionIds = value;
    }

}
