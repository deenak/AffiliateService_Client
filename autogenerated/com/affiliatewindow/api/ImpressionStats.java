
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpressionStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpressionStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sLinkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sLinkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sMerchantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iPendingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mPendingValue" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mPendingCommission" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="iConfirmedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mConfirmedValue" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mConfirmedCommission" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="iDeclinedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mDeclinedValue" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="mDeclinedCommission" type="{http://api.affiliatewindow.com/}Money"/>
 *         &lt;element name="iImpressions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpressionStats", propOrder = {
    "sLinkName",
    "sLinkType",
    "sMerchantName",
    "iPendingCount",
    "mPendingValue",
    "mPendingCommission",
    "iConfirmedCount",
    "mConfirmedValue",
    "mConfirmedCommission",
    "iDeclinedCount",
    "mDeclinedValue",
    "mDeclinedCommission",
    "iImpressions"
})
public class ImpressionStats
    implements Serializable
{

    @XmlElement(required = true)
    protected String sLinkName;
    @XmlElement(required = true)
    protected String sLinkType;
    @XmlElement(required = true)
    protected String sMerchantName;
    protected int iPendingCount;
    @XmlElement(required = true)
    protected Money mPendingValue;
    @XmlElement(required = true)
    protected Money mPendingCommission;
    protected int iConfirmedCount;
    @XmlElement(required = true)
    protected Money mConfirmedValue;
    @XmlElement(required = true)
    protected Money mConfirmedCommission;
    protected int iDeclinedCount;
    @XmlElement(required = true)
    protected Money mDeclinedValue;
    @XmlElement(required = true)
    protected Money mDeclinedCommission;
    protected int iImpressions;

    /**
     * Gets the value of the sLinkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLinkName() {
        return sLinkName;
    }

    /**
     * Sets the value of the sLinkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLinkName(String value) {
        this.sLinkName = value;
    }

    /**
     * Gets the value of the sLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLinkType() {
        return sLinkType;
    }

    /**
     * Sets the value of the sLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLinkType(String value) {
        this.sLinkType = value;
    }

    /**
     * Gets the value of the sMerchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMerchantName() {
        return sMerchantName;
    }

    /**
     * Sets the value of the sMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMerchantName(String value) {
        this.sMerchantName = value;
    }

    /**
     * Gets the value of the iPendingCount property.
     * 
     */
    public int getIPendingCount() {
        return iPendingCount;
    }

    /**
     * Sets the value of the iPendingCount property.
     * 
     */
    public void setIPendingCount(int value) {
        this.iPendingCount = value;
    }

    /**
     * Gets the value of the mPendingValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMPendingValue() {
        return mPendingValue;
    }

    /**
     * Sets the value of the mPendingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMPendingValue(Money value) {
        this.mPendingValue = value;
    }

    /**
     * Gets the value of the mPendingCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMPendingCommission() {
        return mPendingCommission;
    }

    /**
     * Sets the value of the mPendingCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMPendingCommission(Money value) {
        this.mPendingCommission = value;
    }

    /**
     * Gets the value of the iConfirmedCount property.
     * 
     */
    public int getIConfirmedCount() {
        return iConfirmedCount;
    }

    /**
     * Sets the value of the iConfirmedCount property.
     * 
     */
    public void setIConfirmedCount(int value) {
        this.iConfirmedCount = value;
    }

    /**
     * Gets the value of the mConfirmedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMConfirmedValue() {
        return mConfirmedValue;
    }

    /**
     * Sets the value of the mConfirmedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMConfirmedValue(Money value) {
        this.mConfirmedValue = value;
    }

    /**
     * Gets the value of the mConfirmedCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMConfirmedCommission() {
        return mConfirmedCommission;
    }

    /**
     * Sets the value of the mConfirmedCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMConfirmedCommission(Money value) {
        this.mConfirmedCommission = value;
    }

    /**
     * Gets the value of the iDeclinedCount property.
     * 
     */
    public int getIDeclinedCount() {
        return iDeclinedCount;
    }

    /**
     * Sets the value of the iDeclinedCount property.
     * 
     */
    public void setIDeclinedCount(int value) {
        this.iDeclinedCount = value;
    }

    /**
     * Gets the value of the mDeclinedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMDeclinedValue() {
        return mDeclinedValue;
    }

    /**
     * Sets the value of the mDeclinedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMDeclinedValue(Money value) {
        this.mDeclinedValue = value;
    }

    /**
     * Gets the value of the mDeclinedCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMDeclinedCommission() {
        return mDeclinedCommission;
    }

    /**
     * Sets the value of the mDeclinedCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMDeclinedCommission(Money value) {
        this.mDeclinedCommission = value;
    }

    /**
     * Gets the value of the iImpressions property.
     * 
     */
    public int getIImpressions() {
        return iImpressions;
    }

    /**
     * Sets the value of the iImpressions property.
     * 
     */
    public void setIImpressions(int value) {
        this.iImpressions = value;
    }

}
