
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
 *         &lt;element name="getTransactionListReturn" type="{http://api.affiliatewindow.com/}getTransactionListReturn"/>
 *         &lt;element name="getTransactionListCountReturn" type="{http://api.affiliatewindow.com/}RowCounts"/>
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
    "getTransactionListReturn",
    "getTransactionListCountReturn"
})
@XmlRootElement(name = "getTransactionListResponse")
public class GetTransactionListResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected GetTransactionListReturn getTransactionListReturn;
    @XmlElement(required = true)
    protected RowCounts getTransactionListCountReturn;

    /**
     * Gets the value of the getTransactionListReturn property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionListReturn }
     *     
     */
    public GetTransactionListReturn getGetTransactionListReturn() {
        return getTransactionListReturn;
    }

    /**
     * Sets the value of the getTransactionListReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionListReturn }
     *     
     */
    public void setGetTransactionListReturn(GetTransactionListReturn value) {
        this.getTransactionListReturn = value;
    }

    /**
     * Gets the value of the getTransactionListCountReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RowCounts }
     *     
     */
    public RowCounts getGetTransactionListCountReturn() {
        return getTransactionListCountReturn;
    }

    /**
     * Sets the value of the getTransactionListCountReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowCounts }
     *     
     */
    public void setGetTransactionListCountReturn(RowCounts value) {
        this.getTransactionListCountReturn = value;
    }

}
