package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.impl.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	public List<Appliance> find(Criteria criteria) throws DAOException {
		if (!Validator.criteriaValidator(criteria)) {
			throw new RuntimeException("The value in criteria is wrong");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliances = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliances;
	}

}

//you may add your own new classes
