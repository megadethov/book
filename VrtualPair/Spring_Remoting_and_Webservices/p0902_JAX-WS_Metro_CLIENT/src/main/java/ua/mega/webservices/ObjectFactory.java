
package ua.mega.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.mega.webservices package. 
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

    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://webservices.mega.ua/", "deleteCustomerResponse");
    private final static QName _FindCustomersByName_QNAME = new QName("http://webservices.mega.ua/", "findCustomersByName");
    private final static QName _RecordCallResponse_QNAME = new QName("http://webservices.mega.ua/", "recordCallResponse");
    private final static QName _UpdateCustomer_QNAME = new QName("http://webservices.mega.ua/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://webservices.mega.ua/", "updateCustomerResponse");
    private final static QName _NewCustomer_QNAME = new QName("http://webservices.mega.ua/", "newCustomer");
    private final static QName _GetAllCustomers_QNAME = new QName("http://webservices.mega.ua/", "getAllCustomers");
    private final static QName _GetFullCustomerDetailResponse_QNAME = new QName("http://webservices.mega.ua/", "getFullCustomerDetailResponse");
    private final static QName _CustomerNotFoundException_QNAME = new QName("http://webservices.mega.ua/", "CustomerNotFoundException");
    private final static QName _FindCustomerById_QNAME = new QName("http://webservices.mega.ua/", "findCustomerById");
    private final static QName _FindCustomersByNameResponse_QNAME = new QName("http://webservices.mega.ua/", "findCustomersByNameResponse");
    private final static QName _DeleteCustomer_QNAME = new QName("http://webservices.mega.ua/", "deleteCustomer");
    private final static QName _RecordCall_QNAME = new QName("http://webservices.mega.ua/", "recordCall");
    private final static QName _GetFullCustomerDetail_QNAME = new QName("http://webservices.mega.ua/", "getFullCustomerDetail");
    private final static QName _FindCustomerByIdResponse_QNAME = new QName("http://webservices.mega.ua/", "findCustomerByIdResponse");
    private final static QName _NewCustomerResponse_QNAME = new QName("http://webservices.mega.ua/", "newCustomerResponse");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://webservices.mega.ua/", "getAllCustomersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.mega.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link FindCustomerByIdResponse }
     * 
     */
    public FindCustomerByIdResponse createFindCustomerByIdResponse() {
        return new FindCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link NewCustomerResponse }
     * 
     */
    public NewCustomerResponse createNewCustomerResponse() {
        return new NewCustomerResponse();
    }

    /**
     * Create an instance of {@link GetFullCustomerDetail }
     * 
     */
    public GetFullCustomerDetail createGetFullCustomerDetail() {
        return new GetFullCustomerDetail();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link RecordCall }
     * 
     */
    public RecordCall createRecordCall() {
        return new RecordCall();
    }

    /**
     * Create an instance of {@link CustomerNotFoundException }
     * 
     */
    public CustomerNotFoundException createCustomerNotFoundException() {
        return new CustomerNotFoundException();
    }

    /**
     * Create an instance of {@link FindCustomerById }
     * 
     */
    public FindCustomerById createFindCustomerById() {
        return new FindCustomerById();
    }

    /**
     * Create an instance of {@link FindCustomersByNameResponse }
     * 
     */
    public FindCustomersByNameResponse createFindCustomersByNameResponse() {
        return new FindCustomersByNameResponse();
    }

    /**
     * Create an instance of {@link GetFullCustomerDetailResponse }
     * 
     */
    public GetFullCustomerDetailResponse createGetFullCustomerDetailResponse() {
        return new GetFullCustomerDetailResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link NewCustomer }
     * 
     */
    public NewCustomer createNewCustomer() {
        return new NewCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link FindCustomersByName }
     * 
     */
    public FindCustomersByName createFindCustomersByName() {
        return new FindCustomersByName();
    }

    /**
     * Create an instance of {@link RecordCallResponse }
     * 
     */
    public RecordCallResponse createRecordCallResponse() {
        return new RecordCallResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link Call }
     * 
     */
    public Call createCall() {
        return new Call();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "findCustomersByName")
    public JAXBElement<FindCustomersByName> createFindCustomersByName(FindCustomersByName value) {
        return new JAXBElement<FindCustomersByName>(_FindCustomersByName_QNAME, FindCustomersByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordCallResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "recordCallResponse")
    public JAXBElement<RecordCallResponse> createRecordCallResponse(RecordCallResponse value) {
        return new JAXBElement<RecordCallResponse>(_RecordCallResponse_QNAME, RecordCallResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "newCustomer")
    public JAXBElement<NewCustomer> createNewCustomer(NewCustomer value) {
        return new JAXBElement<NewCustomer>(_NewCustomer_QNAME, NewCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<GetAllCustomers>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullCustomerDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "getFullCustomerDetailResponse")
    public JAXBElement<GetFullCustomerDetailResponse> createGetFullCustomerDetailResponse(GetFullCustomerDetailResponse value) {
        return new JAXBElement<GetFullCustomerDetailResponse>(_GetFullCustomerDetailResponse_QNAME, GetFullCustomerDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "CustomerNotFoundException")
    public JAXBElement<CustomerNotFoundException> createCustomerNotFoundException(CustomerNotFoundException value) {
        return new JAXBElement<CustomerNotFoundException>(_CustomerNotFoundException_QNAME, CustomerNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "findCustomerById")
    public JAXBElement<FindCustomerById> createFindCustomerById(FindCustomerById value) {
        return new JAXBElement<FindCustomerById>(_FindCustomerById_QNAME, FindCustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomersByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "findCustomersByNameResponse")
    public JAXBElement<FindCustomersByNameResponse> createFindCustomersByNameResponse(FindCustomersByNameResponse value) {
        return new JAXBElement<FindCustomersByNameResponse>(_FindCustomersByNameResponse_QNAME, FindCustomersByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordCall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "recordCall")
    public JAXBElement<RecordCall> createRecordCall(RecordCall value) {
        return new JAXBElement<RecordCall>(_RecordCall_QNAME, RecordCall.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullCustomerDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "getFullCustomerDetail")
    public JAXBElement<GetFullCustomerDetail> createGetFullCustomerDetail(GetFullCustomerDetail value) {
        return new JAXBElement<GetFullCustomerDetail>(_GetFullCustomerDetail_QNAME, GetFullCustomerDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "findCustomerByIdResponse")
    public JAXBElement<FindCustomerByIdResponse> createFindCustomerByIdResponse(FindCustomerByIdResponse value) {
        return new JAXBElement<FindCustomerByIdResponse>(_FindCustomerByIdResponse_QNAME, FindCustomerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "newCustomerResponse")
    public JAXBElement<NewCustomerResponse> createNewCustomerResponse(NewCustomerResponse value) {
        return new JAXBElement<NewCustomerResponse>(_NewCustomerResponse_QNAME, NewCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.mega.ua/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

}
