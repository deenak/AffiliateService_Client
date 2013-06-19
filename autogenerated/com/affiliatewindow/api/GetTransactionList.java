
package com.affiliatewindow.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sDateType" type="{http://api.affiliatewindow.com/}DateType"/>
 *         &lt;element name="sTransactionStatus" type="{http://api.affiliatewindow.com/}TransactionStatus" minOccurs="0"/>
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
    "dStartDate",
    "dEndDate",
    "sDateType",
    "sTransactionStatus",
    "iOffset",
    "iLimit"
})
@XmlRootElement(name = "getTransactionList")
public class GetTransactionList
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<Integer> aMerchantIds;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dEndDate;
    @XmlElement(required = true)
    protected DateType sDateType;
    protected TransactionStatus sTransactionStatus;
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
     * Gets the value of the dStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDStartDate() {
        return dStartDate;
    }

    /**
     * Sets the value of the dStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDStartDate(XMLGregorianCalendar value) {
        this.dStartDate = value;
    }

    /**
     * Gets the value of the dEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDEndDate() {
        return dEndDate;
    }

    /**
     * Sets the value of the dEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDEndDate(XMLGregorianCalendar value) {
        this.dEndDate = value;
    }

    /**
     * Gets the value of the sDateType property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getSDateType() {
        return sDateType;
    }

    /**
     * Sets the value of the sDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setSDateType(DateType value) {
        this.sDateType = value;
    }

    /**
     * Gets the value of the sTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getSTransactionStatus() {
        return sTransactionStatus;
    }

    /**
     * Sets the value of the sTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setSTransactionStatus(TransactionStatus value) {
        this.sTransactionStatus = value;
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
