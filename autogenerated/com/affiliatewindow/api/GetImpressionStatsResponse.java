
package com.affiliatewindow.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="getImpressionStatsReturn" type="{http://api.affiliatewindow.com/}ImpressionStats" maxOccurs="unbounded"/>
 *         &lt;element name="getImpressionStatsCountReturn" type="{http://api.affiliatewindow.com/}RowCounts"/>
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
    "getImpressionStatsReturn",
    "getImpressionStatsCountReturn"
})
@XmlRootElement(name = "getImpressionStatsResponse")
public class GetImpressionStatsResponse
    implements Serializable
{

    @XmlElement(required = true, nillable = true)
    protected List<ImpressionStats> getImpressionStatsReturn;
    @XmlElement(required = true)
    protected RowCounts getImpressionStatsCountReturn;

    /**
     * Gets the value of the getImpressionStatsReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getImpressionStatsReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetImpressionStatsReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImpressionStats }
     * 
     * 
     */
    public List<ImpressionStats> getGetImpressionStatsReturn() {
        if (getImpressionStatsReturn == null) {
            getImpressionStatsReturn = new ArrayList<ImpressionStats>();
        }
        return this.getImpressionStatsReturn;
    }

    /**
     * Gets the value of the getImpressionStatsCountReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RowCounts }
     *     
     */
    public RowCounts getGetImpressionStatsCountReturn() {
        return getImpressionStatsCountReturn;
    }

    /**
     * Sets the value of the getImpressionStatsCountReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowCounts }
     *     
     */
    public void setGetImpressionStatsCountReturn(RowCounts value) {
        this.getImpressionStatsCountReturn = value;
    }

}
