
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sCommissionGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCommissionGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mAmount" type="{http://api.affiliatewindow.com/}Money" minOccurs="0"/>
 *         &lt;element name="fPercentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionGroup", propOrder = {
    "sCommissionGroupCode",
    "sCommissionGroupName",
    "mAmount",
    "fPercentage"
})
public class CommissionGroup
    implements Serializable
{

    protected String sCommissionGroupCode;
    protected String sCommissionGroupName;
    protected Money mAmount;
    protected Float fPercentage;

    /**
     * Gets the value of the sCommissionGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCommissionGroupCode() {
        return sCommissionGroupCode;
    }

    /**
     * Sets the value of the sCommissionGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCommissionGroupCode(String value) {
        this.sCommissionGroupCode = value;
    }

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
     * Gets the value of the fPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFPercentage() {
        return fPercentage;
    }

    /**
     * Sets the value of the fPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFPercentage(Float value) {
        this.fPercentage = value;
    }

}
