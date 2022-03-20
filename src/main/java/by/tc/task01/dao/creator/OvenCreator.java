package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;

public class OvenCreator implements ApplianceCreator {

	@Override
	public Oven create(Criteria  parsedCriteria) {
		Oven oven = new Oven();
		oven.setPowerConsumption((int) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
		oven.setWeight((int) parsedCriteria.getCriteria().get("WEIGHT"));
		oven.setCapacity((int) parsedCriteria.getCriteria().get("CAPACITY"));
		oven.setDepth((int) parsedCriteria.getCriteria().get("DEPTH"));
		
		
		if (parsedCriteria.getCriteria().get("HEIGHT") instanceof Integer) {
			oven.setHeight((double) ((int)parsedCriteria.getCriteria().get("HEIGHT")));
		} else {
		oven.setHeight((double) parsedCriteria.getCriteria().get("HEIGHT"));}
		
		
		
		if (parsedCriteria.getCriteria().get("WIDTH") instanceof Integer) {
			oven.setWidth((double) ((int)parsedCriteria.getCriteria().get("WIDTH")));
		} else {
		oven.setWidth((double) parsedCriteria.getCriteria().get("WIDTH"));}
		
		
		return oven;
	}

}
