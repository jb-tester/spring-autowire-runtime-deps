package com.beep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Configer {

    @Autowired
    private Beep beep;

    public Beep getBeep() {
        return beep;
    }
}
