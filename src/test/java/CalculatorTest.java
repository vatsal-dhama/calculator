import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup(){
        // Common setup code that needs to be executed before each test
        calculator = new Main();
    }

    @Test
    public void test_add_pos(){
        double a = 1;
        double b = 2;
        double out = 3;
        Assert.assertEquals(out,calculator.addition(a,b),0.01);
    }

    @Test
    public void test_add_posneg(){
        double a = 2;
        double b = -3;
        double out = -1;
        Assert.assertEquals(out,calculator.addition(a,b),0.01);
    }

    @Test
    public void test_subs(){
        double a = -5;
        double b = -19;
        double out = 14;
        Assert.assertEquals(out,calculator.subtraction(a,b),0.01);
    }

    @Test
    public void test_mult() {
        double a = 4;
        double b = -3;
        double out = -12;
        Assert.assertEquals(out, calculator.multiplication(a, b),0.01);
    }

    @Test
    public void test_divide(){
        double a = 3;
        double b = 2;
        double out = 1.5;
        Assert.assertEquals(out,calculator.division(a,b),0.01);
    }
}
