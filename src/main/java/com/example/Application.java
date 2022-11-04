package com.example;

import io.micronaut.runtime.Micronaut;
import java.lang.management.ManagementFactory;

public class Application {
    public static void main(String[] args) {
        System.out.println(ManagementFactory.getRuntimeMXBean().getUptime());
        Micronaut.run(Application.class, args);
    }
}
