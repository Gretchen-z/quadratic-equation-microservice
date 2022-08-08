package ru.gretchen.soapclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gretchen.soapclient.model.Response;
import ru.gretchen.soapclient.soapservice.SoapService;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/calc")
public class QuadraticEquationController {

    private final SoapService soapService;

    @GetMapping("/{a}/{b}/{c}")
    public Response get(@PathVariable(name = "a") double a,
                        @PathVariable(name = "b") double b,
                        @PathVariable(name = "c") double c) {
        return soapService.solveQuadraticEquation(a, b, c);
    }
}
