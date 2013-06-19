
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
 *         &lt;element name="getCommissionGroupReturn" type="{http://api.affiliatewindow.com/}CommissionGroup"/>
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
    "getCommissionGroupReturn"
})
@XmlRootElement(name = "getCommissionGroupResponse")
public class GetCommissionGroupResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected CommissionGroup getCommissionGroupReturn;

    /**
     * Gets the value of the getCommissionGroupReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionGroup }
     *     
     */
    public CommissionGroup getGetCommissionGroupReturn() {
        return getCommissionGroupReturn;
    }

    /**
     * Sets the value of the getCommissionGroupReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionGroup }
     *     
     */
    public void setGetCommissionGroupReturn(CommissionGroup value) {
        this.getCommissionGroupReturn = value;
    }

}
