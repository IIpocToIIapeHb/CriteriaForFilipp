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
                case "BATTERY_CAPACITY":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "SYSTEM_MEMORY":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "CPU":
                    if (!(criteriaProperty.getValue() instanceof Integer) &&
                            !(criteriaProperty.getValue() instanceof Double)) {
                        return false;
                    }
                    break;
                case "DISPLAY_INCHES":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "POWER_CONSUMPTION":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "WEIGHT":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "DEPTH":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "HEIGHT":
                    if (!(criteriaProperty.getValue() instanceof Integer) &&
                            !(criteriaProperty.getValue() instanceof Double)) {
                        return false;
                    }
                    break;
                case "WIDTH":
                    if (!(criteriaProperty.getValue() instanceof Integer) &&
                            !(criteriaProperty.getValue() instanceof Double)) {
                        return false;
                    }
                    break;
                case "FREEZER_CAPACITY":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "OVERALL_CAPACITY":
                    if (!(criteriaProperty.getValue() instanceof Integer) &&
                            !(criteriaProperty.getValue() instanceof Double)) {
                        return false;
                    }
                    break;
                case "FLASH_MEMORY_CAPACITY":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "COLOR":
                    if (!(criteriaProperty.getValue() instanceof String)) {
                        return false;
                    }
                    break;
                case "NUMBER_OF_SPEAKERS":
                    if (!(criteriaProperty.getValue() instanceof Integer)) {
                        return false;
                    }
                    break;
                case "FREQUENCY_RANGE":
                    if (!(criteriaProperty.getValue() instanceof String)) {
                        return false;
                    }
                    break;
                case "CORD_LENGTH":
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

