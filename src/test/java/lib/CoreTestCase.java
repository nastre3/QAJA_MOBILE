package lib;

import io.appium.java_client.AppiumDriver; // поверх библиотеки selenium
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import lib.ui.PlatformSelector;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class CoreTestCase {

    protected AppiumDriver<WebElement> driver;
    private static final String APPIUM_URL = "http://0.0.0.0:4723/wd/hub";

    @Before // запускается перед каждым тестом
    public void setUp() throws Exception {
        URL URL = new URL(APPIUM_URL); // объект URL

        if (PlatformSelector.PLATFORM == "ios") {
            this.driver = new IOSDriver<WebElement>(URL, this.getIOSDesiredCapabilities()); // объект URL передается в констуктор объекта IOSDriver
        } else if (PlatformSelector.PLATFORM == "android") {
            this.driver = new AndroidDriver<WebElement>(URL, this.getAndroidDesiredCapabilities()); // Capabilities - св-ва девайса/приложения для запускаемой сессии - воз-ся в конструктор
        } else {
            throw new Exception("Cannot run Appium session with the platform equals " + PlatformSelector.PLATFORM);
        }
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    private DesiredCapabilities getAndroidDesiredCapabilities() {
        String avdName = "ver10";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android"); // запускаемая платформа

        capabilities.setCapability("avd", avdName);
        // 2 строки ниже - можно не указывать, если есть строка выше про "avd"
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","10.0");

        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","org.wikipedia"); // название проверяемой программы
        capabilities.setCapability("appActivity",".main.MainActivity"); // экран для запуска приложения, уточняется у разработчиков
        capabilities.setCapability("app","/Users/vitalijkotov/SFMobile/apps/org.wikipedia.apk"); // путь до apk файла приложения (обязательно, если приложение не установлено)
        return capabilities;
    }

    private DesiredCapabilities getIOSDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 12 Pro");
        capabilities.setCapability("platformVersion", "14.2");
        capabilities.setCapability("app", "/Users/vitalijkotov/SFMobile/apps/Wikipedia.app");
        return capabilities;
    }

}
