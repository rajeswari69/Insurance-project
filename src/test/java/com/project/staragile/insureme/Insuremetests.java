package com.project.staragile.insureme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Insuremetests {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		 System.out.println("Welcome");
		  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Bizzflo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

		  ChromeOptions chromeoptions = new ChromeOptions();
		//  chromeoptions.addArguments("--headless");
		  //chromeoptions.addArguments("--no-sandbox");
		 // chromeoptions.addArguments("--disable-dev-shm-usage");
		 chromeoptions.addArguments("--remote-allow-origins=*");
		  //WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver(chromeoptions);
		  driver.get("http://15.207.113.135:8084/contact.html");
		  driver.manage().window().maximize();
          driver.findElement(By.id("inputName")).sendKeys("rajeswari");
		  driver.findElement(By.id("inputNumber")).sendKeys("7386672073");
		  driver.findElement(By.id("inputMail")).sendKeys("rajeswarigottipalli69@gmail.com");
		  driver.findElement(By.id("inputMessage")).sendKeys("mydata");

		  driver.findElement(By.id("my-button")).click();
		  System.out.println("send success...");
	}

}
