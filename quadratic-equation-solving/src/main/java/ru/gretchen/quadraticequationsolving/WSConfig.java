package ru.gretchen.quadraticequationsolving;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gretchen.quadraticequationsolving.service.QuadraticEquationServiceImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class WSConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint quadraticEquationEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new QuadraticEquationServiceImpl());
        endpoint.publish("/QuadraticEquation");
        return endpoint;
    }
}
