package net.northern.wurmmaps.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.northern.wurmmaps.Repositories.KingdomName;
import net.northern.wurmmaps.Services.KingdomsService;
import net.northern.wurmmaps.model.KingdomId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/kingdoms")
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
