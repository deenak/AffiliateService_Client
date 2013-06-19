
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sType" type="{http://api.affiliatewindow.com/}CommissionType"/>
 *         &lt;element name="fMin" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fMax" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionRange", propOrder = {
    "sType",
    "fMin",
    "fMax"
})
public class CommissionRange
    implements Serializable
{

    @XmlElement(required = true)
    protected CommissionType sType;
    protected float fMin;
    protected float fMax;

    /**
     * Gets the value of the sType property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getSType() {
        return sType;
    }

    /**
     * Sets the value of the sType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setSType(CommissionType value) {
        this.sType = value;
    }

    /**
     * Gets the value of the fMin property.
     * 
     */
    public float getFMin() {
        return fMin;
    }

    /**
     * Sets the value of the fMin property.
     * 
     */
    public void setFMin(float value) {
        this.fMin = value;
    }

    /**
     * Gets the value of the fMax property.
     * 
     */
    public float getFMax() {
        return fMax;
    }

    /**
     * Sets the value of the fMax property.
     * 
     */
    public void setFMax(float value) {
        this.fMax = value;
    }

}
