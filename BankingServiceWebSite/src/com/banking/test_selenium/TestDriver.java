package com.banking.test_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {
	private String driverUrl = "E:\\Senior Year\\Spring 2021\\Dam bao chat luong phan mem\\chromedriver.exe";

	public TestDriver() {
	}

	public ChromeDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", driverUrl);
		return new ChromeDriver();
	}
}
