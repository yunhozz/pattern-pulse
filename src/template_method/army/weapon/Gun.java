package template_method.army.weapon;

import template_method.army.Weapon;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("빵야빵야!");
    }
}
