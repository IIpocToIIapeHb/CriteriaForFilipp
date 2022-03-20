package by.tc.task01.dao.impl;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.CriteriaParser;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.ApplianceCreatorFactory;
import by.tc.task01.dao.creator.ApplianceCreatorFactoryException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	private String filePath;
	private CriteriaParser parser;

	public ApplianceDAOImpl(CriteriaParser parser, String filePath) {
		this.parser = parser;
		this.filePath = filePath;
	}

	public List<Appliance> find(Criteria criteria) throws DAOException {

		List<Appliance> foundedAppliances = new ArrayList<Appliance>();
		BufferedReader bufferedReader = null;

		try {

			FileReader fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);

			String lineFromFile = bufferedReader.readLine();

			while (lineFromFile != null) {

				if (!lineFromFile.isEmpty()) {

					Criteria criteriaFromLine = parser.parseToCriteria(lineFromFile);

					if (parser.match(criteriaFromLine, criteria)) {

						ApplianceCreator applianceCreator = ApplianceCreatorFactory
								.create(criteriaFromLine.getGroupSearchName());
						Appliance foundedAppliance = applianceCreator.create(criteriaFromLine);

						foundedAppliances.add(foundedAppliance);

					}

				}
				lineFromFile = bufferedReader.readLine();
			}
			return foundedAppliances;

		} catch (IOException e) {
			throw new DAOException("File is not found", e);

		} catch (ApplianceCreatorFactoryException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
