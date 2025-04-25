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
    }

    private void fillPhotos() {

    }

    private void fillNotes_ru() {

    }

    private void fillNotes_en() {

    }

    private void fillNotes_lt() {
    }

    private void fillAuction() {
        
    }

    private void fillInterestedChange() {
        
    }

    private void fillSpecials() {
        this.driver.findElements(By.className("input-style-checkbox")).get(1);
        List<WebElement> specials = driver.findElements(By.className(""));
        for (int i = 0; i < this.specials.length; i++) {
            switch (this.specials[i]){
                case 1:
                    specials.get(0).click();
                    break;
                case 2:
                    specials.get(1).click();
                    break;
                case 3:
                    specials.get(2).click();
                    break;
                case 4:
                    specials.get(3).click();
                    break;
                case 5:
                    specials.get(4).click();
                    break;
                case 6:
                    specials.get(5).click();
                    break;
                case 7:
                    specials.get(6).click();
                    break;
                case 8:
                    specials.get(7).click();
                    break;
                case 9:
                    specials.get(8).click();
                    break;
            }
        }
    }

    private void fillIntendances() {
        this.driver.findElements(By.className("input-style-checkbox")).get(0);
        List<WebElement> intendances = (List<WebElement>) driver.findElement(By.xpath("//input[@data-title='" + this.intendances[0] + "']/following-sibling::label"));
        for (int i = 0; i < this.intendances.length; i++) {
            switch (this.intendances[i]){
                case 1:
                    intendances.get(0).click();
                    break;
                case 2:
                    intendances.get(1).click();
                    break;
                case 3:
                    intendances.get(2).click();
                    break;
                case 4:
                    intendances.get(3).click();
                    break;
                case 5:
                    intendances.get(4).click();
                    break;
                case 6:
                    intendances.get(5).click();
                    break;
                case 7:
                    intendances.get(6).click();
                    break;
                case 8:
                    intendances.get(7).click();
                    break;
                case 9:
                    intendances.get(8).click();
                    break;
                case 10:
                    intendances.get(9).click();
                    break;
            }
        }
    }

    private void fillPlotSize() {//
        this.driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(this.plotSize);
        this.driver.findElement(By.id("fieldFAreaOverAll")).sendKeys(Keys.ENTER);
    }

    private void fillRcNo() {//
        this.driver.findElement(By.className("input-style-rc-number")).sendKeys(this.rcNo);
        this.driver.findElement(By.className("input-style-rc-number")).sendKeys(Keys.ENTER);
    }

    private void fillObjNo() {//
        this.driver.findElement(By.className("input-style-text")).sendKeys(this.objNo);
        this.driver.findElement(By.className("input-style-text")).sendKeys(Keys.ENTER);
    }

    private void fillStreet() {//
        this.driver.findElements(By.className("dropdown-input-value-title")).get(3).click();
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(5).sendKeys(this.street);
        wait(2000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(5).sendKeys(Keys.ENTER);
    }

    private void fillQuartal() {//
        this.driver.findElements(By.className("dropdown-input-value-title")).get(2).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(this.quartal);
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(1).sendKeys(Keys.ENTER);
    }

    private void fillDistrict() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(1).click();
        wait(2000);
        this.driver.findElements(By.className("dropdown-input-values-address")).get(1).getCssValue(this.district);
    }

    private void fillRegion() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(0).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(0).sendKeys(this.region);
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(0).sendKeys(Keys.ENTER);
    }








































}











