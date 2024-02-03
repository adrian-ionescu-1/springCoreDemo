package com.sda.config;

import com.sda.service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Este o adnotare la nivel de clasa care se foloseste pt declararea BEAN-urilor prin adnotarea metodelor din clasa cu @Bean
public class AppConfig {

//    @Bean - este o adnotare la nivel de metoda si ofera suport in procesarea BEAN-urilor din fisierul XML;
//          - suporta de asemenea si procesarea majoritatii atributelor oferite de fisierul XML: init-method, scope, etc.
    @Bean
    public EmailService emailServiceBean() {
        return  new EmailService();
    }
}
