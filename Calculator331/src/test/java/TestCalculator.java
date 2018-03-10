
import com.mycompany.calculator331.Calculate;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 *
 * @since Mar 10, 2018, 1:26:16 PM
 * @author Grzegorz Brodowski
 */
public class TestCalculator {
    Calculate calc = new Calculate();
    String dzialanie1 = ("-1+-5");
    String dzialanie2 = ("2-3");
    String dzialanie3 = ("3*4");
    String dzialanie4 = ("5 / 6");
    String dzialanie5 = ("7^ 8");
    String dzialanie6 = ("10");
    
    String znak1 = calc.checkSign(dzialanie1);
    String znak2 = calc.checkSign(dzialanie2);
    String znak3 = calc.checkSign(dzialanie3);
    String znak4 = calc.checkSign(dzialanie4);
    String znak5 = calc.checkSign(dzialanie5);
    String znak6 = calc.checkSign(dzialanie6);

    @Test
    public void testZnak() {

        Assert.assertEquals(znak1, "+");
        Assert.assertEquals(znak2, "-");
        Assert.assertEquals(znak3, "*");
        Assert.assertEquals(znak4, "/");
        Assert.assertEquals(znak5, "^");
        Assert.assertEquals(znak6, "-");

    }

    @Test
    public void testCleanString() {
        String[] op1 = calc.cleanString(dzialanie1, znak1);
        String[] op2 = calc.cleanString(dzialanie2, znak2);
        String[] op3 = calc.cleanString(dzialanie3, znak3);
        String[] op4 = calc.cleanString(dzialanie4, znak4);
        String[] op5 = calc.cleanString(dzialanie5, znak5);
//        String[] op6 = calc.cleanString(dzialanie6,znak6);

        String[] res1 = {"-1", "-5"};
        String[] res2 = {"2", "3"};
        String[] res3 = {"3", "4"};
        String[] res4 = {"5", "6"};
        String[] res5 = {"7", "8"};
//        String[] res6={"1","5"};

        Assert.assertArrayEquals(op1, res1);
        Assert.assertArrayEquals(op2, res2);
        Assert.assertArrayEquals(op3, res3);
        Assert.assertArrayEquals(op4, res4);
        Assert.assertArrayEquals(op5, res5);
//        Assert.assertArrayEquals(op6,res6);

    }
    
    @Test
    public void testOperatoionResult(){
        Assert.assertEquals(calc.operationResult("1+2"), 3);
        Assert.assertEquals(calc.operationResult("1*56"), 56);
        Assert.assertEquals(calc.operationResult("-2+15"), 13);
        Assert.assertEquals(calc.operationResult("4^0.5"), 2);
        Assert.assertEquals(calc.operationResult("-4+-5"), -9);
        
    }

}
