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

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.id("firstname")).sendKeys("Vardenis");

        _globalDriver.findElement(By.id("lastname")).sendKeys("Pavardenis");

        WebElement dropDownYearButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button"));
        dropDownYearButton.click();
        WebElement yearButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[7]"));
        yearButton.click();
        WebElement dropDownMonthButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button/span[2]"));
        dropDownMonthButton.click();
        WebElement monthButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[1]"));
        monthButton.click();
        WebElement dropDownDayButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button/span[2]"));
        dropDownDayButton.click();
        WebElement dayButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[3]"));
        dayButton.click();

        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());

        _globalDriver.findElement(By.id("phone")).sendKeys("67122334");

        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[6]/div/div/input")).sendKeys("registruotis1*2");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[7]/div/div/input")).sendKeys("registruotis1*2");

        WebElement rules = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span"));
        rules.click();

        WebElement smsConfirmation = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[2]/div/label/span"));
        smsConfirmation.click();

        WebElement register = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button"));
        register.click();

        try {
            TimeUnit.SECONDS.sleep(35);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement skipButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button"));
        skipButton.click();

    }


    @Test
    public void testingBuyingProcess() {
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

        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.id("firstname")).sendKeys("Vardenis");

        _globalDriver.findElement(By.id("lastname")).sendKeys("Pavardenis");

        WebElement dropDownYearButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[1]/button"));
        dropDownYearButton.click();
        WebElement yearButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[1]/div/div/span[2]/div/div/button[7]"));
        yearButton.click();
        WebElement dropDownMonthButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[1]/button/span[2]"));
        dropDownMonthButton.click();
        WebElement monthButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[2]/div/div/span[2]/div/div/button[1]"));
        monthButton.click();
        WebElement dropDownDayButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[1]/button/span[2]"));
        dropDownDayButton.click();
        WebElement dayButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[3]/div/div/div[3]/div/div/span[2]/div/div/button[3]"));
        dayButton.click();

        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());

        _globalDriver.findElement(By.id("phone")).sendKeys("67122334");

        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[6]/div/div/input")).sendKeys("registruotis1*2");
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[7]/div/div/input")).sendKeys("registruotis1*2");

        WebElement privacyPolicyButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[1]/div/div[8]/div[1]/div/label/span"));
        privacyPolicyButton.click();
        WebElement signupButton2 = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/button"));
        signupButton2.click();
        try {
            TimeUnit.SECONDS.sleep(35);// palaukiam 35 sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement skipButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div/div[2]/div/form/div[3]/div[2]/button"));
        skipButton.click();
        _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input")).sendKeys("Tanqueray Gin");
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam 1 sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement searchButton2 = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[1]/button"));
        searchButton2.click();
        String priceInPage = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/span[1]")).getText();
        String priceInPage2 = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]/div/div/span[2]")).getText();
        String productPrice = priceInPage + "." + priceInPage2 + " €";
        WebElement addToCartButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div[2]/section[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/button"));
        addToCartButton.click();
        WebElement deliveryButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/span"));
        deliveryButton.click();
        WebElement next = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[1]/div[1]/button"));
        next.click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[1]/div/div/input")).sendKeys("Kalotes g. 2, Vinksnenai");
        WebElement findAddress = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/button"));
        findAddress.click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        findAddress.click();
        WebElement address = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/button"));
        address.click();
        WebElement chooseAddress = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div[1]/div/button"));
        chooseAddress.click();
        WebElement saveAddress = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/form/div/button"));
        saveAddress.click();
        WebElement chooseTime = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/label/span[2]/span"));
        chooseTime.click();
        WebElement timeReservation = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[2]/button"));
        timeReservation.click();
        WebElement viewCart = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div/div[2]/div[3]/div[1]/button"));
        viewCart.click();
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam 1 sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String priceInCart = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[5]/span")).getText();
        Assert.assertEquals(priceInCart, productPrice);
    }





}











