package by.tc.task01.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class ApplianceParserTest {
	@Test
	public void testParseToCriteria() {
		
		List<Appliance> foundedAppliances = new ArrayList<Appliance>();
		CriteriaParser parser = new CriteriaParser();
		Criteria parsedCriteria = parser.parseToCriteria("TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=4, FLASH_MEMORY_CAPACITY=2, COLOR=blue");
	
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		  criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		  criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		  criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);

		System.out.println(parser.match(parsedCriteria,criteriaTabletPC));
		ApplianceCreator creator = ApplianceCreatorFactory.create(parsedCriteria.getGroupSearchName());
		Appliance foundedAppliance = creator.create(parsedCriteria);
		foundedAppliances.add(foundedAppliance);
	}

}
