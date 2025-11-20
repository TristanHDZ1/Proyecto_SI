package Sistemas_Informacion.Proyecto.Proyecto_SI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/optometrista")
public class OptometristaController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Optometrista/PanelControl_Optometrista";
    }
}
