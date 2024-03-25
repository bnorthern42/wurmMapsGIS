package net.northern.wurmmaps.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){

         /*model.addAllAttributes("features", Arrays.asList(
                "bo",
                "ob",
                "idk"));*/
        return "index";
    }
    @GetMapping("/map")
    public String map(Model model){

         /*model.addAllAttributes("features", Arrays.asList(
                "bo",
                "ob",
                "idk"));*/
        return "map";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }
}
