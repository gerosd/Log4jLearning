package org.gerosd;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manager {
    private static final Logger logger = LoggerFactory.getLogger(Manager.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.xml");
        logger.info("Hello World");
    }
}
