package element;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Homepage_base;

public class Homepage_elements extends Homepage_base {
	public Homepage_elements() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='logo-wrapper']/a")
	WebElement logo;
	public WebElement logo1() {
		return logo;
	}
	
	@FindBy(xpath="//div[@class='downloadAppLinks clr']/a[1]")
	WebElement palystore;
	public WebElement palystore1() {
		return palystore;
	}
	
	@FindBy(xpath="//div[@class='downloadAppLinks clr']/a[2]")
	WebElement Appstore;
	public WebElement Appstore1() {
		return Appstore;
	}
	
	@FindBy(xpath="//ul[@class='footer fontLight clr']/li[1]/ul/li/a")
	List<WebElement> footmenuone;
	public List<WebElement> footmenuone1() {
		return footmenuone;
	}
	
	@FindBy(xpath="//ul[@class='footer fontLight clr']/li[2]/ul/li/a")
	List<WebElement> footmenutwo;
	public List<WebElement> footmenutwo1() {
		return footmenutwo;
	}
	
	@FindBy(xpath="//ul[@class='footer fontLight clr']/li[3]/ul/li/a")
	List<WebElement> footmenuthree;
	public List<WebElement> footmenuthree1() {
		return footmenuthree;
	}
	

}
