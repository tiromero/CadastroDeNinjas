package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador para API
@RequestMapping //Mapear a nossa aplicação
public class NinjaController {


    @GetMapping("/boasVindas") //Colocar a rota da aplicação
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa ROTA.";
    }

}
