package net.northern.wurmmaps.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Entity
@Table(name="Towers")
@NoArgsConstructor
@Data
public class TowerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;

    private String Name;

    private Float Quality;

    @ManyToOne(fetch = FetchType.LAZY)
    private KingdomId KingdomNum;

    @Column(columnDefinition = "geography")
    private Point Location;
}
