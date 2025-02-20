    package foxx1001.escom.Hola_Spring.controller;

    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController  // Indica que esta clase es un controlador REST
    public class HolaController {
        @RequestMapping("/Hola_Spring")  // Define la ruta base "/Hola_Spring"
        public String decirHola() {
            return "¡Hola Spring!";
        }
    }
