package ru.gretchen.quadraticequationsolving.service;

import ru.gretchen.quadraticequationsolving.exception.EquationHasNoRootsException;
import ru.gretchen.quadraticequationsolving.model.Response;

import javax.jws.WebService;

@WebService(
        serviceName = "QuadraticEquationService",
        portName = "QuadraticEquationPort",
        targetNamespace = "http://services.ws.equation/",
        endpointInterface = "ru.gretchen.quadraticequationsolving.service.QuadraticEquationService"
)
public class QuadraticEquationServiceImpl implements QuadraticEquationService{

    @Override
    public Response solveEquation(double a, double b, double c) {

        String formula = a + "x^2+" + b + "x+" + c + "=0";
        double D = b*b - 4*a*c;

        if(D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);

            Response respTwoRoots = Response.builder()
                    .formula(formula)
                    .D(D)
                    .x1(x1)
                    .x2(x2)
                    .build();

            return respTwoRoots;

        } else if (D == 0) {
            double x1;
            x1 = -b / (2 * a);

            Response respOneRoot = Response.builder()
                    .formula(formula)
                    .D(D)
                    .x1(x1)
                    .build();

            return respOneRoot;

        } else {
            throw new EquationHasNoRootsException(formula, D);
        }
    }
}
