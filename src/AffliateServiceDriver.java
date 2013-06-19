import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.affiliatewindow.api.ATransactionId;
import com.affiliatewindow.api.ApiException_Exception;
import com.affiliatewindow.api.ApiPortType;
import com.affiliatewindow.api.DateType;
import com.affiliatewindow.api.UserAuthentication;
import com.affiliatewindow.api.UserType;

public class AffliateServiceDriver {

	public static void main(String args[]) {

		try {

			// Proxy
			System.setProperty("http.proxySet", "true");
			System.setProperty("http.proxyHost", "proxyanbcge.nbc.com");
			System.setProperty("http.proxyPort", "80");

			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.getInInterceptors().add(new LoggingInInterceptor());
			factory.getOutInterceptors().add(new LoggingOutInterceptor());

			factory.setAddress("http://api.affiliatewindow.com/v4/AffiliateService");
			ApiPortType port = factory.create(ApiPortType.class);
			Client client = ClientProxy.getClient(port);

			// Create a list for holding all SOAP headers
			UserAuthentication userAuthentication = new UserAuthentication();
			userAuthentication.setIId(00000);
			userAuthentication
					.setSPassword("xxxxxxx");
			userAuthentication.setSType(UserType.AFFILIATE);

			JAXBElement<UserAuthentication> jUserAuth = new JAXBElement<UserAuthentication>(
					new QName("http://api.affiliatewindow.com/",
							"UserAuthentication"), UserAuthentication.class,
					null, userAuthentication);

			List<Header> headersList = new ArrayList<Header>();

			headersList.add(new Header(new QName(
					"http://api.affiliatewindow.com/", "UserAuthentication"),
					jUserAuth, new JAXBDataBinding(userAuthentication
							.getClass())));

			client.getRequestContext().put(Header.HEADER_LIST, headersList);

			//getTransactionList(port);
			
			getTransaction(port);
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	
	public static void getTransaction(ApiPortType port) throws Exception{
		
		System.out.println("Invoking getTransaction...");
        com.affiliatewindow.api.ATransactionId _getTransaction_aTransactionIds = null;
        try {
        	_getTransaction_aTransactionIds = new ATransactionId();
        	List<Integer> transactionIds = new ArrayList<Integer>();
        	transactionIds.add(104455304);
        	transactionIds.add(104455351);
        	_getTransaction_aTransactionIds.getATransactionId().addAll(transactionIds);
        	
        	
            com.affiliatewindow.api.GetTransactionReturn _getTransaction__return = port.getTransaction(_getTransaction_aTransactionIds);
            System.out.println("getTransaction.result=" + _getTransaction__return);

        } catch (ApiException_Exception e) { 
            System.out.println("Expected exception: ApiException has occurred.");
            System.out.println(e.toString());
        }
	}

	public static void getTransactionList(ApiPortType port) throws Exception {

		System.out.println("Invoking getTransactionList...");
		java.util.List<java.lang.Integer> _getTransactionList_aMerchantIds = null;

		DatatypeFactory df = DatatypeFactory.newInstance();

		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		Date sdate = dt.parse("2013-06-01 00:00:00");
		gc.setTimeInMillis(sdate.getTime());
		javax.xml.datatype.XMLGregorianCalendar _getTransactionList_dStartDate = df
				.newXMLGregorianCalendar(gc);

		gc = new GregorianCalendar();
		Date edate = dt.parse("2013-06-16 00:00:00");
		gc.setTimeInMillis(edate.getTime());
		javax.xml.datatype.XMLGregorianCalendar _getTransactionList_dEndDate = df
				.newXMLGregorianCalendar(gc);
		;

		com.affiliatewindow.api.DateType _getTransactionList_sDateType = DateType.TRANSACTION;
		com.affiliatewindow.api.TransactionStatus _getTransactionList_sTransactionStatus = null;
		java.lang.Integer _getTransactionList_iOffset = null;
		java.lang.Integer _getTransactionList_iLimit = null;
		javax.xml.ws.Holder<com.affiliatewindow.api.GetTransactionListReturn> _getTransactionList_getTransactionListReturn = new javax.xml.ws.Holder<com.affiliatewindow.api.GetTransactionListReturn>();
		javax.xml.ws.Holder<com.affiliatewindow.api.RowCounts> _getTransactionList_getTransactionListCountReturn = new javax.xml.ws.Holder<com.affiliatewindow.api.RowCounts>();
		try {
			port.getTransactionList(_getTransactionList_aMerchantIds,
					_getTransactionList_dStartDate,
					_getTransactionList_dEndDate,
					_getTransactionList_sDateType,
					_getTransactionList_sTransactionStatus,
					_getTransactionList_iOffset, _getTransactionList_iLimit,
					_getTransactionList_getTransactionListReturn,
					_getTransactionList_getTransactionListCountReturn);

			System.out
					.println("getTransactionList._getTransactionList_getTransactionListReturn="
							+ _getTransactionList_getTransactionListReturn.value);
			System.out
					.println("getTransactionList._getTransactionList_getTransactionListCountReturn="
							+ _getTransactionList_getTransactionListCountReturn.value);
		} catch (ApiException_Exception e) {
			System.out
					.println("Expected exception: ApiException has occurred.");
			System.out.println(e.toString());
		}

	}
}
