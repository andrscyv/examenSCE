
package miservicioweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the miservicioweb package. 
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

    private final static QName _ReseteaCuentaSuma_QNAME = new QName("http://miservicioweb/", "reseteaCuentaSuma");
    private final static QName _Hello_QNAME = new QName("http://miservicioweb/", "hello");
    private final static QName _Exception_QNAME = new QName("http://miservicioweb/", "Exception");
    private final static QName _GetCuentaSumaResponse_QNAME = new QName("http://miservicioweb/", "getCuentaSumaResponse");
    private final static QName _Suma_QNAME = new QName("http://miservicioweb/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://miservicioweb/", "sumaResponse");
    private final static QName _GetCuentaSuma_QNAME = new QName("http://miservicioweb/", "getCuentaSuma");
    private final static QName _HelloResponse_QNAME = new QName("http://miservicioweb/", "helloResponse");
    private final static QName _MultiplicaResponse_QNAME = new QName("http://miservicioweb/", "multiplicaResponse");
    private final static QName _ReseteaCuentaSumaResponse_QNAME = new QName("http://miservicioweb/", "reseteaCuentaSumaResponse");
    private final static QName _Multiplica_QNAME = new QName("http://miservicioweb/", "multiplica");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: miservicioweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCuentaSumaResponse }
     * 
     */
    public GetCuentaSumaResponse createGetCuentaSumaResponse() {
        return new GetCuentaSumaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link ReseteaCuentaSumaResponse }
     * 
     */
    public ReseteaCuentaSumaResponse createReseteaCuentaSumaResponse() {
        return new ReseteaCuentaSumaResponse();
    }

    /**
     * Create an instance of {@link Multiplica }
     * 
     */
    public Multiplica createMultiplica() {
        return new Multiplica();
    }

    /**
     * Create an instance of {@link GetCuentaSuma }
     * 
     */
    public GetCuentaSuma createGetCuentaSuma() {
        return new GetCuentaSuma();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link MultiplicaResponse }
     * 
     */
    public MultiplicaResponse createMultiplicaResponse() {
        return new MultiplicaResponse();
    }

    /**
     * Create an instance of {@link ReseteaCuentaSuma }
     * 
     */
    public ReseteaCuentaSuma createReseteaCuentaSuma() {
        return new ReseteaCuentaSuma();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReseteaCuentaSuma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "reseteaCuentaSuma")
    public JAXBElement<ReseteaCuentaSuma> createReseteaCuentaSuma(ReseteaCuentaSuma value) {
        return new JAXBElement<ReseteaCuentaSuma>(_ReseteaCuentaSuma_QNAME, ReseteaCuentaSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCuentaSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "getCuentaSumaResponse")
    public JAXBElement<GetCuentaSumaResponse> createGetCuentaSumaResponse(GetCuentaSumaResponse value) {
        return new JAXBElement<GetCuentaSumaResponse>(_GetCuentaSumaResponse_QNAME, GetCuentaSumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCuentaSuma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "getCuentaSuma")
    public JAXBElement<GetCuentaSuma> createGetCuentaSuma(GetCuentaSuma value) {
        return new JAXBElement<GetCuentaSuma>(_GetCuentaSuma_QNAME, GetCuentaSuma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "multiplicaResponse")
    public JAXBElement<MultiplicaResponse> createMultiplicaResponse(MultiplicaResponse value) {
        return new JAXBElement<MultiplicaResponse>(_MultiplicaResponse_QNAME, MultiplicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReseteaCuentaSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "reseteaCuentaSumaResponse")
    public JAXBElement<ReseteaCuentaSumaResponse> createReseteaCuentaSumaResponse(ReseteaCuentaSumaResponse value) {
        return new JAXBElement<ReseteaCuentaSumaResponse>(_ReseteaCuentaSumaResponse_QNAME, ReseteaCuentaSumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://miservicioweb/", name = "multiplica")
    public JAXBElement<Multiplica> createMultiplica(Multiplica value) {
        return new JAXBElement<Multiplica>(_Multiplica_QNAME, Multiplica.class, null, value);
    }

}
