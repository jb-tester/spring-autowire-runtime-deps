package com.beep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 21.06.2021.</p>
 * <p>Project: springautowire</p>
 * *
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Configer.class);
         
    }

}