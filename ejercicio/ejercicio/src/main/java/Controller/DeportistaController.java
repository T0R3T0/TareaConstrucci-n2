package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.Deportista;

import java.util.Arrays;
import java.util.List;

@Controller
public class DeportistaController {

    @GetMapping("/deportistas")
    public String listarDeportistas(Model model) {
        List<Deportista> lista = Arrays.asList(
            new Deportista("Juan Perez", "Futbol", 25, 1),
            new Deportista("Maria Gómez", "Natación", 22, 12),
            new Deportista("Carlos Ruiz", "Atletismo", 28, 7)
        );

        // Aquí se pasa la lista al modelo
        model.addAttribute("deportistas", lista);

        // Nombre del archivo HTML en templates (deportistas.html)
        return "deportistas";
    }
}
