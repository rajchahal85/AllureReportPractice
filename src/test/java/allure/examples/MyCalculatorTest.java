package allure.examples;

import app.MySimpleCalculator;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyCalculatorTest {
    @Description("TC 1 : Add two numbers")
    @Link("Software_testing")
    @Test(description = "TC 1 : This test adds two numbers")
    public void tc1()
    {
        MySimpleCalculator calc = new MySimpleCalculator();

        Assert.assertEquals(calc.add2Num(3.0, 5.0), 8.0);
    }

    @Issue("Fault_(technology)")
    @Test(description = "TC 2 : This test subtracts two numbers")
    public void tc2(){

        MySimpleCalculator calculator = new MySimpleCalculator();
        Assert.assertEquals(calculator.sub2Num(5.0,4.0), 1.0);
    }


    @TmsLink("PODB-2148")
    @Test(description = "TC 3 : This test multiplies two numbers")
    public void tc3(){

        MySimpleCalculator calculator = new MySimpleCalculator();
        Assert.assertEquals(calculator.mul2Num(5.0,4.0), 20.0);
    }


    @Test(description = "TC 4 : This test divides two numbers")
    public void tc4(){

        MySimpleCalculator calculator = new MySimpleCalculator();
        Assert.assertEquals(calculator.div2Num(20.0,4.0), 6.0);
    }


//    @DisplayName("Calculate the sum of two -ve numbers")
//    @Story("Calculate the sum of two -ve numbers")
//    @Description("This is a test method that will add 2 -ve numbers,"
//            + "This test focuses on the addition of 2 -ve numbers & checks if the result of"
//            + "the calculation is valid")
//    @Test
//    public void tc5() {
//
//        CalculatorSteps calculate = new CalculatorSteps();
//        calculate.add2Numbers(-3.0, -5.0);
//        calculate.add2Numbers(-3.0, -5.0);
//    //    assertThat(calculate.add2Numbers(-3.0, -5.0), equalTo(-8.0));
//    }
}
