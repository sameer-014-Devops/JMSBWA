package com.example.demo.service;

import com.example.demo.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public Message getWelcomeMessage() {
        return new Message("Welcome to JAVA MAVEN SPRING BOOT WEB APPLICATION (V1.0.2).....!");
    }
}
