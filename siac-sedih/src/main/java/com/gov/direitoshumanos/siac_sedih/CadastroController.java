package com.gov.direitoshumanos.siac_sedih;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @GetMapping("/teste")
    public String mensagem() {
        return "Cadastro realizado com sucesso!";
    }
}
