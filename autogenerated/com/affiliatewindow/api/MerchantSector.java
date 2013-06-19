
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantSector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantSector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iSectorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sSectorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantSector", propOrder = {
    "iSectorId",
    "sSectorName"
})
public class MerchantSector
    implements Serializable
{

    protected int iSectorId;
    @XmlElement(required = true)
    protected String sSectorName;

    /**
     * Gets the value of the iSectorId property.
     * 
     */
    public int getISectorId() {
        return iSectorId;
    }

    /**
     * Sets the value of the iSectorId property.
     * 
     */
    public void setISectorId(int value) {
        this.iSectorId = value;
    }

    /**
     * Gets the value of the sSectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSectorName() {
        return sSectorName;
    }

    /**
     * Sets the value of the sSectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSectorName(String value) {
        this.sSectorName = value;
    }

}
