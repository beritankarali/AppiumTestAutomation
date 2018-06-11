package test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
 
public class appiumtest {

	private static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	File classpathRoot = new File(System.getProperty("user.dir"));
	File appDir = new File(classpathRoot, "/src/test/");
	File app = new File(appDir, "Dergilik_com.arneca.dergilik.main3x.apk");

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability("deviceName", "HTC One M9");
    capabilities.setCapability("platformVersion", "6.0");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("app", app.getAbsolutePath());
    capabilities.setCapability("appPackage", "com.arneca.dergilik.main3x");
    capabilities.setCapability("appActivity", "com.solidict.dergilik.activities.MainActivity");
	
	driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.name("GAZETE"));
	element.click();


	//com.arneca.dergilik.main3x:id/iv_preview-->OKU
	WebElement parent = driver.findElement(By.id("com.arneca.dergilik.main3x:id/gv_dergiler"));
			List<WebElement> child = parent.findElements(By.className("android.widget.RelativeLayout"));
	
                     for(int i=0; i<6; i++) {
				WebElement main = child.get(i);
		          main.click();         
		WebElement download = driver.findElementById("com.arneca.dergilik.main3x:id/tv_hemenoku");
		//WebElement read = driver.findElementById("com.arneca.dergilik.main3x:id/tv_hemenoku");
		String text=download.getText();
		String text2 = "İNDİR";
		if(child.get(i)==child.get(4)||child.get(i)==child.get(5))
		{
			driver.pressKeyCode(AndroidKeyCode.BACK);
			continue;
		
		}
			
				if(text.equals(text2))
				{
					download.click();
					Thread.sleep(70000);
					download.click();
					Thread.sleep(10000);
					driver.pressKeyCode(AndroidKeyCode.BACK);
						Thread.sleep(10000);
						driver.pressKeyCode(AndroidKeyCode.BACK);
						Thread.sleep(10000);
			
		}
		else {
			

			Thread.sleep(10000);
			driver.pressKeyCode(AndroidKeyCode.BACK);
				Thread.sleep(10000);
				driver.pressKeyCode(AndroidKeyCode.BACK);
				Thread.sleep(10000);
			
		}
      }
			Thread.sleep(10000);
			Dimension size= driver.manage().window().getSize();
			int starty=(int)(size.height*0.90);
			int endy=(int)(size.height*0.10);
			int startx=size.width/2;
			driver.swipe(startx, starty, startx, endy, 3000);

			for(int j=0; j<6; j++) {

				WebElement main = child.get(j);
		          main.click();
		          	
		WebElement download = driver.findElement(By.id("com.arneca.dergilik.main3x:id/tv_hemenoku"));
		String text = download.getText().toString();
		
		if(text =="İNDİR")
		{
	download.click();
	Thread.sleep(90000);
	download.click();
	Thread.sleep(30000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(10000);
}
else {
	download.click();
Thread.sleep(30000);
driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);

}
		}
			Thread.sleep(10000);
			Dimension size2= driver.manage().window().getSize();
			int startyy=(int)(size.height*0.90);
			int endyy=(int)(size.height*0.10);
			int startxx=size.width/2;
			driver.swipe(startxx, startyy, startxx, endyy, 3000);
			Thread.sleep(10000);
			for(int k=0; k<6; k++) {
				WebElement main = child.get(k);
		          main.click();
		       
		  		WebElement download = driver.findElement(By.id("com.arneca.dergilik.main3x:id/tv_hemenoku"));
		  		String text = download.getText();
		  		if(text=="İNDİR") 
		{
	download.click();
	Thread.sleep(120000);
	download.click();
	Thread.sleep(30000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(10000);
}

		  		
else {
download.click();
Thread.sleep(30000);
driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);

}
		
			}
			
			Thread.sleep(10000);
			Dimension size3= driver.manage().window().getSize();
			int startyyy=(int)(size.height*0.90);
			int endyyy=(int)(size.height*0.10);
			int startxxx=size.width/2;
			driver.swipe(startxxx, startyyy, startxxx, endyyy, 3000);
			Thread.sleep(10000);
			for(int m=0; m<5; m++) {
				WebElement main = child.get(m);
		          main.click();
		
	
		        WebElement read = driver.findElement(By.id("com.arneca.dergilik.main3x:id/iv_preview"));
		  		WebElement download = driver.findElement(By.id("com.arneca.dergilik.main3x:id/tv_hemenoku"));
		  		String text = download.getText();
		if(text=="İNDİR")
		{
	download.click();
	Thread.sleep(120000);
	read.click();
	Thread.sleep(30000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(10000);
}
else {
read.click();
Thread.sleep(30000);
driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);
	driver.pressKeyCode(AndroidKeyCode.BACK);
	Thread.sleep(10000);

}
		}
	driver.quit();
	WebElement quit = driver.findElement(By.id("com.arneca.dergilik.main3x:id/tv_evet"));
	quit.click();
	

	}
}
