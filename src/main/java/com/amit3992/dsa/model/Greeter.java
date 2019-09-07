package com.amit3992.dsa.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Greeter.class);
    public String sayHello() {
        LOGGER.info("testing info log");
        LOGGER.error("testing error log");
        LOGGER.info("logs are working!");
        return "Hello world!";
    }
}
