package com.academia.todoapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todoapp")
public class TodoAppController {

    @GetMapping("/hola")
    public String decirHola() {
        return "Hola Mundo";
    }
    @GetMapping("/saludo")
    public String saludoPersonalizado() {
        return "¡Bienvenido al controlador de artículos!";
    }
}
