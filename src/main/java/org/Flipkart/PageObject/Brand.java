package org.Flipkart.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brand {
	WebDriver driver;

  public Brand(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

   @FindBy(xpath="//div[text()='SAMSUNG']")
   public WebElement samsung;

   @FindBy(xpath="//div[text()='APPLE']")
   public WebElement apple;

   @FindBy(xpath="//div[text()='realme']")
   public WebElement realme;

   public void clickBrand() throws InterruptedException
  {
	samsung.click();
	Thread.sleep(3000);
	
	apple.click();
	Thread.sleep(3000);
	realme.click();
   }


}
