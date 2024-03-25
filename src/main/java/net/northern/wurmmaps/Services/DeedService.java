package net.northern.wurmmaps.Services;



import net.northern.wurmmaps.Controllers.getData;
import net.northern.wurmmaps.Repositories.KingdomRepository;
import net.northern.wurmmaps.model.Deed;
import net.northern.wurmmaps.model.KingdomId;
import net.northern.wurmmaps.Repositories.DeedRepository;
import org.locationtech.jts.geom.*;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeedService {
    private static Logger logger = LoggerFactory.getLogger(DeedService.class);
    @Autowired
    private DeedRepository deedsRepository;
    @Autowired
    private KingdomRepository kingdomRepository;


    public String testMe(){

        Deed d = null;
        try {
            GeometryFactory factory = new GeometryFactory();

            WKTReader wktReader = new WKTReader(new GeometryFactory(new PrecisionModel(), 4326));
            d = new Deed();

            d.setActive(true);
            d.setName("TestDeed");
            KingdomId kd = new KingdomId();
            kd = kingdomRepository.findByKingdomNumber(1);
            //logger.info(kd.toString());
            d.setKingdomNum(kd);


            d.setLocation((Point) wktReader.read("POINT (2048 2048)"));
            deedsRepository.save(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return d.toString();
    }

//    public getKingdomFromName(String name){}

}
