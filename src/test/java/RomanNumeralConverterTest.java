import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralConverterTest {

    private static RNConverter converter;

    @BeforeClass
    public static void setUp(){
        converter = new RNConverter();

    }



    @Test
    public void convert1toI(){

        assertEquals("I", converter.convert(1));

    }
    @Test
    public void convert4toIV(){

        assertEquals("IV", converter.convert(4));

    }

    @Test
    public void convert5toV(){

        assertEquals("V", converter.convert(5));

    }
    @Test
    public void convert9toIX(){

        assertEquals("IX", converter.convert(9));

    }
    @Test
    public void convert10toX(){

        assertEquals("X", converter.convert(10));

    }
}
