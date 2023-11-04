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
        int a = 1;
        int b = 2;
        int out = 3;
        Assert.assertEquals(out,calculator.addition(a,b));
    }

    @Test
    public void test_add_posneg(){
        int a = 2;
        int b = -3;
        int out = -1;
        Assert.assertEquals(out,calculator.addition(a,b));
    }

    @Test
    public void test_subs(){
        int a = -5;
        int b = -19;
        int out = 14;
        Assert.assertEquals(out,calculator.subtraction(a,b));
    }

    @Test
    public void test_mult() {
        int a = 4;
        int b = -3;
        int out = -12;
        Assert.assertEquals(out, calculator.multiplication(a, b));
    }

    @Test
    public void test_divide(){
        int a = 3;
        int b = 2;
        int out = 1;
        Assert.assertEquals(out,calculator.division(a,b));
    }
}
