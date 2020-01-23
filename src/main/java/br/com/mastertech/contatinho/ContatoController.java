package br.com.mastertech.contatinho;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContatoController {

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String mostrarResposta(Contato contato, Model model){
        model.addAttribute("nome", contato.getNome());
        model.addAttribute("email",contato.getEmail());

        return "resposta";
    }

}
