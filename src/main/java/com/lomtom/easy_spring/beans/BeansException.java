package com.lomtom.easy_spring.beans;

public class BeansException extends Exception {

    public BeansException(String message) {
        super(message);
        System.out.println(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
    }
}