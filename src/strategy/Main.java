package strategy;

import strategy.weapon.Gun;
import strategy.weapon.Knife;
import strategy.weapon.Sword;

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character();
        Character character3 = new Character();

        character1.equipWeapon(new Knife());
        character1.attack();

        character2.equipWeapon(new Sword());
        character2.attack();

        character3.equipWeapon(new Gun());
        character3.attack();
    }
}
