import Model.PersonalLoans;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void chromeTest() throws Exception {
        PersonalLoans personalLoansPage = new PersonalLoans("CHROME",true,"https://www.oldmutualfinance.co.za/",Tests.class.getName(),Tests.class.getMethods()[0].getName());
        personalLoansPage.calcuator("R50,000.00","84 months","R1,521.05","R1,600.42");

        personalLoansPage.shutdown();
        personalLoansPage.flush();
    }

    @Test
    public void edgeTest() throws Exception {
        PersonalLoans personalLoansPage = new PersonalLoans("EDGE",true,"https://www.oldmutualfinance.co.za/",Tests.class.getName(),Tests.class.getMethods()[0].getName());
        personalLoansPage.calcuator("R50,000.00","84 months","R1,521.05","R1,600.42");
        personalLoansPage.shutdown();
        personalLoansPage.flush();


    }


}
