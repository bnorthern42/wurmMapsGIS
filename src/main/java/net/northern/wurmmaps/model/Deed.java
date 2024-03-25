package net.northern.wurmmaps.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.locationtech.jts.geom.Point;

@Entity
@Table(name="DEEDS")
@NoArgsConstructor
@Data
public class Deed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;

    private String Name;


    private Boolean Active;

    @ManyToOne(fetch = FetchType.LAZY)
    private KingdomId KingdomNum;

    /*
    * For our own deeds or others that are known, eventual
    * deed cost calculations
    * */
    private Integer NorthSize;
    private Integer SouthSize;
    private Integer EastSize;
    private Integer WestSize;
    private Integer PerimeterSize;
    private Boolean isCapital;



    @Column(columnDefinition = "geography")
    private Point Location;

    public Deed(String name, Boolean active, KingdomId kingdomNum, Point location) {
        Name = name;
        Active = active;
        KingdomNum = kingdomNum;
        Location = location;
    }

    @Override
    public String toString() {
        return "Deed{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Active=" + Active +
                ", KingdomNum=" + KingdomNum +
                ", NorthSize=" + NorthSize +
                ", SouthSize=" + SouthSize +
                ", EastSize=" + EastSize +
                ", WestSize=" + WestSize +
                ", PerimeterSize=" + PerimeterSize +
                ", Location=" + Location +
                '}';
    }
}
