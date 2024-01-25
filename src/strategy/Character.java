package strategy;

public class Character {
    private Weapon weapon;

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
        } else
            weapon.attack(); // delegate(=위임)
    }
}
