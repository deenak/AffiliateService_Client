
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iEnquiryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iMerchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sClickRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mAmount" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mCommission" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="dDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sCustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDeclineReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQuery", propOrder = {
    "iEnquiryId",
    "iMerchantId",
    "sClickRef",
    "sStatus",
    "mAmount",
    "mCommission",
    "dDate",
    "sCustomerReference",
    "sReference",
    "sProgramName",
    "sDeclineReason",
    "sType",
    "sDescription"
})
public class TransactionQuery
    implements Serializable
{

    protected int iEnquiryId;
    protected int iMerchantId;
    @XmlElement(required = true)
    protected String sClickRef;
    @XmlElement(required = true)
    protected String sStatus;
    @XmlElement(required = true)
    protected Money mAmount;
    @XmlElement(required = true)
    protected Money mCommission;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDate;
    protected String sCustomerReference;
    protected String sReference;
    @XmlElement(required = true)
    protected String sProgramName;
    protected String sDeclineReason;
    @XmlElement(required = true)
    protected String sType;
    protected String sDescription;

    /**
     * Gets the value of the iEnquiryId property.
     * 
     */
    public int getIEnquiryId() {
        return iEnquiryId;
    }

    /**
     * Sets the value of the iEnquiryId property.
     * 
     */
    public void setIEnquiryId(int value) {
        this.iEnquiryId = value;
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
     * Gets the value of the sClickRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClickRef() {
        return sClickRef;
    }

    /**
     * Sets the value of the sClickRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClickRef(String value) {
        this.sClickRef = value;
    }

    /**
     * Gets the value of the sStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStatus() {
        return sStatus;
    }

    /**
     * Sets the value of the sStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStatus(String value) {
        this.sStatus = value;
    }

    /**
     * Gets the value of the mAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMAmount() {
        return mAmount;
    }

    /**
     * Sets the value of the mAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMAmount(Money value) {
        this.mAmount = value;
    }

    /**
     * Gets the value of the mCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMCommission() {
        return mCommission;
    }

    /**
     * Sets the value of the mCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMCommission(Money value) {
        this.mCommission = value;
    }

    /**
     * Gets the value of the dDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDate() {
        return dDate;
    }

    /**
     * Sets the value of the dDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDate(XMLGregorianCalendar value) {
        this.dDate = value;
    }

    /**
     * Gets the value of the sCustomerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCustomerReference() {
        return sCustomerReference;
    }

    /**
     * Sets the value of the sCustomerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCustomerReference(String value) {
        this.sCustomerReference = value;
    }

    /**
     * Gets the value of the sReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReference() {
        return sReference;
    }

    /**
     * Sets the value of the sReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReference(String value) {
        this.sReference = value;
    }

    /**
     * Gets the value of the sProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSProgramName() {
        return sProgramName;
    }

    /**
     * Sets the value of the sProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSProgramName(String value) {
        this.sProgramName = value;
    }

    /**
     * Gets the value of the sDeclineReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDeclineReason() {
        return sDeclineReason;
    }

    /**
     * Sets the value of the sDeclineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDeclineReason(String value) {
        this.sDeclineReason = value;
    }

    /**
     * Gets the value of the sType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSType() {
        return sType;
    }

    /**
     * Sets the value of the sType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSType(String value) {
        this.sType = value;
    }

    /**
     * Gets the value of the sDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDescription() {
        return sDescription;
    }

    /**
     * Sets the value of the sDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDescription(String value) {
        this.sDescription = value;
    }

}
