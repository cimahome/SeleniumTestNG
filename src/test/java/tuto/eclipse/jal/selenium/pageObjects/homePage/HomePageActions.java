package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();

	}

	public void setArrivalsCity(String arrivalcity) {
		Select m = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.ARRIVAL_TO_CITY_ID)));
		m.selectByValue(arrivalcity);
	}

	public void setDepartureCity(String departurecity) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue(departurecity);

	}

	public void setGoDay(String day) {

		Select z = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		z.selectByValue(day);
	}

	public void setGoMonth(String month) {

		Select f = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		f.selectByValue(month);
	}

	public void setReturnDay(String day1) {

		Select t = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_DAY)));
		t.selectByValue(day1);
	}

	public void setReturnMonth(String month1) {
		Select r = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_MONTH)));
		r.selectByValue(month1);
	}

	/*
	 * CHECKS
	 */
}
