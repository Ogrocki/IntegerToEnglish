import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ogrocki.matthew.IntegerToEnglishConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class TestIntegerToEnglishConverter {

    private RuleBasedNumberFormat nf;
    private IntegerToEnglishConverter integerToEnglishConverter;

    @Before
    public void setup() {
        this.nf = new RuleBasedNumberFormat(Locale.CANADA, RuleBasedNumberFormat.SPELLOUT);
        this.integerToEnglishConverter = new IntegerToEnglishConverter();
    }

    @Test
    public void happyPathTest() {
        String result = integerToEnglishConverter.convert("987654321");
        String expected = "nine hundred eighty-seven million six hundred fifty-four thousand three hundred twenty-one";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void zeroTest() {
        String result = integerToEnglishConverter.convert("0");
        String expected = "zero";
        Assert.assertEquals(expected, result);

        result = integerToEnglishConverter.convert("-0");
        expected = "zero";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void negativeNumberTest(){
        String result = integerToEnglishConverter.convert("-12345");
        String expected = "minus twelve thousand three hundred forty-five";
        Assert.assertEquals(expected, result);
    }

    @Test(expected = NumberFormatException.class)
    public void emptyStringTest() {
        integerToEnglishConverter.convert("");
    }

    @Test(expected = NumberFormatException.class)
    public void incorrectString() {
        integerToEnglishConverter.convert("123,456");
    }

    @Test(expected = NumberFormatException.class)
    public void valueLargerThenMaxIntTest() {
        integerToEnglishConverter.convert("2147483648");
    }
}
