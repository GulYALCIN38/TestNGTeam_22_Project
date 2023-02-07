package team22.tests.sevim;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team22.pages.HomePage;
import team22.utilities.ConfigReader;
import team22.utilities.Driver;
import team22.utilities.ReusableMethods;

public class US_19 {


    @Test
    public void addToCartTest01(){
        //Kullanici anasayfayı açar
        Driver.getDriver().get(ConfigReader.getProperty("app-url"));
        //Kullanici uygulamaya login olur

        //My Account sayfasi görüntülenir
        //Kullanici kullanici Categories kismina hoverover yapar
        //Kullanici bir category secer ve category'e tiklar
        //Kullanici bir ürün secer ve ürüne tiklar
        //Kullanici add to cart butonuna tiklar
        //Kullanici tekrar Categories kismina hover over yapar
        //Kullanici bir Category secer ve category'e tiklar
        //Kullanici ilk ürüne tiklar
        //Kullanici add to cart butonuna tiklar
        //Kullanici "cart" butonuna tiklar
        //Ürünlerin sepette oldugu dogrulanir
    }
}
