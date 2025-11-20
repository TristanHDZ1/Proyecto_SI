package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String VerLogin() {
        return "Login";
    }

    @PostMapping("/simular")
    public String simularRol(@RequestParam String rol) {

        switch (rol) {
            case "admin":
                return "redirect:/Admin/dashboard";
            case "optometrista":
                return "redirect:/Optometrista/dashboard";
            case "vendedor":
                return "redirect:/Vendedor/dashboard";
            case "soporte":
                return "redirect:/Soporte/dashboard";
            default:
                return "redirect:/";
        }
    }
}
