package net.northern.wurmmaps.Controllers;

import net.northern.wurmmaps.Services.KingdomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HomeController {


    @GetMapping("/")
    public String home(Model model) {

         /*model.addAllAttributes("features", Arrays.asList(
                "bo",
                "ob",
                "idk"));*/
        return "index";
    }

    @GetMapping("/map")
    public String map(Model model) {

         /*model.addAllAttributes("features", Arrays.asList(
                "bo",
                "ob",
                "idk"));*/
        return "map";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }


}
