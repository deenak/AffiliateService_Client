
package com.affiliatewindow.api;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowCounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowCounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iRowsReturned" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iRowsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowCounts", propOrder = {
    "iRowsReturned",
    "iRowsAvailable"
})
public class RowCounts
    implements Serializable
{

    protected int iRowsReturned;
    protected int iRowsAvailable;

    /**
     * Gets the value of the iRowsReturned property.
     * 
     */
    public int getIRowsReturned() {
        return iRowsReturned;
    }

    /**
     * Sets the value of the iRowsReturned property.
     * 
     */
    public void setIRowsReturned(int value) {
        this.iRowsReturned = value;
    }

    /**
     * Gets the value of the iRowsAvailable property.
     * 
     */
    public int getIRowsAvailable() {
        return iRowsAvailable;
    }

    /**
     * Sets the value of the iRowsAvailable property.
     * 
     */
    public void setIRowsAvailable(int value) {
        this.iRowsAvailable = value;
    }

}
