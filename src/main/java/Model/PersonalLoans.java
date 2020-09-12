package Model;

import Controller.Selinum;
import org.openqa.selenium.By;

import java.util.Currency;

public class PersonalLoans extends Selinum {

    private String personalLoanLink = "(//a[@href=\'/personal-loans?\'])[1]";

    private String  amount50000Button = "//span[text()='50 000']";

    private String textBoxAmont = "//input[@id='lPrincipal']";

    private String textITerm = "(//span[text()='MONTHS '])[9]";
    private String fieldPaymin = "//span[@id='paymin']";
    private String fieldPaymax = "//span[@id='paymax']";

    private String viewBreakdown = "//a[text()='View Breakdown']";
    private String capitalAmount = "//div[@id='breakdownCapital']";
    private String termsAllocated = "//div[@id='breakdownTerm']";

    public PersonalLoans(String browsersType, boolean windowSize,String site, String testSuite, String testcase) throws Exception {
        super(browsersType, windowSize,site, testSuite, testcase);
    }


    public void calcuator(String amount,String term,String PAYMIN,String PAYMAX)  {
        clickElement(By.xpath(personalLoanLink),true,"Able to access Personal Loan Page");
        clickElement(By.xpath(amount50000Button),true,"Able to Click amount R50000 button?");
        clickElement(By.xpath(textITerm),true,"Able to Click Term button?");
       // clickElement(By.xpath(buttonNextMonth),true,"Able to click Next button?");
        validateElementText(By.xpath(fieldPaymin),PAYMIN,true,"Able Validate minimal amount?");
        validateElementText(By.xpath(fieldPaymax),PAYMAX,true,"Able Validate maximum amount?");
        clickElement(By.xpath(viewBreakdown),true,"Able to click view Breakdown");
        validateElementText(By.xpath(capitalAmount),amount,true,"Able to view Capital Amount");
        validateElementText(By.xpath(termsAllocated),term, true, "Able to view Term Allocated");
        shutdown();
    }



}
