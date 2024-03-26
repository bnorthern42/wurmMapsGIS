package net.northern.wurmmaps.Controllers;

import net.northern.wurmmaps.Services.KingdomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/api/List-kingdoms")
public class getKingdomsCtrl {
    @Autowired
    private KingdomsService kingdomsService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET , produces = "application/json")
    public @ResponseBody ResponseEntity<List<String>> getAllKingdoms(){
       return ResponseEntity.ok(kingdomsService.findAllNames());



    }


}
