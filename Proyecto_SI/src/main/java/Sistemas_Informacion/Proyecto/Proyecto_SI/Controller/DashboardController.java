package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// ¡Ya no necesitamos Authentication ni GrantedAuthority! ¡Bravo!

@Controller
public class DashboardController {

    /**
     * Muestra el dashboard de Administrador.
     * Escucha en la URL a la que redirige el LoginController.
     */
    @GetMapping("/admin/dashboard")
    public String showAdminDashboard(Model model) {
        // Ponemos datos FALSOS (simulados) para que la plantilla los muestre
        model.addAttribute("username", "Admin Simulado");
        model.addAttribute("pageTitle", "Panel de Admin");
        model.addAttribute("role", "Administrador");

        // Devuelve la ruta a tu archivo: templates/Admin/PanelControl_Admin.html
        return "Admin/PanelControl_Admin";
    }

    /**
     * Muestra el dashboard de Vendedor.
     */
    @GetMapping("/vendedor/dashboard")
    public String showVendedorDashboard(Model model) {
        model.addAttribute("username", "Vendedor Simulado");
        model.addAttribute("pageTitle", "Panel de Ventas");
        model.addAttribute("role", "Vendedor");

        // Devuelve la ruta: templates/Vendedor/PanelControl_Vendedor.html
        return "Vendedor/PanelControl_Vendedor";
    }

    /**
     * Muestra el dashboard de Optometrista.
     */
    @GetMapping("/optometrista/dashboard")
    public String showOptometristaDashboard(Model model) {
        model.addAttribute("username", "Opto Simulado");
        model.addAttribute("pageTitle", "Panel de Optometrista");
        model.addAttribute("role", "Optometrista");

        // Devuelve la ruta: templates/Optometrista/PanelControl_Optometrista.html
        return "Optometrista/PanelControl_Optometrista";
    }

    /**
     * Muestra el dashboard de Soporte.
     */
    @GetMapping("/soporte/dashboard")
    public String showSoporteDashboard(Model model) {
        model.addAttribute("username", "Soporte Simulado");
        model.addAttribute("pageTitle", "Panel de Soporte");
        model.addAttribute("role", "Soporte");

        // Devuelve la ruta: templates/Soporte/PanelControl_Soporte.html
        return "Soporte/PanelControl_Soporte";
    }
}