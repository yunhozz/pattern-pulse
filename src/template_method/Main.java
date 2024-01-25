package template_method;

import template_method.army.Soldier;
import template_method.army.SoldierConscriptionHelperImpl;

public class Main {
    public static void main(String[] args) {
        SoldierConscriptionHelperImpl helper = new SoldierConscriptionHelperImpl();
        Soldier soldier = helper.conscription();

        soldier.attack();
        soldier.defense();
    }
}
