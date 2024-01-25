package strategy.weapon;

import strategy.Weapon;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("칼 찌르기!");
    }
}
