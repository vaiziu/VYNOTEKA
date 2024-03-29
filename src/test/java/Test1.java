import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver _globalDriver;

    @BeforeTest
    public void setUpDriver() {

        _globalDriver = new ChromeDriver();
    }
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};

        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        email.append("@");

        String randomDomain = domains[random.nextInt(domains.length)];

        email.append(randomDomain);

        return email.toString();
    }

    @Test
    public void testingSubscribeButton() {
        _globalDriver.get("https://vynoteka.lt");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ageButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div/button"));

    }
    @Test
    public void testingAfterCancelingSubscribtion() {
        _globalDriver.get("https://vynoteka.lt");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ageButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div/button"));
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button/div")).click();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



    @Test
    public void testingSearch() {
        _globalDriver.get("https://vynoteka.lt");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[1]/form/div[5]/div[2]/div/button"));
        _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button/div")).click();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("primitivo");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement registrationText = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[2]/div/div/div/div[1]/div[1]/div/div/a")); // reikia paieskos zingsniu
        Assert.assertEquals(registrationText.getText(), "Masso Antico Primitivo 0,75 L");

    }

    @Test
    public void testingRegistration() {
        _globalDriver.get("https://vynoteka.lt");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/a[1]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ageButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button"));
        ageButton.click();

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement promotionBanner = _globalDriver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]/button/div"));
        promotionBanner.click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement exitPublicationButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div/button"));
        exitPublicationButton.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement registrationButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[4]/nav/div[1]/button"));
        registrationButton.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement registration = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button"));
        registration.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement creatingAccount= _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div[1]/div/button"));
        creatingAccount.click();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.id("firstname)")).sendKeys("Vardenis");

        _globalDriver.findElement(By.id("lastname")).sendKeys("Pavardenis");

        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[4]/div/div[1]/input")).sendKeys(generateRandomEmail());

        _globalDriver.findElement(By.id("phone")).sendKeys("11223344");

        _globalDriver.findElement(By.id("password")).sendKeys("1*2registruotis");

        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[7]/div/div/input")).sendKeys("1*2registruotis");

        WebElement rules= _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label"));
        rules.click();

        WebElement smsConfirmation = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[2]/div/label"));
        smsConfirmation.click();

        WebElement register= _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button"));
        register.click();




    }










}
