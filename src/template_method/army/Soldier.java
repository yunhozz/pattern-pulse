package template_method.army;

import template_method.city.Citizen;

public class Soldier extends Citizen {
    private Weapon weapon;
    private Armor armor;

    public Soldier(Citizen citizen) {
        super(citizen);
    }

    public void attack() {
        weapon.attack();
    }

    public void defense() {
        armor.defense();
    }

    public void getEquipment(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
