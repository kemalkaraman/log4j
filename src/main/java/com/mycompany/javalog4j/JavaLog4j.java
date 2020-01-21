package com.mycompany.javalog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kemal
 */
public class JavaLog4j {

    private static final Logger LOGGER = Logger.getLogger(JavaLog4j.class); // Log4j logger;

    public static void main(String[] args) {

        PropertyConfigurator.configure("C:\\Users\\kemal\\Documents\\NetBeansProjects\\log4j\\src\\test\\java\\log4j.properties");
        LOGGER.debug("-xx-");
        LOGGER.info("-info-");

        
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            LOGGER.error("catch error", e);
        }
    }
}
