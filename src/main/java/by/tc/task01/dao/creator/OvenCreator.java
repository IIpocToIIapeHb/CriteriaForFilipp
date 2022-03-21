package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;

public class OvenCreator implements ApplianceCreator {

    @Override
    public Oven create(Criteria parsedCriteria) {
        Oven oven = new Oven();
        oven.setPowerConsumption((Integer) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
        oven.setWeight((Integer) parsedCriteria.getCriteria().get("WEIGHT"));
        oven.setCapacity((Integer) parsedCriteria.getCriteria().get("CAPACITY"));
        oven.setDepth((Integer) parsedCriteria.getCriteria().get("DEPTH"));


        if (parsedCriteria.getCriteria().get("HEIGHT") instanceof Integer) {
            oven.setHeight((double)((Integer) parsedCriteria.getCriteria().get("HEIGHT")));
        } else {
            oven.setHeight((Double) parsedCriteria.getCriteria().get("HEIGHT"));
        }


        if (parsedCriteria.getCriteria().get("WIDTH") instanceof Integer) {
            oven.setWidth((double)(int) ((Integer) parsedCriteria.getCriteria().get("WIDTH")));
        } else {
            oven.setWidth((Double) parsedCriteria.getCriteria().get("WIDTH"));
        }


        return oven;
    }

}
