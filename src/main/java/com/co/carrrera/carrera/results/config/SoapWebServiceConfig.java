package com.co.carrrera.carrera.results.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @Autor: Omar Madrigal
 * Clase que se encarga de la configuracion y exposicion de firma del servicio
 */

@EnableWs
@Configuration
public class SoapWebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDisplacheServlet(ApplicationContext context){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/carreraResultsWS/*");
    }
    @Bean
    public XsdSchema resultadosCarreraSchema() {
        return new SimpleXsdSchema(new ClassPathResource("contract/resultadosCarrera.xsd"));
    }

    @Bean(name = "carreraResultsWS")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema employedSchema) {

        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(employedSchema);
        definition.setLocationUri("/carreraResultsWS");
        definition.setPortTypeName("ResultsServicePort");
        definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        return definition;
    }
}
