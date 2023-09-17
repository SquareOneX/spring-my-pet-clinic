package squareonex.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import squareonex.mypetclinic.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @RequestMapping({"pets", "pets/index", "pets/index.html"})
    public String getPets(Model model){
        model.addAttribute("pets", petService.findAll());
        return "pets/index";
    }
}
