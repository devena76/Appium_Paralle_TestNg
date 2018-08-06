package appium_package;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
		
//import org.testng.annotations.AfterMethod;
		
		
	public class Appium_TestNG_Sample_One {
		private static AndroidDriver<MobileElement> driver;

		@Test
		public void F() {
		
			int tmp;
			
			tmp=driver.findElements(By.id("com.android.calculator2:id/digit5")).size();
			//System.out.println(tmp);
			
			if (tmp !=0)
			{
				MobileElement Digit5=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/digit5"));
				Digit5.click();
			}
			else
			{
				MobileElement Digit5=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/digit_5"));
				Digit5.click();
			}
			
			tmp=driver.findElements(By.id("com.android.calculator2:id/mul")).size();
			if (tmp !=0)
			{
				MobileElement Multiple=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/mul"));
				Multiple.click();
			}
			
			else
			{
				MobileElement Multiple=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/op_mul"));
				Multiple.click();
			}
			
			tmp=driver.findElements(By.id("com.android.calculator2:id/digit1")).size();
			if (tmp !=0)
			//if (driver.findElement(By.id("com.android.calculator2:id/digit1")).isEnabled())
			{
				MobileElement Digit1=(MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit1"));
				Digit1.click();
			}
			else
			{
				MobileElement Digit1=(MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_1"));
				Digit1.click();
			}
			
			tmp=driver.findElements(By.id("com.android.calculator2:id/digit0")).size();
			if (tmp !=0)
			//if (driver.findElement(By.id("com.android.calculator2:id/digit0")).isEnabled())
			{
				MobileElement Digit0=(MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit0"));
				Digit0.click();
				Digit0.click();
			}
			else
			{
				MobileElement Digit0=(MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_0"));
				Digit0.click();
				Digit0.click();
			}
				
			tmp=driver.findElements(By.id("com.android.calculator2:id/equal")).size();
			if (tmp !=0)
			//if (driver.findElement(By.id("com.android.calculator2:id/equal")).isEnabled())
			{
				MobileElement DigitEqual=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/equal"));
				DigitEqual.click();
			}
			else{
				MobileElement DigitEqual=(MobileElement)driver.findElement(By.id("com.android.calculator2:id/eq"));
				DigitEqual.click();
			}
			
			driver.quit();
			System.out.println("done");
		}

		
		@Parameters({ "deviceName_","UDID_","platformVersion_", "URL_" })
		@BeforeMethod
		public void beforeMethod(String deviceName_,String UDID_,String platformVersion_,String URL_) throws MalformedURLException, InterruptedException {
			//File classpathRoot = new File(System.getProperty("user.dir"));
			//File appDir = new File(classpathRoot, "/Apps/Amazon/");
			//File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", deviceName_);
			capabilities.setCapability("udid", UDID_);
			capabilities.setCapability("platformVersion", platformVersion_);
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage","com.android.calculator2");
			capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
			//capabilities.setCapability("app", app.getAbsolutePath());
			//capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
			//capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
			
			driver = new AndroidDriver<MobileElement>(new URL("http://"+URL_), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
		}
}