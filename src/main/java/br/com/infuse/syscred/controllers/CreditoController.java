package br.com.infuse.syscred.controllers;

import br.com.infuse.syscred.model.Credito;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CreditoController {

    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/consultarTipoCredito")
    public Credito credito(
            @RequestParam(value="numeroCredito", defaultValue="999")
            String numeroCredito){
        return new Credito(counter.incrementAndGet(), numeroCredito, "Consignado");
    }
}
