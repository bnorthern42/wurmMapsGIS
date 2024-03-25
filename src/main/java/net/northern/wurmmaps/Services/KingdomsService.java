package net.northern.wurmmaps.Services;

import net.northern.wurmmaps.Repositories.KingdomName;
import net.northern.wurmmaps.Repositories.KingdomRepository;
import net.northern.wurmmaps.model.KingdomId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class KingdomsService {

    @Autowired
    private KingdomRepository kingdomRepository;
    private static Logger logger = LoggerFactory.getLogger(KingdomsService.class);
    public List<String> findAllNames(){
       return kingdomRepository.findAllKingdomName();

    }
    public void setupKingdoms(){
        /*
        * Copy paste
        KingdomId = new KingdomId();
        kingdomRepository.save();
        logger.info("Saved kingdom: ");
        * */
        /*Templates */
        KingdomId MRT = new KingdomId(1, "Mol-Rehan", false);
        kingdomRepository.save(MRT);
        logger.info("Saved kingdom: MR Template");
        KingdomId JKT = new KingdomId(2, "Jenn-Kellon", false);
        kingdomRepository.save(JKT);
        logger.info("Saved kingdom: JK Template");
        KingdomId FRD = new KingdomId(3, "Freedom", false);
        FRD.setActive();
        kingdomRepository.save(FRD);
        logger.info("Saved kingdom: Freedom Template");
        /* PMK */

        KingdomId EMR = new KingdomId(4, "Empire of Mol-Rehan", true);
        kingdomRepository.save(EMR);
        logger.info("Saved kingdom: EMR");
        KingdomId PANDA = new KingdomId(5, "Pandemonium", true);
        PANDA.setActive();
        kingdomRepository.save(PANDA);
        logger.info("Saved kingdom: PANDA");
        KingdomId LD = new KingdomId(6, "Libilas Dominion", true);
        LD.setActive();
        kingdomRepository.save(LD);
        logger.info("Saved kingdom: LD");
        KingdomId SPARTA = new KingdomId(7, "Spartan Empire", true);
        SPARTA.setActive();
        kingdomRepository.save(SPARTA);
        logger.info("Saved kingdom: Spartan Empire");
        KingdomId ORC = new KingdomId(8, "Orca Syndicate",true);
        ORC.setActive();
        kingdomRepository.save(ORC);
        logger.info("Saved kingdom: Orca Syndicate");
        KingdomId ODD = new KingdomId(9, "Order of the Dragon", true);
        kingdomRepository.save(ODD);
        logger.info("Saved kingdom: Order of the Dragon");
        KingdomId HTDG = new KingdomId(10, "Hot Dog", true);
        HTDG.setActive();
        kingdomRepository.save(HTDG);
        logger.info("Saved kingdom: Hot Dog");
        KingdomId KPT = new KingdomId(11, "Keepers of truth", true);
        KPT.setActive();
        kingdomRepository.save(KPT);
        logger.info("Saved kingdom: Keepers of truth");
        KingdomId SKLL = new KingdomId(12, "Skoll", true);
        SKLL.setActive();
        kingdomRepository.save(SKLL);
        logger.info("Saved kingdom: Skoll");
        KingdomId JKP= new KingdomId(13, "Jenn-Kellon", true);
        kingdomRepository.save(JKP);
        logger.info("Saved kingdom: Jenn-Kellon PMK");
        KingdomId TDL = new KingdomId(14, "Templars de Lux", true);
        kingdomRepository.save(TDL);
        logger.info("Saved kingdom: Templars de Lux");
        KingdomId BL= new KingdomId(15, "Black Legion", true);
        kingdomRepository.save(BL);
        logger.info("Saved kingdom: Black Legion");
        KingdomId EBA= new KingdomId(16, "Ebonaura", true);
        kingdomRepository.save(EBA);
        logger.info("Saved kingdom: Ebonaura");
        KingdomId TKA = new KingdomId(17, "The Kingdom of Abral", true);
        kingdomRepository.save(TKA);
        logger.info("Saved kingdom: The Kingdom of Abral");
        KingdomId MCD = new KingdomId(18, "Macedon", true);
        kingdomRepository.save(MCD);
        logger.info("Saved kingdom: Macedon");
        KingdomId DDY= new KingdomId(19, "Dreadnaught Dynasty", true);
        kingdomRepository.save(DDY);
        logger.info("Saved kingdom: Dreadnaught Dynasty");
        KingdomId TCD = new KingdomId(20, "The Crusaders", true);
        kingdomRepository.save(TCD);
        logger.info("Saved kingdom: The Crusaders");
        KingdomId WUY = new KingdomId(21, "Wurm University", true);
        kingdomRepository.save(WUY);
        logger.info("Saved kingdom: Wurm University");
        KingdomId VDS = new KingdomId(22, "Valhall Descendants", true);
        kingdomRepository.save(VDS);
        logger.info("Saved kingdom: Valhall Descendants");
        KingdomId LAS = new KingdomId(23, "Legion of Anubis", true);
        kingdomRepository.save(LAS);
        logger.info("Saved kingdom: Legion of Anubis");
        KingdomId APO = new KingdomId(24, "Apocalypse Order", true);
        kingdomRepository.save(APO);
        logger.info("Saved kingdom: Apocalypse Order");
        KingdomId CRK = new KingdomId(25, "Crow Kingdom", true);
        kingdomRepository.save(CRK);
        logger.info("Saved kingdom: Crow Kingdom");
        KingdomId PRTS = new KingdomId(26, "Pirates", true);
        kingdomRepository.save(PRTS);
        logger.info("Saved kingdom: Pirates");
        KingdomId MR2 = new KingdomId(27, "Mol-Rehan-PMK", true);
        kingdomRepository.save(MR2);
        logger.info("Saved kingdom: Mol-Rehan PMK ");
        KingdomId HLL= new KingdomId(28, "Heroic Libila Legion", true);
        kingdomRepository.save(HLL);
        logger.info("Saved kingdom: Heroic Libila Legion");
        KingdomId KJP= new KingdomId(29, "Kenn-Jellon", true);
        kingdomRepository.save(KJP);
        logger.info("Saved kingdom: Kenn-Jellon");
        KingdomId CHSE = new KingdomId(30, "Cheese", true);
        kingdomRepository.save(CHSE);
        logger.info("Saved kingdom: Cheese");
        KingdomId KOV= new KingdomId(31, "Knights of Valrei", true);
        kingdomRepository.save(KOV);
        logger.info("Saved kingdom: Knights of Valrei");
        KingdomId CAPS = new KingdomId(32, "Capybara Sultanate", true);
        kingdomRepository.save(CAPS);
        logger.info("Saved kingdom: Capybara Sultanate");
        KingdomId INQ = new KingdomId(33, "Inquisition", true);
        kingdomRepository.save(INQ);
        logger.info("Saved kingdom: Inquisition");
        KingdomId SUM = new KingdomId(34, "Summit", true);
        kingdomRepository.save(SUM);
        logger.info("Saved kingdom: Summit");
        KingdomId  HOTS = new KingdomId(35, "Horde of the Summoned", false);
        HOTS.setActive();
        kingdomRepository.save(HOTS);
        logger.info("Saved kingdom: Horde of the Summoned");
        KingdomId GRTA = new KingdomId(36, "Gratsalot", true);
        kingdomRepository.save(GRTA);
        logger.info("Saved kingdom: Gratsalot");



    }
}
