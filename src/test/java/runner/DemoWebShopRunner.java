package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				"C:\\Users\\anany\\Downloads\\DemoWebShop-Group-3-RLL (4)\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\DemoWebShop_AddToCart1.feature"
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\DemoWebShop_Recently_Viewed_Products.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\RegisterTest1.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\DemoWebShopLogin.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\search.feature"	,
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\WebDemoShop_AddToCart_2jh.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\DemoWebShop_Wishlist.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\DemoWebShop_AddToCart.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\Community_poll.feature",
				//"C:\\Users\\HP\\eclipse-workspace-new\\DemoWebShop-Group-3-RLL\\src\\test\\resources\\checkout1.feature",
		},
		glue = {"stepDefintion"},
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "html:target/TestreportToday.html",
				  "rerun:target/failed.txt"}, 
		monochrome = true )
public class DemoWebShopRunner extends AbstractTestNGCucumberTests {

}
