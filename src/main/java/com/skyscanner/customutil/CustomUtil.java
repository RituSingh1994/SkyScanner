package com.skyscanner.customutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CustomUtil {
	static Properties prop = new Properties();

	public static String getLocator(String locatorName) {
		String locator = "";
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Lenovo\\eclipse-workspace\\SkyScanner\\src\\main\\java\\Repo\\OR.properties");
			prop.load(fis);
			locator = prop.getProperty(locatorName);

		} catch (FileNotFoundException e) {
			System.out.println("Object repository not found!!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Locator Name: "+locator);
		return locator;

	}

	public static String[] getLocatorValue(String locatorName) {
		return getLocator(locatorName).split("##");

	}

}
