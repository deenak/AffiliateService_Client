
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
    "iMerchantId"
})
@XmlRootElement(name = "getCommissionGroupList")
public class GetCommissionGroupList
    implements Serializable
{

    protected int iMerchantId;

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

}
