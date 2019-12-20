import org.junit.Assert;

public class CalculTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        int expected = 6;

        int actual = Calcul.add(3, 3);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void addPositiveAndNegativeNumber(){
        int expected = 0;

        int actual = Calcul.add(-3, 3);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void addNegativeAndNegativeNumber(){
        int expected = -6;

        int actual = Calcul.add(-3, -3);

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void multiply() {
        int expected = 4;

        int actual = Calcul.multiply(2, 2);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void multiplyPositiveAndNegativeNumber(){
        int expected = -9;

        int actual = Calcul.multiply(-3, 3);

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void multiplyNegativeAndNegativeNumber(){
        int expected = 9;

        int actual = Calcul.multiply(-3, -3);

        Assert.assertEquals(actual, expected);
    }
}