package ru.gretchen.soapclient.soapservice;

import ru.gretchen.soapclient.QuadraticEquationService;
import ru.gretchen.soapclient.QuadraticEquationService_Service;
import ru.gretchen.soapclient.model.Response;

public class SoapService {

    public Response solveQuadraticEquation(double a, double b, double c) {
        QuadraticEquationService_Service serviceImpl = new QuadraticEquationService_Service();
        QuadraticEquationService service = serviceImpl.getQuadraticEquationPort();
        ru.gretchen.soapclient.Response response = service.solveEquation(a, b, c);

        Response resp = new Response();
        resp.setD(response.getD());
        resp.setFormula(response.getFormula());
        resp.setX1(response.getX1());
        resp.setX2(response.getX2());

        return resp;
    }
}
