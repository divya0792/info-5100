package Question1;

import Question1.ExceptionGenerator;
import org.junit.Test;

public class ExceptionGeneratorTest {


    @Test(expected = MyIndexOutOfBoundException.class)
    public void testMain() {
        int[] arr = {1,2,3,4,5,6};
        ExceptionGenerator main = new ExceptionGenerator();
        main.generateException(arr);
    }

}
