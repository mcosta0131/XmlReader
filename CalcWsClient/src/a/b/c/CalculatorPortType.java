//
// Generated By:JAX-WS RI 2.2.9-b130926.1035 (JAXB RI IBM 2.2.8-b130911.1802)
//


package a.b.c;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CalculatorPortType", targetNamespace = "http://c.b.a")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorPortType {


    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:add")
    @WebResult(targetNamespace = "http://c.b.a")
    @RequestWrapper(localName = "add", targetNamespace = "http://c.b.a", className = "a.b.c.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://c.b.a", className = "a.b.c.AddResponse")
    public Integer add(
        @WebParam(name = "n1", targetNamespace = "http://c.b.a")
        Integer n1,
        @WebParam(name = "n2", targetNamespace = "http://c.b.a")
        Integer n2);

}
