package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class LoginController {

    @GetMapping("/")
    public String VerLogin() {
        return "Login";
    }

    
}
