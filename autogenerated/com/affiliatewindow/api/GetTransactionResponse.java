
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
 *         &lt;element name="getTransactionReturn" type="{http://api.affiliatewindow.com/}getTransactionReturn"/>
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
    "getTransactionReturn"
})
@XmlRootElement(name = "getTransactionResponse")
public class GetTransactionResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected GetTransactionReturn getTransactionReturn;

    /**
     * Gets the value of the getTransactionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionReturn }
     *     
     */
    public GetTransactionReturn getGetTransactionReturn() {
        return getTransactionReturn;
    }

    /**
     * Sets the value of the getTransactionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionReturn }
     *     
     */
    public void setGetTransactionReturn(GetTransactionReturn value) {
        this.getTransactionReturn = value;
    }

}
