package tuto.eclipse.jal.selenium.pageObjects.DispoPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class DispoPageActions {

	public void clickContinueButton() {
		MyDriver.driver.findElement(By.id(DispoPageIDs.CONTINUE_BUTTON)).click();

	}

}
