
package com.affiliatewindow.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.affiliatewindow.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetQuota_QNAME = new QName("http://api.affiliatewindow.com/", "getQuota");
    private final static QName _GetQuotaResponse_QNAME = new QName("http://api.affiliatewindow.com/", "getQuotaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.affiliatewindow.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMerchantResponse }
     * 
     */
    public GetMerchantResponse createGetMerchantResponse() {
        return new GetMerchantResponse();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link GetMerchant }
     * 
     */
    public GetMerchant createGetMerchant() {
        return new GetMerchant();
    }

    /**
     * Create an instance of {@link GetClickStatsResponse }
     * 
     */
    public GetClickStatsResponse createGetClickStatsResponse() {
        return new GetClickStatsResponse();
    }

    /**
     * Create an instance of {@link ClickStats }
     * 
     */
    public ClickStats createClickStats() {
        return new ClickStats();
    }

    /**
     * Create an instance of {@link RowCounts }
     * 
     */
    public RowCounts createRowCounts() {
        return new RowCounts();
    }

    /**
     * Create an instance of {@link GetTransactionListResponse }
     * 
     */
    public GetTransactionListResponse createGetTransactionListResponse() {
        return new GetTransactionListResponse();
    }

    /**
     * Create an instance of {@link GetTransactionListReturn }
     * 
     */
    public GetTransactionListReturn createGetTransactionListReturn() {
        return new GetTransactionListReturn();
    }

    /**
     * Create an instance of {@link GetMerchantListResponse }
     * 
     */
    public GetMerchantListResponse createGetMerchantListResponse() {
        return new GetMerchantListResponse();
    }

    /**
     * Create an instance of {@link GetTransactionQuerysResponse }
     * 
     */
    public GetTransactionQuerysResponse createGetTransactionQuerysResponse() {
        return new GetTransactionQuerysResponse();
    }

    /**
     * Create an instance of {@link TransactionQuery }
     * 
     */
    public TransactionQuery createTransactionQuery() {
        return new TransactionQuery();
    }

    /**
     * Create an instance of {@link GetTransactionQuerys }
     * 
     */
    public GetTransactionQuerys createGetTransactionQuerys() {
        return new GetTransactionQuerys();
    }

    /**
     * Create an instance of {@link GetCommissionGroupResponse }
     * 
     */
    public GetCommissionGroupResponse createGetCommissionGroupResponse() {
        return new GetCommissionGroupResponse();
    }

    /**
     * Create an instance of {@link CommissionGroup }
     * 
     */
    public CommissionGroup createCommissionGroup() {
        return new CommissionGroup();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link ATransactionId }
     * 
     */
    public ATransactionId createATransactionId() {
        return new ATransactionId();
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransactionReturn }
     * 
     */
    public GetTransactionReturn createGetTransactionReturn() {
        return new GetTransactionReturn();
    }

    /**
     * Create an instance of {@link GetCommissionGroupListResponse }
     * 
     */
    public GetCommissionGroupListResponse createGetCommissionGroupListResponse() {
        return new GetCommissionGroupListResponse();
    }

    /**
     * Create an instance of {@link GetTransactionList }
     * 
     */
    public GetTransactionList createGetTransactionList() {
        return new GetTransactionList();
    }

    /**
     * Create an instance of {@link ApiException }
     * 
     */
    public ApiException createApiException() {
        return new ApiException();
    }

    /**
     * Create an instance of {@link GetClickStats }
     * 
     */
    public GetClickStats createGetClickStats() {
        return new GetClickStats();
    }

    /**
     * Create an instance of {@link GetMerchantList }
     * 
     */
    public GetMerchantList createGetMerchantList() {
        return new GetMerchantList();
    }

    /**
     * Create an instance of {@link GetCommissionGroup }
     * 
     */
    public GetCommissionGroup createGetCommissionGroup() {
        return new GetCommissionGroup();
    }

    /**
     * Create an instance of {@link GetTransactionProductResponse }
     * 
     */
    public GetTransactionProductResponse createGetTransactionProductResponse() {
        return new GetTransactionProductResponse();
    }

    /**
     * Create an instance of {@link TransactionProduct }
     * 
     */
    public TransactionProduct createTransactionProduct() {
        return new TransactionProduct();
    }

    /**
     * Create an instance of {@link GetTransactionProduct }
     * 
     */
    public GetTransactionProduct createGetTransactionProduct() {
        return new GetTransactionProduct();
    }

    /**
     * Create an instance of {@link GetImpressionStats }
     * 
     */
    public GetImpressionStats createGetImpressionStats() {
        return new GetImpressionStats();
    }

    /**
     * Create an instance of {@link UserAuthentication }
     * 
     */
    public UserAuthentication createUserAuthentication() {
        return new UserAuthentication();
    }

    /**
     * Create an instance of {@link GetCommissionGroupList }
     * 
     */
    public GetCommissionGroupList createGetCommissionGroupList() {
        return new GetCommissionGroupList();
    }

    /**
     * Create an instance of {@link GetImpressionStatsResponse }
     * 
     */
    public GetImpressionStatsResponse createGetImpressionStatsResponse() {
        return new GetImpressionStatsResponse();
    }

    /**
     * Create an instance of {@link ImpressionStats }
     * 
     */
    public ImpressionStats createImpressionStats() {
        return new ImpressionStats();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link MerchantSector }
     * 
     */
    public MerchantSector createMerchantSector() {
        return new MerchantSector();
    }

    /**
     * Create an instance of {@link ATransactionParts }
     * 
     */
    public ATransactionParts createATransactionParts() {
        return new ATransactionParts();
    }

    /**
     * Create an instance of {@link TransactionPart }
     * 
     */
    public TransactionPart createTransactionPart() {
        return new TransactionPart();
    }

    /**
     * Create an instance of {@link CommissionRange }
     * 
     */
    public CommissionRange createCommissionRange() {
        return new CommissionRange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.affiliatewindow.com/", name = "getQuota")
    public JAXBElement<Boolean> createGetQuota(Boolean value) {
        return new JAXBElement<Boolean>(_GetQuota_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.affiliatewindow.com/", name = "getQuotaResponse")
    public JAXBElement<Integer> createGetQuotaResponse(Integer value) {
        return new JAXBElement<Integer>(_GetQuotaResponse_QNAME, Integer.class, null, value);
    }

}
