/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplolog4j.ejemplo1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author ColsutecR
 */
public class App2 {
     public static void main(String[] args) {
  
        Logger log = Logger.getLogger("App2.class");
        PropertyConfigurator.configure("Log4J2.properties");
        log.fatal("esto es un error fatal");
        log.error("esto es un error");
        log.warn("esto es una advertencia");
        log.info("esto rd un mensaje de imformacion");
        log.debug("esto es un mensaje de debug");
        log.trace("esto es un mensaje de razabilidad");

    }
}
