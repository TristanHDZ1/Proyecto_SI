package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class LoginController {

    /**
     * Muestra la página de login.
     * Es mejor usar /login que solo /
     */
    @GetMapping("/login")
    public String VerLogin() {
        // "login" (minúscula) debe coincidir con tu nombre de archivo "login.html"
        return "login";
    }

    @PostMapping("/dologin")
    public String handleLogin(@RequestParam("role") String role) {

        // Un switch para decidir a dónde mandar al usuario
        // basado en el 'value' del <option> seleccionado.
        switch (role) {
            case "ROLE_ADMIN":
                // Redirige a la URL que escucha tu DashboardController
                return "redirect:/admin/dashboard";

            case "ROLE_VENDEDOR":
                return "redirect:/vendedor/dashboard";

            case "ROLE_OPTOMETRISTA":
                return "redirect:/optometrista/dashboard";

            case "ROLE_SOPORTE":
                return "redirect:/soporte/dashboard";

            default:
                // Si algo sale mal, lo regresamos al login
                return "redirect:/login?error";
        }
    }
}
