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
    // Mapeo para la vista de Historiales del Admin
    @GetMapping("/admin/historial")
    public String verHistoriales(Model model) {
        // Aquí simulamos el usuario, igual que en tus otros métodos
        model.addAttribute("username", "Administrador");

        // "adminHistorial" debe ser EXACTAMENTE el nombre de tu archivo HTML (sin .html)
        return "Admin/Historial_Admin";
    }

    // Mapeo para Avisos y Promociones
    @GetMapping("/admin/avisos")
    public String verAvisos(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/AvisosPromociones_Admin"; // Nombre del archivo HTML nuevo
    }

    // Mapeo para Inventario en Sucursal
    @GetMapping("/admin/sucursales")
    public String verInventarioSucursal(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/ProductosSucursal_Admin";
    }

    // Mapeo para Pulido
    @GetMapping("/admin/pulido")
    public String verPulido(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Pulido_Admin";
    }

    // Mapeo para Métricas
    @GetMapping("/admin/metricas")
    public String verMetricas(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Metricas_Admin";
    }

    // Mapeo para Notas de Proveedores
    @GetMapping("/admin/notas-proveedores")
    public String verNotasProveedores(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/NotasProvedores_Admin";
    }

    // Mapeo para Cierre de Día
    @GetMapping("/admin/cierre")
    public String verCierreDia(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/CierreDia_Admin";
    }

    // Mapeo para Reportes (Tablas)
    @GetMapping("/admin/reportes")
    public String verReportes(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Reportes_Admin";
    }

    // Mapeo para Saldos
    @GetMapping("/admin/saldos")
    public String verSaldos(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Saldos_Admin";
    }

    // Mapeo para Horarios
    @GetMapping("/admin/horarios")
    public String verHorarios(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Horarios_Admin";
    }

    // Mapeo para Estado de Cuenta Proveedores
    @GetMapping("/admin/cuentas-proveedores")
    public String verEstadoProveedores(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/EstadosCuentaProvedores_Admin";
    }

    // Mapeo para Ventas Quincenales
    @GetMapping("/admin/ventas")
    public String verVentasAdmin(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Ventas_Admin";
    }

    // Mapeo para Configuración de Ticket
    @GetMapping("/admin/config-ticket")
    public String verConfigTicket(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/EtiquetasTickes_Admin";
    }

    // Mapeo para Productos Almacén
    @GetMapping("/admin/almacen")
    public String verAlmacen(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/ProductosAlmacen_Admin";
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