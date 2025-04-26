package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Plot {
    public WebDriver driver;
    public String region;
    public String district;
    public String quartal;
    public String street;
    public String objNo;
    public String rcNo;
    public String plotSize;
    public int[] intendances;
    public int[] specials;
    public boolean interestedChange;
    public boolean auction;
    public String notes_lt;
    public String notes_en;
    public String notes_ru;
    public String[] photos;
    public String video;
    public String tour3d;
    public String price;
    public String phone;
    public String email;
    public boolean dontShowInAds;
    public boolean cbdontWantChat;
    public int accountType;
    public boolean cbagreeToRules;

    public Plot() {
    }

    public Plot(WebDriver driver, String region, String district, String quartal, String street, String objNo,
                String rcNo, String plotSize, int[] intendances, int[] specials, boolean interestedChange, boolean auction,
                String notes_lt, String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price,
                String phone, String email, boolean dontShowInAds, boolean cbdontWantChat, int accountType, boolean cbagreeToRules) {
        this.driver = driver;
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.objNo = objNo;
        this.rcNo = rcNo;
        this.plotSize = plotSize;
        this.intendances = intendances;
        this.specials = specials;
        this.interestedChange = interestedChange;
        this.auction = auction;
        this.notes_lt = notes_lt;
        this.notes_en = notes_en;
        this.notes_ru = notes_ru;
        this.photos = photos;
        this.video = video;
        this.tour3d = tour3d;
        this.price = price;
        this.phone = phone;
        this.email = email;
        this.dontShowInAds = dontShowInAds;
        this.cbdontWantChat = cbdontWantChat;
        this.accountType = accountType;
        this.cbagreeToRules = cbagreeToRules;
    }

    public void wait(int time){
        try{
            Thread.sleep(time);
        }
        catch (Exception e){}
    }

    public void fill(){
        fillRegion();
        fillDistrict();
        fillQuartal();
        fillStreet();
        fillObjNo();
        fillRcNo();
        fillPlotSize();
        fillIntendances();
        fillSpecials();
        fillInterestedChange();
        fillAuction();
        fillNotes_lt();
        fillNotes_en();
        fillNotes_ru();
        fillPhotos();
        fillVideo();
        fillTour3d();
        fillPrice();
        fillPhone();
        fillEmail();
        fillDontShowInAds();
        fillCbdontWantChat();
        fillAccountType();
        fillCbagreeToRules();
    }

    private void fillCbagreeToRules() {
        WebElement checkbox = driver.findElement(By.id("cbagree_to_rules"));
        WebElement label = driver.findElement(By.xpath("//label[@for='cbagree_to_rules']/span"));
        wait(1000);
        if (cbagreeToRules && !checkbox.isSelected()) {
            label.click();
        } else if (cbagreeToRules && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillAccountType() {
        List<WebElement> accountTypes = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[39]/div[1]/div"));
        System.out.println(this.accountType);
        switch (this.accountType){
            case 1: accountTypes.get(0).click(); break;
            case 2: accountTypes.get(1).click(); break;
            case 3: accountTypes.get(2).click(); break;
            case 4: accountTypes.get(3).click(); break;
        }
    }

    private void fillCbdontWantChat() {
        WebElement checkbox = driver.findElement(By.id("cbdont_want_chat"));
        WebElement label = driver.findElement(By.xpath("//label[@for='cbdont_want_chat']"));
        wait(1000);
        if (cbdontWantChat && !checkbox.isSelected()) {
            label.click();
        } else if (cbdontWantChat && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillDontShowInAds() {
        WebElement checkbox = driver.findElement(By.id("cbdont_show_in_ads"));
        WebElement label = driver.findElement(By.xpath("//label[@for='cbdont_show_in_ads']"));
        wait(1000);
        if (dontShowInAds && !checkbox.isSelected()) {
            label.click();
        } else if (dontShowInAds && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillEmail() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/span[1]/input")).sendKeys(this.email);
    }

    private void fillPhone() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[34]/span[1]/input")).sendKeys(this.phone);
    }

    private void fillPrice() {

        driver.findElement(By.id("priceField")).sendKeys(this.price);
    }

    private void fillTour3d() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/span[1]/input")).sendKeys(this.tour3d);
    }

    private void fillVideo() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[30]/span[1]/input")).sendKeys(this.video);
    }

    private void fillPhotos() {
        wait(1000);
        driver.findElement(By.xpath("//*[@id=\"uploadPhotoBtn\"]/input")).sendKeys("C:\\Users\\Owner\\IdeaProjects\\eLENTA\\photos\\" + this.photos[0]);
    }

    private void fillNotes_ru() {
        driver.findElement(By.className("lang-ru-label")).click();
        driver.findElement(By.name("notes_ru")).sendKeys(this.notes_ru);
    }

    private void fillNotes_en() {
        driver.findElement(By.className("lang-en-label")).click();
        driver.findElement(By.name("notes_en")).sendKeys(this.notes_en);
    }

    private void fillNotes_lt() {
        driver.findElement(By.className("lang-lt-label")).click();
        driver.findElement(By.name("notes_lt")).sendKeys(this.notes_lt);
    }

    private void fillAuction() {
        WebElement checkbox = driver.findElement(By.id("cbAuction"));
        WebElement label = driver.findElement(By.xpath("//label[@for='cbAuction']"));
        wait(1000);
        if (auction && !checkbox.isSelected()) {
            label.click();
            wait(1000);
        } else if (auction && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillInterestedChange() {
        WebElement checkbox = driver.findElement(By.id("cbInterestedChange"));
        WebElement label = driver.findElement(By.xpath("//label[@for='cbInterestedChange']"));
        wait(1000);
        if (interestedChange && !checkbox.isSelected()) {
            label.click();
            wait(1000);
        } else if (interestedChange && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillSpecials() {
        this.driver.findElements(By.id("showMoreFields")).get(0).click();
        List<WebElement> specials = driver.findElements(By.xpath("//input[@name='Special[]']/following-sibling::label"));
        for (int i = 0; i < this.specials.length; i++) {
            switch (this.specials[i]){
                case 1: specials.get(0).click(); break;
                case 2: specials.get(1).click(); break;
                case 3: specials.get(2).click(); break;
                case 4: specials.get(3).click(); break;
                case 5: specials.get(4).click(); break;
                case 6: specials.get(5).click(); break;
                case 7: specials.get(6).click(); break;
                case 8: specials.get(7).click(); break;
                case 9: specials.get(8).click(); break;
            }
        }
    }

    private void fillIntendances() {
        List<WebElement> intendances = driver.findElements(By.xpath("//input[@name='FIntendance[]']/following-sibling::label"));
        for (int i = 0; i < this.intendances.length; i++) {
            switch (this.intendances[i]){
                case 1: intendances.get(0).click(); break;
                case 2: intendances.get(1).click(); break;
                case 3: intendances.get(2).click(); break;
                case 4: intendances.get(3).click(); break;
                case 5: intendances.get(4).click(); break;
                case 6: intendances.get(5).click(); break;
                case 7: intendances.get(6).click(); break;
                case 8: intendances.get(7).click(); break;
                case 9: intendances.get(8).click(); break;
                case 10: intendances.get(9).click(); break;
            }
        }
    }

    private void fillPlotSize() {
        this.driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(this.plotSize);
        this.driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(Keys.ENTER);
    }

    private void fillRcNo() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[11]/div[1]/input")).sendKeys(this.rcNo);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[11]/div[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillObjNo() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.objNo);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillStreet() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(3).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(4).sendKeys(this.street);
        wait(2000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(4).sendKeys(Keys.ENTER);
    }

    private void fillQuartal() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(2).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(this.quartal);
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(Keys.ENTER);
    }

    private void fillDistrict() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(1).click();
        wait(1000);
        List<WebElement> districts = driver.findElements(By.className("drop-down-value-row"));
        for (WebElement option : districts) {
            if (option.getText().equals(this.district)) {
                option.click();
                break;
            }
        }
    }

    private void fillRegion() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(0).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(0).sendKeys(this.region);
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(0).sendKeys(Keys.ENTER);
    }








































}











