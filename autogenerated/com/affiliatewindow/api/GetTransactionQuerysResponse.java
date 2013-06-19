
package com.affiliatewindow.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="getTransactionQuerysReturn" type="{http://api.affiliatewindow.com/}TransactionQuery" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="getTransactionQuerysCountReturn" type="{http://api.affiliatewindow.com/}RowCounts"/>
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
    "getTransactionQuerysReturn",
    "getTransactionQuerysCountReturn"
})
@XmlRootElement(name = "getTransactionQuerysResponse")
public class GetTransactionQuerysResponse
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<TransactionQuery> getTransactionQuerysReturn;
    @XmlElement(required = true)
    protected RowCounts getTransactionQuerysCountReturn;

    /**
     * Gets the value of the getTransactionQuerysReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getTransactionQuerysReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetTransactionQuerysReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionQuery }
     * 
     * 
     */
    public List<TransactionQuery> getGetTransactionQuerysReturn() {
        if (getTransactionQuerysReturn == null) {
            getTransactionQuerysReturn = new ArrayList<TransactionQuery>();
        }
        return this.getTransactionQuerysReturn;
    }

    /**
     * Gets the value of the getTransactionQuerysCountReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RowCounts }
     *     
     */
    public RowCounts getGetTransactionQuerysCountReturn() {
        return getTransactionQuerysCountReturn;
    }

    /**
     * Sets the value of the getTransactionQuerysCountReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowCounts }
     *     
     */
    public void setGetTransactionQuerysCountReturn(RowCounts value) {
        this.getTransactionQuerysCountReturn = value;
    }

}
