package template_method.army.armor;

import template_method.army.Armor;

public class BodyArmor implements Armor {
    @Override
    public void defense() {
        System.out.println("이거 방탄유리야!");
    }
}
