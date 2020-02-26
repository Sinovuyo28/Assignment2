import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calcu;

    @Before
    public void setUp() {
        this.calcu = new Calculator();
    }


    @Test
    public void testAdd() {
        double num1 = 1;
        double num2 = 2;
        double expected = 3;
        double actual;

        actual = this.calcu.add(num1, num2);

        assertEquals(expected, actual, 0.000);
    }

    @Test(timeout = 1000)

            public void testWithTimeout(){


    }

    @Test
    public void temporarilyDisabledTest(){


    }

@Test
    public void objectEquality(){


}

@Test
    public void objectIdentity(){


}

@Test
    public void failingTest(){


}


}
