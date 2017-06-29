package testsuite;

import org.junit.Test;
import org.openqa.selenium.By;


public class Logout  extends BaseClass{

	@Test
	public void logoutTest()
	{

		system.out.println("Logging out")
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
