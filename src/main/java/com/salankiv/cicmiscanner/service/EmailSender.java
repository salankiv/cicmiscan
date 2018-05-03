package com.salankiv.cicmiscanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String text) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("**********@gmail.com");
        email.setFrom("***********@gmail.com");
        email.setSubject("**********************");
        email.setText(text);

        javaMailSender.send(email);
    }
}
