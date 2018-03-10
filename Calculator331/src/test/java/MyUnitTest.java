
import com.mycompany.calculator331.MyUnit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 
 *
 * @since Mar 9, 2018, 11:37:56 AM
 * @author Mateusz Uliński
 */
public class MyUnitTest {

    @Test
    public void testConcatenate(){
        MyUnit myunit=new MyUnit();
        String result=myunit.concatenate("one", "two");
        assertEquals("onetwo",result);
    }
    
    @Test
    public void testCalculator(){
        
    }
}