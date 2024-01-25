package template_method.army.armor;

import template_method.army.Armor;

public class SteelArmor implements Armor {
    @Override
    public void defense() {
        System.out.println("갑옷 방어!");
    }
}
