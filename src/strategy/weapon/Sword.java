package strategy.weapon;

import strategy.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("검 휘두르기!");
    }
}
