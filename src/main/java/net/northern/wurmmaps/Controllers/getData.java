package net.northern.wurmmaps.Controllers;

import net.northern.wurmmaps.Services.DeedService;
import net.northern.wurmmaps.Services.GetMap;
import net.northern.wurmmaps.Services.KingdomsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/getMap")
public class getData {
    private static Logger logger = LoggerFactory.getLogger(getData.class);

@Autowired
    private DeedService ds;
@Autowired
private KingdomsService ks;


    @GetMapping("/{number}")
    public ResponseEntity<String> testnumber(@PathVariable String number){
        return ResponseEntity.ok("Number  "+ number);
    }
    @GetMapping("/testInput")
    public ResponseEntity<String> testSetup(){
        logger.info("setting up kingdoms");
        ks.setupKingdoms();
        logger.info("set up kingdoms, can now try and set test deed");
        ds.testMe();
        return ResponseEntity.ok("OK");
    }
}
