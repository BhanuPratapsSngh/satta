package testphhase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import actions.Homepgae_actions;
import base.Homepage_base;
import element.Homepage_elements;

public class Homepage_testphase extends Homepage_base{
	Homepage_elements HE ;
	Homepgae_actions actions_home;
	
	public Homepage_testphase() {
	}
	@BeforeSuite
	public void initialize() throws IOException {
		setup();
		HE=new Homepage_elements() ;
		actions_home=new Homepgae_actions();
	}
		@BeforeClass
	public void start() {
			startTest();
		}
		@AfterClass
	public void end() {
			endTest();
		}
	@Test(priority=0)
	public void logo() {
		actions_home.logovisi();
	}
	
	@Test(priority=0)
	public void titleconfo() {
		actions_home.a_titleconfo();
	}

	@Test(priority=1)
	public void linkcountsinffoter() throws InterruptedException {
		actions_home.a_footlinkscount();
	
	}
	@Test(priority=1)
	public void pokerclick() throws InterruptedException {
		actions_home.a_poker_footermenu();
		
	}
	@Test(priority=2)
	public void teenpaticlick() throws InterruptedException {
		actions_home.a_teenpati_footermenu();
	}
	@Test(priority=3)
	public void rummymenu() throws InterruptedException {
		actions_home.a_rummy_footermenu();
	}
	@Test(priority=4)
	public void blackjackmenu() throws InterruptedException {
		actions_home.a_blackjack_click();
	}

	@Test(priority=5)
	public void contactusmenu() throws InterruptedException {
		actions_home.a_contackus_click();
	}
	@Test(priority=1)
	public void blogmenu() throws InterruptedException {
		actions_home.a_blog_click();
	}
	@Test(priority=6)
	public void eulamenu() throws InterruptedException {
		actions_home.a_eula_click();
	}
	@Test(priority=7)
	public void legalitymenu() throws InterruptedException {
		actions_home.a_legality_click();
	}
	@Test(priority=8)
	public void cookiepolicymenu() throws InterruptedException {
		actions_home.a_cookiepolicy_click();
	}
	@Test(priority=9)
	public void privacypolicymenu() throws InterruptedException {
		actions_home.a_privacypolicy_click();
	}
	@Test(priority=10)
	public void Sequritymenu() throws InterruptedException {
		actions_home.a_sequrity_click();
	}
	@Test(priority=11)
	public void TOUmenu() throws InterruptedException {
		actions_home.a_TOU_click();
	}
	@Test(priority=12)
	public void englishmenu() throws InterruptedException {
		actions_home.a_englishlang_click();
	}
}
