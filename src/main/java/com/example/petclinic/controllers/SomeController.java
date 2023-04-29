package com.example.petclinic.controllers;

import com.example.petclinic.services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}
