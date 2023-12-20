package lldprac.structuralDesPat.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;

// Step 1 - Intrinsic State
@AllArgsConstructor
@Getter
public class Bullet {
    private String image;
    private Double radius;
    private Double weight;
    private BulletType type;
}