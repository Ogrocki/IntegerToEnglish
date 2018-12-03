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
        this.integerToEnglishConverter = new IntegerToEnglishConverter(nf);
    }

    @Test
    public void happyPathTest() {
        String result = integerToEnglishConverter.convert("987654321");
        String expected = "nine hundred eighty-seven million six hundred fifty-four thousand three hundred twenty-one";
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
