package ru.gb.hw.tsurupa.lesson6.RockWool.Inspiration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.gb.hw.tsurupa.lesson6.RockWool.BaseViewRockWool;

public class MajorRenovationOfResidentialBuilding extends BaseViewRockWool {
    public MajorRenovationOfResidentialBuilding(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[contains(@href, 'loft-and-attic-renovation') and  contains(@class, 'card-stretched-link')]")
    public WebElement atticReconstruction;

    public AtticReconstruction clickToPageAtticReconstruction() {
        atticReconstruction.click();
        return new AtticReconstruction(webDriver);
    }



}
