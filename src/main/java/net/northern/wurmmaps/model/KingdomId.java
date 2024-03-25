package net.northern.wurmmaps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="KINGDOMS")
@NoArgsConstructor
@Data
public class KingdomId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;

    @Column(name = "KingdomNumber")
    private Integer KingdomNumber;

    private String KingdomName;

    private Boolean IsPMK;

    private Boolean Active = false;

    //@ElementCollection(targetClass = Deed.class, fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "KingdomNum", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Deed> deeds = new ArrayList<>();

    public KingdomId( Integer kingdomNumber, String kingdomName, Boolean isPMK) {

        KingdomNumber = kingdomNumber;
        KingdomName = kingdomName;
        IsPMK = isPMK;
    }
    public void setActive(){
        Active = true;
    }
}
