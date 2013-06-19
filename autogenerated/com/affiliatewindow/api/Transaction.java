
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sStatus" type="{http://api.affiliatewindow.com/}TransactionStatus"/>
 *         &lt;element name="sType" type="{http://api.affiliatewindow.com/}TransactionType"/>
 *         &lt;element name="sIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iPaymentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sDeclinedReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iMerchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mSaleAmount" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mCommissionAmount" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="dClickDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dValidationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sClickref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSearchSiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSearchSiteKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aTransactionParts" type="{http://api.affiliatewindow.com/}aTransactionParts"/>
 *         &lt;element name="sExtra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "iId",
    "sStatus",
    "sType",
    "sIp",
    "bPaid",
    "iPaymentId",
    "sDeclinedReason",
    "iMerchantId",
    "mSaleAmount",
    "mCommissionAmount",
    "dClickDate",
    "dTransactionDate",
    "dValidationDate",
    "sClickref",
    "sSearchSiteName",
    "sSearchSiteKeyword",
    "aTransactionParts",
    "sExtra"
})
public class Transaction
    implements Serializable
{

    protected int iId;
    @XmlElement(required = true)
    protected TransactionStatus sStatus;
    @XmlElement(required = true)
    protected TransactionType sType;
    protected String sIp;
    protected boolean bPaid;
    protected Integer iPaymentId;
    protected String sDeclinedReason;
    protected int iMerchantId;
    @XmlElement(required = true)
    protected Money mSaleAmount;
    @XmlElement(required = true)
    protected Money mCommissionAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dClickDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dTransactionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dValidationDate;
    protected String sClickref;
    protected String sSearchSiteName;
    protected String sSearchSiteKeyword;
    @XmlElement(required = true)
    protected ATransactionParts aTransactionParts;
    protected String sExtra;

    /**
     * Gets the value of the iId property.
     * 
     */
    public int getIId() {
        return iId;
    }

    /**
     * Sets the value of the iId property.
     * 
     */
    public void setIId(int value) {
        this.iId = value;
    }

    /**
     * Gets the value of the sStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus }
     *     
     */
    public TransactionStatus getSStatus() {
        return sStatus;
    }

    /**
     * Sets the value of the sStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus }
     *     
     */
    public void setSStatus(TransactionStatus value) {
        this.sStatus = value;
    }

    /**
     * Gets the value of the sType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getSType() {
        return sType;
    }

    /**
     * Sets the value of the sType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setSType(TransactionType value) {
        this.sType = value;
    }

    /**
     * Gets the value of the sIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIp() {
        return sIp;
    }

    /**
     * Sets the value of the sIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIp(String value) {
        this.sIp = value;
    }

    /**
     * Gets the value of the bPaid property.
     * 
     */
    public boolean isBPaid() {
        return bPaid;
    }

    /**
     * Sets the value of the bPaid property.
     * 
     */
    public void setBPaid(boolean value) {
        this.bPaid = value;
    }

    /**
     * Gets the value of the iPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIPaymentId() {
        return iPaymentId;
    }

    /**
     * Sets the value of the iPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIPaymentId(Integer value) {
        this.iPaymentId = value;
    }

    /**
     * Gets the value of the sDeclinedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDeclinedReason() {
        return sDeclinedReason;
    }

    /**
     * Sets the value of the sDeclinedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDeclinedReason(String value) {
        this.sDeclinedReason = value;
    }

    /**
     * Gets the value of the iMerchantId property.
     * 
     */
    public int getIMerchantId() {
        return iMerchantId;
    }

    /**
     * Sets the value of the iMerchantId property.
     * 
     */
    public void setIMerchantId(int value) {
        this.iMerchantId = value;
    }

    /**
     * Gets the value of the mSaleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMSaleAmount() {
        return mSaleAmount;
    }

    /**
     * Sets the value of the mSaleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMSaleAmount(Money value) {
        this.mSaleAmount = value;
    }

    /**
     * Gets the value of the mCommissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMCommissionAmount() {
        return mCommissionAmount;
    }

    /**
     * Sets the value of the mCommissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMCommissionAmount(Money value) {
        this.mCommissionAmount = value;
    }

    /**
     * Gets the value of the dClickDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDClickDate() {
        return dClickDate;
    }

    /**
     * Sets the value of the dClickDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDClickDate(XMLGregorianCalendar value) {
        this.dClickDate = value;
    }

    /**
     * Gets the value of the dTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDTransactionDate() {
        return dTransactionDate;
    }

    /**
     * Sets the value of the dTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDTransactionDate(XMLGregorianCalendar value) {
        this.dTransactionDate = value;
    }

    /**
     * Gets the value of the dValidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDValidationDate() {
        return dValidationDate;
    }

    /**
     * Sets the value of the dValidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDValidationDate(XMLGregorianCalendar value) {
        this.dValidationDate = value;
    }

    /**
     * Gets the value of the sClickref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClickref() {
        return sClickref;
    }

    /**
     * Sets the value of the sClickref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClickref(String value) {
        this.sClickref = value;
    }

    /**
     * Gets the value of the sSearchSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSearchSiteName() {
        return sSearchSiteName;
    }

    /**
     * Sets the value of the sSearchSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSearchSiteName(String value) {
        this.sSearchSiteName = value;
    }

    /**
     * Gets the value of the sSearchSiteKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSearchSiteKeyword() {
        return sSearchSiteKeyword;
    }

    /**
     * Sets the value of the sSearchSiteKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSearchSiteKeyword(String value) {
        this.sSearchSiteKeyword = value;
    }

    /**
     * Gets the value of the aTransactionParts property.
     * 
     * @return
     *     possible object is
     *     {@link ATransactionParts }
     *     
     */
    public ATransactionParts getATransactionParts() {
        return aTransactionParts;
    }

    /**
     * Sets the value of the aTransactionParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATransactionParts }
     *     
     */
    public void setATransactionParts(ATransactionParts value) {
        this.aTransactionParts = value;
    }

    /**
     * Gets the value of the sExtra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSExtra() {
        return sExtra;
    }

    /**
     * Sets the value of the sExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSExtra(String value) {
        this.sExtra = value;
    }

}
