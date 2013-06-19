
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
 *         &lt;element name="getClickStatsReturn" type="{http://api.affiliatewindow.com/}ClickStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="getClickStatsCountReturn" type="{http://api.affiliatewindow.com/}RowCounts"/>
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
    "getClickStatsReturn",
    "getClickStatsCountReturn"
})
@XmlRootElement(name = "getClickStatsResponse")
public class GetClickStatsResponse
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<ClickStats> getClickStatsReturn;
    @XmlElement(required = true)
    protected RowCounts getClickStatsCountReturn;

    /**
     * Gets the value of the getClickStatsReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getClickStatsReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetClickStatsReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClickStats }
     * 
     * 
     */
    public List<ClickStats> getGetClickStatsReturn() {
        if (getClickStatsReturn == null) {
            getClickStatsReturn = new ArrayList<ClickStats>();
        }
        return this.getClickStatsReturn;
    }

    /**
     * Gets the value of the getClickStatsCountReturn property.
     * 
     * @return
     *     possible object is
     *     {@link RowCounts }
     *     
     */
    public RowCounts getGetClickStatsCountReturn() {
        return getClickStatsCountReturn;
    }

    /**
     * Sets the value of the getClickStatsCountReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowCounts }
     *     
     */
    public void setGetClickStatsCountReturn(RowCounts value) {
        this.getClickStatsCountReturn = value;
    }

}
