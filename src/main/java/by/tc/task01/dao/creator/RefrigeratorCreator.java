package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;

public class RefrigeratorCreator implements ApplianceCreator {

	@Override
	public Refrigerator create(Criteria parsedCriteria) {
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.setPowerConsumption((int) parsedCriteria.getCriteria().get("POWER_CONSUMPTION"));
		refrigerator.setWeight((int) parsedCriteria.getCriteria().get("WEIGHT"));
		refrigerator.setFreezerCapacity((int) parsedCriteria.getCriteria().get("FREEZER_CAPACITY"));
		refrigerator.setOverallCapacity((int) parsedCriteria.getCriteria().get("OVERALL_CAPACITY"));
		refrigerator.setHeight((int) parsedCriteria.getCriteria().get("HEIGHT"));
		refrigerator.setWidth((int) parsedCriteria.getCriteria().get("WIDTH"));
		return refrigerator;
	}

}
