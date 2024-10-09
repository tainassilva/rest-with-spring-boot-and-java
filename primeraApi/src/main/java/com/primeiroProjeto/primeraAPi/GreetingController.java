package com.primeiroProjeto.primeraAPi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    // Adiciona incremento, decremento e comparação
    private final AtomicLong counter = new AtomicLong();

    // Mapeia uma requisição para um método
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",
                             defaultValue = "World" )
                             String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}

