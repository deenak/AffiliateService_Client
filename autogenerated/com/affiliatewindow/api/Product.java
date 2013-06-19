
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mUnitPrice" type="{http://api.affiliatewindow.com/}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "sId",
    "sName",
    "mUnitPrice"
})
public class Product
    implements Serializable
{

    protected String sId;
    protected String sName;
    protected Money mUnitPrice;

    /**
     * Gets the value of the sId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSId() {
        return sId;
    }

    /**
     * Sets the value of the sId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSId(String value) {
        this.sId = value;
    }

    /**
     * Gets the value of the sName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Sets the value of the sName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Gets the value of the mUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMUnitPrice() {
        return mUnitPrice;
    }

    /**
     * Sets the value of the mUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMUnitPrice(Money value) {
        this.mUnitPrice = value;
    }

}
