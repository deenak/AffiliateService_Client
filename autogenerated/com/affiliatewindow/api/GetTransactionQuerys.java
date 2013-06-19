
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
 *         &lt;element name="aMerchantIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aStatus" type="{http://api.affiliatewindow.com/}TransactionPreStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aClickRefs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="iOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="iLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "aMerchantIds",
    "aStatus",
    "aClickRefs",
    "iOffset",
    "iLimit"
})
@XmlRootElement(name = "getTransactionQuerys")
public class GetTransactionQuerys
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<Integer> aMerchantIds;
    @XmlElement(nillable = true)
    protected List<TransactionPreStatus> aStatus;
    @XmlElement(nillable = true)
    protected List<String> aClickRefs;
    @XmlElement(defaultValue = "0")
    protected Integer iOffset;
    @XmlElement(defaultValue = "100")
    protected Integer iLimit;

    /**
     * Gets the value of the aMerchantIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aMerchantIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAMerchantIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAMerchantIds() {
        if (aMerchantIds == null) {
            aMerchantIds = new ArrayList<Integer>();
        }
        return this.aMerchantIds;
    }

    /**
     * Gets the value of the aStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionPreStatus }
     * 
     * 
     */
    public List<TransactionPreStatus> getAStatus() {
        if (aStatus == null) {
            aStatus = new ArrayList<TransactionPreStatus>();
        }
        return this.aStatus;
    }

    /**
     * Gets the value of the aClickRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aClickRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAClickRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAClickRefs() {
        if (aClickRefs == null) {
            aClickRefs = new ArrayList<String>();
        }
        return this.aClickRefs;
    }

    /**
     * Gets the value of the iOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOffset() {
        return iOffset;
    }

    /**
     * Sets the value of the iOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOffset(Integer value) {
        this.iOffset = value;
    }

    /**
     * Gets the value of the iLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getILimit() {
        return iLimit;
    }

    /**
     * Sets the value of the iLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setILimit(Integer value) {
        this.iLimit = value;
    }

}
