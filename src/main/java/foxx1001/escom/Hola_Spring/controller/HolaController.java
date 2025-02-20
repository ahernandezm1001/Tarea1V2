package foxx1001.escom.Hola_Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Nota: Ahora es @Controller en lugar de @RestController
public class HolaController {

    @GetMapping("/Hola_Spring")
    public String mostrarPagina() {
        return "hola";  // Retorna el nombre del archivo hola.html (sin .html)
    }
}
