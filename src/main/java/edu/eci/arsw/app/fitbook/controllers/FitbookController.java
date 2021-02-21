package edu.eci.arsw.app.fitbook.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitbookController {
    /**
     * Clase de hello markethub
     * 
     * @return - String de bienvenido
     */
    @RequestMapping("/")
    public String helloMarketHub() {
        return "Bienvenidos a FitBook";
    }
}
