package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoleController {

    @PostMapping("/login")
    public String login(@RequestParam("rol") String rol) {

        switch (rol.toLowerCase()) {

            case "administrador":
                return "redirect:/admin/dashboard";

            case "optometrista":
                return "redirect:/optometrista/dashboard";

            case "vendedor":
                return "redirect:/vendedor/dashboard";

            case "soporte":
                return "redirect:/soporte/dashboard";

            default:
                return "redirect:/Login?error=rol-invalido";
        }
    }
}
