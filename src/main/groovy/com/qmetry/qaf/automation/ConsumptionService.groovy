package com.qmetry.qaf.automation

import geb.Browser
import geb.binding.BindingUpdater
import groovy.transform.CompileStatic
import geb.*

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.*
import java.util.concurrent.TimeUnit

import  com.qmetry.qaf.automation.NewsPage
import com.qmetry.qaf.automation.ui.UiDriverFactory.Browsers
import  com.qmetry.qaf.automation.HomePage

/**
 * Created by Webonise on 13/12/16.
 */
//@CompileStatic
//public class ConsumptionService {
def configbinding
	public def sayHello(){
		 println("hello all groovy user!")
	 }
	 
	//BEfore and after are cucumber hooks
	 def executebefore() {
	  Before() {
		  println("In before!")
		  bindingUpdater = new BindingUpdater(binding, new Browser())
		  bindingUpdater.initialize()
		  browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		  browser.driver.manage().window().maximize()
	  }
     }
	// def executeafter()
	// {
		   After(){ bindingUpdater.remove() }
	 //}
  
	  /*
	  def userhome (){
		  
		  
		  helpLink(to: HomePage)
		 
		  
	  //	 { -> to HomePage }
	   
		 }*/
  /*
  
  When(~/^I go to my bag$/) {
	  ->
	  page.selectLatestNews()
	  at NewsPage
	  page.check_item()
  }
	  
  Then(~/^user successfully able to view my bag$/) { -> at HomePage} */
