import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBowling {

    Bowling bowling;

    @Before
    public void setup(){
        bowling = new Bowling();
    }

    @Test
    public void testMezok(){
        Assert.assertEquals(10, bowling.mezoSzam());
    }

    @Test
    public void testGuritas(){
        Assert.assertEquals(0, bowling.mezoErteke(0, 0));
        Assert.assertEquals(8, bowling.mezoErteke(3, 5));
        Assert.assertEquals(6, bowling.mezoErteke(2,4));
        Assert.assertEquals(7, bowling.mezoSzam());

    }

    @Test
    public void testSpareJel(){
        Assert.assertEquals("3 /", bowling.spare(3,7));
        Assert.assertEquals("5 /", bowling.spare(5,5));

        Assert.assertEquals("3 5", bowling.spare(3,5));
    }

    @Test
    public void testStrikeJel(){
        Assert.assertEquals("X", bowling.strike(10, 0));

        Assert.assertEquals("3 5", bowling.spare(3,5));
    }

    @Test
    public void tesztSzamitas(){
        bowling.mezoErteke(0,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        bowling.mezoErteke(1,2);
        Assert.assertEquals(26, bowling.osszPont());
    }

    @Test
    public void tesztSzamitas2(){
        bowling.mezoErteke(0,8);
        bowling.mezoErteke(4,6);
        bowling.mezoErteke(2,0);
        bowling.mezoErteke(2,3);
        bowling.mezoErteke(4,5);
        bowling.mezoErteke(2,0);
        bowling.mezoErteke(0,0);
        bowling.mezoErteke(10,0);
        bowling.mezoErteke(2,2);
        bowling.mezoErteke(2,2);
        Assert.assertEquals(64, bowling.osszPont());
    }

}
