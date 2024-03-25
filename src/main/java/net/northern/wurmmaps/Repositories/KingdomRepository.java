package net.northern.wurmmaps.Repositories;

import net.northern.wurmmaps.model.KingdomId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface KingdomRepository extends JpaRepository<KingdomId, Long> {
  //  public KingdomId findKingdomIdByKingdomID(Integer id);
    Optional<KingdomId> findByID(Long id);
@Query("SELECT kn FROM KingdomId kn WHERE kn.KingdomNumber = ?1")
    KingdomId findByKingdomNumber(Integer kingdomnumber);
@Query(
        value = "SELECT kingdom_name from kingdoms",
        nativeQuery = true
)
List<String> findAllKingdomName();

    //Optional<KingdomId> findByKingdomName(String KingdomName);
}
