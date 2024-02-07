package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		WebDriver hospiol = new ChromeDriver();
		hospiol.manage().window().maximize();
		hospiol.get("https://testing.hospiol.com/site/login");
		hospiol.findElement(By.name("username")).sendKeys("sampath.marolix@gmail.com");
		hospiol.findElement(By.name("password")).sendKeys("sampath@777");
		hospiol.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
