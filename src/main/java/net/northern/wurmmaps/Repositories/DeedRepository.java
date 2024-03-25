package net.northern.wurmmaps.Repositories;

import net.northern.wurmmaps.model.Deed;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface DeedRepository extends JpaRepository<Deed, Long> {
//Deed findByName(String lastdeedname);

//List<Deed> findAllByKingdomId(KingdomId kingdomId);

    Optional<Deed> findById(Long id);


}
