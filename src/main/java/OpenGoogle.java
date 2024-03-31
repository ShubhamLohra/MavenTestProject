import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
	public static void Main(String args[]) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SALESKEN\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		Open Naukari.com
		driver.get("https://www.google.com/");
		System.out.println("----> Opened Google.com");
	}

}
