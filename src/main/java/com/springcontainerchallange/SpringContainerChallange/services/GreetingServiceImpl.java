package com.springcontainerchallange.SpringContainerChallange.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}