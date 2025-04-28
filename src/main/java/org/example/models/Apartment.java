package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Apartment {
    public WebDriver driver;
    public String region;
    public String district;
    public String quartal;
    public String street;
    public String houseNum;
    public String apartNum;
    public String rcNum;
    public String apartSize;
    public int rooms;
    public int floor;
    public int houseFloors;
    public boolean elevator;
    public String constructionYear;
    public boolean renovated;
    public String buildingType;
    public String interior;
    public int[] heating;
    public String type;
    public int usage;
    public int[] windowOrient;
    public int[] specials;
    public int[] additionalRooms;
    public int[] additionalEquipement;
    public int[] security;
    public String energyClass;
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
    public boolean dontWantEmail;
    public boolean dontWantChat;
    public int accountType;
    public boolean cbagreeToRules;

    public Apartment() {
    }

    public Apartment(WebDriver driver, String region, String district, String quartal, String street, String houseNum, String apartNum, String rcNum,
                     String apartSize, int rooms, int floor, int houseFloors, boolean elevator, String constructionYear, boolean renovated,
                     String buildingType, String interior, int[] heating, String type, int usage, int[] windowOrient, int[] specials, int[] additionalRooms,
                     int[] additionalEquipement, int[] security, String energyClass, boolean interestedChange, boolean auction, String notes_lt,
                     String notes_en, String notes_ru, String[] photos, String video, String tour3d, String price, String phone, String email,
                     boolean dontWantEmail, boolean dontWantChat, int accountType, boolean cbagreeToRules) {
        this.driver = driver;
        this.region = region;
        this.district = district;
        this.quartal = quartal;
        this.street = street;
        this.houseNum = houseNum;
        this.apartNum = apartNum;
        this.rcNum = rcNum;
        this.apartSize = apartSize;
        this.rooms = rooms;
        this.floor = floor;
        this.houseFloors = houseFloors;
        this.elevator = elevator;
        this.constructionYear = constructionYear;
        this.renovated = renovated;
        this.buildingType = buildingType;
        this.interior = interior;
        this.heating = heating;
        this.type = type;
        this.usage = usage;
        this.windowOrient = windowOrient;
        this.specials = specials;
        this.additionalRooms = additionalRooms;
        this.additionalEquipement = additionalEquipement;
        this.security = security;
        this.energyClass = energyClass;
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
        this.dontWantEmail = dontWantEmail;
        this.dontWantChat = dontWantChat;
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
        fillHouseNum();
        fillApartNum();
        fillRcNum();
        fillApartSize();
        fillRooms();
        fillFloor();
        fillHouseFloors();
        fillElevator();
        fillConstructionYear();
        fillRenovated();
        fillBuildingType();
        fillInterior();
        fillHeating();
//        fillType();
//        fillUsage();
        fillWindowOrient();
        fillSpecials();
        fillAdditionalRooms();
        fillAdditionalEquipement();
        fillSecurity();
        fillEnergyClass();
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
        fillDontWantEmail();
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
//        List<WebElement> accountTypes = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[55]/div"));
        List<WebElement> accountTypes = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[55]/div[1]/div"));
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
        WebElement label = driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[53]/div/div/div/label/span"));
        wait(1000);
        if (dontWantChat && !checkbox.isSelected()) {
            label.click();
        } else if (dontWantChat && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillDontWantEmail() {
        WebElement checkbox = driver.findElement(By.id("cbdont_show_in_ads"));
        WebElement label = driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[52]/span/label"));
        wait(1000);
        if (dontWantEmail && !checkbox.isSelected()) {
            label.click();
        } else if (dontWantEmail && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillEmail() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[51]/span[1]/input")).sendKeys(this.email);
    }

    private void fillPhone() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[50]/span[1]/input")).sendKeys(this.phone);
    }

    private void fillPrice() {

        driver.findElement(By.id("priceField")).sendKeys(this.price);
    }

    private void fillTour3d() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[47]/span[1]/input")).sendKeys(this.tour3d);
    }

    private void fillVideo() {
        driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[46]/span[1]/input")).sendKeys(this.video);
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

    private void fillEnergyClass() {
        List<WebElement> energClass = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[37]/div/div/div[@class=\"input-button-text\"]"));
        for (WebElement option : energClass) {
            String optionText = option.getText().trim();

            if (optionText.equalsIgnoreCase(this.energyClass.trim())) {
                option.click();
                break;
            }
        }
    }

    private void fillSecurity() {
        List<WebElement> security = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[35]/div/div/label"));
        for (int i = 0; i < this.security.length; i++) {
            switch (this.security[i]){
                case 1: security.get(0).click(); break;
                case 2: security.get(1).click(); break;
                case 3: security.get(2).click(); break;
                case 4: security.get(3).click(); break;
                case 5: security.get(4).click(); break;
            }
        }
    }

    private void fillAdditionalEquipement() {
        List<WebElement> equipement = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[33]/div/div/label"));
        for (int i = 0; i < this.additionalEquipement.length; i++) {
            switch (this.additionalEquipement[i]){
                case 1: equipement.get(0).click(); break;
                case 2: equipement.get(1).click(); break;
                case 3: equipement.get(2).click(); break;
                case 4: equipement.get(3).click(); break;
                case 5: equipement.get(4).click(); break;
                case 6: equipement.get(5).click(); break;
                case 7: equipement.get(6).click(); break;
                case 8: equipement.get(7).click(); break;
                case 9: equipement.get(8).click(); break;
                case 10: equipement.get(9).click(); break;
                case 11: equipement.get(10).click(); break;
                case 12: equipement.get(11).click(); break;
                case 13: equipement.get(12).click(); break;
            }
        }
    }

    private void fillAdditionalRooms() {
//        List<WebElement> specials = driver.findElements(By.xpath("//input[@name='Special[]']/following-sibling::label"));
        List<WebElement> specialsLabel = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[31]/div/div/label"));
        for (int i = 0; i < this.additionalRooms.length; i++) {

            switch (this.additionalRooms[i]){
                case 1: specialsLabel.get(0).click(); break;
                case 2: specialsLabel.get(1).click(); break;
                case 3: specialsLabel.get(2).click(); break;
                case 4: specialsLabel.get(3).click(); break;
                case 5: specialsLabel.get(4).click(); break;
                case 6: specialsLabel.get(5).click(); break;
                case 7: specialsLabel.get(6).click(); break;
                case 8: specialsLabel.get(7).click(); break;
            }
        }

    }

    private void fillSpecials() {
        this.driver.findElements(By.id("showMoreFields")).get(0).click();
//        List<WebElement> specials = driver.findElements(By.xpath("//input[@name='Special[]']/following-sibling::label"));
        List<WebElement> specials = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[29]/div/div/label"));
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
                case 10: specials.get(9).click(); break;
                case 11: specials.get(10).click(); break;
            }
        }
    }

    private void fillWindowOrient() {
        List<WebElement> windows = driver.findElements(By.xpath("//input[@name='windows_direction[]']/following-sibling::label"));
        for (int i = 0; i < this.windowOrient.length; i++) {
            switch (this.windowOrient[i]){
                case 1: windows.get(0).click(); break;
                case 2: windows.get(1).click(); break;
                case 3: windows.get(2).click(); break;
                case 4: windows.get(3).click(); break;
                            }
        }
    }

//    private void fillUsage() {
//    }

//    private void fillType() {
//        List<WebElement> aparType = driver.findElements(By.xpath("//div[contains(@class, 'input-buttons-wrapper')]//div[contains(@class, 'input-button-text')]"));
//
//        for (WebElement option : aparType) {
//            String optionText = option.getText().trim();
//
//            if (optionText.equalsIgnoreCase(this.type.trim()) &&
//                    option.getAttribute("data-selected").equals("0")) {
//                option.click();
//                break;
//            }
//        }
//    }

    private void fillHeating() {
        List<WebElement> heating = driver.findElements(By.xpath("//input[@name='FWarmSystem[]']/following-sibling::label"));
        for (int i = 0; i < this.heating.length; i++) {
            switch (this.heating[i]){
                case 1: heating.get(0).click(); break;
                case 2: heating.get(1).click(); break;
                case 3: heating.get(2).click(); break;
                case 4: heating.get(3).click(); break;
                case 5: heating.get(4).click(); break;
                case 6: heating.get(5).click(); break;
                case 7: heating.get(6).click(); break;
                case 8: heating.get(7).click(); break;
                case 9: heating.get(8).click(); break;
                case 10: heating.get(9).click(); break;
            }
        }
    }

    private void fillInterior() {
        List<WebElement> interiorState = driver.findElements(By.xpath("//div[contains(@class, 'input-buttons-wrapper')]//div[contains(@class, 'input-button-text')]"));

        for (WebElement option : interiorState) {
            String optionText = option.getText().trim();

            if (optionText.equalsIgnoreCase(this.interior)) {
                option.click();
                break;
            }
        }
    }

    private void fillBuildingType() {
        List<WebElement> buildType = driver.findElements(
                By.xpath("//div[contains(@class, 'input-buttons-wrapper')]//div[contains(@class, 'input-button-text')]"));

        for (WebElement option : buildType) {
            String optionText = option.getText().trim();

            if (optionText.equalsIgnoreCase(this.buildingType.trim())) {
                option.click();
                break;
            }
        }
    }

    private void fillRenovated() {
        WebElement checkbox = driver.findElement(By.id("cbrenovated"));
        WebElement label = driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div[2]/div/div/label/span"));
        if (renovated && !checkbox.isSelected()) {
            label.click();
        } else if (renovated && !checkbox.isSelected()){
            label.click();
        }

    }

    private void fillConstructionYear() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div[1]/span[1]/span/input")).sendKeys(this.constructionYear);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[17]/div[1]/span[1]/span/input")).sendKeys(Keys.ENTER);



    }

    private void fillElevator() {
        WebElement checkbox = driver.findElement(By.id("cbelevator"));
        WebElement label = driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[3]/div/div/label/span"));
        wait(1000);
        if (elevator && !checkbox.isSelected()) {
            label.click();
        } else if (elevator && !checkbox.isSelected()){
            label.click();
        }
    }

    private void fillHouseFloors() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FHouseHeight\"]/span[1]/input")).sendKeys(""+this.floor);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FHouseHeight\"]/span[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillFloor() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/span[2]/input")).sendKeys(""+this.floor);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"fieldRow_FFloor\"]/div[1]/span[2]/input")).sendKeys(Keys.ENTER);
    }

    private void fillRooms() {
        List<WebElement> roomsNumber = driver.findElements(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[15]/div/div"));
        switch (this.rooms){
            case 1: roomsNumber.get(0).click(); break;
            case 2: roomsNumber.get(1).click(); break;
            case 3: roomsNumber.get(2).click(); break;
            case 4: roomsNumber.get(3).click(); break;
        }
    }

    private void fillApartSize() {
        this.driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(this.apartSize);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"fieldFAreaOverAll\"]")).sendKeys(Keys.ENTER);
    }

    private void fillRcNum() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[12]/div[1]/input")).sendKeys(this.rcNum);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[12]/div[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillApartNum() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[8]/span[1]/input")).sendKeys(this.apartNum);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[8]/span[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillHouseNum() {
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(this.houseNum);
        wait(1000);
        this.driver.findElement(By.xpath("//*[@id=\"newObjectForm\"]/ul/li[7]/span[1]/input")).sendKeys(Keys.ENTER);
    }

    private void fillStreet() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(3).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(5).sendKeys(this.street);
        wait(2000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(5).sendKeys(Keys.ENTER);
    }

    private void fillQuartal() {
        this.driver.findElements(By.className("dropdown-input-value-title")).get(2).click();
        this.driver.findElements(By.className("dropdown-input-search-value")).get(2).sendKeys(this.quartal);
        wait(1000);
        this.driver.findElements(By.className("dropdown-input-search-value")).get(2).sendKeys(Keys.ENTER);
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
