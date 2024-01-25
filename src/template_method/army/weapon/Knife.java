package template_method.army.weapon;

import template_method.army.Weapon;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("슈슉 슈슉 슉");
    }
}
