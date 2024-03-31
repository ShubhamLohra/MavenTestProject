import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SALESKEN\\selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

//	Open Naukari.com
	driver.get("https://www.google.com/");
	System.out.println("----> Opened Google.com");
}

}
