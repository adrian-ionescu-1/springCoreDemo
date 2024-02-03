package com.sda;

import com.sda.config.AppConfig;
import com.sda.service.EmailService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        EmailService emailService = new EmailService();
//        emailService.sendEmail("Tarom", "Ieftiniti biletele!");

        // Putem accesa in BEAN din beans.xml prin intermediul a doua containere: BeanFactory si ApplicationContext
        // 1. BeanFactory -> este o interfata predefinita in Spring care nu suporta configurari pe baza de adnotari ci doar pe baza de fisiere XML
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        EmailService emailService = beanFactory.getBean("emailService", EmailService.class);
        System.out.println(emailService.toString());
        emailService.sendEmail("Tarom", "Ieftiniti biletele!");

        // 2. ApplicationContext -> este o subinterfata a lui BeanFactory care foloseste atat configurari pe baza de adnotari cat si configurari la nivel de XML
        // Varianta cu XML
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        EmailService emailService1 = applicationContext.getBean("emailService", EmailService.class);
        System.out.println(emailService1);
        emailService1.sendEmail("Cristi", "Maine ploua.");

        // Varianta CONFIG din Java cu @Bean
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService2 = applicationContext1.getBean("emailServiceBean", EmailService.class);
        System.out.println(emailService2);
        emailService2.sendEmail("Radu", "Mesaj pentru Radu.");
    }
}