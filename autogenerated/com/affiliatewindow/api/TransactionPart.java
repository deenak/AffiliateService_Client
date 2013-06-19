
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sCommissionGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mSaleAmount" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mCommissionAmount" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="iCommission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCommissionType" type="{http://api.affiliatewindow.com/}CommissionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPart", propOrder = {
    "sCommissionGroupName",
    "mSaleAmount",
    "mCommissionAmount",
    "iCommission",
    "sCommissionType"
})
public class TransactionPart
    implements Serializable
{

    @XmlElement(required = true)
    protected String sCommissionGroupName;
    @XmlElement(required = true)
    protected Money mSaleAmount;
    @XmlElement(required = true)
    protected Money mCommissionAmount;
    protected int iCommission;
    @XmlElement(required = true)
    protected CommissionType sCommissionType;

    /**
     * Gets the value of the sCommissionGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCommissionGroupName() {
        return sCommissionGroupName;
    }

    /**
     * Sets the value of the sCommissionGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCommissionGroupName(String value) {
        this.sCommissionGroupName = value;
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
     * Gets the value of the iCommission property.
     * 
     */
    public int getICommission() {
        return iCommission;
    }

    /**
     * Sets the value of the iCommission property.
     * 
     */
    public void setICommission(int value) {
        this.iCommission = value;
    }

    /**
     * Gets the value of the sCommissionType property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getSCommissionType() {
        return sCommissionType;
    }

    /**
     * Sets the value of the sCommissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setSCommissionType(CommissionType value) {
        this.sCommissionType = value;
    }

}
