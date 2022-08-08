package ru.gretchen.quadraticequationsolving.service;

import ru.gretchen.quadraticequationsolving.model.Response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "", name = "QuadraticEquationService")
public interface QuadraticEquationService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "solveEquation",
            targetNamespace = "http://services.ws.equation/",
            className = "ru.gretchen.service.QuadraticEquationService")
    @WebMethod(action = "urn:result")
    @ResponseWrapper(
            localName = "solveEquationResponse",
            targetNamespace = "http://services.ws.equation/",
            className = "ru.gretchen.service.QuadraticEquationResponse")
    Response solveEquation(
            @WebParam(name = "a", targetNamespace = "") double a,
            @WebParam(name = "b", targetNamespace = "") double b,
            @WebParam(name = "c", targetNamespace = "") double c);
}
