
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
 *         &lt;element name="iMerchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sCommissionGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "iMerchantId",
    "sCommissionGroupCode"
})
@XmlRootElement(name = "getCommissionGroup")
public class GetCommissionGroup
    implements Serializable
{

    protected int iMerchantId;
    @XmlElement(required = true)
    protected String sCommissionGroupCode;

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

}
