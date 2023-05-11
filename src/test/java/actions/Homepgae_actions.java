package actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;

import base.Homepage_base;
import element.Homepage_elements;

public class Homepgae_actions extends Homepage_base {
		Homepage_elements gamenti=new Homepage_elements();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//-------------------------------------------------------------------------------------------------------------------------------------------
	public void logovisi() {
		test = report.startTest("verifing logo visibility");
		if((gamenti.logo1().isDisplayed())==true) {
			test.log(LogStatus.PASS, "YES ,Logo is visible");
		}
		else {
			test.log(LogStatus.FAIL, "no its not visible");
		}
		Assert.assertEquals(gamenti.logo1().isDisplayed(), true);

	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	public void a_titleconfo() {
			test = report.startTest("verifing the title");
			if((driver.getTitle()).equals("Play online 3 patti game & get free coins | Play teen patti now!")) {
				test.log(LogStatus.PASS, "YES ,Title is correct");
			}
			else {
				test.log(LogStatus.FAIL, "Title is not correct");
			}
			Assert.assertEquals(driver.getTitle(), "Play online 3 patti game & get free coins | Play teen patti now!");
			
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------
	public void a_footlinkscount() throws InterruptedException {
		int oneUL=gamenti.footmenuone1().size();
		int secondUL=gamenti.footmenutwo1().size();
		int thirdURL=gamenti.footmenuthree1().size();
		int total_totalmenuslink=oneUL+secondUL+thirdURL;
		test = report.startTest("Verify the count of footer menus");
		Thread.sleep(2000);
		if((total_totalmenuslink)==(13)) {
			test.log(LogStatus.PASS, "YES ,Thirteen footer menus are present ");
		}
		else {
			test.log(LogStatus.FAIL, "Incorrect number of footer menus");
		}
		Assert.assertEquals(total_totalmenuslink, 13);
	}
		//------------------------------------------------------------------------------------------------------------------------------------------------
		
		public void a_poker_footermenu() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuone1().get(0));
			gamenti.footmenuone1().get(0).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the poker menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://poker.gamentio.com/")) {
				test.log(LogStatus.PASS, "YES ,by clciking poker menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking poker menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://poker.gamentio.com/");
			driver.navigate().back();
		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_teenpati_footermenu() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuone1().get(1));
			gamenti.footmenuone1().get(1).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the teenpati menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/")) {
				test.log(LogStatus.PASS, "YES ,by clciking teenpati menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking teenpati menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/");
			driver.navigate().back();
		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_rummy_footermenu() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuone1().get(2));
			gamenti.footmenuone1().get(2).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the rummy menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://rummy.gamentio.com/")) {
				test.log(LogStatus.PASS, "YES ,by clciking rummy menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking rummy menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://rummy.gamentio.com/");
			driver.navigate().back();
		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_blackjack_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuone1().get(3));
			gamenti.footmenuone1().get(3).click();
			test = report.startTest("Verify the blackjack menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://blackjack.gamentio.com/")) {
				test.log(LogStatus.PASS, "YES ,by clciking blackjack menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking blackjack menu it does not  direct to the correct URL");
			}
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl(), "https://blackjack.gamentio.com/");
			driver.navigate().back();
		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_contackus_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenutwo1().get(0));
			gamenti.footmenutwo1().get(0).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/contact-us");
			test = report.startTest("Verify the contackus menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://gamentio.com/contact-us")) {
				test.log(LogStatus.PASS, "YES ,by clciking contackus menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "by clciking contackus menu it does not  direct to the correct URL");
			}
			driver.navigate().back();

		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_blog_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenutwo1().get(1));
			gamenti.footmenutwo1().get(1).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the blog menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/blog")) {
				test.log(LogStatus.PASS, "YES ,by clciking blog menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking blog menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/blog");
			driver.navigate().back();
		}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_eula_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(0));
			gamenti.footmenuthree1().get(0).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the contackus menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/gamentioeula")) {
				test.log(LogStatus.PASS, "YES ,by clciking contackus menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking contackus menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/gamentioeula");
			driver.navigate().back();
		}	
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_legality_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(1));
			gamenti.footmenuthree1().get(1).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the legality menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/gamentiolegal")) {
				test.log(LogStatus.PASS, "YES ,by clciking legality menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking legality menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/gamentiolegal");
			driver.navigate().back();
			}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_cookiepolicy_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(2));
			gamenti.footmenuthree1().get(2).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the cookiepolicy menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/cookie-policy")) {
				test.log(LogStatus.PASS, "YES ,by clciking cookiepolicy menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking cookiepolicy menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/cookie-policy");
			driver.navigate().back();
			}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_privacypolicy_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(3));
			gamenti.footmenuthree1().get(3).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the cookiepolicy menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/gamentioPP")) {
				test.log(LogStatus.PASS, "YES ,by clciking cookiepolicy menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking cookiepolicy menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/gamentioPP");
			driver.navigate().back();
			}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_sequrity_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(4));
			gamenti.footmenuthree1().get(4).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the sequrity and intergrity menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())=="https://teenpatti.gamentio.com/gamentiosecuritynint") {
				test.log(LogStatus.PASS, "YES ,by clciking sequrity and intergrity menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking sequrity and intergrity menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/gamentiosecuritynint");
			driver.navigate().back();
			}
			//--------------------------------------------------------------------------------------------------------------------------------------------
			public void a_TOU_click() throws InterruptedException {
			js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(5));
			gamenti.footmenuthree1().get(5).click();
			Thread.sleep(2000);
			test = report.startTest("Verify the TOU menus present in footer direct to correct URL");
			if((driver.getCurrentUrl())==("https://teenpatti.gamentio.com/gamentiotou")) {
				test.log(LogStatus.PASS, "YES ,by clciking TOU menu it direct to the correct URL");
			}
			else {
				test.log(LogStatus.FAIL, "YES ,by clciking TOU menu it does not  direct to the correct URL");
			}
			Assert.assertEquals(driver.getCurrentUrl(), "https://teenpatti.gamentio.com/gamentiotou");
			driver.navigate().back();
			}
				//--------------------------------------------------------------------------------------------------------------------------------------------
				public void a_englishlang_click() throws InterruptedException {
				js.executeScript("arguments[0].scrollIntoView(true);", gamenti.footmenuthree1().get(6));
				gamenti.footmenuthree1().get(6).click();
				Thread.sleep(2000);
				test = report.startTest("Verify the rummy menus present in footer direct to correct URL");
				if((driver.getCurrentUrl())==("https://gamentio.com/")) {
					test.log(LogStatus.PASS, "YES ,by clciking english language menu it direct to the correct URL");
				}
				else {
					test.log(LogStatus.FAIL, "YES ,by clciking english language menu it does not  direct to the correct URL");
				}
				Assert.assertEquals(driver.getCurrentUrl(), "https://gamentio.com/");
				driver.navigate().back();
			
				}
}
	

