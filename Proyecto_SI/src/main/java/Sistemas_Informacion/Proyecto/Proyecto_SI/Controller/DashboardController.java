package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // =====================
    // ADMINISTRADOR
    // =====================

    @GetMapping("/admin/dashboard")
    public String showAdminDashboard(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/PanelControl_Admin";
    }

    @GetMapping("/admin/historial")
    public String verHistoriales(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Historial_Admin";
    }

    @GetMapping("/admin/avisos")
    public String verAvisos(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/AvisosPromociones_Admin";
    }

    @GetMapping("/admin/sucursales")
    public String verInventarioSucursal(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/ProductosSucursal_Admin";
    }

    @GetMapping("/admin/pulido")
    public String verPulido(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Pulido_Admin";
    }

    @GetMapping("/admin/metricas")
    public String verMetricas(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Metricas_Admin";
    }

    @GetMapping("/admin/notas-proveedores")
    public String verNotasProveedores(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/NotasProvedores_Admin";
    }

    @GetMapping("/admin/cierre")
    public String verCierreDia(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/CierreDia_Admin";
    }

    @GetMapping("/admin/reportes")
    public String verReportes(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Reportes_Admin";
    }

    @GetMapping("/admin/saldos")
    public String verSaldos(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Saldos_Admin";
    }

    @GetMapping("/admin/horarios")
    public String verHorarios(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Horarios_Admin";
    }

    @GetMapping("/admin/cuentas-proveedores")
    public String verEstadoProveedores(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/EstadosCuentaProvedores_Admin";
    }

    @GetMapping("/admin/ventas")
    public String verVentasAdmin(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/Ventas_Admin";
    }

    @GetMapping("/admin/config-ticket")
    public String verConfigTicket(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/EtiquetasTickes_Admin";
    }

    @GetMapping("/admin/almacen")
    public String verAlmacen(Model model) {
        model.addAttribute("username", "Administrador");
        return "Admin/ProductosAlmacen_Admin";
    }


    // =====================
    // VENDEDOR
    // =====================

    @GetMapping("/vendedor/dashboard")
    public String showVendedorDashboard(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/PanelControl_Vendedor";
    }

    @GetMapping("/vendedor/asistencia")
    public String asistenciaVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/Asistencia_Vendedor";
    }

    @GetMapping("/vendedor/cierre")
    public String cierreDiaVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/CierreDia_Vendedor";
    }

    @GetMapping("/vendedor/historial")
    public String historialVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/Historial_Vendedor";
    }

    @GetMapping("/vendedor/inventario")
    public String inventarioQuincenalVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/InventarioQuincenal_Vendedor";
    }

    @GetMapping("/vendedor/nueva-venta")
    public String nuevaVentaVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/NuevaVenta_Vendedor";
    }

    @GetMapping("/vendedor/avisos")
    public String avisosVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/PromocionesAvisos_Vendedor";
    }

    @GetMapping("/vendedor/saldos")
    public String saldosVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/Saldos_Vendedor";
    }

    @GetMapping("/vendedor/ventas")
    public String ventasVendedor(Model model) {
        model.addAttribute("username", "Vendedor");
        return "Vendedor/Ventas_Vendedor";
    }


    // =====================
    // OPTOMETRISTA
    // =====================

    @GetMapping("/optometrista/dashboard")
    public String showOptometristaDashboard(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/PanelControl_Optometrista";
    }

    @GetMapping("/optometrista/historial")
    public String historialOptometrista(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/Historial_Optometrista";
    }

    @GetMapping("/optometrista/nuevo-historial")
    public String nuevoHistorialOptometrista(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/NuevoHistorial_Optometrista";
    }

    @GetMapping("/optometrista/ventas")
    public String ventasOptometrista(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/Ventas_Optometrista";
    }

    @GetMapping("/optometrista/garantias")
    public String garantiasOptometrista(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/Garantias_Optometrista";
    }

    @GetMapping("/optometrista/avisos")
    public String avisosOptometrista(Model model) {
        model.addAttribute("username", "Optometrista");
        return "Optometrista/PromocionesAvisos_Optometrista";
    }


    // =====================
    // SOPORTE
    // =====================

    @GetMapping("/soporte/dashboard")
    public String showSoporteDashboard(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/PanelControl_Soporte";
    }

    @GetMapping("/soporte/cierre")
    public String verCierreDiaSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/CierreDia_Soporte";
    }

    @GetMapping("/soporte/cuentas-proveedores")
    public String verEstadoProveedoresSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/EstadoCuentasProvedores_Soporte";
    }

    @GetMapping("/soporte/garantias")
    public String verGarantiasSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/Garantias_Soporte";
    }

    @GetMapping("/soporte/historial")
    public String verHistorialSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/Historial_Soporte";
    }

    @GetMapping("/soporte/notas-proveedores")
    public String verNotasProveedoresSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/NotasProvedores_Soporte";
    }

    @GetMapping("/soporte/pulido")
    public String verPulidoSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/Pulido_Soporte";
    }

    @GetMapping("/soporte/saldos")
    public String verSaldosSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/Saldos_Soporte";
    }

    @GetMapping("/soporte/ventas")
    public String verVentasSoporte(Model model) {
        model.addAttribute("username", "Soporte");
        return "Soporte/Ventas_Soporte";
    }
}
