package com.uzcoder.springemaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {
    @Autowired
    EmailSenderService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringEmailDemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void TriggerMail(){
    service.sendSimpleEmail("",
            "",
            "");
    }
}
