
package ru.gretchen.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="formula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="x1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="x2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "response", namespace = "http://service.quadraticequationsolving.gretchen.ru/", propOrder = {
    "d",
    "formula",
    "x1",
    "x2"
})
public class Response {

    protected double d;
    protected String formula;
    protected double x1;
    protected double x2;

    /**
     * Gets the value of the d property.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(double value) {
        this.d = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the x1 property.
     * 
     */
    public double getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     * 
     */
    public void setX1(double value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     */
    public double getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     */
    public void setX2(double value) {
        this.x2 = value;
    }

}
