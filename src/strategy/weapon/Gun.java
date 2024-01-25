package strategy.weapon;

import strategy.Weapon;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("총 쏘기!");
    }
}
