package Baza;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BazicniTestovi {
    private static WebDriver driver;

    public static void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\W10NB2\\IdeaProjects\\Automatizacija\\src\\main\\resources");
        driver.get("https://the-internet.herokuapp.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().window().maximize();
        driver.quit();

    }

    public static void main(String[] args) {
        BazicniTestovi.setUp();
    }



    }





