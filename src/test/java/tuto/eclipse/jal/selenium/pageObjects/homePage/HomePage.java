package tuto.eclipse.jal.selenium.pageObjects.homePage;

import static org.junit.Assert.assertEquals;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class HomePage extends AllPages {

	private static final String HOME_PAGE = "> HOME_PAGE > Checks > ";
	private static final String EXPECTED_PAGE_TITLE = "JAPAN AIRLINES (JAL) - France Region - Airfare to Japan (Tokyo)";
	private static final String DepartureCity = "NCE";
	private static final String ArrivalCity = "TYO";
	private static final String DAY = "7";
	private static final String MONTH = "6";
	private static final String DAY1 = "12";
	private static final String MONTH1 = "6";

	public HomePage() {
		super();
		System.out.println("A new home page was created");
	}

	public void run() {
		waitForThePage(); // we run the parent class method if we add a parameter
		performChecks();
		performActions();
	}

	public void waitForThePage() {
		HomePageChecks check = new HomePageChecks();
		check.waitForThePage();
		System.out.println("The Home Page has been loaded");
	}

	public void performActions() {
		HomePageActions actions = new HomePageActions();
		actions.closeModal();
		actions.setDepartureCity(DepartureCity);
		actions.setArrivalsCity(ArrivalCity);
		actions.setGoDay(DAY);
		actions.setGoMonth(MONTH);
		actions.setReturnDay(DAY1);
		actions.setReturnMonth(MONTH1);
		actions.clickSearchButton();

	}

	public void performChecks() {
		HomePageChecks check = new HomePageChecks();
		assertEquals(HOME_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
		System.out.println("if wrong, we dont see it");

	}

}
