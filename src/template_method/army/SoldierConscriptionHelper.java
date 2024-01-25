package template_method.army;

import template_method.city.Citizen;

/*
<요구 사항>
시민들을 징집하여 병사로 만들어 주세요.

1. 시민들 중 병사가 될 수 있는 조건의 시민들을 징집
2. 징집된 군인들 훈련
3. 보직을 시민에서 병사로 변경
4. 장비 보급
 */

public abstract class SoldierConscriptionHelper {
    protected abstract Citizen conscriptCitizen(Citizen citizen); //시민 징집
    protected abstract void training(Citizen citizen); //징집된 군인들 훈련
    protected abstract Soldier changeOfPosition(Citizen citizen); //보직을 시민에서 병사로 변경
    protected abstract void supplyEquipment(Soldier soldier); //장비 보급

    //시민들을 징집하여 병사로 만듦
    public Soldier conscription() {
        Citizen citizen = conscriptCitizen(new Citizen());
        training(citizen);
        Soldier soldier = changeOfPosition(citizen);
        supplyEquipment(soldier);

        return soldier;
    }
}
