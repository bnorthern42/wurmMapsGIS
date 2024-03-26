package net.northern.wurmmaps.Controllers;

import net.northern.wurmmaps.Services.KingdomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private KingdomsService kingdomsService;

    @GetMapping("/kingdoms")
    public String kingdomSetupPage(Model model){

        model.addAttribute("kingdomList",getAllKingdoms());
        return "admin/kingdoms";
    }

    @ModelAttribute("kingdomList")
    public  List<String> getAllKingdoms() {
        return kingdomsService.findAllNames();

    }
}
