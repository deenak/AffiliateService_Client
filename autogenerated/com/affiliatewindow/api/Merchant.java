
package com.affiliatewindow.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Merchant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Merchant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sDisplayUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sClickThroughUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oPrimaryRegion" type="{http://api.affiliatewindow.com/}Region"/>
 *         &lt;element name="sLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iDetailsVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dDetailsModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="iFeedVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dFeedModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sStrapline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fApprovalPercentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fEpc" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fConversionRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="iValidationDays" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="fAwinGrade" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="aCommissionRanges" type="{http://api.affiliatewindow.com/}CommissionRange" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aSectors" type="{http://api.affiliatewindow.com/}MerchantSector" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Merchant", propOrder = {
    "iId",
    "sName",
    "sDisplayUrl",
    "sClickThroughUrl",
    "oPrimaryRegion",
    "sLogoUrl",
    "iDetailsVersion",
    "dDetailsModified",
    "iFeedVersion",
    "dFeedModified",
    "sStrapline",
    "sDescription",
    "fApprovalPercentage",
    "fEpc",
    "fConversionRate",
    "iValidationDays",
    "fAwinGrade",
    "aCommissionRanges",
    "aSectors"
})
public class Merchant
    implements Serializable
{

    protected int iId;
    @XmlElement(required = true)
    protected String sName;
    @XmlElement(required = true)
    protected String sDisplayUrl;
    @XmlElement(required = true)
    protected String sClickThroughUrl;
    @XmlElement(required = true)
    protected Region oPrimaryRegion;
    protected String sLogoUrl;
    protected Integer iDetailsVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dDetailsModified;
    protected Integer iFeedVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dFeedModified;
    protected String sStrapline;
    protected String sDescription;
    protected Float fApprovalPercentage;
    protected Float fEpc;
    protected Float fConversionRate;
    protected Float iValidationDays;
    protected Float fAwinGrade;
    @XmlElement(nillable = true)
    protected List<CommissionRange> aCommissionRanges;
    @XmlElement(nillable = true)
    protected List<MerchantSector> aSectors;

    /**
     * Gets the value of the iId property.
     * 
     */
    public int getIId() {
        return iId;
    }

    /**
     * Sets the value of the iId property.
     * 
     */
    public void setIId(int value) {
        this.iId = value;
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
     * Gets the value of the sDisplayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDisplayUrl() {
        return sDisplayUrl;
    }

    /**
     * Sets the value of the sDisplayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDisplayUrl(String value) {
        this.sDisplayUrl = value;
    }

    /**
     * Gets the value of the sClickThroughUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClickThroughUrl() {
        return sClickThroughUrl;
    }

    /**
     * Sets the value of the sClickThroughUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClickThroughUrl(String value) {
        this.sClickThroughUrl = value;
    }

    /**
     * Gets the value of the oPrimaryRegion property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getOPrimaryRegion() {
        return oPrimaryRegion;
    }

    /**
     * Sets the value of the oPrimaryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setOPrimaryRegion(Region value) {
        this.oPrimaryRegion = value;
    }

    /**
     * Gets the value of the sLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLogoUrl() {
        return sLogoUrl;
    }

    /**
     * Sets the value of the sLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLogoUrl(String value) {
        this.sLogoUrl = value;
    }

    /**
     * Gets the value of the iDetailsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDetailsVersion() {
        return iDetailsVersion;
    }

    /**
     * Sets the value of the iDetailsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDetailsVersion(Integer value) {
        this.iDetailsVersion = value;
    }

    /**
     * Gets the value of the dDetailsModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDDetailsModified() {
        return dDetailsModified;
    }

    /**
     * Sets the value of the dDetailsModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDDetailsModified(XMLGregorianCalendar value) {
        this.dDetailsModified = value;
    }

    /**
     * Gets the value of the iFeedVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIFeedVersion() {
        return iFeedVersion;
    }

    /**
     * Sets the value of the iFeedVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIFeedVersion(Integer value) {
        this.iFeedVersion = value;
    }

    /**
     * Gets the value of the dFeedModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDFeedModified() {
        return dFeedModified;
    }

    /**
     * Sets the value of the dFeedModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDFeedModified(XMLGregorianCalendar value) {
        this.dFeedModified = value;
    }

    /**
     * Gets the value of the sStrapline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStrapline() {
        return sStrapline;
    }

    /**
     * Sets the value of the sStrapline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStrapline(String value) {
        this.sStrapline = value;
    }

    /**
     * Gets the value of the sDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDescription() {
        return sDescription;
    }

    /**
     * Sets the value of the sDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDescription(String value) {
        this.sDescription = value;
    }

    /**
     * Gets the value of the fApprovalPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFApprovalPercentage() {
        return fApprovalPercentage;
    }

    /**
     * Sets the value of the fApprovalPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFApprovalPercentage(Float value) {
        this.fApprovalPercentage = value;
    }

    /**
     * Gets the value of the fEpc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFEpc() {
        return fEpc;
    }

    /**
     * Sets the value of the fEpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFEpc(Float value) {
        this.fEpc = value;
    }

    /**
     * Gets the value of the fConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFConversionRate() {
        return fConversionRate;
    }

    /**
     * Sets the value of the fConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFConversionRate(Float value) {
        this.fConversionRate = value;
    }

    /**
     * Gets the value of the iValidationDays property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIValidationDays() {
        return iValidationDays;
    }

    /**
     * Sets the value of the iValidationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIValidationDays(Float value) {
        this.iValidationDays = value;
    }

    /**
     * Gets the value of the fAwinGrade property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFAwinGrade() {
        return fAwinGrade;
    }

    /**
     * Sets the value of the fAwinGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFAwinGrade(Float value) {
        this.fAwinGrade = value;
    }

    /**
     * Gets the value of the aCommissionRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aCommissionRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACommissionRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRange }
     * 
     * 
     */
    public List<CommissionRange> getACommissionRanges() {
        if (aCommissionRanges == null) {
            aCommissionRanges = new ArrayList<CommissionRange>();
        }
        return this.aCommissionRanges;
    }

    /**
     * Gets the value of the aSectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aSectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getASectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantSector }
     * 
     * 
     */
    public List<MerchantSector> getASectors() {
        if (aSectors == null) {
            aSectors = new ArrayList<MerchantSector>();
        }
        return this.aSectors;
    }

}
