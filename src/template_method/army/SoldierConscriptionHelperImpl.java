package template_method.army;

import template_method.army.armor.BodyArmor;
import template_method.army.weapon.Gun;
import template_method.city.Citizen;

public class SoldierConscriptionHelperImpl extends SoldierConscriptionHelper {
    @Override
    protected Citizen conscriptCitizen(Citizen citizen) {
        System.out.println("징집!");
        return new Citizen(citizen);
    }

    @Override
    protected void training(Citizen citizen) {
        System.out.println("병사 훈련!");
        citizen.upgradeStrength(123);
    }

    @Override
    protected Soldier changeOfPosition(Citizen citizen) {
        System.out.println("병사로 보직 변경!");
        return new Soldier(citizen);
    }

    @Override
    protected void supplyEquipment(Soldier soldier) {
        System.out.println("장비 보급!");
        soldier.getEquipment(new Gun(), new BodyArmor());
    }
}
