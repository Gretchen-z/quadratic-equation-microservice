
package ru.gretchen.soapclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gretchen.soapclient package. 
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

    private final static QName _SolveEquation_QNAME = new QName("http://services.ws.equation/", "solveEquation");
    private final static QName _SolveEquationResponse_QNAME = new QName("http://services.ws.equation/", "solveEquationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gretchen.soapclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolveEquation }
     * 
     */
    public SolveEquation createSolveEquation() {
        return new SolveEquation();
    }

    /**
     * Create an instance of {@link SolveEquationResponse }
     * 
     */
    public SolveEquationResponse createSolveEquationResponse() {
        return new SolveEquationResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolveEquation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolveEquation }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ws.equation/", name = "solveEquation")
    public JAXBElement<SolveEquation> createSolveEquation(SolveEquation value) {
        return new JAXBElement<SolveEquation>(_SolveEquation_QNAME, SolveEquation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolveEquationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolveEquationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ws.equation/", name = "solveEquationResponse")
    public JAXBElement<SolveEquationResponse> createSolveEquationResponse(SolveEquationResponse value) {
        return new JAXBElement<SolveEquationResponse>(_SolveEquationResponse_QNAME, SolveEquationResponse.class, null, value);
    }

}
