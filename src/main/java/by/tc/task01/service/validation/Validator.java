package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		for (Map.Entry<String, Object> criteriaProperty : criteria.getCriteria().entrySet()) {
			String key = criteriaProperty.getKey();
			switch (key) {
				case "CAPACITY":
					if (!(criteriaProperty.getValue() instanceof Integer)) {
						return false;
					}
					break;
				case "OS":
					if (!(criteriaProperty.getValue() instanceof String)) {
						return false;
					}
					break;
				case "MEMORY_ROM":
					if (!(criteriaProperty.getValue() instanceof Integer)) {
						return false;
					}
					break;
				default:
					throw new RuntimeException("Crooked hands exception");
			}

		}
		return true;
	}
}

